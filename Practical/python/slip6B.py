#B)Write a python GUI program to create two buttons exist and hello using tkinter module.
import tkinter as tk
from tkinter import ttk

# Function to be called when the "Hello" button is clicked
def say_hello():
    label.config(text="Hello, World!")

# Function to exit the application
def exit_app():
    root.quit()

# Creating the main window
root = tk.Tk()
root.title("Button Example")
root.geometry("300x150")  # Set window size

# Creating Buttons
hello_button = ttk.Button(root, text="Hello", command=say_hello)
exit_button = ttk.Button(root, text="Exit", command=exit_app)

# Positioning buttons using grid
hello_button.grid(column=0, row=0, padx=20, pady=20)
exit_button.grid(column=1, row=0, padx=20, pady=20)

# Label to display "Hello" message
label = ttk.Label(root, text="", font=("Arial", 12))
label.grid(column=0, row=1, columnspan=2, pady=20)

# Running the main loop
root.mainloop()

