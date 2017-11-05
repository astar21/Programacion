a=raw_input('dime un nombre')
li=[]
lista=[]
while a!='':
   li.append(a)
   b=float (input('Introduce las notas'))
   while b<=10 and b>=0:
       li.append(b)
       b=float (input('Introduce otra nota'))
   lista.append(li)
   a=raw_input('Introduce otra nota')
   li=[]
print (lista)
