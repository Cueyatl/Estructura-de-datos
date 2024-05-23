from node import Node
class simple_list:
  
  def __init__(self):
    self.head=None
    
  def is_empty(self):
    return self.head is None

  def print_list(self):
    current_node=self.head
    print("Head")
    while current_node:
      print(current_node.data, end=" -> ")
      current_node=current_node.next
    print("Tail")

  def add_to_head(self, data):
    new_node=Node(data)
    new_node.next=self.head
    self.head = new_node
    
    
  def add_to_tail(self, data):
    new_node=Node(data)
    new_node.next=self.head
    tail=self.head
    if tail is None:
      self.head=Node(data)  
    else:  
      while tail.next is not None:
        tail=tail.next
      tail.next=Node(data)
  
  def remove_from_head(self):
    removed_head=self.head
    if removed_head is None:
      return  "The list is already empty."
    self.head=removed_head.next
    removed_head.next=None
    return removed_head.data
  
  def  remove_from_tail(self):
    if self.is_empty():
      return
    if self.head.next is None:
      removed_node=self.head
      self.head=None
      return removed_node.data
    current = self.head
    while current.next.next:
        current = current.next
    removed_node = current.next
    current.next = None
    return removed_node.data





    

    