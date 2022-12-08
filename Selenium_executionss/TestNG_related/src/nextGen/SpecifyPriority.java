package nextGen;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SpecifyPriority 
{
	@Test(priority = 1)// will exe 2nd cos priority is 1
	public void test01()
	{
		Reporter.log("1",true);
	}
	
	@Test(priority = 1)// will exe 3 cos priority is 1 but name is 02 and asper alphabetical order 
	public void test02()
	{
		Reporter.log("2",true);
	}
	
	@Test(priority = 3)// will exe last as it has least priority
	public void test03()
	{
		Reporter.log("3",true);
	}
	
	@Test //default priority is 0 so will exe first
	public void test04()
	{
		Reporter.log("4",true);
	}
}
