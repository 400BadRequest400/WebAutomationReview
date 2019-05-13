package bestBuySetup;

import commonApi.CommonApi;
import org.openqa.selenium.By;

public class BestBuyHomePage extends CommonApi {


    public void BestBuyPage() {
        System.out.println(driver.getTitle());
        //driver.switchTo().alert().dismiss();


    }

    //public void BestBuyAccount(){
        //driver.findElement(By.id("hf_accountMenuLink")).click();
   // }
}
