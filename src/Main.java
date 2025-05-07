public class Main {
    public static void main(String[] args) {

        //1
        /* // 1 section one introduction to java

        System.out.println("hello World");
        System.out.print("welcome kasem \n ");
        System.out.print("how are you ");
        System.out.println(" ");
        System.out.println();

        */
        //2
        /* // 2 section two variables

        //primitive variable

        int age = 28;
        double price = 30.5;
        char grade = 'A';
        boolean isStudent = true;
        System.out.println("the age is "+age);
        System.out.println("the price is " + price);
        System.out.println("his grade is " + grade);
        System.out.println(isStudent);

        //reference  variable

        String name = "kasem safwat";
        System.out.println("welcome " + name);
        int[] arr = {15, 4, 2, 8};
        System.out.println(arr[0]);

        //homework
        String name = "Bro Code";
        int gta = 6;
        double pi = 3.14159;
        char gender = 'M';
        boolean isAdmin = true;
        System.out.println("hello " + name + ","
                + "the gta is " + gta + ","
                + "and the pi is " + pi + ","
                + "and gender is " + gender + ","
                + "and you are admin " + isAdmin);
        */
        //3
        /*  // 3 section three  user input

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Your Age: ");
        int age = scanner.nextInt();
        System.out.print("Enter Your GPA: ");
        double gpa = scanner.nextDouble();
        System.out.print("Are You Student (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Welcome " + name + "\n" + "your age is " + age + "\n" + "your gpa is " +  gpa + "\n" + isStudent );


        scanner.close();


        //--------------------
        double width = 0;
        double height = 0;
        double area = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter width of rectangle : ");
        width = scanner.nextDouble();
        System.out.print("Enter height of rectangle : ");
        height = scanner.nextDouble();
        area = width * height;
        System.out.println("the area of rectangle is : " + area + " cm²");
        scanner.close();

        */
        //4
        /* // 4 section four  mad libs game
        Scanner scanner = new Scanner(System.in);
        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("Enter an adjective (description): ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a noun (animal or person): ");
        noun1 = scanner.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter a verb end with -ing (action): ");
        verb1 = scanner.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective3 = scanner.nextLine();

        System.out.println("Today I went to a " + adjective1 + " Zoo.");
        System.out.println("In an exhibit, Isaw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");
        scanner.close();
        */
        //5
        /* // 5 section five  arithmetic operations

        int x =10;
        int y = 5;
        int z;
        z= x+y;
        z=x-y;
        z=x*y;
        z=x/y;
        z=x%y;
        z=y-x;
        x+=y;
        System.out.println(x);
         */
        //6
        /* // 6 section six   shopping cart program

        Scanner scanner = new Scanner(System.in);
        String item;
        double price;
        int num;
        double total;
        char curreny = '$';
        System.out.print("What item would you like to buy? : ");
        item = scanner.nextLine();
        System.out.print("what is the price for each? : ");
        price = scanner.nextDouble();
        System.out.print("How many would you like? : ");
        num = scanner.nextInt();
        total = price * num;
        System.out.println("You have bought " + num + " "+ item + "/s" + "\n" + "your total is "+ curreny  + total);
        scanner.close();

         */
        //7
        /* // 7 section seven   if statements
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Age: ");
        if (scanner.hasNextInt()) {
            int age = scanner.nextInt();
            if (age >= 18) {
                System.out.println("you are an adult!");
            } else if (age < 0) {
                System.out.println("failed to enter age");
            } else if (age == 0) {
                System.out.println("you are baby");
            } else {
                System.out.println("you are a child!");
            }
        }else {
            System.out.println("invalid age number ");
        }
        scanner.close();

         */
        //8
        /* // 8 section eight  random numbers
        Random random = new Random();

        int num;
        double num2;
        boolean ishead;
        ishead = random.nextBoolean();
        num = random.nextInt(0,10 );
        num2 = random.nextDouble(0,1);
        System.out.println(num);
        System.out.println(num2);
        if (ishead){
            System.out.println("head");
        }else {
            System.out.println("body");
        }
         */
        //9
        /* // 9 section nine  math class
        System.out.println(Math.PI);
        System.out.println(Math.E);

        double result;
        result = Math.pow(5,5);
        result = Math.abs(-10);
        result = Math.sqrt(16); //الجذر
        result = Math.round(3.14);
        result = Math.round(3.6);
        result = Math.ceil(3.14); // تقريب للرقم الاكبر
        result = Math.floor(3.64); // تقريب للرقم الاصغر
        result = Math.max(10,20);
        result = Math.min(10,20);
        System.out.println(result);

        //hypotenuse c = Math.sqrt(a² + b²)
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.print("Enter a: ");
        a = scanner.nextDouble();
        System.out.print("Enter b: ");
        b = scanner.nextDouble();
        a = Math.pow(a,2);
        b = Math.pow(b,2);
        c = Math.sqrt(a + b);
        System.out.println("hypotenuse c: " + c + "cm");


        //circumference = 2 * math.pi * radius;
        System.out.print("Enter Radius: ");
        double radius = scanner.nextDouble();
        double circumference = 2 * Math.PI * radius;
        System.out.println("the circumference is : " + circumference);
        //area = math.pi * math.pow(radius,2);
        double area = Math.PI * Math.pow(radius,2);
        System.out.println("the area is : " + area);
        //volum = (4.0/3.0) * math.pi * math.pow(radius,3);
        double volum = (4.0/3.0) * Math.PI * Math.pow(radius,3);
        System.out.println("the volum is : " + volum);
        //circumference = 2 * math.pi * radius;
        System.out.print("Enter Radius: ");
        double radius = scanner.nextDouble();
        double circumference = 2 * Math.PI * radius;
        System.out.printf("the circumference is : %.2f\n" , circumference);
        //area = math.pi * math.pow(radius,2);
        double area = Math.PI * Math.pow(radius,2);
        System.out.printf("the area is : %.1f\n" , area);
        //volum = (4.0/3.0) * math.pi * math.pow(radius,3);
        double volum = (4.0/3.0) * Math.PI * Math.pow(radius,3);
        System.out.printf("the volum is : %.1f\n", volum);
        scanner.close();
         */
        //10
        /* // 10 section ten   printf

                //string >>> %s
        //char >>> %c
        //int >>> %d
        //double >>> %f >>> %.2f
        //boolean >>>

        String name = "kasem";
        char firstChar = 'K';
        int age = 28;
        double height = 75.5;
        boolean isEmp = true;

        System.out.printf("Hello %s \n",name);
        System.out.printf("your name start with %c\n",firstChar);
        System.out.printf("your Age is %d years old \n",age);
        System.out.printf("your height is %.2f \n",height);
        System.out.printf("Employed: %b \n",isEmp);

        System.out.printf("%s is %d years old \n",name,age);

         */
        //11
        /* // 11 section eleven   compound interest calculator

        Scanner scanner = new Scanner(System.in);
        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;


        System.out.print("Enter the Principal: ");
        principal = scanner.nextDouble();
        System.out.print("Enter the Rate (in %): ");
        rate = scanner.nextDouble() / 100;
        System.out.print("Enter the Time per year: ");
        timesCompounded = scanner.nextInt();
        System.out.print("Enter the Years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1+rate/timesCompounded,timesCompounded*years);

        System.out.printf("the amount after %d is: $%.2f \n",years,amount);
        scanner.close();

         */
        //12
        /* // 12 nested if statements
                boolean isStudent = true;
        boolean isSenior = false;
        double price = 9.99;

        if (isStudent) {
            if (isSenior) {
                System.out.println("you well get discount 20%");
                price *= .7;
            } else {
                System.out.println("you well get discount 10%");
                price *= .9;
            }
        } else {
            if (isSenior) {
                System.out.println("you well get discount 20%");
                price *= .8;
            } else {
                price *= 1;
            }
        }
        System.out.printf("the price of ticket is : $%.2f \n", price);

         */
        //13
        /* // 13 string methods
        String name = "kasem safwat  ";

        int length = name.length(); //get length
        char letter = name.charAt(0); // get character
        int index = name.indexOf('s'); //get number of first character it find
        int lastIndex = name.lastIndexOf('a'); // get number of last character it find
        name = name.toUpperCase(); // convert text to upper case
        name = name.toLowerCase(); // convert text to lower case
        name = name.trim(); //remove spase between
        name = name.replace("s", "n"); //replace character

        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);
        System.out.println(name.isEmpty());
        System.out.println(name);

        if (name.isEmpty()) {
            System.out.println("your name is empty");

        } else {
            name = name.toUpperCase().trim().replace("n", "s");
            System.out.println(name);

        }
         */
        //14
        /* // 14 substrings

//        String email = "kasemsafwat.96@gmail.com";
//        String firstName = email.substring(0, 5);
//        String lastName = email.substring(5, 11);
//        String domain = email.substring(15);
//        String domain = email.substring(email.indexOf("@") + 1);
//        System.out.println("your name is : " + firstName + " " + lastName);
//        System.out.printf("your name is : %s %s \n", firstName, lastName);
//        System.out.printf("your domain is : %s \n", domain);


        String email;
        String name;
        String domain;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Email: ");
        email = scanner.next();

        if (email.contains("@")) {
            name = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);
            System.out.printf("your Email is: %s \n", email);
            System.out.printf("your Name is: %s \n", name);
            System.out.printf("your domain is: %s \n", domain);
        } else {
            System.out.println("invalid Email");
        }
        scanner.close();

         */
        //15
        /* // 15 weight converter

        double kilo;
        double lbs;
        int option;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Weight Conversion Program\n");

        while (true) {
            System.out.println("1 : Convert lbs To Kgs");
            System.out.println("2 : Convert Kgs To lbs");
            System.out.print("Choose one of options (1 / 2) : ");
            option = scanner.nextInt();

            if (option == 1) {
                System.out.print("Enter the weight in lbs : ");
                lbs = scanner.nextDouble();
                kilo = lbs * 0.453592;
                System.out.printf("The new weight in Kgs is : %.2f \n", kilo);
                break;
            } else if (option == 2) {
                System.out.print("Enter the weight in kgs : ");
                kilo = scanner.nextDouble();
                lbs = kilo * 2.20462;
                System.out.printf("The new weight in Kgs is : %.2f \n", lbs);
                break;
            } else {
                System.out.println("\n invalid option pleas try again \n \n");
            }

        }
        scanner.close();

         */
        //16
        /* // 16 ternary operator

        int score = 5;

        if (score > 50) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
        String result = (score > 50) ? "Pass" : "Fail";
        System.out.println(result);

        String evenOrOdd = (score % 2 == 0) ? "even" : "odd";
        System.out.println(evenOrOdd);
         */
        //17
        /* // 17 temperature converter

               double temp;
        double result;
        String unit;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Temperature : ");
        temp = scanner.nextDouble();
        System.out.print("convert to celsius or fahrenheit? (C or F) : ");
        unit = scanner.next().toUpperCase();

        result = (unit.equals("C")) ? (temp - 33.8) * 5 / 9 : (unit.equals("F")) ? (temp * 5 / 9) + 32 : Double.NaN;
        if (Double.isNaN(result)) {
            System.out.println("Invalid unit entered.");
        } else {
            System.out.printf("new temp is : %.2f°%s \n", result, unit);
        }
        scanner.close();

         */
        //18
        /* // 18 enhanced switches

         */


        //19
        /* // 19 calculator program

         */
        //20
        /* // 20 logical operators

         */
        //21
        /* // 21 while loops ♾️


         */
        //22
        /* // 22 ⭐ number guessing game 🔢


         */
        //23
        /* // 23 for loops 🔂


         */
        //24
        /* // 24 break & continue 🚦


         */
        //25
        /* // 25 nested loops ➿


         */
        //26
        /* // 26 methods 📞


         */
        //27
        /* // 27 overloaded methods 🍕


         */
        //28
        /* // 28 variable scope 🏠


         */
        //29
        /* // 29 ⭐ banking program 💰


         */
        //30
        /* // 30 ⭐ dice roller program 🎲


         */
        //31
        /* // 31 arrays 🍎


         */
        //32
        /* // 32 enter user input into an array ➡️


         */
        //33
        /* // 33 search an array 🔎


         */
        //34
        /* // 34 varargs 💬


         */
        //35
        /* // 35 2d arrays ⬜


         */
        //36
        /* // 36 ⭐ quiz game 💯


         */
        //37
        /* // 37 ⭐ rock paper scissors 🗿


         */
        //38
        /* // 38 ⭐ slot machine 🎰


         */
        //39
        /* // 39 object-oriented programming 🧱


         */
        //40
        /* // 40 constructors 🔨


         */
        //41
        /* // 41 overloaded constructors 🛠️


         */
        //42
        /* // 42 array of objects 🗃️


         */
        //43
        /* // 43 static 🤝


         */
        //44
        /* // 44 inheritance 👨‍👧‍👦


         */
        //45
        /* // 45 super 🔝


         */
        //46
        /* // 46 method overriding ♻️


         */
        //47
        /* // 47 tostring method 🎉


         */
        //48
        /* // 48 abstraction 🌫️


         */
        //49
        /* // 49 interfaces 📋


         */
        //50
        /* // 50 polymorphism 🎭


         */
        //51
        /* // 51 runtime polymorphism 🤷‍♂️


         */
        //52
        /* // 52 getters and setters 🔐


         */
        //53
        /* // 53 aggregation 🏫


         */
        //54
        /* // 54 composition ⚙️


         */
        //55
        /* // 55 wrapper classes 🎁


         */
        //56
        /* // 56 arraylists 📃


         */
        //57
        /* // 57 exception handling ⚠️


         */
        //58
        /* // 58 write files ✍


         */
        //59
        /* // 59 read files 📖


         */
        //60
        /* // 60 ⭐ music player 🎼


         */
        //61
        /* // 61 ⭐ hangman game 🕺


         */
        //62
        /* // 62 dates & times 📆


         */
        //63
        /* // 63 anonymous classes 🕵️‍♂️


         */
        //64
        /* // 64 timertasks ⏲️


         */
        //65
        /* // 65 ⭐ countdown timer ⏳


         */
        //66
        /* // 66 generics 📦


         */
        //67
        /* // 67 hashmaps 🗺️


         */
        //68
        /* // 68 enums 📅


         */
        //69
        /* // 69 threading 🧵


         */
        //70
        /* // 70 multithreading 🧶


         */
        //71
        /* // 71 ⭐ alarm clock ⏰


         */

        // in backend learning D:\web fullstack\Courses\New Courses 2025\backendtamer\Week 4\session1

    }
}
