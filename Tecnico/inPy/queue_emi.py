from inPy.simple_list import simple_list
from node import Node
class Queue:
  
  def __init__(self):
    self.queue=simple_list()
    self.size=0
    self.max_size=1199
  
  def has_space(self):
    return self.size<self.max_size
  
  def enqueue(self, value):
      if (self.has_space()):
          self.size += 1
          self.queue.add_to_tail(value)
          print("added ", value)
      else:
          print("Queue is full.")
  
  def dequeue(self):
    if not self.queue.is_empty():
        return self.queue.remove_from_head()
  
  def print_list(self):
    print (self.queue.print_list())

def main():
  tenga=Queue()
  tenga.enqueue(1)
  tenga.enqueue(3)
  tenga.enqueue(4)
  tenga.enqueue(2)
  tenga.dequeue()
  tenga.dequeue()
  tenga.print_list()

if __name__ == "__main__":
  main()