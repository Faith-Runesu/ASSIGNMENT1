//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        // Define the Bank class
        class Bank {
            private final String accountType;
            private int accountBalance;

            // Parameterized constructor to initialize accountType and accountBalance
            public Bank(String accountType, int accountBalance) {
                this.accountType = accountType;
                this.accountBalance = accountBalance;
            }

            // Method to deposit money into the account
            public void deposit(int amount) {
                accountBalance += amount;
            }

            // Method to withdraw money from the account
            public void withdrawal(int amount) {
                if (amount > accountBalance) {
                    System.out.println("Insufficient funds");
                } else {
                    accountBalance -= amount;
                }
            }

            // Method to display the account type and balance
            public void display() {
                System.out.println("The account type is " + accountType + " and the balance is " + accountBalance);
            }
        }

// Define the Insurance class that inherits from Bank
        class Insurance extends Bank {

            // Constructor for Insurance class
            public Insurance(String accountType, int accountBalance) {
                super(accountType, accountBalance);
            }

            // Method to print a message indicating coverage
            public void cover() {
                System.out.println("You are covered");
            }


            public void display() {

                String accountType = "FTR"; //  initials
                int accountBalance = 230278; //  registration number without characters

                // Create an instance of the Bank class
                Bank myBankAccount = new Bank(accountType, accountBalance);

                // Invoke the display method
                myBankAccount.display();

                // Optional: Demonstrate deposit and withdrawal methods
                myBankAccount.deposit(500);
                myBankAccount.withdrawal(200);

                // Display the updated account information
                myBankAccount.display();

                // Create an instance of the Insurance class and demonstrate the cover method
                Insurance myInsurance = new Insurance(accountType, accountBalance);
                myInsurance.cover();

            }


        }
    }

}

