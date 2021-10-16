'''
Project Two
IT-140
Samuel Bailey
'''

#Task: Create the empty data structures
grocery_item = {}
grocery_history = []

#declaration for finished to activate the while loop 
finished = 'this string is irrelevant' 

#While loop to take input from user to use in the program
wloop = 'c'
while finished != 'q': 
  item_name = input("Item name:\n")
  quantity = input("Quantity purchased:\n")
  cost = input("Price per item:\n")
  grocery_item = {'name':item_name,'number': int(quantity),'price':float(cost)}
  grocery_history.append(grocery_item.copy())
  finished = input("Would you like to enter another item?\nType 'c' for continue or 'q' to quit:\n")

# Define variable to hold grand total called 'grand_total'
grand_total = 0

#For loop for calculating the grand total price from the input.
for loop in grocery_history:
  item_total = (loop['price']*loop['number'])
  grand_total += item_total

  #debug print statements
  #print(grocery_item['number'])
  #print(grocery_item['price'])
  #print(loop)
  #print(str(loop['price']))
  
  print(str(loop['number']) + str(" ") + str(loop['name']) + str(" @ $"),end = '')
  print(str(loop['price']),end = '')
  print(" ea $"+str(item_total))
  
#print the grand total
print("Grand total: $"+(str(grand_total)))
