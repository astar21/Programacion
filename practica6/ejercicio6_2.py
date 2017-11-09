num=int(raw_input("Numero de palabras:"))
lista=[]
for i in range(1,num+1):
    lista.append(raw_input("Palabra:"))
		
print lista	

buscar=raw_input("Palabra a buscar:")
print "La he encontrado %d veces"% lista.count(buscar)
