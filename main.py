from account import Account


def simulate_basic_flow() -> None:
    account = Account(owner="Alice", initial_balance=100.0)
    print(f"Created account for {account.owner}. Starting balance: ${account.get_balance():.2f}")

    # Deposit
    account.deposit(50)
    print(f"Deposited $50.00. New balance: ${account.get_balance():.2f}")

    # Withdraw within balance
    account.withdraw(20)
    print(f"Withdrew $20.00. New balance: ${account.get_balance():.2f}")

    # Attempt to withdraw more than available
    try:
        account.withdraw(200)
    except ValueError as exc:
        print(f"Failed withdrawal: {exc}")
    finally:
        print(f"Final balance: ${account.get_balance():.2f}")


if __name__ == "__main__":
    simulate_basic_flow()