class Account:
    """A very small bank account model with basic validation.

    The account manages its own balance and exposes a minimal API: deposit,
    withdraw, and get_balance.
    """

    def __init__(self, owner: str, initial_balance: float = 0.0) -> None:
        if initial_balance < 0:
            raise ValueError("Initial balance cannot be negative")
        self.owner: str = owner
        self._balance: float = float(initial_balance)

    def deposit(self, amount: float) -> None:
        amount = float(amount)
        if amount <= 0:
            raise ValueError("Deposit amount must be positive")
        self._balance += amount

    def withdraw(self, amount: float) -> None:
        amount = float(amount)
        if amount <= 0:
            raise ValueError("Withdrawal amount must be positive")
        if amount > self._balance:
            raise ValueError("Insufficient funds for this withdrawal")
        self._balance -= amount

    def get_balance(self) -> float:
        return self._balance

    def __repr__(self) -> str:
        return f"Account(owner={self.owner!r}, balance={self._balance:.2f})"