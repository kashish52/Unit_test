import static org.junit.Assert.*;

public class testAddNumbers {
    @org.junit.Test
    public void addNumber() throws Exception {
        jUnitTesting obj = new jUnitTesting();
        int results=obj.addNumber(3,5);
        assertEquals(8,results);
    }

}