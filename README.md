# Basic Bank Account Simulator (Python)

A tiny OOP project that demonstrates encapsulation using an `Account` class with `deposit()`, `withdraw()`, and `get_balance()` methods. Includes basic error handling to prevent invalid operations like negative deposits or overdrafts.

## Files
- `account.py`: Defines the `Account` class and its behavior.
- `main.py`: Runs a short simulation to show typical usage.
- `README.md`: This guide.

## Requirements
- Python 3.8+

## Run
```bash
python3 main.py
```

## What it does
- Creates an account with an initial balance
- Makes a deposit and a withdrawal
- Attempts an over-withdrawal and shows a friendly error
- Prints the balance after each step

## Sample output
```text
Created account for Alice. Starting balance: $100.00
Deposited $50.00. New balance: $150.00
Withdrew $20.00. New balance: $130.00
Failed withdrawal: Insufficient funds for this withdrawal
Final balance: $130.00
```

## Notes
- This is intentionally basic. You can extend it with features like transaction history, transfer between accounts, or persistence later.
