#A) Write a Python program to check if a given key already exists in a dictionary. If 
#key exists replace with another key/value pair. 
my_dict = {
    'name': 'John',
    'age': 30,
    'city': 'New York'
}
key_to_check = 'age'
new_key = 'new_age'
new_value = 25

if key_to_check in my_dict:
    my_dict[new_key] = new_value
    del my_dict[key_to_check]
    print(f"Key '{key_to_check}' found and replaced with '{new_key}'")
else:
    print(f"Key '{key_to_check}' not found in the dictionary")

print(my_dict)
