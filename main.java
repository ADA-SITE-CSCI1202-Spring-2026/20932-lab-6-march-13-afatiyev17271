public class main {

    public static void main(String[] args) {

        Account acc = new Account(1, "John", 500);

        acc.deposit(200);
        System.out.println("Balance: " + acc.getBalance());

        try {
            acc.withdraw(800);
        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Final Balance: " + acc.getBalance());
    }
}