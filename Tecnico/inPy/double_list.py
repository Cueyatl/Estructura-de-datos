class Node:
    """
    Represents a node in a doubly linked list.
    """

    def __init__(self, data):
        """
        Initializes a new node with the given data.

        Args:
            data: The data to store in the node.
        """
        self.data = data
        self.prev = None
        self.next = None


class DoublyLinkedList:
    """
    Represents a doubly linked list data structure.
    """

    def __init__(self):
        """
        Initializes an empty doubly linked list.
        """
        self.head = None
        self.tail = None

    def is_empty(self):
        """
        Checks if the linked list is empty.

        Returns:
            True if the list is empty, False otherwise.
        """
        return self.head is None

    def append(self, data):
        """
        Appends a new node with the given data to the end of the linked list.

        Args:
            data: The data to store in the new node.
        """
        new_node = Node(data)
        if self.is_empty():
            self.head = new_node
            self.tail = new_node
        else:
            self.tail.next = new_node
            new_node.prev = self.tail
            self.tail = new_node

    def __str__(self):
        """
        Returns a string representation of the linked list.

        Returns:
            A string representation of the linked list, showing the data of each node.
        """
        string_representation = ""
        current = self.head
        while current is not None:
            string_representation += f"{current.data} <-> "
            current = current.next
        return string_representation[:-4]


# Example usage
linked_list = DoublyLinkedList()
linked_list.append(1)
linked_list.append(2)
linked_list.append(3)

print(linked_list)  # Output: 1 <-> 2 <-> 3
