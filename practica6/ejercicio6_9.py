num=int(raw_input("Numero de palabras:"))
lista=[]
for i in range(1,num+1):
    lista.append(raw_input("Palabra:"))
		
print lista
lista2=[]
for i in lista:
    if not i in lista2:
        lista2.append(i)
lista=lista2
print lista








