package homeworkTests;

import homework6.ThirdTask;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ThirdTaskTests {
    ThirdTask tt;

    @Before
    public void init(){
        tt = new ThirdTask();
    }

    @Test
    public void lookingForNumbersTest1(){
        Assert.assertTrue(tt.lookingForNumbers(1,2,3,5));
    }

    @Test
    public void lookingForNumbersTest2(){
        Assert.assertTrue(tt.lookingForNumbers(2,3,5,4));
    }

    @Test
    public void lookingForNumbersTest3(){
        Assert.assertFalse(tt.lookingForNumbers(2,3,5,6,9,8,7));
    }

    @Test
    public void lookingForNumbersTest4(){
        int[] array = {254,52,36,98};
        Assert.assertFalse(tt.lookingForNumbers(array));
    }

}
