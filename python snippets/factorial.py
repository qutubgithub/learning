def factorial(num):
    return num*factorial(num - 1) if num > 1 else 1

print(factorial(4))
