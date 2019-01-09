/*
The Calendar class is an abstract class that provides methods for 
converting between a specific instant in time and a set of calendar 
fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for 
manipulating the calendar fields, such as getting the date of the next week.

You are given a date. You just need to write the method, getDay, which returns the day on that date.
To simplify your task, we have provided a portion of the code in the editor.

For example, if you are given the date August 14th 2017, the method should return MONDAY as the 
day on that date.
*/



class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {

       
        Calendar c = Calendar.getInstance();
        c.set(year, month-1, day);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        String dayS = "";
        switch (dayOfWeek) {
        case 1:
            dayS = "SUNDAY";
            break;
        case 2:
            dayS = "MONDAY";
            break;
        case 3:
            dayS = "TUESDAY";
            break;
        case 4:
            dayS = "WEDNESDAY";
            break;
        case 5:
            dayS = "THURSDAY";
            break;
        case 6:
            dayS = "FRIDAY";
            break;
        case 7:
            dayS = "SATURDAY";
            break;
        }
        
        return dayS;

    }
    

}


