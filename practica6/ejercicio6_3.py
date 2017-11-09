num=int(raw_input("Número de palabras:"))
lista=[]
for i in xrange(1,num+1):
    lista.append(raw_input("Palabra:"))
		
print lista
buscar=raw_input('buscar  la palabra...')

subs=raw_input('sustituir la palabra')
cont=0
for cad in lista:
     if cad==buscar:
         lista[cont]=subs
     cont=cont+1		

print lista
