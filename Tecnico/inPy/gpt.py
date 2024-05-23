class Node:
  """
  Represents a single node in a linked list.
  """
  def __init__(self, data):
    self.data = data
    self.next = None

class LinkedList:
  """
  Represents a linked list data structure.
  """
  def __init__(self):
    self.head = None

  def is_empty(self):
    """
    Checks if the linked list is empty.
    """
    return self.head is None

  def insert_at_beginning(self, data):
    """
    Inserts a new node at the beginning of the linked list.
    """
    new_node = Node(data)
    new_node.next = self.head
    self.head = new_node

  def insert_at_end(self, data):
    """
    Inserts a new node at the end of the linked list.
    """
    new_node = Node(data)
    if self.is_empty():
      self.head = new_node
      return
    current = self.head
    while current.next:
      current = current.next
    current.next = new_node

  def remove_at_beginning(self):
    """
    Removes the first node from the linked list.
    """
    if self.is_empty():
      return
    removed_node = self.head
    self.head = self.head.next
    removed_node.next = None
    return removed_node.data

  def remove_at_end(self):
    """
    Removes the last node from the linked list.
    """
    if self.is_empty():
      return
    if self.head.next is None:
      removed_node = self.head
      self.head = None
      return removed_node.data
    current = self.head
    while current.next.next:
      current = current.next
    removed_node = current.next
    current.next = None
    return removed_node.data

  def print_list(self):
    """
    Prints the contents of the linked list.
    """
    current = self.head
    while current:
      print(current.data, end=" -> ")
      current = current.next
    print("None")

# Example usage
linked_list = LinkedList()
linked_list.insert_at_beginning(5)
linked_list.insert_at_end(10)
linked_list.insert_at_beginning(2)
linked_list.print_list()  # Output: 2 -> 5 -> 10 -> None

removed_data = linked_list.remove_at_end()
print(f"Removed data from end: {removed_data}")
linked_list.print_list()  # Output: 2 -> 5 -> None

removed_data = linked_list.remove_at_beginning()
print(f"Removed data from beginning: {removed_data}")
linked_list.print_list()  # Output: 5 -> None
