'''Escribe un programa que pida una cantidad y que escriba cuántas gruesas, docenas y unidades
son. Recuerda que una gruesa son doce docenas.'''

numero=input("dame un numero")
gruesas=(numero/12)/12
docenas=(numero/12)-(gruesas*12)
unidades=numero%12
print numero,"som",gruesas,"gruesas",docenas,"docenas",unidades,"unidades"


