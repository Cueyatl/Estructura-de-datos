import numpy as np
class Person:
  def __init__(self, name, age):
    self.name = name
    self.age = age

  def myfunc(self):
    print("Hello my name is " + self.name)
  def tryme(self):
    a = np.array([1, 2, 3])
    b = np.array([4, 5, 6])
    result = a + b  # Element-wise addition
    print(result)
# class Node:
#   def __init__(self):
#     pass
p1 = Person("John", 36)
p1.myfunc()
p1.tryme()
