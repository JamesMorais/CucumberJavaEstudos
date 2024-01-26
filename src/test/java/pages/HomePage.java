package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BrowserDriver;

import java.time.Duration;

public class HomePage extends BrowserDriver {
    // Hamburger Menu
    public static String hamburger_menu_xpath = "//div[@id='menuToggle']//input[@type='checkbox']";
    // SigIn
    public static String sigIn_link_xpath = "//a[@href='SignIn.html']/li";

    public static void click_hamburger_menu() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // Espera até 20 segundos
        By hamburgerMenuLocator = By.xpath(hamburger_menu_xpath);

        // Aguarda até que o elemento seja visível antes de clicar
        wait.until(ExpectedConditions.visibilityOfElementLocated(hamburgerMenuLocator)).click();
    }
    public static void click_signIn_link(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // Espera até 20 segundos
        By signInLocator = By.xpath(sigIn_link_xpath);

        wait.until(ExpectedConditions.visibilityOfElementLocated(signInLocator)).click();
    }
}
