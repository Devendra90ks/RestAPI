package com.qa.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;

import org.apache.http.client.ClientProtocolException;


import com.qa.base.TestBase;
import com.qa.client.RestClient;

public class GetAPITest extends TestBase {
	
	TestBase testBase;
	String servicesURL;
	String apiURL;
	String url;
	RestClient restClient;
	
	
	@BeforeMethod
	public void setUp() {
		
		testBase = new TestBase();
		servicesURL = prop.getProperty("URL");
		apiURL = prop.getProperty("serviceURL");
		url = servicesURL+apiURL;
		System.out.println(url);
		
		
		}
	
	@Test
	public void getTest() throws ClientProtocolException, IOException {
		
		restClient = new RestClient();
		restClient.get(url);
		
	}

}
