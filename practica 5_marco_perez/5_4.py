print"dame un numero";
a=float(input())
print"dame otro numero mayor";
b=float(input())
li=[a,b]
while a<b:
    print li
    break;
   
if a>b:
    print "vulve a meter el segundo digito"
b=float(input())
li=[a,b]
print li  
