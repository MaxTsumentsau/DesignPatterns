package pattern.structural.proxy.bank;

public enum UserRole {
    OWNER,
    MANAGER,
    GUEST;

    public boolean canWithdraw() {
        return this == OWNER;
    }

    public boolean canDeposit() {
        return this == OWNER || this == MANAGER;
    }
}
