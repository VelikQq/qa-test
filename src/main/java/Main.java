import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.testng.Assert;


import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D://QA//chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();


        //Начало
        /*driver.get("https://google.com");

        WebElement input = driver.findElement(By.xpath("//input[@aria-label='Найти']"));
                input.click();*/

        //Ожидания
        /*driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("123"))));
        driver.get("https://google.com");*/

        //Локаторы
        /* System.setProperty("webdriver.chrome.driver","D://QA//chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://google.com");*/

        //Свойства атрибута
        /*driver.get("https://www.avito.ru");

        WebElement element = driver.findElement(By.xpath("(//a[text()='Личные вещи'])[1]"));

        String par = element.getAttribute("offsetWidth");
        String top = element.getAttribute("offsetHeight");

        System.out.println(par);
        System.out.println(top);*/

        //Текст
        /*driver.get("https://www.avito.ru/kletskaya/doma_dachi_kottedzhi?cd=1");

        WebElement element = driver.findElement(By.cssSelector(".price-text-_YGDY.text-text-LurtD.text-size-s-BxGpL"));

        String par = element.getText();
        System.out.println(par);*/

        //Автоматизация тестирования верстки
        /* driver.get("https://dev.by/");

        WebElement element = driver.findElement(By.xpath("//a[text()='Вход']"));
        String hui = element.getCssValue("display");

        System.out.println(hui);*/

        //Клик
         /*driver.get("https://dev.by/");

        WebElement element = driver.findElement(By.xpath("//a[text()='Вход']"));
        String hui = element.getCssValue("display");

        System.out.println(hui);

        element.click();*/

        //SendKeys
        /*driver.get("https://www.udemy.com/");

        WebElement element = driver.findElement(By.xpath("//input[@name='q']"));

            element.sendKeys("Стул для очка", Keys.ENTER);*/

        //Actions
        /*driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



         *//*try {
            driver.get("https://crossbrowsertesting.github.io/drag-and-drop");
            Thread.sleep(2000);
            WebElement element = driver.findElement(By.id("draggable"));
            WebElement element2 = driver.findElement(By.id("droppable"));
            Actions actions = new Actions(driver);
            actions.moveToElement(element).clickAndHold().moveToElement(element2).release().build().perform();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            Thread.sleep(10000);
            driver.quit();
        }*//*

        //Drag and drop
        try {
            driver.get("https://crossbrowsertesting.github.io/drag-and-drop");
            Thread.sleep(2000);
            WebElement element = driver.findElement(By.id("draggable"));
            WebElement element2 = driver.findElement(By.id("droppable"));
            Actions actions = new Actions(driver);
            actions.dragAndDrop(element,element2).build().perform();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            Thread.sleep(10000);
            driver.quit();
        }*/

        //Ожидание исчезновения элемента
        /*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            driver.get("https://pagination.js.org/");
            Thread.sleep(2000);
            List<WebElement> elements = driver.findElements(By.xpath("//div[@class='data-container']/ul/li"));
            List<WebElement> pages = driver.findElements(By.xpath("//div[@class='paginationjs-pages']/ul/li"));
            String text = elements.get(5).getText();
            System.out.println(text);

            pages.get(2).click();
            wait.until(ExpectedConditions.stalenessOf(elements.get(5)));

            elements = driver.findElements(By.xpath("//div[@class='data-container']/ul/li"));

            text = elements.get(5).getText();
            System.out.println(text);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            Thread.sleep(10000);
            driver.quit();


        }*/

        //Модальные окна Alert
        /*driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 1000);

        try {
            driver.get("http://127.0.0.1:5500/index.html#");
            Thread.sleep(5000);

            WebElement element = driver.findElement(By.id("a"));
            WebElement element2 = driver.findElement(By.id("b"));
            WebElement element3 = driver.findElement(By.id("c"));

            Thread.sleep(2000);

            element.click();

            Alert alert = wait.until(alertIsPresent());
            alert.accept();

            Thread.sleep(2000);

            element2.click();
            Alert prompt = wait.until(alertIsPresent());
            prompt.sendKeys("Хер давалка");
            prompt.accept();

            Alert alert2 = wait.until(alertIsPresent());
            Thread.sleep(5000);
            alert2.accept();


            element3.click();
            Alert alert3 = wait.until(alertIsPresent());
            alert3.dismiss();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        finally {
            Thread.sleep(10000);
            driver.quit();
        }*/

        //Вкладки
        /*driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 1000);

        JavascriptExecutor js = (JavascriptExecutor)driver;

        try {
            driver.get("http://127.0.0.1:5500/index.html#");
            Thread.sleep(5000);

           String window1 = driver.getWindowHandle();
           js.executeScript("window.open()");
           Set<String> currentWindows = driver.getWindowHandles();

           String window2 = null;
           for(String window : currentWindows){
               if (!window.equals(window1)){
                   window2 = window;
                   break;
               }
           };
           driver.switchTo().window(window2);
           driver.get("http://127.0.0.1:5500/index.html#");

        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        finally {
            Thread.sleep(10000);
            driver.quit();
        }*/

        //Скрытые инпуты
        /*JavascriptExecutor js = (JavascriptExecutor)driver;

        try {
            driver.get("http://127.0.0.1:5500/index.html#");
            Thread.sleep(5000);

            js.executeScript("document.quarySelector('#a').setAttribute('style', 'opacity:1')");

        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        finally {
            Thread.sleep(10000);
            driver.quit();
        }*/

        //Assert проверки
        /*try {
            driver.get("http://127.0.0.1:5500/index.html#");
            Thread.sleep(5000);

            String title = driver.getTitle();
            Assert.assertEquals(title, "Document");

            

        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        finally {
            Thread.sleep(10000);
            driver.quit();
        }*/

        //Page Object
        try {
            driver.get("http://127.0.0.1:5500/index.html#");
            Thread.sleep(5000);

            LoginPage lp = new LoginPage();
            lp.login("admin", "pass");


        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        finally {
            Thread.sleep(10000);
            driver.quit();
        }
    }
}
