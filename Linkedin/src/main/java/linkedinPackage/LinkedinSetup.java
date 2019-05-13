package linkedinPackage;

import commonApi.CommonApi;
import org.openqa.selenium.By;

public class LinkedinSetup extends CommonApi {

    public void LinkedinHomePage(){

        System.out.println(driver.getTitle());
    }

    public void Signin(){
        driver.findElement(By.className("nav__button-secondary")).click();
    }

    public void UserName(String email){
        driver.findElement(By.id("username")).sendKeys(email);
    }

    public void Password(String pass){
        driver.findElement(By.id("password")).sendKeys(pass);
    }

    public void SigninButton(){
        driver.findElement(By.xpath("//*[@id=\"app__container\"]/main/div/form/div[3]/button")).click();
        //*[@id="app__container"]/main/div/div[2]/form/div[3]/button
    }



}
