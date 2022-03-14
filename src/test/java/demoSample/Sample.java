package demoSample;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Description;



public class Sample {
	
	@Test
	@Description("Some detailed ====> test description1")
	public void demo() {
		System.out.println("demo1");
	}
	@Test
	@Description("Some detailed test description2")
	public void demo1() {
		Assert.fail();
	}
	
	@Test(dependsOnMethods ="demo1")
	@Description("Some detailed test description3")
	public void demo3() {
		System.out.println("demo1");
	}
	

}
