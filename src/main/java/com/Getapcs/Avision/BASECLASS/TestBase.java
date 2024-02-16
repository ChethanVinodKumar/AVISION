package com.Getapcs.Avision.BASECLASS;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Optional;
import java.util.function.Function;

import org.apache.commons.io.FileUtils; // Import FileUtils
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v120.network.Network;
import org.openqa.selenium.devtools.v120.network.model.Request;
import org.openqa.selenium.devtools.v120.network.model.Response;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class TestBase {
	public static ChromeDriver driver;
	public static DevTools devTools;
//	public static FirefoxDriver driver;
	public static ChromeOptions options;
	public static WebDriverWait wait;
	public static Actions actions;
	public static JavascriptExecutor js;
	public static Robot robot;

	@FindBy(xpath = "(//button[normalize-space()='Close'])[1]")
	static WebElement closeButton;

	public static void initialization() throws AWTException {

		// Incognito Mode Execution
		options = new ChromeOptions();
		options.addArguments("--incognito");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(cap);
		driver = new ChromeDriver(options);

		// Normal Execution

//		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wait = new WebDriverWait(driver, Duration.ofSeconds(100));

		actions = new Actions(driver);
		robot = new Robot();
		js = (JavascriptExecutor) driver;

		// For Get the Error Status
		devTools = ((ChromeDriver) driver).getDevTools();
		devTools.createSession();
		devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));

		devTools.addListener(Network.requestWillBeSent(), requestConsumer -> {
			Request req = requestConsumer.getRequest();

			// System.out.println("Send URL :- "+req.getUrl()+"\n"+"\n");
		});

		devTools.addListener(Network.responseReceived(), response -> {
			Response res = response.getResponse();

			// System.err.println(res.getStatus() + " :- "+res.getStatusText()+"\n"+"\n");
			if (res.getStatus().toString().startsWith("3") || res.getStatus().toString().startsWith("4")
					|| res.getStatus().toString().startsWith("5")) {
				String errorMessage = "Error status received: " + res.getStatus() + " - " + res.getStatusText()
						+ "\nError URL: " + res.getUrl();

				System.out.println(errorMessage);
				// Hard assertion
				Assert.fail(errorMessage);
			}
		});

		driver.get("https://avision-demo.getapcs.com/login");

	}

	// Fluent Wait
	public static WebElement waitForElement(WebDriver driver, WebElement element, int timeout, int pollingInterval) {

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeout))
				.pollingEvery(Duration.ofSeconds(pollingInterval)).ignoring(ElementClickInterceptedException.class);

		return wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return wait.until(ExpectedConditions.elementToBeClickable(element));
			}
		});
	}

	// Usage:

//	WebElement element = driver.findElement(By.id("elementId"));
//	element = waitForElement(driver, element, 30, 2);
//	element.click();

//Click Action
	public static void click(WebDriver driver, WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		wait.until(ExpectedConditions.visibilityOf(element));
		try {
			if (!element.isDisplayed()) {
				throw new NoSuchElementException("Element not visible so could not click: " + element);
			}

			element.click();
		} catch (Exception e) {
			try {
				element.sendKeys(Keys.ENTER);
			} catch (Exception e2) {
				try {
					js.executeScript("arguments[0].click();", element);
				} catch (Exception e3) {
					actions.click(element).build().perform();
				}
			}

		}

	}

// Is Selected

	public static void isSelected(WebDriver driver, WebElement element, String variableName) {
		assertTrue(driver.switchTo().activeElement().equals(element), variableName + " : " + " is not Selected");
	}

	// File Upload
	public static void uploadFile(WebDriver driver, WebElement element, int fileIndex) throws Exception {

		js.executeScript("arguments[0].click();", element);

		String[] files = new String[] { "D:\\c drive\\Desktop\\Picture1.png", // imgae
				"D:\\c drive\\Desktop\\Avision Table Pages.xlsx", // excel
				"D:\\c drive\\Desktop\\Sales Order Create.docx", "D:\\c drive\\Desktop\\Utility Methods.txt" }; // docx

		String file = files[fileIndex];

		StringSelection stringSelection = new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

		robot.delay(1000);

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(1000);
		robot.keyRelease(KeyEvent.VK_ENTER);

//		try {
//			click(driver, closeButton);
//		} catch (Exception e) {
//			System.out.println("Close button is not displayed");
//		}
	}

	// Data Print 1
	// Label-Label Tag
	public static void dataPrint(WebDriver driver, WebElement element, String variableName)
			throws InterruptedException {
		waitForElement(driver, element, 10, 1);
		assertTrue(element.isDisplayed(), element + " is not IsDisplayed.");
		// To extract Value Attribute and use same approach to retrieve
		String elementValue = element.getText().trim();
		System.out.println(variableName + " : " + elementValue + "\n");
	}

	// Data Print 2
	// Label-input Tag
	public static void dataPrintFromInputtag(WebDriver driver, WebElement element, String variableName)
			throws InterruptedException {
		waitForElement(driver, element, 10, 1);
		assertTrue(element.isDisplayed(), element + " is not IsDisplayed.");
		String elementValue = (String) js.executeScript("return arguments[0].value;", element);
		System.out.println("\n" + variableName + " : " + elementValue + "\n");
	}

	// Date Picker 1
	public static void datePicker(WebDriver driver, WebElement element) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		assertTrue(element.isDisplayed(), "Date Picker is not Displayed.");
		Thread.sleep(2000);
		click(driver, element);

		for (int i = 0; i < 5; i++) {
			element.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(500); // Add a small delay if needed
		}

		element.sendKeys(Keys.ARROW_RIGHT);
		element.sendKeys(Keys.ENTER);
	}

	// Date Picker 2
	public static void selectPreviousDate(WebDriver driver, WebElement element, int numberOfClicks)
			throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		assertTrue(element.isDisplayed(), "Date Picker is not Displayed.");
		Thread.sleep(2000);
		click(driver, element);

		for (int i = 0; i < numberOfClicks; i++) {
			element.sendKeys(Keys.ARROW_UP);
			Thread.sleep(500); // Add a small delay if needed
		}

		element.sendKeys(Keys.ARROW_LEFT);
		element.sendKeys(Keys.ENTER);
	}

	// Screen Shot
	public static void screenShot(String fileName) throws IOException {

		String filePath = ".//Getapcs_Avision//ScreenShot//" + fileName + ".png";

		// Check if the previous screenshot file exists
		File previousScreenshot = new File(filePath);
		if (previousScreenshot.exists()) {
			// Delete the previous screenshot file
			FileUtils.forceDelete(previousScreenshot);
		}

		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(filePath));

	}

	// Pagination
	public static void paginate(WebDriver driver, int startPage, int endPage, boolean forward) throws Exception {

		if (forward) {

			// Forward iteration
			for (int i = startPage; i <= endPage; i++) {
				System.out.println("Clicking on pagination " + i);
				WebElement pageLink = driver.findElement(By.partialLinkText(String.valueOf(i)));
				click(driver, pageLink);

				// Wait for page load
				wait.until(ExpectedConditions.jsReturnsValue("return document.readyState==='complete';"));

				System.out.println("Page " + i + " loaded!");
			}

		} else {

			// Backward iteration
			for (int i = endPage; i >= startPage; i--) {
				System.out.println("Clicking on pagination " + i);
				WebElement pageLink = driver.findElement(By.partialLinkText(String.valueOf(i)));
				click(driver, pageLink);

				// Wait for page load
				wait.until(ExpectedConditions.jsReturnsValue("return document.readyState==='complete';"));

				System.out.println("Page " + i + " loaded!");
			}
		}
	}

}
