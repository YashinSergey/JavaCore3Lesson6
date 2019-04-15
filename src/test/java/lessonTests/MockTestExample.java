package lessonTests;

import org.junit.Assert;
import org.junit.Test;
import java.util.Iterator;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MockTestExample {
    @Test
    public void mockTest(){
        Iterator iterator = mock(Iterator.class);
        when(iterator.next()).thenReturn("Hello,").thenReturn("world");

        String res = (String) iterator.next() + " " + (String) iterator.next();

        Assert.assertEquals("Hello, world", res);
    }
}
