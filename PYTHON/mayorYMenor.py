import math

mayorNumero = 0
menorNumero = math.inf
i = 0

for i in range(0, 5, i+1):
    num = int(input("Dame un número: "))
    if (num > mayorNumero):
        mayorNumero = num
    if (num < menorNumero):
        menorNumero = num
print("El mayor número es: "+mayorNumero)
print("El menor número es: "+menorNumero)