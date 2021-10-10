package UI;

import org.junit.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.*;



public class RegistrationTest {
    String email ;  
    int pass ;
    String url ;

    @Test
    public void runTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        System.setProperty("selenide.browser", "Chrome");

        String caseId = "15381230";
        open(url);
        $(By.name("email")).val(email);
        $(By.name("password")).val(String.valueOf(pass));
        $(By.name("repeat_password")).val(String.valueOf(pass));
        $(By.className("mat-button-wrapper")).click();
        Thread.sleep(1000);




    }
}

