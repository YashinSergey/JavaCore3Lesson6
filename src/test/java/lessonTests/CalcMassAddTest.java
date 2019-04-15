package lessonTests;

import lesson.testing.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CalcMassAddTest {

    @Parameterized.Parameters
    public static Collection<Object []> data(){
        return Arrays.asList(new Object[][]{
                {0,4,4},
                {2,5,7},
                {9,8,17},
                {7,2,9}
        });

    }

    private int a;
    private int b;
    private int c;

    public CalcMassAddTest(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    Calculator calculator;

    @Before
    public void init(){
        calculator = new Calculator();
    }

    @Test
    public void massTestAdd(){
        Assert.assertEquals(c,calculator.add(a,b));
    }
}
