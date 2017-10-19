'''6.- Fer un programa que demani un nombre de com a màxim 3 xifres a un usuari (per
exemple serien vàlids 1, 99 i 213 però no 1001). Si l'usuari entra un nombre de més 3 xifres
ha de donar un error'''
num =int(input("introduce un numero de solo 3 cifras"))
num=str(num)
if len(num)>3:
         print"error el numero tiene mas de tres cifras"
else:
         print"el numero es correcto"
