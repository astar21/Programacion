frase =raw_input('Escribe una frase')
def cuenta(x):
    a=0
    vocales='aeiou'
    for i in range (len(vocales)):
        if vocales[i] in x:
            a=x.count(vocales[i])
        print 'La vocal',vocales[i],'aparece',a,'veces.'
cuenta(frase)
