a=raw_input('dime tu nombre')
li=[]
lista=[]
while a!='':
   li.append(a)
   b=input('introduce  el numero de telefono')
   li.append(b)
   lista=lista+[li]
   a=raw_input('dime otro nombre')
   li=[]
print 'se an guardado estos nombres y numeros',(lista)
