#B) Write a python script to define a class student having members roll no, name, age, 
 #gender. Create a subclass called Test with member marks of 3 subjects. Create three 
 #objects of the Test class and display all the details of the student with total marks.

 class Student:
    def __init__(self, roll_no, name, age, gender):
        self.roll_no = roll_no
        self.name = name
        self.age = age
        self.gender = gender

class Test(Student):
    def __init__(self, roll_no, name, age, gender, marks):
        super().__init__(roll_no, name, age, gender)
        self.marks = marks

    def total_marks(self):
        return sum(self.marks)

student1 = Test(101, 'Gita', 18, 'Female', [85, 90, 92])
student2 = Test(102, 'Sham', 19, 'Male', [78, 88, 75])
student3 = Test(103, 'Ramn’, 20, 'Male', [92, 91, 89])

students = [student1, student2, student3]

for student in students:
    print(f"Roll No: {student.roll_no}")
    print(f"Name: {student.name}")
    print(f"Age: {student.age}")
    print(f"Gender: {student.gender}")
    print(f"Marks: {student.marks}")
    print(f"Total Marks: {student.total_marks()}\n")
