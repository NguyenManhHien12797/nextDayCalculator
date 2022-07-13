public class NextDayCalculator {
   public static final String CONCAT= "/";
   public static final int STARTOFMONTH= 1;
    public static String displayNextDay(int dayTest, int monthTest, int yearTest){
        int day;
        int lastOfMonth;
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
                lastOfMonth= 31;
                break;
            case 2:
                lastOfMonth= 28;
                break;
            default:
                lastOfMonth= 31;
        }
        if(dayTest == lastOfMonth){
            day = STARTOFMONTH;
            monthTest++;
        }
        else{
            day= dayTest+1;
        }
        String result= day+ CONCAT+ monthTest+ CONCAT+ yearTest;
        return result;
    }
}

