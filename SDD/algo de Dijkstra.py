def relacher(si,sj):
	if 





def Dijkstra(S,A,v,s0):
	distance=[[None,None]*len(S)]
	d[s0]=0
	F=S
	while F!=[]:
		min=d[0]
		imin=-1
		for i in range(len(F)):
			if d[i]<min:
				min=d[i]
				imin=i
		F.split(imin)
		