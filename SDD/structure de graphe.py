class noeud:
	def __init__(self,nat,nom):
		self.nature=nat
		self.nom=nom

class arete:
	def __init__(self,nat,longueur):
		self.nature=nat
		self.longueur=longueur

class voisin:
	def __init__(self,nata,longueur,natn,nom):
		self.route=arete(nata,longueur)
		self.destination=noeud(natn,nom)
		self.v_suiv=None

class maille_principal:
	def __init__(self,nat,nom):
		self.noeud=noeud(nat,nom)
		self.suivant=None
		self.voisin=None

class graphe:
	def __init__(self):
		self.tete=None

	'''
		input: self, liste contenant les infos d'un noeud
		output: un nouveau noeud est crée contenant les info de la liste
	'''
	def setNoeud(self,liste):
		maillon=self.tete
		if self.tete==None:
			self.tete=maille_principal(liste[0],liste[1])
		else:
			while maillon.suivant!=None:
				maillon=maillon.suivant
			maillon.suivant=maille_principal(liste[0],liste[1])

	def setVoisin(self,liste):
		maillon=self.tete
		while maillon.suivant!=None:
			maillon=maillon.suivant
		while maillon.voisin!=None:
			maillon=maillon.voisin
		maillon.voisin=voisin(liste[0],liste[1],liste[2],liste[3])

	def getGraphe(self):
		maillon=self.tete
		while maillon!=None:
			print(maillon.noeud.nature," | ",maillon.noeud.nom," |-> ")
			voisin=maillon.voisin
			while voisin!=None:
				print(voisin.route.nature," | ",voisin.route.longueur," || ",voisin.destination.nature," | ",voisin.destination.nom)
				voisin=voisin.v_suiv
			maillon=maillon.suivant

	def getNoeud(self):
		maillon=self.tete
		while maillon!=None:
			print(maillon.noeud.nature," | ",maillon.noeud.nom)
			maillon=maillon.suivant

	def getVoisin(self,sommet):
		maillon=self.tete
		while maillon.suivant!=None and maillon.noeud.nom!=sommet:
			maillon=maillon.suivant
		if maillon.noeud.nom==sommet:
			voisin=maillon.voisin
			while voisin!=None:
				print(voisin.destination.nature," | ",voisin.destination.nom)
				voisin=voisin.v_suiv


	def getNbVille(self):
		maillon=self.tete
		n=0
		while maillon!=None:
			if maillon.noeud.nature=="V":
				n=n+1
			maillon=maillon.suivant
		return n

	def getNbLoisir(self):
		maillon=self.tete
		n=0
		while maillon!=None:
			if maillon.noeud.nature=="L":
				n=n+1
			maillon=maillon.suivant
		return n
	
	def getNbResto(self):
		maillon=self.tete
		n=0
		while maillon!=None:
			if maillon.noeud.nature=="R":
				n=n+1
			maillon=maillon.suivant
		return n

	def getNbDepartementale(self):
		liste=[]
		maillon=self.tete
		while maillon!=None:
			voisin = maillon.voisin
			while voisin!=None:
				if ([maillon.noeud.nom,voisin.destination.nom] not in liste or [voisin.destination.nom,maillon.noeud.nom] not in liste) and voisin.route.nature=="D":
					liste.append([maillon.noeud.nom,voisin.destination.nom])
				voisin=voisin.v_suiv
			maillon=maillon.suivant
		return len(liste)
				
	def getNbNationnal(self):
		liste=[]
		maillon=self.tete
		while maillon!=None:
			voisin = maillon.voisin
			while voisin!=None:
				if ([maillon.noeud.nom,voisin.destination.nom] not in liste or [voisin.destination.nom,maillon.noeud.nom] not in liste) and voisin.route.nature=="N":
					liste.append([maillon.noeud.nom,voisin.destination.nom])
				voisin=voisin.v_suiv
			maillon=maillon.suivant
		return len(liste)
				
	def getNbAutoroute(self):
		liste=[]
		maillon=self.tete
		while maillon!=None:
			voisin = maillon.voisin
			while voisin!=None:
				if ([maillon.noeud.nom,voisin.destination.nom] not in liste or [voisin.destination.nom,maillon.noeud.nom] not in liste) and voisin.route.nature=="A":
					liste.append([maillon.noeud.nom,voisin.destination.nom])
				voisin=voisin.v_suiv
			maillon=maillon.suivant
		return len(liste)
				
	def getRoute(self):
		maillon=self.tete
		while maillon!=None:
			voisin = maillon.voisin
			while voisin!=None:
				
				voisin=voisin.v_suiv
			maillon=maillon.suivant
		return len(liste)



G=graphe()
G.setNoeud(["L","Parc de la tête d'Or"])
G.setVoisin(["N",3,'V',"Villeurbanne"])
G.setNoeud(["V","Villeurbanne"])
G.setVoisin(["N",3,'L',"Parc de la tête d'Or"])
print(G.getNbAutoroute())