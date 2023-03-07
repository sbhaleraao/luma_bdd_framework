package utilities;


import org.apache.commons.lang.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pageObjects.E2EPage;


public class BaseClass {

    public WebDriver driver;
    public E2EPage E2EPage;
    public static Logger logger;

    //Created for generating random string for Unique email
    public static String randomestring()
    {
        String generatedString1 = RandomStringUtils.randomAlphabetic(5);
        return (generatedString1);
    }

}
