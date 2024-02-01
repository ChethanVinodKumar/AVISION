package com.Getapcs.Avision.BASECLASS;
import java.io.*;
import java.util.Optional;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v120.network.Network;
import org.openqa.selenium.devtools.v120.network.model.Request;
import org.openqa.selenium.devtools.v120.network.model.Response;

public class NetworkError extends TestBase{
	

	
	public static void networkTabConsoleOutputToFile(String filePath) {
        try {
            // Create a file to redirect console output
            File file = new File("console_output.txt");
            FileOutputStream fos = new FileOutputStream(file);
            PrintStream ps = new PrintStream(fos);

            // Save the current System.out
            PrintStream console = System.out;

            // Redirect System.out to the file
            System.setOut(ps);

            // Your existing code
            DevTools devTools = ((ChromeDriver) driver).getDevTools();
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
                        || res.getStatus().toString().startsWith("5"))
                    System.out.println(
                            res.getStatus() + " :- " + res.getStatusText() + "\n" + "Error URL :- " + res.getUrl() + "\n");
            });

            // Close the file stream
            ps.close();

            // Restore System.out
            System.setOut(console);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
