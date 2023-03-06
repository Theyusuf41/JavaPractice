package BankApplication;

public class Customer {
        public String name;
        public String accountNumber;
        public String password;
        public String phone;
        public String email;
        public double balance;


    public Customer(String name, String accountNumber, String password,  double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.password = password;
        this.balance = balance;

        printInfo();
    }


    public void printInfo() { // Bu sekilde toString Methodu kullanilabilir!!
        System.out.println("name='" + name + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'');
    }

    public void addBalance(double amount){
        this.balance += amount;
        System.out.println("Sayin " + name + "  " + amount + " yatirildi." );


    }

    public void withdrawMoney(double amount){
        if (amount <= this.balance){
            this.balance -= amount;
            System.out.println("Sayin " + name + ", hesabinizdan " + amount + " TL cekilmistir.");
        }else{
            System.out.println("Para cekme islemi basarisiz. Yetersiz bakiye!!!");
        }
    }

    public void printBalance(){
        System.out.println("Bakiye " + balance);
    }
    public void chancePassword(){

    }





}
