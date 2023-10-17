import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalcScreen {

    @FindBy(id = "com.google.android.calculator:id/digit_8")
    WebElement btn8;

    @FindBy(id = "com.google.android.calculator:id/digit_7")
    WebElement btn7;

    @FindBy(id = "com.google.android.calculator:id/op_add")
    WebElement btnPlus;

    @FindBy(id = "com.google.android.calculator:id/op_sub")
    WebElement btnSub;

    @FindBy(id = "com.google.android.calculator:id/eq")
    WebElement btnEqual;

    @FindBy(id = "com.google.android.calculator:id/result_final")
    WebElement txtResult;

    @FindBy(id = "com.google.android.calculator:id/clr")
    WebElement btnclear;

    AndroidDriver driver;

    public CalcScreen(AndroidDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    public String doSum(int a, int b){
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+a)).click();
        btnPlus.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+b)).click();
        btnEqual.click();
        return txtResult.getText();
    }

    public String doSub(int a, int b){
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+a)).click();
        btnSub.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+b)).click();
        btnEqual.click();
        return txtResult.getText();
    }


}
