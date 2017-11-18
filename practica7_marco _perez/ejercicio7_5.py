frase=raw_input('introduce una frase')
vocal=raw_input('introduce una vocal')
def sustituirvocal(x,y):
    a=''
    vovlaes='aeiou'
    for i in range (len(x)):
        if x[i] in vovlaes:
            a=a+y
        else:
            a=a+x[i]
    return a
print 'Ahora dice:',sustituirvocal(frase,vocal)

