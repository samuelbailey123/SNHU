import sys

'''
Samuel Bailey
Project 1 
IT-140
'''

#take input from user(Length of rent)
rentalCode = input("(B)udget, (D)aily, or (W)eekly rental?\n")
if rentalCode == 'W':
  rentalPeriod = input("Number of Weeks Rented:\n")
else:
  rentalPeriod = input("Number of Days Rented:\n")

#odometer reader start and end inputs 
odoStart = input("Starting Odometer Reading:\n")
odoEnd = input("Ending Odometer Reading:\n")
totalMiles = int(odoEnd) - int(odoStart)

#values for budget, daily, or weekly
#B = 40.00 |D = 60.00 | W = 190.00

#calculate baseCharge / reading the rentalCode input from user then deciding what calculations charge 
if (rentalCode =='B'):
  baseCharge = int(rentalPeriod) * 40.00
elif (rentalCode =='D'):
  baseCharge = int(rentalPeriod) * 60.00
elif (rentalCode == 'W'):
  baseCharge = int(rentalPeriod) * 190.00

#calculations for the rental mileCharge. 
if rentalCode == 'B':
  mileCharge = int(totalMiles) * (.25)
if rentalCode == 'D':
  averageDayMiles = int(totalMiles)/int(rentalPeriod)
  
  if averageDayMiles <= 100:
    extraMiles = 0
  if averageDayMiles > 100:
    extraMiles = averageDayMiles - 100
    mileCharge = extraMiles * .25
   
if rentalCode == 'W':
  averageWeekMiles = (totalMiles)/rentalPeriod
  if averageWeekMiles > 900:
    mileCharge = 100.00 
  else: 
      mileCharge = 0.00

#amount due calculations
amtDue = baseCharge + mileCharge

#debugging print
print("Rental Summary")
print("Rental Code: ",rentalCode)
print("Rental Period: ",rentalPeriod)
print("Starting Odometer: ",odoStart)
print("Ending Odometer: ",odoEnd)
print("Miles Driven: ",totalMiles)
print("Amount Due: ${:.2f}".format(amtDue))