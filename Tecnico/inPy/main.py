from inPy.simple_list import LinkedList
def main():
  ma_list=[1,2,3,4,5,6,7,8,9]
  linked_list=LinkedList()
  for value in ma_list:
    linked_list.add_to_tail(value)

  linked_list.print_list()
  
if __name__=="__main__":
  main()

