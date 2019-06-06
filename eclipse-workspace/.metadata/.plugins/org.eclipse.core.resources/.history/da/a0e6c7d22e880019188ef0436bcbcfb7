package com.qa.client;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class RestClient {

	//get method
	public void get(String url) throws ClientProtocolException, IOException {
		CloseableHttpClient httpClient =HttpClients.createDefault();
		HttpGet httpget = new HttpGet(url);//GET request
		CloseableHttpResponse closeableHttpResponse = httpClient.execute(httpget);// hit the GET url
		//a.Status code
		int statusCode = closeableHttpResponse.getStatusLine().getStatusCode();
		System.out.println("Status code is "+statusCode);
		
		//b.JSON String  
		String responseString = EntityUtils.toString(closeableHttpResponse.getEntity(),"UTF-8");
		
		JSONObject responseJson = new JSONObject(responseString);
		System.out.println("Response json form api==>> "+responseJson);
		
		//c. All headers
		Header[] headersArray = closeableHttpResponse.getAllHeaders();
		HashMap<String, String> allHeaders= new HashMap<String, String>();
		
		for(Header header :headersArray ) {
			
			allHeaders.put(header.getName(), header.getValue());
		}
		
		System.out.println("Headers array===>> "+allHeaders);
		
		
	}
}
