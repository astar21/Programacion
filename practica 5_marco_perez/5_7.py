a=input('mete un numero como limite ')
b=input('mete otro numero')
c=b
li=[b]
while a>c:
    b=input('mete otro numero')
    li=li+[b]
    c=c+b
print 'el numero a susperar es' ,a,'y la lista creada es',(li)
