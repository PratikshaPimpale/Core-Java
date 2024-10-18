#B) Write a Python program to accept two lists and merge the two lists into list of tuple. 
# Function to merge two lists into a list of tuples
def merge_lists(list1, list2):
    # Use zip() to pair elements from both lists into tuples
    merged_list = list(zip(list1, list2))
    return merged_list

# Accepting two lists from the user
list1 = input("Enter the first list of elements (separated by spaces): ").split()
list2 = input("Enter the second list of elements (separated by spaces): ").split()

# Check if both lists have the same length
if len(list1) != len(list2):
    print("Error: Both lists must have the same number of elements.")
else:
    # Merging the two lists
    merged_list = merge_lists(list1, list2)
    print("Merged list of tuples:", merged_list)
