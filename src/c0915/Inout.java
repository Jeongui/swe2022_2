package c0915;

import java.util.Scanner;

public class Inout {
    public static void main(String[] args){
        System.out.printf("Hello, %s%d\n", "Java", 8);
        System.out.println(String.format("%s%,+.2f", "java", 12452.24234d));


        Scanner in;

        System.out.println("What is your name?");
        in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println("Your name is " + name);

        System.out.println("Favorite Numbers?");
        in = new Scanner(System.in);
        while(in.hasNextInt()){
            System.out.println("num:" + in.nextInt());

        }

    }
}
