num=int(input("Introduce cuantas palabras tiene la primera lista: "))

if num < 1:
    print("Imposible")
else:
    primera = []
    for i in range(num):
        print("Introduce la palabra", str(i + 1) + ": ", end="")
        palabra = input()
        primera += [palabra]
    print("La primera lista es:", primera)

    for i in range(len(primera)-1, -1, -1):
        if primera[i] in primera[:i]:
            del(primera[i])
            
    num2 = int(input("Introduce el numero de palabras que tiene la segunda lista: "))

    if num2 < 1:
        print("Imposible")
    else:
        segunda = []
        for i in range(num2):
            print("Introduce una palabra", str(i + 1) + ": ", end="")
            palabra = input()
            segunda += [palabra]
        print("La segunda lista es:", segunda)

        for i in range(len(segunda)-1, -1, -1):
            if segunda[i] in segunda[:i]:
                del(segunda[i])

        comunes = []
        for i in primera:
            if i in segunda:
                comunes += [i]
        print("Palabras que aparecen en las dos listas:", comunes)

        solo_Primera = []
        for i in primera:
            if i not in segunda:
                solo_Primera += [i]
        print("Palabras que solo aparecen en la primera lista:", solo_Primera)

        solo_Segunda = []
        for i in segunda:
            if i not in primera:
                solo_Segunda += [i]
        print("Palabras que solo aparecen en la segunda lista:", solo_Segunda)

        todas = comunes + solo_Primera + solo_Segunda
        print("Todas las palabras:", todas)
