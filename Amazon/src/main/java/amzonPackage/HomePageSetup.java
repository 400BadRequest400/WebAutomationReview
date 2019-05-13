package amzonPackage;

import commonApi.CommonApi;
import org.openqa.selenium.By;

public class HomePageSetup extends CommonApi {


    public void OpenAmazonPage(){
        System.out.println(driver.getTitle());
    }


    public void ClickAccount(){
        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[2]")).click();
    }


    public void InputUserName(String Email){
        driver.findElement(By.id("ap_email")).sendKeys(Email);
    }

    public void InputPassword(String password){
        driver.findElement(By.name("password")).sendKeys(password);
    }

    public void AmazonSingIn(){
        driver.findElement(By.className("a-button-input")).click();
    }













/*


    public void clickAccount(String URL) {
        //click on account
        System.out.println(driver.getCurrentUrl());
    }

    public void clickSignIn(){

    }

    public void writeUsername(String userName) {
        //user
        //parameterize
    }


    public void writePass(String pass) {
        //pass
        //parameterize
    }
    public void submit(){

    }

 */
}
