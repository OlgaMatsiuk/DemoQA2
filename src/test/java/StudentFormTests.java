import helpers.HelperStudent;
import models.StudentDTO;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StudentFormTests extends TestBase implements HelperStudent {

    @BeforeMethod
    public void precondition(){
        hideAds();
        selectItemForms();
        selectPracticeForm();
        hideAds();
        hideFooter();

    }

    @Test
    public void studentFormPositive(){
        StudentDTO student = StudentDTO.builder()
                .firstName("Johanna")
                .lastName("Du")
                .email("joanna@gmail.com")
                .gender("Female")
                .phone("15485")
                .birthday("14 08 2000")
                .subjects("Maths,Physics")
                .hobbies("Sports,Music")
                .address("Haifa, 5")
                .state("NCR")
                .city("Delhi")
                .build();
        fillForm(student);
        submitForm();

    }

}
