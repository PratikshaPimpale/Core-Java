#B) Write python GUI program to create three radio buttons widget using tkinter module
import tkinter as tk
from tkinter import ttk

# Function to be called when a radio button is selected
def show_selected():
    selection = f"You selected: {selected_option.get()}"
    label.config(text=selection)

# Creating the main window
root = tk.Tk()
root.title("Radio Button Example")
root.geometry("300x200")  # Set window size

# Tkinter variable to store the value of the selected radio button
selected_option = tk.StringVar()
selected_option.set("Option 1")  # Set default option

# Creating Radio Buttons
radio1 = ttk.Radiobutton(root, text="Option 1", variable=selected_option, value="Option 1", command=show_selected)
radio2 = ttk.Radiobutton(root, text="Option 2", variable=selected_option, value="Option 2", command=show_selected)
radio3 = ttk.Radiobutton(root, text="Option 3", variable=selected_option, value="Option 3", command=show_selected)

# Positioning Radio Buttons using grid
radio1.grid(column=0, row=0, padx=10, pady=10)
radio2.grid(column=0, row=1, padx=10, pady=10)
radio3.grid(column=0, row=2, padx=10, pady=10)

# Label to display the selected option
label = ttk.Label(root, text="You selected: Option 1", font=("Arial", 12))
label.grid(column=0, row=3, padx=10, pady=20)

# Running the main loop
root.mainloop()

 