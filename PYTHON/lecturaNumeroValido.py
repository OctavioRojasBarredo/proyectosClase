num = input("Dime un numero: ")
if (num.isdigit()):
    print("El número "+num+" es dígito")
else: 
    while (not num.isdigit()):
        num = input("Dime un numero válido: ")
    if (num.isdigit()):
        print("El número "+num+" es dígito")