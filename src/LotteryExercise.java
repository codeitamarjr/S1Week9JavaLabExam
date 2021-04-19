import java.util.Scanner;

public class LotteryExercise {
    public static void main(String[] args) {

        //Student ID 23952 Itamar Atanasio da Silva Junior

        int winingNumber1= 1+(int)(Math.random()*24), winingNumber2= 1+(int)(Math.random()*24) , winingNumber3= 1+(int)(Math.random()*24);
        while(winingNumber1 == winingNumber2){	winingNumber2 = 1+(int)(Math.random()*24);} // to check the 1st and 2nd numbers be dif
        while (winingNumber3 == winingNumber1 || winingNumber3 == winingNumber2){	winingNumber3 = 1+(int)(Math.random()*24);} //to check if the 3rd number is dif of 1 and 2.

        int lotteryNumber1,lotteryNumber2,lotteryNumber3;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the Lottery; What's your name?");
        String name = keyboard.nextLine();
        System.out.println("Enter the first number for your lottery ticket(Between 1 and 24):");
        lotteryNumber1 = keyboard.nextInt();

        while(lotteryNumber1 < 1 || lotteryNumber1 > 24){
            System.out.println("Try again using a number between 1 and 24");
            lotteryNumber1 = keyboard.nextInt();
        }

        System.out.println("Enter the second number for your lottery ticket(Between 1 and 24):");
        lotteryNumber2 = keyboard.nextInt();

        while(lotteryNumber2 == lotteryNumber1 || (lotteryNumber2 < 1 || lotteryNumber2 > 24)){
            System.out.println("Enter the second number again and chose a different number between 1 and 24:");
            lotteryNumber2 = keyboard.nextInt();
        }

        System.out.println("Enter the third number for your lottery ticket(Between 1 and 24):");
        lotteryNumber3 = keyboard.nextInt();

        while (lotteryNumber3 == lotteryNumber2 || lotteryNumber3 == lotteryNumber1 || (lotteryNumber3 < 1 || lotteryNumber3 > 24)){
            System.out.println("Enter the third number again and chose a different number(Between 1 and 24:");
            lotteryNumber3 = keyboard.nextInt();
        }
        keyboard.close();

        System.out.println("Dear "+name);
        System.out.println("Your lottery ticket number is:"+lotteryNumber1+","+lotteryNumber2+","+lotteryNumber3);
        System.out.println("The result of this lottery is:"+winingNumber1+","+winingNumber2+","+winingNumber3);

        //The statement below check if the first number match with one of the winingNumber AND
        //if the second number match with one of the winingNumber AND
        //if the third number match with on of the winingNumber
        //so the name won the first prize

        boolean firstMatch = (lotteryNumber1==winingNumber1 || lotteryNumber1==winingNumber2 || lotteryNumber1==winingNumber3);
        boolean secondMatch = (lotteryNumber2==winingNumber1 || lotteryNumber2==winingNumber2 || lotteryNumber2==winingNumber3);
        boolean thirdMatch = (lotteryNumber3==winingNumber1 || lotteryNumber3==winingNumber2 || lotteryNumber3==winingNumber3);

        if (firstMatch && secondMatch && thirdMatch)
            System.out.println("Congratulations! You have won the first prize.");
            else {

            if ( (firstMatch && secondMatch) || (firstMatch && thirdMatch) || (secondMatch && thirdMatch))
                System.out.println("Congratulations! You have won the second prize.");

            else {
                //The statement below if one of those three match
                if (firstMatch || secondMatch || thirdMatch)
                    System.out.println("Congratulations! You have won the third prize.");
            }
            }

            System.out.println("Best luck next time!");
    }
}
