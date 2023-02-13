import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GenderSection {

    private WebDriver driver;

    private final By maleRadioLabel = new By.ByCssSelector("label[for=\"gender-radio-1\"]") ;
    private final By femaleRadioLabel = new By.ByCssSelector("label[for=\"gender-radio-2\"]");
    private final By otherRadioLabel = new By.ByCssSelector("label[for=\"gender-radio-3\"]");

    private final By maleRadioButton = By.id ("gender-radio-1");
    private final By femaleRadioButton = By.id("gender-radio-2");
    private final By otherRadioButton = By.id("gender-radio-3");

    public enum Genders{MALE,FEMALE,OTHER}

    public GenderSection(WebDriver driver){
        this.driver=driver;
    }

    public void clickRadioButton(Genders gender){
        switch(gender) {
            case MALE:
                driver.findElement(maleRadioLabel).click();
                break;

            case FEMALE:
                driver.findElement(femaleRadioLabel).click();
                break;

            case OTHER:
                driver.findElement(otherRadioLabel).click();
                break;

        }
    }

    public boolean isRadioButtonChecked(Genders gender){
        boolean isChecked=false;

        switch(gender) {
            case MALE:
                isChecked = driver.findElement(maleRadioButton).isSelected();
                break;

            case FEMALE:
                isChecked = driver.findElement(femaleRadioButton).isSelected();
                break;

            case OTHER:
                isChecked = driver.findElement(otherRadioButton).isSelected();
                break;
        }
        return isChecked;
    }
}
