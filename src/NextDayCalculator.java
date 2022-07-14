public class NextDayCalculator {
   public static final String CONCAT= "/";
    public static final int STARTOFMONTH= 1;
    public static final int STARTOFYEAR = 1;

    public static boolean isLeapYear(int yearTest){
       boolean isLeapYear= false;
       boolean isDivisibleBy4= yearTest%4 ==0;
       if(isDivisibleBy4) {
           boolean isDivisibleBy100= yearTest %100 == 0;
           if(isDivisibleBy100){
               boolean isDivisibleBy400 = yearTest %400 == 0;
               if(isDivisibleBy400){
                   isLeapYear= true;
               }
           } else {
               isLeapYear= true;
           }
       }
       return isLeapYear;
   }
    public static String displayNextDay(int dayTest, int monthTest, int yearTest){
        int day;
        int lastOfMonth;
        if(isLeapYear(yearTest)){
            switch(monthTest){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    lastOfMonth= 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    lastOfMonth= 30;
                    break;
                case 2:
                    lastOfMonth= 29;
                    break;
                default:
                    lastOfMonth= 31;
            }
        }else {
            switch(monthTest){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    lastOfMonth= 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    lastOfMonth= 30;
                    break;
                case 2:
                    lastOfMonth= 28;
                    break;
                default:
                    lastOfMonth= 31;
            }
        }
        int lastOfYear = 12;
        if(monthTest==lastOfYear){
            if(dayTest == lastOfMonth){
                day = STARTOFMONTH;
                monthTest++;
                monthTest= STARTOFYEAR;
                yearTest++;
            }
            else{
                day= dayTest+1;
            }

        } else {
            if(dayTest == lastOfMonth){
                day = STARTOFMONTH;
                monthTest++;
            }
            else{
                day= dayTest+1;
            }
        }

        String result= day+ CONCAT+ monthTest+ CONCAT+ yearTest;
        return result;
    }
}

