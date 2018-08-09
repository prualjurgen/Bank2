package com.Bank;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Bank bank = new Bank("Sock Drawer");
        Scanner input = new Scanner(System.in);
        bank.addPrivate("JackJill");

        while(true) {

            System.out.println("Hello! Welcome to " + bank.getBankName() + " international, the finest bank in this imaginary land.");
            System.out.println("What can we do for you on this fine day? Type a number that corresponds to your inquiry: ");
            System.out.println("1. Open an account with us");
            System.out.println("2. Add money to your account");
            System.out.println("3. Make a withdrawal");
            System.out.println("4. Check your account balance");
            System.out.println("5. Print your user details");
            System.out.println("6. Print the bank");
            System.out.println("0. Quit");

            int userChoice = input.nextInt();
            switch (userChoice) {
                case 1:
                    System.out.println("Choose an account type you would like to open");
                    System.out.println("1. Private user");
                    System.out.println("2. Business user");
                    System.out.println("3. Fund user");
                    int choiceOfAccount = input.nextInt();
                    System.out.println("Please enter the desired name for your account");
                    String fullName = input.next();
                    switch(choiceOfAccount){
                        case 1:
                            bank.addPrivate(fullName);
                            break;
                        case 2:
                            bank.addBusiness(fullName);
                            break;
                        case 3:
                            bank.addFund(fullName);
                            break;
                        default:
                            System.out.println("This isn't a correct choice");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Please enter the name in your account");
                    String nameOnAccount = input.next();
                    System.out.println("Enter amount of money");
                    double money = input.nextDouble();
                    bank.addMoneyToUser(nameOnAccount, money);
                    System.out.println("The total balance of user is: " + bank.usersBalance(nameOnAccount));
                    break;
                case 3:
                    System.out.println("Please enter the name on your account");
                    String accountName = input.next();
                    System.out.println("Enter amount of money");
                    double muniez = input.nextDouble();
                    bank.withdrawMoneyFromAccount(accountName, muniez);
                    System.out.println(bank.usersBalance(accountName));
                    break;
                case 4:
                    System.out.println("Please enter your name as it appears in your account");
                    String name1 = input.nextLine();
                    System.out.println(bank.usersBalance(name1));
                    break;
                case 5:
                    System.out.print("Type in your full name, case sensitive: ");
                    String fName = input.next();
                    bank.printUser(fName);
                    break;
                case 6:
                    System.out.println(bank);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("That's not an option, try again.");
                    break;

            }
        }

    }
}