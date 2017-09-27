import com.sun.tools.javac.util.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class testAddStrings {
    @Test
    public void addStrings() throws Exception {
        jUnitTesting obj = new jUnitTesting();
        int results=obj.addNumber(3,5);
        assertEquals(8,results);
    }

}