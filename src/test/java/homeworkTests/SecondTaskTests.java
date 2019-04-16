package homeworkTests;

import homework6.SecondTask;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class SecondTaskTests {

    SecondTask secondTask;

    @Before
    public void init(){
        secondTask = new SecondTask();
    }

    @Test
    public void arrayTest1(){
        Assert.assertNotEquals(4, secondTask.array(1,2,3,4,5,6,7));
    }

    @Test(expected = RuntimeException.class)
    public void arrayTest2(){
        Assert.assertNotEquals(4, secondTask.array(1,2,3,5,6,7));
    }

    @Test()
    public void arrayTest3(){
        Assert.assertNotEquals(4, secondTask.array(1,2,3,5,6,4));
    }

    @Test()
    public void arrayTest4(){
        int[] arr = {5,6,8,7,9,2,1,4,5,6,9};
        Assert.assertNotEquals(4, secondTask.array(arr));
    }
}
