palabra1=raw_input('introduce una palabra de 3 letras')
palabra2=raw_input('introduce otra palbra igual')
def frase(x,y):
    a=0
    for i in range (-1,-4,-1):
        if x[i]==y[i]:
            a=a+1
    if a>=3:
        print 'Las palabras riman'
    elif a==2:
        print 'Las palabras riman un poco'
    else:
        print 'Las palabras no riman'
frase(palabra1,palabra2)
