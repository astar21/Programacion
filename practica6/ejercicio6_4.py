num=int(raw_input("Número de palabras:"))
lista=[]
for i in xrange(1,num+1):
    lista.append(raw_input("Palabra:"))
		
print lista

eliminar=raw_input("Palabra a eliminar:")		

while eliminar in lista:
     lista.remove(eliminar)		

print lista
