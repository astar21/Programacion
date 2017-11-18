numpa=raw_input('introduce una palabra o numero')
def comprobador(x):
    a=''
    b=0
    for i in range (len(x)-1,-1,-1):
        a=a+x[i]
    for i in range (len(x)):
        if x[i]!=a[i]:
            b=b+1
    if b!=0:
        return x,'no es palindroma o capicua'
    else:
        return x,'es plindroma o capicua'
print comprobador(numpa)
