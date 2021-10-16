#import regular expressions
import re

#paragraph provided for search and replace
lorem_ipsum = '''Lorem ipsum dolor sit-amet, consectetur adipiscing elit. Phasellus iaculis velit ac nunc interdum tempor. 
Ut volutpat elit metus, vel auctor enim commodo at. Nunc quis quam non ligula ultricies luctus porta id justo. 
Quisque dapibus est ut sagittis bibendum. Mauris ullamcorper pellentesque porttitor. Ut sit:amet ex nec dolor gravida 
porttitor. Proin at justo finibus justo vestibulum congue. Suspendisse et ipsum et ipsum eleifend dapibus a fermentum 
lacus. Vivamus porta nunc eu nisl sagittis, quis vulputate metus dignissim. Integer non fermentum nisl, id vestibulum 
elit. Sed euismod vestibulum purus ut porttitor. Integer sit-amet mollis neque. Donec sed lacinia diam, ac finibus 
lectus. Mauris tempor ipsum nisl, vitae posuere est lacinia nec. Nam eget euismod odio.'''

#outputs all of the nonnumerical characters from the lorem_ipsum
results = re.findall("[^a-zA-Z0-9]",lorem_ipsum)
print(len(results))

#prints all the times sit-amet appeared or sit:amet then prints out how many times it happened. 
occurrences_sit_amet = re.findall('sit[-:]amet',lorem_ipsum)
print(len(occurrences_sit_amet))

#replaces all the times sit-amet appeared or sit:amet with sit amet then prints it out 
replace_results = re.sub('sit[:-]amet', 'sit amet',lorem_ipsum)
occurence_sit_amet = re.findall('sit amet',replace_results)
print(len(occurence_sit_amet))

