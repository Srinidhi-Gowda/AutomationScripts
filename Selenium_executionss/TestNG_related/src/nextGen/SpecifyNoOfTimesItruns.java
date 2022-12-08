package nextGen;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SpecifyNoOfTimesItruns 
{
	@Test(invocationCount = 4)
	public void test01()
	{
		Reporter.log("1",true);
	}
	
	@Test(invocationCount = 3)
	public void test02()
	{
		Reporter.log("2",true);
	}
	
	@Test(invocationCount = 2)
	public void test03()
	{
		Reporter.log("3",true);
	}
	
	@Test(invocationCount = 1)
	public void test04()
	{
		Reporter.log("4",true);
	}
}
