'''
Samuel Bailey
Project 3 ATM
IT-140
'''

##import system input
import sys

#account balance 
global account_balance
account_balance = float(500.25)

#printbalance function
def balance():
  print("Your current balance:\n"+str(account_balance))

#deposit function
def deposit(amount):
  print("Deposit was $%.2f, current balance is $%.2f" %(amount, amount + account_balance))
  account_balance += deposit_amount
  
#withdraw function / declared global balance at top 
def withdrawal(amount):
  global account_balance
  if amount > account_balance:
    print("$%.2f is greater than your account balance of $%.2f"%(amount, account_balance))
  else:
    account_balance -= amount
    print("Withdrawal amount was $%.2f, current balance is $%.2f"%(amount,account_balance))
  
#User Input goes here, use if/else conditional statement to call function based on user input
userchoice = input("What would you like to do?\n")
if (userchoice == 'B'.upper()):
  balance()
if (userchoice == 'D'.upper()):
  deposit_amount = float(input("How much would you like to deposit today?\n"))
  deposit(deposit_amount)
if (userchoice == 'W'.upper()):
  withdrawal_amount = float(input("How much would you like to withdraw today?\n"))
  withdrawal(withdrawal_amount)
if (userchoice == 'Q'.upper()):
  print("Thank you for banking with us.")