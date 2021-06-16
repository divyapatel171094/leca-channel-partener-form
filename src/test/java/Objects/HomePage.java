package Objects;

import Base.DriverSetup;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.stream.Collectors;

public class HomePage extends DriverSetup {
    String channelPartenerXpath = "//*[contains (text() , 'Channel Partner Registration')]";
    String titleXpath= "//*[@class='ibox-title text-center headings']//* [text()='Channel Partner Registration Form']";
    String CompanyNameXpath = "//input[@id='companymaster-title']";
    String ABNNameXpath= "//input[@id='companymaster-abn']";
    String CreditStoreXpath="//input[@id='companymaster-credit_score']";
    String AddressLine1Xpath="//input[@id= 'address_line_1']";
    String selectAddressCheckBoxXpath = "//ins[@class='iCheck-helper']";
    String address_clickXpath = "//li[@id='suggestion_0']";
    String primaryContactTitleXpath = "//option[@value='Mrs.']";
    String primaryContactFirstNameXpath = "//input[@id='user-first_name']";
    String primaryContactLatNameXpath = "//input[@id='user-last_name']";
    String primaryContactEmailXpath = "//input[@id='user-email']";
    String primaryContactPassword1Xpath = "//input[@id='password_validate1']";
    String primaryContactPassword2Xpath = "//input[@id='confirm_password']";
    String primaryDetailsContact = "//input[@id='user-mobile_number']";
    String primaryContactFillAddress = "//input[@id='address_user_1']";
    String primaryContactClickDatePicker = "//input[@id = 'datepicker']";
    String primaryContactSelectDateOfBirth = "//td[@class = 'day' and contains(text(), '10')]";
    String primaryContactDrivingLicence = "//input[@id= 'user-licence_no']";
    String primaryContactEmergencyContactNameXpath = "//input[@id='user-emergency_contact_name']";
    String primaryContactEmergencyContactNoXpath = "//input[@id='user-emergency_contact_no']";
    String profilePictureXpath= "//input[@class='imgInp_banner_profile_pic']";
    public void clickOnChannelPartner(){
        driver.findElement(By.xpath(channelPartenerXpath)).click();
    }
    public String getTitle(){
        return driver.findElement(By.xpath(titleXpath)).getText();
    }

    public void fillFormDetails(String companyName, String ABNName, String CreditStore)  {
        driver.findElement(By.xpath(CompanyNameXpath)).sendKeys(companyName);
        driver.findElement(By.xpath(ABNNameXpath)).sendKeys(ABNName);
        driver.findElement(By.xpath(CreditStoreXpath)).sendKeys(CreditStore);
        }

    public void selectCurrentAddress(String Addressline1) throws InterruptedException {
        driver.findElement(By.xpath(AddressLine1Xpath)).sendKeys(Addressline1);
        Thread.sleep(5000);
        driver.findElement(By.xpath(address_clickXpath)).click();
    }

   public void clickOnSameAsAboveAddressCheckbox() throws InterruptedException {
        Thread.sleep(5000);
          driver.findElement(By.xpath(selectAddressCheckBoxXpath)).click();
    }

    public void fillPrimaryContactDetails(String firstName, String lastName, String email, String password1, String password2, String contact){
        driver.findElement(By.xpath(primaryContactTitleXpath)).click();
        driver.findElement(By.xpath(primaryContactFirstNameXpath)).sendKeys(firstName);
        driver.findElement(By.xpath(primaryContactLatNameXpath)).sendKeys(lastName);
        driver.findElement(By.xpath(primaryContactEmailXpath)).sendKeys(email);
        driver.findElement(By.xpath(primaryContactPassword1Xpath)).sendKeys(password1);
        driver.findElement(By.xpath(primaryContactPassword2Xpath)).sendKeys(password2);
        driver.findElement(By.xpath(primaryDetailsContact)).sendKeys(contact);
    }

    public void fillPrimaryDetailsAddress(String Addressline1) throws InterruptedException {
        driver.findElement(By.xpath(primaryContactFillAddress)).sendKeys(Addressline1);
        Thread.sleep(8000);
        driver.findElement(By.xpath(address_clickXpath)).click();
    }

    public void clickOnDateOfBirthField(){
        driver.findElement(By.xpath(primaryContactClickDatePicker)).click();
        driver.findElement(By.xpath(primaryContactSelectDateOfBirth)).click();
    }

    public void fillPrimaryDetailsAfterDOB(String DrivingLicence, String EmergencyContactName, String EmergencyContactNo){
        driver.findElement(By.xpath(primaryContactDrivingLicence)).sendKeys(DrivingLicence);
        driver.findElement(By.xpath(primaryContactEmergencyContactNameXpath)).sendKeys(EmergencyContactName);
        driver.findElement(By.xpath(primaryContactEmergencyContactNoXpath)).sendKeys(EmergencyContactNo);
    }
    public void uploadImg() throws InterruptedException {
        Thread.sleep(6000);
        driver.findElement(By.xpath(profilePictureXpath)).click();
                //.sendKeys("C:\\Users\\divya.patel\\Downloads\\eduardo-bergen-a1V5iA9UTDc-unsplash_1618312268");
        Thread.sleep(9000);

    }

}

