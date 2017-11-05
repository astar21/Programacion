a=raw_input('Introduce el nombre')
li=[]
lista=[]
while a!='':
   li.append(a)
   b=input('dime un numero')
   li.append(b)
   lista=lista+[li]
   a=raw_input('pon otro nombre')
   li=[]
print (lista)
