package com.ss.demo;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

public class DemoTest extends BaseClass {
	@Test
	public void runDEmo() throws MalformedURLException
	{
		capabilities();
		System.out.println("done");
	}

}
