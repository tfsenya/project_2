import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        //Use variables of different types (int, double, char, boolean, String).
        int Age = 17;//int
        double dbl = 3.1;//double
        char chr = 'Z';//char
        int a = 100;//boolean
        int b = 1000;//boolean
        String l = "string";//string

        System.out.println("I am " + Age + " years old");
        System.out.println("My fav song is  " + dbl + " minutes long");
        System.out.println("Last letter of alphabet is " + chr);
        System.out.println(b>a);
        System.out.println(l);

        //Demonstrate operations with Numbers
        a = 10;
        b = 7;
        int z = a + b;
        System.out.println(z);
        z = a*b;
        System.out.println(z);
        z = a/b;
        System.out.println(z);
        System.out.println(10.0 / 7.0);

        //Demonstrate String operations
        String txt = "HeLLo wOrLd";
        System.out.println(txt);
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());

        //Demonstrate Input/Output operations
        String name;
        double years;
        double hours;
        Scanner main = new Scanner(System.in);
        System.out.println("Hello, what is your name? ");
        name = main.nextLine();
        System.out.println("How old are you? ");
        years = main.nextDouble();
        System.out.println("How much hours a day do watch tv? ");
        hours = main.nextDouble();
        System.out.println("Well, your name is " + name + " you are " + years + " years old and you watch tv " + hours + " hours per day");

        //part 2
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! Please answer my questions.");

        System.out.println("Please enter your name:");
        String nam = scanner.nextLine();

        System.out.println("How old are you?");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("How tall are you? (only meters)");
        double height = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("What's your favorite color?");
        String color = scanner.nextLine();

        System.out.println("Where do you live?");
        String country = scanner.nextLine();

        System.out.println("What's your phone number?");
        long phoneNumber = scanner.nextLong();
        scanner.nextLine();

        System.out.println("What's your favourite car brand?");
        String car = scanner.nextLine();

        System.out.println("What's your favorite number?");
        int favNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What's your favorite food?");
        String food = scanner.nextLine();

        System.out.println("What's your favourite animal?");
        String animal = scanner.nextLine();


        System.out.println("Name: " + nam);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " meters");
        System.out.println("Favorite Color: " + color);
        System.out.println("Country: " + country);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Favorite car brand: " + car);
        System.out.println("Favorite Number: " + favNumber);
        System.out.println("Favorite Food: " + food);
        System.out.println("Favorite animal: " + animal);

        // Using String operations

        if (animal.startsWith("c")) {
            System.out.println("Cool, my favourite animal is cat too");
        }
        if (car.contains("Toyota")){
            System.out.println("Cool, my favourite car is toyota too");
        }
        int index = food.indexOf("pizza");
        if (index != -1) {
            System.out.println("Your favorite food contains 'pizza' at position " + index + "");a
        }
        }
}