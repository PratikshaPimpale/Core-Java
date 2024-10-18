#A) Write a Python program to accept n numbers in list and remove duplicates from a list.
n=int(input("Enter Limit:"))
a=list()
for i in range(0,n):
    num=int(input("Enter value:"))
    a.append(num)
b=set(a)
print(b)