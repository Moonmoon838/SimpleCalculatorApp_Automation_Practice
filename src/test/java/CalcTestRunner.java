import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class CalcTestRunner extends Setup{

    CalcScreen screen;

    @Test(priority = 1, description = "Do Sum")
    public void doSum(){
        screen = new CalcScreen(driver);
        String value = screen.doSum(6,3);
        System.out.println(value);
        Assert.assertEquals(value,"9");
        //clear();

    }

    @Test(priority = 2, description = "Do Sub")
    public void doSub(){
        screen = new CalcScreen(driver);
        String value = screen.doSub(6,3);
        System.out.println(value);
        Assert.assertEquals(value,"3");
    }

    @AfterMethod
    public void clear(){
        screen = new CalcScreen(driver);
        screen.btnclear.click();
    }
}
