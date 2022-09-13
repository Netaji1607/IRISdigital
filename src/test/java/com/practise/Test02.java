package com.practise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test02 {
	
	@Test
	 public void test02() {
	 HashMap<String,String> hm = new HashMap<String,String>();
	 hm.put("userName","abcd");
	 hm.put("password","1234");
	 hm.put("browser","https://google.com/");
	 hm.put("environment","QA");
	 
	Set<Entry<String,String>> entry = hm.entrySet();
	Iterator<Entry<String, String>> it = entry.iterator();
	while(it.hasNext()) {
		Entry<String,String> en = it.next();
		System.out.println(en.getKey()+"...."+ en.getValue());
	}
	}
	
	@Test
	public void stringDiff() {
		String s = "12xt@j5&";
		String spe = s.replaceAll("[^@ & ]","");
		String num = s.replaceAll("[^1 2 5]","");
		String cha = s.replaceAll("[^x t j]","");
		System.out.println(Arrays.toString(spe.toCharArray()));
		System.out.println(Arrays.toString(num.toCharArray()));

		System.out.println(Arrays.toString(cha.toCharArray()));

	}
	
	@Test
	public void arrayPro() {
		
		int[] ar = {1,2,1,1,3,2,3,3,3};
		// 1   -> 3
		// 2   -> 2
		int countOf=0;
		for(int i=0;i<ar.length;i++) {
			for(int j=i;j<ar.length;j++) {
				if(ar[i]==ar[j])
				{
					countOf++;
				}
				
			}
			System.out.println(ar[i]+"  repeated by "+countOf);
			countOf=0;
		}
	}
		
}
