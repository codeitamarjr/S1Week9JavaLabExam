import java.util.Scanner;

public class LotteryExercise {
    public static void main(String[] args) {

        //Student ID 23952 Itamar Atanasio da Silva Junior

        //starting three random numbers between 1 and 24
        int winingNumber1= 1+(int)(Math.random()*24), winingNumber2= 1+(int)(Math.random()*24) , winingNumber3= 1+(int)(Math.random()*24);

        //checking if all the numbers are different
        while(winingNumber1 == winingNumber2){	winingNumber2 = 1+(int)(Math.random()*24);} // to check the 1st and 2nd numbers be dif
        while (winingNumber3 == winingNumber1 || winingNumber3 == winingNumber2){	winingNumber3 = 1+(int)(Math.random()*24);} //to check if the 3rd number is dif of 1 and 2.

        int lotteryNumber1,lotteryNumber2,lotteryNumber3;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the Lottery; What's your name?");
        String name = keyboard.nextLine();
        System.out.println("Enter the first number for your lottery ticket(Between 1 and 24):");
        lotteryNumber1 = keyboard.nextInt();

        //Check if the user input a valid number
        while(lotteryNumber1 < 1 || lotteryNumber1 > 24){
            System.out.println("Try again using a number between 1 and 24");
            lotteryNumber1 = keyboard.nextInt();
        }

        System.out.println("Enter the second number for your lottery ticket(Between 1 and 24):");
        lotteryNumber2 = keyboard.nextInt();

        //check if the second number is valid and different of the others
        while(lotteryNumber2 == lotteryNumber1 || (lotteryNumber2 < 1 || lotteryNumber2 > 24)){
            System.out.println("Enter the second number again and chose a different number between 1 and 24:");
            lotteryNumber2 = keyboard.nextInt();
        }

        System.out.println("Enter the third number for your lottery ticket(Between 1 and 24):");
        lotteryNumber3 = keyboard.nextInt();

        //check if the third number is valid and different of the others
        while (lotteryNumber3 == lotteryNumber2 || lotteryNumber3 == lotteryNumber1 || (lotteryNumber3 < 1 || lotteryNumber3 > 24)){
            System.out.println("Enter the third number again and chose a different number(Between 1 and 24:");
            lotteryNumber3 = keyboard.nextInt();
        }
        keyboard.close();

        System.out.println("Dear "+name);
        System.out.println("Your lottery ticket number is:"+lotteryNumber1+","+lotteryNumber2+","+lotteryNumber3);
        System.out.println("The result of this lottery is:"+winingNumber1+","+winingNumber2+","+winingNumber3);

        //The statement bellow create one boolean for each number to check if the users have a match
        //check if the first number match with one of the random numbers to create one match and so on...
        boolean firstMatch = (lotteryNumber1==winingNumber1 || lotteryNumber1==winingNumber2 || lotteryNumber1==winingNumber3);
        boolean secondMatch = (lotteryNumber2==winingNumber1 || lotteryNumber2==winingNumber2 || lotteryNumber2==winingNumber3);
        boolean thirdMatch = (lotteryNumber3==winingNumber1 || lotteryNumber3==winingNumber2 || lotteryNumber3==winingNumber3);

        //If all the numbers match the user won the first prize
        if (firstMatch && secondMatch && thirdMatch)
            System.out.println("Congratulations! You have won the first prize.");
            else {

                //if not and the user have two match he won the second prize
            if ( (firstMatch && secondMatch) || (firstMatch && thirdMatch) || (secondMatch && thirdMatch))
                System.out.println("Congratulations! You have won the second prize.");

            else {
                //The statement below if just one of those three match
                if (firstMatch || secondMatch || thirdMatch)
                    System.out.println("Congratulations! You have won the third prize.");
            }
            }
            //If none of them match Java will print the statement bellow
            System.out.println("Best luck next time!");
    }
}
