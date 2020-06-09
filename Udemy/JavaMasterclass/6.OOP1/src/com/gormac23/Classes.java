package com.gormac23;

public class Classes {

    public static void main(String[] args) {

        // Classes testing for Car.java
        Car porche = new Car();
        Car holden = new Car();
        porche.setModel("Carrera");
        System.out.println("Model is " + porche.getModel());

        // Classes testing for Challenge Exercise, BankAccount.java
        System.out.println("\n\n***BankAccount.java testing***\n");
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(500);
        bankAccount.depositFunds(4000);
        bankAccount.depositFunds(-100);
        bankAccount.withdrawFunds(10);
        bankAccount.withdrawFunds(-10);
        bankAccount.withdrawFunds(10000);
        bankAccount.getBalance();

        // This is using the constructor to initialize the variables as it is being created
        BankAccount myAccount = new BankAccount(1234, 100, "Colin Gorman", "colin@gmail", 777);
        System.out.println(myAccount.getBalance());
        System.out.println(myAccount.getCustomerName());

        // Classes testing for Challenge Exercise, VipCustomer.java
        System.out.println("\n\n***VipCustomer.java testing***\n");

        VipCustomer p1 = new VipCustomer();
        System.out.println(p1.getName());
        System.out.println(p1.getCreditLimit());

        VipCustomer p2 = new VipCustomer("Jim", "jim@jim.com");
        System.out.println(p2.getName());
        System.out.println(p2.getCreditLimit());

        VipCustomer p3 = new VipCustomer("Tommmmyyy", 40000, "t@t.com");
        System.out.println(p3.getName());
        System.out.println(p3.getCreditLimit());

    }
}
