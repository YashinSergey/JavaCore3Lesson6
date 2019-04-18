package homeworkTests;

import homework6.SecondTask;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SecondTaskTests {
    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {new int[]{1,7}, new int[]{1,2,4,4,2,3,4,1,7}},
                {new int[]{1,7}, new int[]{1,2,0,0,2,3,0,1,7}},
                {new int[]{1,7}, new int[]{1,2,4,4,2,3,4,1,7}},
                {new int[]{0,2,3,0,1,7}, new int[]{1,2,4,0,2,3,0,1,7}},
        });
    }

    private SecondTask st;
    private int[] a;
    private int[] b;


    public SecondTaskTests(int[] a, int[] b){
        this.a = a;
        this.b = b;
    }

    @Before
    public void init(){
        st = new SecondTask();
    }

    @Test
    public void arrayTest(){
        Assert.assertTrue("Arrays are not equals!", Arrays.equals(a, st.array(b)));
    }


//    SecondTask secondTask;
//
//    @Before
//    public void init(){
//        secondTask = new SecondTask();
//    }
//
//    @Test
//    public void arrayTest1(){
//        Assert.assertNotEquals(4, secondTask.array(1,2,3,4,5,6,7));
//    }
//
//    @Test(expected = RuntimeException.class)
//    public void arrayTest2(){
//        Assert.assertNotEquals(4, secondTask.array(1,2,3,5,6,7));
//    }
//
//    @Test()
//    public void arrayTest3(){
//        Assert.assertNotEquals(4, secondTask.array(1,2,3,5,6,4));
//    }
//
//    @Test()
//    public void arrayTest4(){
//        int[] arr = {5,6,8,7,9,2,1,4,5,6,9};
//        Assert.assertNotEquals(4, secondTask.array(arr));
//    }
}
