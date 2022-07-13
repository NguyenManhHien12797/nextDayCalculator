import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public   class NextDayCalculatorTest {
    @Test
    @DisplayName("case 1/1/2018")
public void testDay1Month1Year2018(){
        int dayTest=1;
        int monthTest=1;
        int yearTest= 2018;
        String expect="2/1/2018";
        String result = NextDayCalculator.displayNextDay(dayTest,monthTest,yearTest);
        assertEquals(expect,result);
    }

    @Test
    @DisplayName("case 31/1/2018")
    public void test(){
        int dayTest=31;
        int monthTest=1;
        int yearTest= 2018;
        String expect= "1/2/2018";
        String result= NextDayCalculator.displayNextDay(dayTest,monthTest,yearTest);
        assertEquals(expect,result);
    }
}