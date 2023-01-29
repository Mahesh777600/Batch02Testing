package Com.Listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class Listener implements ISuiteListener{

	public void onStart(ISuite s)
	{
		System.out.println("On Start");
	}
	
	public void onFinish(ISuite s)
	{
		System.out.println("On Finish");
	}
}
