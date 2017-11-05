a=float(input('dame una nota'))
li=[a]
while a<=10 and a>=0:
    a=float( input('dame otra nota'))
    li=li+[a]
if a>10 or a<=0:
    li.remove (a)
print li;

