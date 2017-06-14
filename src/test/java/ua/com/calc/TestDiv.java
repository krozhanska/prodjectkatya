package ua.com.calc; /**
 * Created by k.rozhanska_tac on 08.06.2017.
 */

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestDiv {
    Calc c;
    @BeforeTest
    public void setUp()

    {
        c = new Calc();
    }
    @Parameters({"a","b"})
    @Test
    public void testdiv(int a1,int b1){
        Assert.assertEquals(c.div(a1,b1),2);
    }

}
