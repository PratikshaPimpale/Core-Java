#A) Write a Python program to add or remove operation on set and length of set 
# Function to demonstrate set operations
def set_operations():
    # Initializing a set
    my_set = {10, 20, 30, 40, 50}
    print("Original Set:", my_set)

    # Add an element to the set
    my_set.add(60)
    print("Set after adding 60:", my_set)

    # Remove an element from the set
    my_set.remove(30)  # This will raise an error if the element is not found
    print("Set after removing 30:", my_set)

    # Discard an element (won't raise an error if the element is not found)
    my_set.discard(70)  # No error, as 70 is not in the set
    print("Set after attempting to discard 70 (not in set):", my_set)

    # Checking the length of the set
    print("Length of the set:", len(my_set))

# Calling the function
set_operations()
