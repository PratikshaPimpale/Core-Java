#A) Write a python script to generate the following pattern 
# *
# **
# ***

   
n = int(input("Enter the number of rows"))       
for i in range(0, n):    
        for j in range(0, i + 1):        
            print("* ", end="")       
        print()    