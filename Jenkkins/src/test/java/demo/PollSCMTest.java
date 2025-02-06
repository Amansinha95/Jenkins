package demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.model.Report;

public class PollSCMTest {
@Test
public void scm() {
	Reporter.log("poll scm class added",true);
	Reporter.log("check",true);
}
}
