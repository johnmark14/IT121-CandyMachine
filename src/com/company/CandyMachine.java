package com.company;

import java.util.*;

public class CandyMachine {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        CashRegister cashRegister = new CashRegister();  //Step 1
        Dispenser candy = new Dispenser(100, 50);        //Step 2
        Dispenser chips = new Dispenser(100, 65);        //Step 2
        Dispenser gum = new Dispenser(75, 45);           //Step 2
        Dispenser cookies = new Dispenser(100, 85);      //Step 2


        int choice;  //variable to hold the selection    //Step 3

        showSelection();                                 //Step 4
        choice = console.nextInt();                      //Step 5

        while (choice != 9)                              //Step 6
        {
            switch (choice)                              //Step 6a
            {
                case 1: sellProduct(candy, cashRegister);
                    break;
                case 2: sellProduct(chips, cashRegister);
                    break;
                case 3: sellProduct(gum, cashRegister);
                    break;
                case 4: sellProduct(cookies, cashRegister);
                    break;
                default: System.out.println("Invalid Selection");
            }//end switch

            showSelection();                             //Step 6b
            choice = console.nextInt();                  //Step 6c
        }//end while
    }
}
