a = int(input("Enter first number"))
b = int(input("Enter second number"))

minm = min(a, b)
maxm = max(a, b)


while minm != 0:
    gcd = minm
    minm = maxm % minm

print("GCD of {} and {} is {}".format(a, b, gcd))

