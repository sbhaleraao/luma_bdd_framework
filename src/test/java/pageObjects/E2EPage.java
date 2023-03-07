package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class E2EPage {

    public WebDriver ldriver;

    public E2EPage(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }

    @FindBy(xpath = "//div[@class='panel header']//a[contains(text(),'Sign In')]")
    WebElement lnkLoginPage;

    public void setLnkLoginPage()
    {
        lnkLoginPage.click();
    }

    @FindBy(id = "email")
    WebElement txtLoginEmail;

    public void setTxtLoginEmail(String email)
    {
        txtLoginEmail.sendKeys(email);
    }

    @FindBy(id = "pass")
    WebElement txtLoginPassword;

    public void setTxtLoginPassword(String password)
    {
        txtLoginPassword.sendKeys(password);
    }

    @FindBy(xpath = "//fieldset[@class='fieldset login']//span[contains(text(),'Sign In')]")
    WebElement btnLogin;

    public void setBtnLogin()
    {
        btnLogin.click();
    }

    @FindBy(xpath = "//a[@id='ui-id-19']//span[contains(text(),'Jackets')]")
    WebElement lnkMensTopsJacket;

    public void setlnkMensTopsJacket()
    {
        lnkMensTopsJacket.click();
    }

    // Locating the Main Menu (Parent element)
    @FindBy(xpath = "//li[@class='level0 nav-3 category-item level-top parent ui-menu-item']")
    WebElement mainMenu;

    @FindBy(xpath = "//a[@id='ui-id-17']")
    WebElement subMenuTops;

    @FindBy(xpath = "//a[@id='ui-id-18']")
    WebElement subMenuBottoms;

    @FindBy(xpath = "//a[@id='ui-id-19']")
    WebElement jacket;

    public void setLnkMensTopsJacket()
    {
        Actions actions = new Actions(ldriver);
        actions.moveToElement(mainMenu);

        actions.moveToElement(subMenuTops);

        actions.moveToElement(jacket);
        actions.click().build().perform();
    }

    @FindBy(xpath = "//div[@class='swatch-opt-430']//div[@id='option-label-size-143-item-166']")
    WebElement Jacket1Size;

    public void setJacket1Size()
    {
        Jacket1Size.click();
    }

    @FindBy(xpath = " //div[@class='swatch-opt-430']//div[@id='option-label-color-93-item-50']")
    WebElement Jacket1Color;

    public void setJacket1Color()
    {
        Jacket1Color.click();
    }

    @FindBy(xpath = "(//button[@title='Add to Cart'])[1]")
    WebElement AddJacket1ToCart;

    public void setAddJacket1ToCart()
    {
        AddJacket1ToCart.click();
    }

    @FindBy(xpath = "//div[@class='swatch-opt-414']//div[@id='option-label-size-143-item-166']")
    WebElement Jacket2Size;

    public void setJacket2Size()
    {
        Jacket2Size.click();
    }

    @FindBy(xpath = "//div[@class='swatch-opt-414']//div[@id='option-label-color-93-item-58']")
    WebElement Jacket2Color;

    public void setJacket2Color()
    {
        Jacket2Color.click();
    }

    @FindBy(xpath = "(//button[@title='Add to Cart'])[2]")
    WebElement AddJacket2ToCart;

    public void setAddJacket2ToCart()
    {
        AddJacket2ToCart.click();
    }

    @FindBy(xpath = "//li[@class='level0 nav-3 category-item has-active level-top parent ui-menu-item']")
    WebElement mainMenu2;

    @FindBy(xpath = "//a[@id='ui-id-23']")
    WebElement pants;

    public void setLnkMensBottomsPants()
    {
        Actions actions = new Actions(ldriver);
        actions.moveToElement(mainMenu2);

        actions.moveToElement(subMenuBottoms);

        actions.moveToElement(pants);
        actions.click().build().perform();
    }


    @FindBy(xpath = "//div[@class='swatch-opt-880']//div[@id='option-label-size-143-item-175']")
    WebElement PantSize;

    public void setPantSize()
    {
        PantSize.click();
    }

    @FindBy(xpath = " //div[@class='swatch-opt-880']//div[@id='option-label-color-93-item-50']")
    WebElement PantColor;

    public void setPantColor()
    {
        PantColor.click();
    }

    @FindBy(xpath = "(//button[@title='Add to Cart'])[1]")
    WebElement AddPantToCart;

    public void setAddPantToCart()
    {
        AddPantToCart.click();
    }

    @FindBy(xpath = "//span[@class='counter-number']")
    WebElement CheckoutImage;

    public void setCheckoutImage()
    {
        CheckoutImage.click();
    }

    @FindBy(xpath = "//button[@id='top-cart-btn-checkout']")
    WebElement Checkout;

    public void setCheckout()
    {
        Checkout.click();
    }

    //Checkout

    @FindBy(xpath = " //input[@name='ko_unique_1']\n")
    WebElement SelectShippingMethod;

    public void setSelectShippingMethod()
    {
        SelectShippingMethod.click();
    }

    @FindBy(xpath = "//span[normalize-space()='Next']")
    WebElement SelectNext;

    public void setSelectNext()
    {
        SelectNext.click();
    }

    @FindBy(xpath = "//button[@title='Place Order']")
    WebElement PlaceOrder;

    public void setPlaceOrder()
    {
        PlaceOrder.click();
    }

    @FindBy(xpath = "//div[@class='panel header']//li[@class='customer-welcome']")
    WebElement MyProfile;

    public void setMyProfile()
    {
        MyProfile.click();
    }

    @FindBy(xpath = "//div[@aria-hidden='false']//a[normalize-space()='My Account']")
    WebElement MyAccount;

    public void setMyAccount()
    {
        MyAccount.click();
    }

    @FindBy(xpath = "//a[normalize-space()='My Orders']")
    WebElement MyOrders;

    public void setMyOrders()
    {
        MyOrders.click();
    }

    @FindBy(xpath = " //tbody/tr[1]/td[6]/a[1]/span[1]")
    WebElement MyLastOrders;

    public void setMyLastOrders()
    {
        MyLastOrders.click();
    }

}
