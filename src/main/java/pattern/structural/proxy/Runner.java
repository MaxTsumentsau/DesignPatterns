package pattern.structural.proxy;

public class Runner {
    public static void main(String[] args) {
        BankAccount ownerAccount = new ProtectionProxy("Иван", 1000, UserRole.OWNER);
        ownerAccount.withdraw(100);
        ownerAccount.withdraw(1100);
        ownerAccount.deposit(500);

        BankAccount managerAccount = new ProtectionProxy("Петр", 2000, UserRole.MANAGER);
        managerAccount.withdraw(100);
        managerAccount.deposit(300);

        BankAccount guestAccount = new ProtectionProxy("Анна", 3000, UserRole.GUEST);
        guestAccount.withdraw(100);
        guestAccount.deposit(200);
        System.out.println("Баланс: " + guestAccount.getBalance());
    }
}