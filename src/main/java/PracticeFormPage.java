import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeFormPage {

    private WebDriver driver;
    private final By name = By.id("firstName");
    private final By lastname = By.id("lastName");
    private final By email = By.id("userEmail");

    public PracticeFormPage(WebDriver driver){
        this.driver = driver;
    }


    public void setName(String nameTested){
        WebElement nameSpace = driver.findElement(name);
        nameSpace.click();
        nameSpace.sendKeys(nameTested);

    }
    public void setLastName(String lastNameTested){
        WebElement lastNameSpace = driver.findElement(lastname);
        lastNameSpace.click();
        lastNameSpace.sendKeys(lastNameTested);
    }
    public void setEmail(String emailTested){
        WebElement emailSpace = driver.findElement(email);
        emailSpace.click();
        emailSpace.sendKeys(emailTested);
    }

    public String getName(){
        WebElement nameSpace = driver.findElement(name);
        return nameSpace.getAttribute("value");
    }

    public String getLastName(){
        WebElement lastnameSpace = driver.findElement(lastname);
        return lastnameSpace.getAttribute("value");
    }

    public String getEmail(){
        WebElement emailSpace = driver.findElement(email);
        return emailSpace.getAttribute("value");
    }

}
