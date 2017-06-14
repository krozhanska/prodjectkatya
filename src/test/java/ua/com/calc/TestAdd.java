package ua.com.calc; /**
 * Created by k.rozhanska_tac on 08.06.2017.
 */

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TestAdd {
    Calc c;
    @BeforeTest
    public void setUp()

    {
        c = new Calc();
    }
    @DataProvider(name = "dataAdd")
    public Object[][] CreateData(){
        return new Object[][]{{1, 2},
                {100000000, 1111111111},
                {-20, -1000000},
                {45, -100},
                {-1000000000, -1000000000}
        };
    };

    @Test(dataProvider = "dataAdd")
    public void testAdd(int a, int b){
        Assert.assertEquals(c.add(a,b),a+b);
    }

}
