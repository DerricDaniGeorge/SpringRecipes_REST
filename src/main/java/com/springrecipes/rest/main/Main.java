package com.springrecipes.rest.main;

import org.springframework.web.client.RestTemplate;

import com.springrecipes.rest.beans.Members;

import java.util.Map;
import java.util.HashMap;
public class Main {
	public static  void main(String[] args) {
		/*final String url="http://localhost:8080/SpringREST/members.json";
		RestTemplate restTemplate=new RestTemplate();
		String result=restTemplate.getForObject(url,String.class);
		System.out.println(result);  */
		System.out.println("==========================================");
		String url2="http://localhost:8080/SpringREST/member/{memberId}";
		Map<String,String> params=new HashMap<>();
		params.put("memberId", "MartenDeinum");
		RestTemplate template2=new RestTemplate();
		Members r2=template2.getForObject(url2, Members.class,params);
		System.out.println(r2);  
	}
}
