package MercadoLibre;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import Resources.Base;

public class Listeners extends Base implements ITestListener {

	
//	Base b=new Base(); 
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Start to execute " +result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Succesfull pass to execute " +result.getName());
		;
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		try {
			getScreenshot(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Failed to execute " +result.getName());	   
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		Reporter.log("Completed executing test suite " + context.getName(), true);
	}

}
