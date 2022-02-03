



public class WeekDay {
    public static void main(String args[]){
    // Using switch case, do the following:
    // Store a number between 1-7
    // If the number is 1, display a message "Monday", 2 for "Tuesday", 3 for "Wednesday" etc.
    // Anything other than 1-7 would default to "Invalid Input"

    


    int num=10;
    String weekday;
    switch (num) {
        case 1:  weekday = "Monday";
                 break;
        case 2:  weekday = "Tuesday";
                 break;
        case 3:  weekday = "Wednesday";
                 break;
        case 4:  weekday = "Thursday";
                 break;
        case 5:  weekday = "Friday";
                 break;
        case 6:  weekday = "Saturday";
                 break;
        case 7:  weekday = "Sunday";
                 break;
        default: weekday = "Free Day";
                 break;

                 
    }
    System.out.println(weekday);
    
    }
}