package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.E2EPage;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import utilities.BaseClass;

import java.io.IOException;


public class StepDef extends BaseClass {

    @Before
    public void setup() throws IOException
    {
        //Logging
        logger = Logger.getLogger("LUMA BDD CUCUMBER");
        PropertyConfigurator.configure("Log4j.properties");
        logger.setLevel(Level.DEBUG);

    }

    @Given("User Launch Chrome browser")
    public void user_Launch_Chrome_browser()
    {
        logger.info("************* Launching Browser *****************");

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        E2EPage = new E2EPage(driver);

    }

    @When("User opens URL {string}")
    public void user_opens_URL(String string) throws InterruptedException
    {

        logger.info("************* Opening URL  *****************");

        driver.get("https://magento.softwaretestingboard.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

    }


    /*  ************** USER SIGN IN STEPS DEFINITIONS STARTS HERE ***********/


    @Then("Click on Log in link")
    public void click_on_log_in_link() throws InterruptedException
    {
        Thread.sleep(2000);
        E2EPage.setLnkLoginPage();
    }

    @And("User enters Email as {string} and Password as {string}")
    public void user_enters_email_as_and_password_as(String email, String password) throws InterruptedException {
        E2EPage.setTxtLoginEmail(email);
        Thread.sleep(2000);
        E2EPage.setTxtLoginPassword(password);
    }

    @And("Click on Log in")
    public void click_on_log_in() throws InterruptedException {
        Thread.sleep(2000);
        E2EPage.setBtnLogin();
        logger.info("************* Signed In Successfully *****************");
    }

    @And("User select Men Tops category from navigation")
    public void user_select_men_tops_category_from_navigation() throws InterruptedException {
        Thread.sleep(2000);
        E2EPage.setLnkMensTopsJacket();

    }
    @Then("User select {int} Jackets and Add into the cart")
    public void user_select_jackets_and_add_into_the_cart(Integer int1) throws InterruptedException {
        Thread.sleep(2000);
        E2EPage.setJacket1Size();
        Thread.sleep(2000);
        E2EPage.setJacket1Color();
        Thread.sleep(2000);
        E2EPage.setAddJacket1ToCart();

        Thread.sleep(2000);
        E2EPage.setJacket2Size();
        Thread.sleep(2000);
        E2EPage.setJacket2Color();
        Thread.sleep(2000);
        E2EPage.setAddJacket2ToCart();

        logger.info("************* 2 jacket product added to the cart *****************");

    }
    @When("User select Men Bottoms category from navigation")
    public void user_select_men_bottoms_category_from_navigation() throws InterruptedException {

        Thread.sleep(5000);
        E2EPage.setLnkMensBottomsPants();

    }
    @Then("User select {int} Pants and Add into the cart")
    public void user_select_pants_and_add_into_the_cart(Integer int1) throws InterruptedException {

        Thread.sleep(2000);
        E2EPage.setPantSize();
        Thread.sleep(2000);
        E2EPage.setPantColor();
        Thread.sleep(2000);
        E2EPage.setAddPantToCart();

        logger.info("************* 1 bottom product added to the cart *****************");

    }
    @Then("User will navigate to the checkout")
    public void user_will_navigate_to_the_checkout() throws InterruptedException {
        Thread.sleep(2000);
        E2EPage.setCheckoutImage();
        Thread.sleep(2000);
        E2EPage.setCheckout();

        logger.info("************* Navigated to the checkout page *****************");

    }

    @Then("User will choose shipping method")
    public void user_will_choose_shipping_method() throws InterruptedException {
        Thread.sleep(5000);
        E2EPage.setSelectShippingMethod();
    }
    @Then("Click on Next")
    public void click_on_next() throws InterruptedException {
        Thread.sleep(2000);
        E2EPage.setSelectNext();
    }

    @Then("Click on Place order")
    public void click_on_place_order() throws InterruptedException {
        Thread.sleep(5000);
        E2EPage.setPlaceOrder();

        logger.info("************* Order placed successfully *****************");
    }

    @Then("Click on My Account")
    public void click_on_my_account() throws InterruptedException {
        Thread.sleep(5000);
        E2EPage.setMyProfile();
        Thread.sleep(5000);

    }
    @Then("Click on My Orders")
    public void click_on_my_orders() throws InterruptedException {

        Thread.sleep(2000);
        E2EPage.setMyAccount();
        Thread.sleep(2000);
        E2EPage.setMyOrders();

        logger.info("************* My Order List *****************");

    }
    @Then("Verify last order in my orders")
    public void verify_last_order_in_my_orders() throws InterruptedException {
        Thread.sleep(3000);
        E2EPage.setMyLastOrders();

        logger.info("************* Verified the last order *****************");
    }

    @And("Close browser")
    public void close_browser() throws InterruptedException
    {
        driver.quit();
        logger.info("************* Close the browser *****************");
    }

}
