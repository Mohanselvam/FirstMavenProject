package com.listerners.udemy;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListeners implements  ITestListener
{
	
	
	
	@Override		
    public void onTestFailure(ITestResult arg0) {					
        // TODO Auto-generated method stub				
		System.out.println("The test will be FAILED"+"-----"+arg0.getName());	
    }		

    @Override		
    public void onTestSkipped(ITestResult arg0) {					
        // TODO Auto-generated method stub				
    	System.out.println("The test will be SKIPPED"+"-----"+arg0.getName());
    }		

    @Override		
    public void onTestStart(ITestResult arg0) {					
        // TODO Auto-generated method stub				
    	System.out.println("The test will be STARTED"+"-----"+arg0.getName());
    }		

    @Override		
    public void onTestSuccess(ITestResult arg0) {					
        // TODO Auto-generated method stub		
    	System.out.println("The test will be SUCCESS"+"-----"+arg0.getName());
        		
    }		
}
