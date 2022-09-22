package ParallSuitfiles;

import java.util.Arrays;

import org.testng.TestNG;

public class RunSuitParalle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestNG testng=new TestNG();
		testng.setTestSuites(Arrays.asList(new String [] {System.getProperty("user.dir")+"//megasuit.xml"}));
		testng.setSuiteThreadPoolSize(2);
		testng.run();
		
	}

}
