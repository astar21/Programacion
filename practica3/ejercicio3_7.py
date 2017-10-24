segundos=input ("segundos")
hora= segundos/3600
minutos=(segundos/60)-(hora*60)
segundo=segundos%60
print hora ,"horas",minutos,"minutos",segundo,"segundos"
