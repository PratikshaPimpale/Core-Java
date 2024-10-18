#B) Write a python script to generate Fibonacci terms using generator function.
def fibonacci_generator():
    a, b = 0, 1
    while True:
        yield a
        a, b = b, a + b
fibonacci = fibonacci_generator()
for _ in range(10):
   print(next(fibonacci))
