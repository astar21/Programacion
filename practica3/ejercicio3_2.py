'''Ejercicio_02
Escribe un programa que pida el peso y la altura de una persona y que calcule su índice de masa
corporal (imc). El imc se calcula con la fórmula imc = peso / altura2'''
print "Dime tu peso"
peso=float(input ("peso"))
print "Dame tu altura"
altura=float(input ("altura"))
imc = peso/(altura*altura)
print imc, "este es tu imc"
