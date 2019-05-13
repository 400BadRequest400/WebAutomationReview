package linkedinPackageTest;

import linkedinPackage.LinkedinSetup;
import org.testng.annotations.Test;

public class LinkedinSetupTest extends LinkedinSetup {

    @Test (priority = 1)
    public void LinkedinTest() throws InterruptedException {

        LinkedinHomePage();
        Thread.sleep(2000);

        Signin();
        Thread.sleep(2000);

        UserName("Jeff@Selenium.com");
        Thread.sleep(2000);

        Password("Jeff_pass");
        Thread.sleep(2000);

        SigninButton();
        Thread.sleep(2000);


    }
    @Test (priority = 2)
    public void LinkedinTest2() throws InterruptedException {

        LinkedinHomePage();
        Thread.sleep(2000);

        Signin();
        Thread.sleep(2000);

        UserName("PNt@Selenium.com");
        Thread.sleep(2000);

        Password("PNT_pass");
        Thread.sleep(2000);

        SigninButton();
        Thread.sleep(2000);


    }

    @Test (priority = 3)
    public void LinkedinTest3() throws InterruptedException {

        LinkedinHomePage();
        Thread.sleep(2000);

        Signin();
        Thread.sleep(2000);

        UserName("Akli@Selenium.com");
        Thread.sleep(2000);

        Password("Akli_pass");
        Thread.sleep(2000);

        SigninButton();
        Thread.sleep(2000);


    }
}
