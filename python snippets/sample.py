import numpy as np
import random

# Sorting array with unique value
arr = [7,2,9,2,7,4,10,7,2,9,1]
print(sorted(set(arr)))

arr = np.linspace(1,10,10)
print(arr)

arr = np.arange(1,11,1)
print(arr)
print(list(range(1,10)))

print(np.ones((2,2)))

print(np.empty((2,2)))

arr = []
for i in range(1,1000):
	arr.insert(0,random.choice(range(1,1000000)))
print(arr)
