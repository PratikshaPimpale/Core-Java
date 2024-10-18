# A) Write Python program to perform all tuples operation. 
# Python program to perform all tuple operations

# 1. Creating a tuple
tuple1 = (10, 20, 30, 40, 50)
print("Original Tuple:", tuple1)

# 2. Accessing elements in a tuple (indexing and slicing)
print("Element at index 2:", tuple1[2])
print("Slicing tuple from index 1 to 3:", tuple1[1:4])

# 3. Tuple length
print("Length of tuple:", len(tuple1))

# 4. Concatenation of two tuples
tuple2 = (60, 70)
concatenated_tuple = tuple1 + tuple2
print("Concatenated Tuple:", concatenated_tuple)

# 5. Repetition of a tuple
repeated_tuple = tuple1 * 2
print("Repeated Tuple:", repeated_tuple)

# 6. Checking membership (in, not in)
print("Is 30 in the tuple?", 30 in tuple1)
print("Is 80 not in the tuple?", 80 not in tuple1)

# 7. Iterating through a tuple
print("Iterating through tuple:")
for item in tuple1:
    print(item)

# 8. Finding max and min values in a tuple (if the elements are of same type)
print("Maximum value in the tuple:", max(tuple1))
print("Minimum value in the tuple:", min(tuple1))

# 9. Counting occurrences of a value in a tuple
print("Count of 20 in tuple:", tuple1.count(20))

# 10. Finding the index of a value in a tuple
print("Index of 30 in tuple:", tuple1.index(30))

# 11. Converting a list into a tuple
sample_list = [1, 2, 3, 4]
tuple_from_list = tuple(sample_list)
print("Tuple from list:", tuple_from_list)

# 12. Unpacking a tuple
a, b, c, d, e = tuple1
print("Unpacked Values:", a, b, c, d, e)

# 13. Nested tuples
nested_tuple = ((1, 2), (3, 4), (5, 6))
print("Nested Tuple:", nested_tuple)
print("Accessing element from nested tuple:", nested_tuple[1][1])

# 14. Tuple immutability (demonstrating error on modification)
try:
    tuple1[1] = 100  # This will raise a TypeError
except TypeError as e:
    print("Error on trying to modify tuple:", e)
