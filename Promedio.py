nota1 = int(input())
nota2 = int(input())
nota3 = int(input())

promedio = (nota1+nota2+nota3)/3

if(promedio >=11):
    print(promedio," APROBADO")
else:
    if(promedio > 8 and promedio < 11):
        print(promedio," DESAPROBADO")
    else:
        print(promedio," REPROBADO")