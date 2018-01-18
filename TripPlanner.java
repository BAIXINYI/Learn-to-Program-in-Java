import java.util.Scanner;
public class TripPlanner{
        public static void main(String[] args){
                Greeting();
                TravelTimeAndBudget();
                TimeDifference();
                CounterArea();

}

        public static void Greeting(){
            Scanner input = new Scanner(System.in);
            System.out.println("Welcome to Vacation Planner");
            System.out.println("What is your name?");
            String name = input.nextLine();
            System.out.println("Nice to meet you " + name +", where are you travelling to?");
            String destination = input.nextLine();
            System.out.println("Great! " + destination + " sounds like a great trip \n **********");
            
}

        public static void TravelTimeAndBudget(){
            Scanner input = new Scanner(System.in);
            System.out.println("How many days are you going to spend travelling?");
            int day = input.nextInt();
            System.out.println("How much money, in USD, are you planning to spend on your trip?");
            int USD = input.nextInt();
            System.out.println("What is the three letter currency symbol for your travel destination?");
            String threeletter = input.next();
            System.out.println("How many " + threeletter +" are there in 1 USD? \n\n");
            double currency = input.nextDouble();
            
            int hour = 24 * day;
            int minute = hour * 60;
            double moneyperdayusd = (double) USD/day;
            double MXC = (double) USD * currency;
            double moneyperdaymxc = (double) MXC/day;
            
            System.out.println("If you are travelling for " + day +" days that is the same as " + hour + " hours or " + minute + " minutes");
            System.out.println("If you are going to spens $" + USD +" USD that means per day you can spend up to $" + moneyperdayusd + " USD");
            System.out.println("Your total budget in" + threeletter + " is " + MXC + " " + threeletter + ", which per day is " + moneyperdaymxc + " " + threeletter +"\n**********");

}

        public static void TimeDifference(){
            Scanner input = new Scanner(System.in);
            System.out.println("What is the time difference, in hours, between your home and your destination?");
            int timegap = input.nextInt();
            int time1 =timegap % 24;
            String timea = time1 + ":00";
            int time2 =12 + time1;
            String timeb = time2 + ":00";
            System.out.println("That means when it is midnight at home it will be " + timea + " in your travel destination\nand when it is noon at home it will be " + timeb);
            
}

        public static void CounterArea(){
            Scanner input = new Scanner(System.in);
            System.out.println("What is the square area of your destination country in km?");
            int area = input.nextInt();
            double miles = (double) area * 0.38610216;
            System.out.println("In miles2 that is " + miles);

}
}

