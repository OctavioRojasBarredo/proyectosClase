numero = int(input("Dime un número: "))
tabla = int(input("Dime la tabla de multiplicación: "))
resul = 0
contador = 0

while (contador < numero):
    contador = contador + 1
    resul = tabla * contador
    print(resul)
