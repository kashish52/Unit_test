import com.sun.tools.javac.util.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class testAddStrings {
    @Test
    public void addStrings() throws Exception {
        jUnitTesting obj1 = new jUnitTesting();
        String result=obj1.addStrings("hello","world");
        assertEquals("helloworld",result);
    }

}