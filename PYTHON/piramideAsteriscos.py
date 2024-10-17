num = int(input("Dime un número: "))
while (num % 2 != 0):
    num = int(input("El número es impar, dime un número par: "))
asterisco = "*"
espacios = ""
totalAsteriscos = ""
for i in range(1, num+1, 2):
    espacios = (num-i) / 2
    totalAsteriscos += asterisco
    print(" " * int(espacios) + "*" * i)
