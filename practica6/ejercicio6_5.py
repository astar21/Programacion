num=int(raw_input("Numero de palabras:"))
lista=[]
for i in range(1,num+1):
    lista.append(raw_input("Palabra:"))	
num=int(raw_input("Numero de palabras :"))
lista2=[]
for i in range(1,num+1):
    lista2.append(raw_input("Palabra2:"))			

for j in lista2:
    while j in lista:
         lista.remove(j)		

print lista

