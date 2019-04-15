package lessonTests;

import lesson.testing.Calculator;
import org.junit.*;

public class TestCalc {

    Calculator calculator;
    static int count = 1;

    @Before
    public void init(){
        System.out.println("init " + count);
        calculator = new Calculator();
    }

    @Test
    public void testCalcAdd1(){
        Assert.assertEquals(7,calculator.add(2,5));
    }

    @Test
    public void testCalcAdd2(){
        Assert.assertEquals(56,calculator.add(51,5));
    }

    @Test
    public void testCalcAdd3(){
        Assert.assertEquals(12,calculator.add(8,4));
    }

    @Ignore // этот тест игнорируется
    @Test(expected = ArithmeticException.class, timeout = 100) // ожидаем увидеть здесь исключение,
    public void testCalcDiv(){                                 // тест должен выполняться не более 100 миллисекунд
        Assert.assertEquals(12,calculator.div(10,0));
    }


    @After
    public void shutdown(){
        System.out.println("END " + count++);
    }
}
