import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Setting_Name_Lastname_Email extends BaseTest {


    @Test
    public void testSetName(){

        practiceFormPage.setName("Mahmut");
        Assertions.assertEquals("Mahmut",practiceFormPage.getName(), "Name value is not like expected.");
    }

    @Test
    public void testLastName(){
        practiceFormPage.setLastName("Kilic");
        Assertions.assertEquals("Kilic",practiceFormPage.getLastName(), "Lastname value is not like expected.");
    }

    @Test
    public void testEmail(){
        practiceFormPage.setEmail("mahmut@mail.com");
        Assertions.assertEquals("mahmut@mail.com",practiceFormPage.getEmail(), "e-mail value is not like expected.");
    }
}
