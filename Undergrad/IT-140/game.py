rooms = {
    'Great Hall': {'south': 'Study', 'west': 'Library', 'east': 'Dining Hall', 'north': 'Sitting Room'},
    'Sitting Room': {'south': 'Great Hall', 'east': 'Foyer'},
    'Foyer': {'west': 'Sitting Room'},
    'Dining Hall': {'west': 'Great Hall', 'north': 'Kitchen'},
    'Kitchen': {'south': 'Dining Hall'},
    'Library': {'east': 'Great Hall'},
    'Study': {'north': 'Great Hall', 'east': 'Cellar'},
    'Cellar': {'west': 'Study'},
    'End': {},
}
items = {
    'Great Hall': {'nothing'},
    'Sitting Room': {'a Fez'},
    'Foyer': {'a Bow Tie'},
    'Dining Hall': {'TARDIS key'},
    'Kitchen': {'a Dalek'},
    'Library': {' a copy of River\'s Diary'},
    'Study': {'a Sonic Screwdriver'},
    'Cellar': {'a TARDIS'},
}
player_inventory = []
current_room     = 'Great Hall'  # Starting location
move             = ''  # declare move and clear input

def room_guide():
    if current_room == 'Great Hall':
        if items[current_room] == {'a Dalek'}: # check for Dalek to end game
            print('A Dalek notices you from across the room.\n'
                  'You have been EXTERMINATED!')
            exit()
        print('There are doors to the North, East, South and West.')
        if items[current_room] == {'nothing'} or items[current_room] == 'nothing': # check room for items
            print('There is nothing in the room.')
        else:
            for i in items[current_room]: # get items from list to print
                print('There is', i, 'in the room.') # print room items
            print('Would you like to get this item? y/n') # prompt to retrieve item
            item_get = input().lower().strip() #format input for comparison 
            if item_get == 'y':
                player_inventory.append(items[current_room])
                if len(player_inventory) == 6: # check for victory condition
                    print('Congratulations, you have collected all the items and escaped in the TARDIS.')
                    exit()
                for i in items[current_room]:
                    print('You have added', items[current_room], 'to your inventory') # confirm item retrieved
                    items[current_room] = 'nothing' # clear retrieved item from room inventory
            else:
                print('You did not get the item') # confirm refusal of item
    elif current_room == 'Study':
        if items[current_room] == {'a Dalek'}: # check for Dalek to end game
            print('A Dalek notices you from across the room.\n'
                  'You have been EXTERMINATED!')
            exit()
        print('There are doors to the North and East')
        if items[current_room] == {'nothing'} or items[current_room] == 'nothing':
            print('There is nothing in the room.')
        else:
            for i in items[current_room]: # get items from list to print
                print('There is', i, 'in the room.') # print room items
            print('Would you like to get this item? y/n')
            item_get = input().lower().strip() #format input for comparison
            if item_get == 'y':
                player_inventory.append(items[current_room])
                if len(player_inventory) == 6: # check for victory condition
                    print('you have collected all the items and escaped in the TARDIS.')
                    exit()
                for i in items[current_room]:
                    print('You have added', i, 'to your inventory')
                    items[current_room] = 'nothing' # clear retrieved item from room inventory
            else:
                print('You did not get the item') # confirm refusal of item
    elif current_room == 'Cellar':
        if items[current_room] == {'a Dalek'}: # check for Dalek to end game
            print('A Dalek notices you from across the room.\n'
                  'You have been EXTERMINATED!')
            exit()
        print('There is a door to the West')
        if items[current_room] == {'nothing'} or items[current_room] == 'nothing':
            print('There is nothing in the room')
        else:
            for i in items[current_room]: # get items from list to print
                print('There is', i, 'in the room.') # print room items
            print('Would you like to get this item? y/n')
            item_get = input().lower().strip() #format input for comparison
            if item_get == 'y':
                player_inventory.append(items[current_room])
                if len(player_inventory) == 6: # check for victory condition
                    print('Congratulations, you have collected all the items and escaped in the TARDIS.')
                    exit()
                print('You have added', i, 'to your inventory')
                items[current_room] = 'nothing' # clear retrieved item from room inventory
            else:
                print('You did not get the item') # confirm refusal of item
    elif current_room == 'Library':
        if items[current_room] == {'a Dalek'}: # check for Dalek to end game
            print('A Dalek notices you from across the room.\n'
                  'You have been EXTERMINATED!')
            exit()
        print('There is a door to the East')
        if items[current_room] == {'nothing'} or items[current_room] == 'nothing':
            print('There is nothing in the room.')
        else:
            for i in items[current_room]: # get items from list to print
                print('There is', i, 'in the room.') # print room items
            print('Would you like to get this item? y/n')
            item_get = input().lower().strip() #format input for comparison
            if item_get == 'y':
                player_inventory.append(items[current_room])
                if len(player_inventory) == 6: # check for victory condition
                    print('Congratulations, you have collected all the items and escaped in the TARDIS.')
                    exit()
                for i in items[current_room]:
                    print('You have added', i, 'to your inventory')
                    items[current_room] = 'nothing' # clear retrieved item from room inventory
            else:
                print('You did not get the item') # confirm refusal of item
    elif current_room == 'Dining Hall':
        if items[current_room] == {'a Dalek'}: # check for Dalek to end game
            print('A Dalek notices you from across the room.\n'
                  'You have been EXTERMINATED!')
            exit()
        print('There are doors to the West and North')
        if items[current_room] == {'nothing'} or items[current_room] == 'nothing':
            print('There is nothing in the room.')
        else:
            for i in items[current_room]: # get items from list to print
                print('There is', i, 'in the room.') # print room items
            print('Would you like to get this item? y/n')
            item_get = input().lower().strip() #format input for comparison
            if item_get == 'y':
                player_inventory.append(items[current_room])
                if len(player_inventory) == 6: # check for victory condition
                    print('Congratulations, you have collected all the items and escaped in the TARDIS.')
                    exit()
                for i in items[current_room]:
                    print('You have added', i, 'to your inventory')
                    items[current_room] = 'nothing' # clear retrieved item from room inventory
            else:
                print('You did not get the item') # confirm refusal of item
    elif current_room == 'Kitchen':
        if items[current_room] == {'a Dalek'}: # check for Dalek to end game
            print('A Dalek notices you from across the room.\n'
                  'You have been EXTERMINATED!')
            exit()
        print('There is a door to the South')
        if items[current_room] == {'nothing'} or items[current_room] == 'nothing':
            print('There is nothing in the room.')
        else:
            for i in items[current_room]: # get items from list to print
                print('There is', i, 'in the room.') # print room items
            print('Would you like to get this item? y/n')
            item_get = input().lower().strip() #format input for comparison
            if item_get == 'y':
                player_inventory.append(items[current_room])
                if len(player_inventory) == 6: # check for victory condition
                    print('Congratulations, you have collected all the items and escaped in the TARDIS.')
                    exit()
                for i in items[current_room]:
                    print('You have added', i, 'to your inventory')
                    items[current_room] = 'nothing' # clear retrieved item from room inventory
            else:
                print('You did not get the item') # confirm refusal of item
    elif current_room == 'Sitting Room':
        if items[current_room] == {'a Dalek'}: # check for Dalek to end game
            print('A Dalek notices you from across the room.\n'
                  'You have been EXTERMINATED!')
            exit()
        print('There are doors to the East and South')
        if items[current_room] == {'nothing'} or items[current_room] == 'nothing':
            print('There is nothing in the room.')
        else:
            for i in items[current_room]: # get items from list to print
                print('There is', i, 'in the room.') # print room items
            print('Would you like to get this item? y/n')
            item_get = input().lower().strip() #format input for comparison
            if item_get == 'y':
                player_inventory.append(items[current_room])
                if len(player_inventory) == 6: # check for victory condition
                    print('Congratulations, you have collected all the items and escaped in the TARDIS.')
                    exit()
                for i in items[current_room]:
                    print('You have added', i, 'to your inventory')
                    items[current_room] = 'nothing' # clear retrieved item from room inventory
            else:
                print('You did not get the item') # confirm refusal of item
    elif current_room == 'Foyer':
        if items[current_room] == {'a Dalek'}: # check for Dalek to end game
            print('A Dalek notices you from across the room.\n'
                  'You have been EXTERMINATED!')
            exit()
        print('There is a door to the West')
        if items[current_room] == {'nothing'} or items[current_room] == 'nothing':
            print('There is nothing in the room.')
        else:
            for i in items[current_room]:
                print('There is', i, 'in the room.') # print room items # get items from list to print
            print('Would you like to get this item? y/n')
            item_get = input().lower().strip() #format input for comparison
            if item_get == 'y':
                player_inventory.append(items[current_room]) # add retrieved item to player inventory
                if len(player_inventory) == 6: # check for victory condition
                    print('Congratulations, you have collected all the items and escaped in the TARDIS.')
                    exit()
                for i in items[current_room]: # get items from list to print
                    print('You have added', i, 'to your inventory')
                    items[current_room] = 'nothing' # clear retrieved item from room inventory
    elif current_room == 'End':
        print('Thank you for playing. Goodbye.')
        move = 'quitgame'
        exit()
    else:
        print('You did not get the item') # confirm refusal of item

        
if __name__ == '__main__': # main start for code to run
    # player instructions
    print('Welcome to the Asylum, Doctor. You must find all six object hidden in the manor to escape in the Tardis.\n'
          'If you encounter the Dalek, you will be EXTERMINATED!!\n'
          'You can enter North, South, East, or West to move. Enter Quit to leave game.\n'
          'Press enter to begin')
    input()  # get first input to start game        

    while move != 'quitgame':
        print('\nYou are standing in the', current_room + '.')  # give player location and move options
        room_guide()
        print('Which direction do you want to move?')
        # print('\n', player_inventory)
        # print('\n', len.player_inventory)
        # print(move, len(player_inventory))
        move = input().lower().strip()  # convert to lower case and removed extra spaces

        if move in rooms[current_room]: # validate move selection
            current_room = rooms[current_room][move] #move to room
        elif move == 'quit':
            current_room = 'End'
        else:
            print("You can't go that way.") # invalid move or bad input response
