package com.hc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean quit = false;
        do {
            float cm;
            float m;
            float ft;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the following number of the metric unit of your height:");
            System.out.println("(1) centimetre, (2) metre or (3) foot.");
            System.out.println("Enter 'quit' to close the program.");
            String userinput = input.nextLine();
            if (userinput.equals("1")){
                System.out.println("What is your height in centimetre?");
                cm = Float.parseFloat(input.nextLine());
                m = cm / 100;
                ft = (float) (cm / 30.48);
                System.out.println("Your height in metre is " + m);
                System.out.println("Your height in foot is " + ft);
            } else if (userinput.equals("2")){
                System.out.println("What is your height in metre?");
                m = Float.parseFloat(input.nextLine());
                cm = m * 100;
                ft = (float) (m * 3.281);
                System.out.println("Your height in centimetre is " + cm);
                System.out.println("Your height in foot is " + ft);
            } else if (userinput.equals("3")){
                System.out.println("What is your height in foot?");
                ft = Float.parseFloat(input.nextLine());
                cm = (float) (ft * 30.48);
                m = (float) (ft / 3.281);
                System.out.println("Your height in centimetre is " + cm);
                System.out.println("Your height in metre is " + m);
            } else if (userinput.equals("quit")){
                quit = true;
                System. exit(0);
            } else if (userinput != "1" || userinput != "2" || userinput != "3" || userinput != "quit"){
                System.out.println("Error!");
            }
        } while (quit == false);

    }
}
