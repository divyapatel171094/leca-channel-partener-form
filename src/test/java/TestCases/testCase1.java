package TestCases;

import Base.UrlSetup;
import Objects.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testCase1 extends UrlSetup {
    String title = "Channel Partner Registration Form";
    String companyName = "Divya";
    String ABNName = "123456789";
    String CreditStore = "98745632145698";
    String Addressline1 = "unit";
    String Addressline2 = "111 Anthony Rolfe Avenue";
    String Suburb = "GUNGAHLIN";
    String State = "ACT";
    String Postcode = "2912";
    String firstName = "Divya";
    String lastName = "Patel";
    String email = "divya.patel+7@drcsystems.com";
    String password1 = "Drc@1234";
    String password2 = "Drc@1234";
    String contact = "1234567890";
    String DrivingLicence= "1234gTVJl";
    String EmergencyContactName = "Divya Patel";
    String EmergencyContactNo = "1234567890";

    HomePage hp = new HomePage();

    public testCase1() {

        url = "http://php.dev.drcsystems.ooo/php-projects/leca/";
    }

    @Test(priority = 1)
    public void clickChannel() {
        hp.clickOnChannelPartner();
        Assert.assertEquals(title, hp.getTitle(), "title is different than actual title");
    }

    @Test(priority = 2)
    public void fillDetails() throws InterruptedException {
        hp.fillFormDetails(companyName, ABNName, CreditStore);
        // hp.addAddress(Addressline1,Addressline2,Suburb,State,Postcode);
    }

    @Test(priority = 3)
    public void addressSelect() throws InterruptedException {
        hp.selectCurrentAddress(Addressline1);

    }

    @Test(priority = 3)
    public void clickAddCheckBox() throws InterruptedException {
        hp.clickOnSameAsAboveAddressCheckbox();
    }

    @Test(priority = 4)
    public void primaryContactDetails() {
        hp.fillPrimaryContactDetails(firstName, lastName, email, password1, password2, contact);
    }

    @Test(priority = 5)
    public void fillPrimaryDetailsAddress() throws InterruptedException {
        hp.fillPrimaryDetailsAddress(Addressline1);
    }
    @Test (priority = 6)
    public void selectDob(){
        hp.clickOnDateOfBirthField();

    }
    @Test (priority = 7)
    public void fillOtherDetails()
    {
       hp.fillPrimaryDetailsAfterDOB(DrivingLicence,EmergencyContactName,EmergencyContactNo);
    }
    @Test (priority = 8)
    public void testUploadImg() throws InterruptedException {
        hp.uploadImg();
    }
}
