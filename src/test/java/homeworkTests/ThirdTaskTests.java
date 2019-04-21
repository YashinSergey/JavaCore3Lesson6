package homeworkTests;

import homework6.ThirdTask;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ThirdTaskTests {
    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {true, new int[]{1,2,4,4,2,3,4,1,7}},
                {false, new int[]{2,0,0,2,3,0,7}},
                {true, new int[]{1,2,4,4,2,3,4,1,7}},
                {true, new int[]{1,2,4,0,2,3,0,1,7}},
        });
    }

    private ThirdTask tt;
    private boolean bool;
    private int[] arr;

    public ThirdTaskTests(boolean bool, int[] arr) {
        this.bool = bool;
        this.arr = arr;
    }

    @Before
    public void init(){
        tt = new ThirdTask();
    }

    @Test
    public void lookingForNumbersTest(){
        Assert.assertEquals(bool, tt.lookingForNumbers(arr));
    }

    //    ThirdTask tt;
//
//    @Before
//    public void init(){
//        tt = new ThirdTask();
//    }
//
//    @Test
//    public void lookingForNumbersTest1(){
//        Assert.assertTrue(tt.lookingForNumbers(1,2,3,5));
//    }
//
//    @Test
//    public void lookingForNumbersTest2(){
//        Assert.assertTrue(tt.lookingForNumbers(2,3,5,4));
//    }
//
//    @Test
//    public void lookingForNumbersTest3(){
//        Assert.assertFalse(tt.lookingForNumbers(2,3,5,6,9,8,7));
//    }
//
//    @Test
//    public void lookingForNumbersTest4(){
//        int[] array = {254,52,36,98};
//        Assert.assertFalse(tt.lookingForNumbers(array));
//    }

}
