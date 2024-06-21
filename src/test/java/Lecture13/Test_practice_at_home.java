package Lecture13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_practice_at_home {

    public static class TestExamples {

        private FirefoxDriver webDriver;

        @BeforeMethod
        public void browserSetup() throws InterruptedException {
            this.webDriver = new FirefoxDriver();
            this.webDriver.manage().window().maximize();
            this.webDriver.get("http://training.skillo-bg.com:4200/posts/all");
            WebElement login = webDriver.findElement(By.id("nav-link-login"));
            login.click();

            WebElement username = webDriver.findElement(By.id("defaultLoginFormUsername"));
            username.sendKeys("kn3222");
            WebElement password = webDriver.findElement(By.id("defaultLoginFormPassword"));
            password.sendKeys("passpass");

            WebElement rememberMeBox = webDriver.findElement(By.xpath("//input[@class='remember-me-button ng-untouched ng-pristine ng-valid']"));
            rememberMeBox.click();

            WebElement signInButton = webDriver.findElement(By.id("sign-in-button"));
            signInButton.click();

            Thread.sleep(1000);

        }

        @Test
        public void loginSetup() throws InterruptedException {
            WebElement logOut = webDriver.findElement(By.xpath("//li[@class='nav-item ng-star-inserted']//i[@class='fas fa-sign-out-alt fa-lg']"));
            logOut.click();
            Thread.sleep(1000);

            WebElement loginAfterExit = webDriver.findElement(By.id("nav-link-login"));
            Assert.assertTrue(loginAfterExit.isDisplayed(), "The Log in form is displayed!");

        }

        @Test
        public void createNewPost() throws InterruptedException {
            WebElement logOutIcon = webDriver.findElement(By.xpath("//ul[@class='navbar-nav my-ml d-none d-md-block']"));
            Assert.assertTrue(logOutIcon.isEnabled(), "The log out icon is displayed!");

            WebElement newPostButton = webDriver.findElement(By.linkText("New post"));
            newPostButton.click();
            Thread.sleep(1000);

            WebElement uploadField = webDriver.findElement(By.xpath("//*[@class='uploadfilecontainer']"));
        }

        @Test
        public void myPosts() throws InterruptedException {
            WebElement profile = webDriver.findElement(By.id("nav-link-profile"));
            profile.click();
            Thread.sleep(1000);

            WebElement allPosts = webDriver.findElement(By.xpath("//label[@class='btn-all btn btn-primary']"));
            allPosts.click();
            Thread.sleep(1000);

            WebElement privatePosts = webDriver.findElement(By.xpath("//label[@class='btn-private btn btn-primary']"));
            privatePosts.click();
            Thread.sleep(1000);

            WebElement primaryPosts = webDriver.findElement(By.xpath("//label[@class='btn-public btn btn-primary']"));
            primaryPosts.click();
            Thread.sleep(1000);

        }



        @AfterMethod
        public void browserClose() {
            webDriver.quit();
        }

    }
}


