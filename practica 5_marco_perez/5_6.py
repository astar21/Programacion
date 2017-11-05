print 'Dime un numero'
a=input()
print 'dime un numero mayor que' ,(a)
b=input()
while b<a:
    print (b), 'no es mayor que' ,(a), 'intentalo de nuevo'
    b=input()
print 'dime un numero entre' ,(a), 'y' ,(b)
c=input()
while c<=a or c>=b:
    print (c), 'no esta entre' ,(a), 'y' ,(b), 'prueba otra vez'
    c=input()
li=[c]
print 'dime otro numero que este entre' ,(a), 'y' ,(b)
c=input()
while c<=a or c>=b:
    print (c), 'no esta entre' ,(a), 'y' ,(b), 'prueba otra vez'
    c=input()
li=li+[c]
print (li)
