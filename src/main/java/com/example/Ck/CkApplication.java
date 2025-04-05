package com.example.Ck;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class CkApplication {

	public static void main(String[] args) {
		SpringApplication.run(CkApplication.class, args);

		try {
			String url = "http://localhost:7070";
			String chromePath = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";

			new ProcessBuilder(chromePath, url).start();
		} catch (IOException e) {
			System.err.println("Could not open Chrome: " + e.getMessage());
		}

	}
}
