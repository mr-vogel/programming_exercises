public class DayOfTheWeekChallenge {

    public static void printDayOfTheWeek(int day){
        switch (day){
            case 0:
                System.out.println("Sunday");
                break;

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Invalid Day");
                break;
        }


        if(day == 0){
            System.out.println("Sunday");
        } else if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2){
            System.out.println("Tuesday");
        } else if (day == 3){
            System.out.println("Wednesday");
        } else if (day == 4){
            System.out.println("Thursday");
        } else if (day == 5){
            System.out.println("Friday");
        } else if (day == 6){
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid Day");
        }
    }
}


/*
Write a method with the name printDayOfTheWeek that has one parameter
of type int and name it day

The method should not return any value

Using a switch statement print "Sunday", "Monday", etc if the int parameter "day"
is 0, 1, etc, otherwise it should print "Invalid day"

Bonus
Write a second solution using if then else, instead of using switch
Create a new project in intellij named "DayOfTheWeekChallenge"
 */