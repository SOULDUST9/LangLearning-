
import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Person> listOfClients;
    private int branchNumber;
    private String location;

    // Constructors
    public Bank() {
        this.listOfClients = new ArrayList<>();
        this.branchNumber = -999;
        this.location = "Unknown";
    }

    public Bank(int branchNumber, String location) {
        this.listOfClients = new ArrayList<>();
        this.branchNumber = branchNumber;
        this.location = location;
    }

    // Getters
    public int getBranchNumber() {
        return this.branchNumber;
    }

    public String getLocation() {
        return this.location;
    }

    public List<Person> getListOfClients() {
        return this.listOfClients;
    }

    // Check if a person is eligible (age 18+)
    public boolean checkAge(Person person) {
        return person.getAge() >= 18;
    }

    // Add a person if eligible and not already added
    public void addPerson(Person person) {
        if (!checkAge(person)) {
            System.out.println("SORRY, NOT OLD ENOUGH TO BE ADDED: " + person.getName());
            return;
        }

        // Prevent duplicates (optional: use toLowerCase for case-insensitive comparison)
        for (Person p : listOfClients) {
            if (p.getName().equalsIgnoreCase(person.getName()) && p.getAge() == person.getAge()) {
                System.out.println("Person already exists in the client list: " + person.getName());
                return;
            }
        }

        // Assign this bank's info to person
        person.setBranch(this.branchNumber);
        person.setBankNumber(1000 + listOfClients.size()); // Unique ID simulation

        listOfClients.add(person);
        System.out.println("Person added: " + person.getName());
    }

    // Display all clients
    public void displayClients() {
        System.out.println("Clients of branch " + branchNumber + ":");
        for (Person client : listOfClients) {
            System.out.println(client);
        }
    }

    // Bank summary
    @Override
    public String toString() {
        return "Bank [BranchNumber=" + branchNumber + ", Location=" + location +
               ", TotalClients=" + listOfClients.size() + "]";
    }

    // Main method
    public static void main(String[] args) {
        // Create a bank
        Bank bank = new Bank(1010, "Ottawa");

        // Create persons
        Person alice = new Person("Alice", 25);
        Person bob = new Person("Bob", 17);
        Person charlie = new Person("Charlie", 30);
        Person aliceDuplicate = new Person("Alice", 25); // Test duplicate

        // Try adding them to the bank
        bank.addPerson(alice);
        bank.addPerson(bob);             // Rejected: underage
        bank.addPerson(charlie);
        bank.addPerson(aliceDuplicate);  // Rejected: duplicate

        // Perform some transactions
        alice.deposit(1000);
        alice.withdraw(200);
        charlie.deposit(500);

        // Display results
        System.out.println("\nFinal Bank Info:");
        System.out.println(bank);

        System.out.println("\nList of Clients:");
        bank.displayClients();
    }
}


class Person {

    private String name;
    private int age;
    private int bankNumber;
    private int branch;
    private int balance;

    // Default constructor
    public Person() {
        this.name = "John Doe";
        this.age = 0;
        this.bankNumber = 0;
        this.branch = 0;
        this.balance = 0;
    }

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.setAge(age); // Use setter for validation
        this.bankNumber = 0;
        this.branch = 0;
        this.balance = 0;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0)
            this.age = age;
        else
            System.out.println("Age must be non-negative.");
    }

    public void setBankNumber(int bankNumber) {
        this.bankNumber = bankNumber;
    }

    public void setBranch(int branch) {
        this.branch = branch;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getBankNumber() {
        return this.bankNumber;
    }

    public int getBranch() {
        return this.branch;
    }

    public int getBalance() {
        return this.balance;
    }

    // Business Logic
    public void deposit(int amount) {
        if (amount > 0) {
            this.balance += amount;
        } else {
            System.out.println("Deposit must be positive.");
        }
    }

    public void withdraw(int amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
        } else {
            System.out.println("Invalid withdraw amount.");
        }
    }

    // toString method for debugging
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", bankNumber=" + bankNumber +
               ", branch=" + branch + ", balance=" + balance + "]";
    }
}
