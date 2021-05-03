public class LeapYear {



    public static boolean   isLeapYear(int year) {

            int Year1 = year % 4;
            int Year2 = year % 100;
            int Year3 = year % 400;

            if (year <1 || year >9999){

                return false;

            } else if (Year3 == 0){ return true;}

            else if (Year2 !=0 && Year1 == 0){
                return true;}

            return false;
        }

}


