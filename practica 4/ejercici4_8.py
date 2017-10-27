altura=input('introduce altura')
y=1
z=1
a=altura-1
b="*"
for i in range(altura):
    for e in range(z):
        print b,
    z=z+1
    print
for i in range(a):
    for e in range(y,altura):
        print b,
    y=y+1
    print
