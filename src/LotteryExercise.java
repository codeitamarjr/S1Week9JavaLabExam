import java.util.Scanner;

public class LotteryExercise {
    public static void main(String[] args) {

        //Student ID 23952 Itamar Atanasio da Silva Junior

        int winingNumber1= 8, winingNumber2= 23 , winingNumber3= 15;
        int lotteryNumber1,lotteryNumber2,lotteryNumber3;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the Lottery; What's your name?");
        String name = keyboard.next();
        System.out.println("Enter the first number for your lottery ticket(Between 1 and 24):");
        lotteryNumber1 = keyboard.nextInt();
        System.out.println("Enter the second number for your lottery ticket(Between 1 and 24):");
        lotteryNumber2 = keyboard.nextInt();
        System.out.println("Enter the third number for your lottery ticket(Between 1 and 24):");
        lotteryNumber3 = keyboard.nextInt();

        //The statement below is just to show the introduction of the Java program
        System.out.println("Dear "+name);
        System.out.println("Your lottery ticket number is:"+lotteryNumber1+","+lotteryNumber2+","+lotteryNumber3);
        System.out.println("The result of this lottery is:"+winingNumber1+","+winingNumber2+","+winingNumber3);

        //The statement below check if the first number match with one of the winingNumber AND
        //if the second number match with one of the winingNumber AND
        //if the third number match with on of the winingNumber
        //so the name won the first prize

        if ((lotteryNumber1==winingNumber1 || lotteryNumber1==winingNumber2 || lotteryNumber1==winingNumber3) &&
                (lotteryNumber2==winingNumber1 || lotteryNumber2==winingNumber2 || lotteryNumber2==winingNumber3) &&
                 (lotteryNumber3==winingNumber1 || lotteryNumber3==winingNumber2 || lotteryNumber3==winingNumber3))
            System.out.println("Congratulations! You have won the first prize.");
            else {

                //Now the program will test if the number match with the first OR second AND third match
            if ((lotteryNumber1 == winingNumber1 || lotteryNumber1 == winingNumber2 || lotteryNumber1 == winingNumber3) |
                    (lotteryNumber2 == winingNumber1 || lotteryNumber2 == winingNumber2 || lotteryNumber2 == winingNumber3) &&
                    (lotteryNumber3 == winingNumber1 || lotteryNumber3 == winingNumber2 || lotteryNumber3 == winingNumber3))
                System.out.println("Congratulations! You have won the second prize.");

            else {

                //The statement below if the first AND second OR third match
                if ((lotteryNumber1 == winingNumber1 || lotteryNumber1 == winingNumber2 || lotteryNumber1 == winingNumber3) &&
                        (lotteryNumber2 == winingNumber1 || lotteryNumber2 == winingNumber2 || lotteryNumber2 == winingNumber3) |
                                (lotteryNumber3 == winingNumber1 || lotteryNumber3 == winingNumber2 || lotteryNumber3 == winingNumber3))
                    System.out.println("Congratulations! You have won the second prize.");
            else {

                //The statement below if one of those three match
                if ((lotteryNumber1 == winingNumber1 || lotteryNumber1 == winingNumber2 || lotteryNumber1 == winingNumber3) |
                        (lotteryNumber2 == winingNumber1 || lotteryNumber2 == winingNumber2 || lotteryNumber2 == winingNumber3) |
                        (lotteryNumber3 == winingNumber1 || lotteryNumber3 == winingNumber2 || lotteryNumber3 == winingNumber3))
                    System.out.println("Congratulations! You have won the third prize.");
            }}}


    }
}
