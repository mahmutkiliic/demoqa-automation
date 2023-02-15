import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeFormPage  extends BasePage {


    private final By nameLocator = By.id("firstName");
    private final By lastnameLocator = By.id("lastName");
    private final By emailLocator = By.id("userEmail");

    private GenderSection genderSection;

    public PracticeFormPage(WebDriver driver){
        super(driver);
        driver.get(baseUrl.concat("automation-practice-form"));
        genderSection = new GenderSection(driver);
    }

    public GenderSection genderSection(){
        return this.genderSection;
    }


    public void setName(String nameTested){
//        WebElement nameSpace = driver.findElement(nameLocator);
//        nameSpace.click();
//        nameSpace.sendKeys(nameTested);

        type(nameLocator,nameTested);

    }
    public void setLastName(String lastNameTested){
//        WebElement lastNameSpace = driver.findElement(lastnameLocator);
//        lastNameSpace.click();
//        lastNameSpace.sendKeys(lastNameTested);
        type(lastnameLocator,lastNameTested);
    }
    public void setEmail(String emailTested){
//        WebElement emailSpace = driver.findElement(emailLocator);
//        emailSpace.click();
//        emailSpace.sendKeys(emailTested);
        type(emailLocator,emailTested);
    }

    public String getName(){
//        WebElement nameSpace = driver.findElement(nameLocator);
//        return nameSpace.getAttribute("value");
        return find(nameLocator).getAttribute("value");
    }

    public String getLastName(){
//        WebElement lastnameSpace = driver.findElement(lastnameLocator);
//        return lastnameSpace.getAttribute("value");

        return find(lastnameLocator).getAttribute("value");
    }

    public String getEmail(){
//        WebElement emailSpace = driver.findElement(emailLocator);
//        return emailSpace.getAttribute("value");

        return find(emailLocator).getAttribute("value");
    }

}
