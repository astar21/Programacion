'''7.- Fer un programa que demani un nombre de nom�s 3 xifres a un usuari (per exemple
serien v�lids 201, 999 i 113 per� no 1001, 99, 1 o 23). Si l'usuari entra un nombre que no
sigui de 3 xifres ha de donar un error. '''
num =int(input("introduce un numero de solo 3 cifras"))
num=str(num)
if len(num)==3:
            print"el numero es correcto"
else: 
         print"error el numero no contiene unicamente 3 cifras"
