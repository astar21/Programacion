print 'dime un numero'
a=input()
li=[a]
print 'dime un numero mayor que el anterior' 
b=input()
li=li+[b]
while b>a:
    a=b
    print ' dime un numero mayor que el anterior '
    b=input()
    li=li+[b]
print 'Los numeros que has introducido son' ,(li)
