#A) Write a Python GUI program to create a list of Computer Science Courses using Tkinter module (use Listbox).
import tkinter as tk
from tkinter import ttk

# Function to display the selected course
def show_selected_course(event):
    selected_course = courses_listbox.get(courses_listbox.curselection())
    label.config(text=f"Selected Course: {selected_course}")

# Creating the main window
root = tk.Tk()
root.title("Computer Science Courses")
root.geometry("300x250")  # Set window size

# Label to display a message
label = ttk.Label(root, text="Select a Course:", font=("Arial", 12))
label.pack(pady=10)

# List of Computer Science courses
courses = [
    "Data Structures",
    "Algorithms",
    "Operating Systems",
    "Computer Networks",
    "Database Management Systems",
    "Software Engineering",
    "Artificial Intelligence",
    "Machine Learning",
    "Computer Graphics",
    "Cyber Security"
]

# Creating a Listbox widget
courses_listbox = tk.Listbox(root, height=8)
for course in courses:
    courses_listbox.insert(tk.END, course)

courses_listbox.pack(pady=10)

# Binding the selection event to display the selected course
courses_listbox.bind('<<ListboxSelect>>', show_selected_course)

# Label to display the selected course
label = ttk.Label(root, text="", font=("Arial", 12))
label.pack(pady=10)

# Running the main loop
root.mainloop()
