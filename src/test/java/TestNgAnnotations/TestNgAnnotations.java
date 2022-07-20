package TestNgAnnotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNgAnnotations {
  @Test
  public void testCase1() {
	  System.out.println("Inside the test case 1");
  }
  @Test(enabled = false )
  public void testCase2() {
	  System.out.println("Inside the test case 2");
  }
  @Test
  public void testCase3() {
	  System.out.println("Inside the test case 3");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Inside the before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Inside the after method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Inside the before class");
  }

  @AfterClass
  public void afterClass() {
  System.out.println("Inside the after class");
  }
  

  @BeforeTest
  public void beforeTest() {
	  System.out.println("inside before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Inside the after test");
  }  
  
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Inside the before suite");
  }
  
  @AfterSuite
  public void afterSuite() {
	  System.out.println("Inside the after suite");
  }
  }
