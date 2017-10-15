# basic example

class BankAccount:
    account_numbers = 0

    def __init__(self):
        self.balance = 0
        account_numbers += 1

    def withdraw(self, amount):
        self.balance -= amount
        return self.balance

    def deposit(self, amount):
        self.balance += amount
        return self.balance

    def close(self):
        self.isClosed = True
        account_numbers -= 1
