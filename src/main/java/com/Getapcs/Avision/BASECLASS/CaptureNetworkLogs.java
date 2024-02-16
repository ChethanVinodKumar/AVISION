//package com.Getapcs.Avision.BASECLASS;
//import net.lightbody.bmp.BrowserMobProxy;
//import net.lightbody.bmp.BrowserMobProxyServer;
//import net.lightbody.bmp.client.ClientUtil;
//import net.lightbody.bmp.core.har.Har;
//import net.lightbody.bmp.proxy.CaptureType;
//import org.openqa.selenium.Proxy;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//import java.io.File;
//
//public class CaptureNetworkLogs {
//    public static void main(String[] args) {
//        // Set the path to your ChromeDriver executable
//
//        // Start the BrowserMob Proxy
//        BrowserMobProxy proxy = new BrowserMobProxyServer();
//        proxy.start(0);
//
//        // Get the Selenium proxy object
//        Proxy seleniumProxy = ClientUtil.createSeleniumProxy(proxy);
//
//        // Configure Chrome options to use the proxy
//        ChromeOptions options = new ChromeOptions();
//        options.setProxy(seleniumProxy);
//
//        // Initialize ChromeDriver with the configured options
//        WebDriver driver = new ChromeDriver(options);
//
//        // Enable more detailed HAR capture, if desired (see CaptureType for the complete list)
//        proxy.enableHarCaptureTypes(CaptureType.REQUEST_CONTENT, CaptureType.RESPONSE_CONTENT);
//
//        // Create a new HAR with the label "example.com"
//        proxy.newHar("example.com");
//
//        // Open a webpage
//        driver.get("https://example.com");
//
//        // Get the HAR data
//        Har har = proxy.getHar();
//
//        // Save the HAR data to a file
//        File harFile = new File("/path/to/har_file.har");
//        try {
//            har.writeTo(harFile);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        // Stop the BrowserMob Proxy and close the browser
//        proxy.stop();
//        driver.quit();
//    }
//}
