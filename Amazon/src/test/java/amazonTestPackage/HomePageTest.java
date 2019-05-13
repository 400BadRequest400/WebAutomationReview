package amazonTestPackage;

import amzonPackage.HomePageSetup;
import org.testng.annotations.Test;

public class HomePageTest extends HomePageSetup  {

    @Test
    public void TestAmazonPage() throws InterruptedException {
        OpenAmazonPage();
        Thread.sleep(3000);

        ClickAccount();
        Thread.sleep(3000);

        InputUserName("jeff@pnt.com");
        Thread.sleep(3000);

        InputPassword("Jeff_Password");
        Thread.sleep(3000);

        AmazonSingIn();
        Thread.sleep(3000);
    }


}
