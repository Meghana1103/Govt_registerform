package runnerfile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions (features = {"C:\\Users\\pavan\\eclipse-workspace\\learnSeleniuim\\Cucumber_Mvn_git_jenkin_Asgnmt\\src\\test\\resources\\Form\\gvtform.feature"},glue = {"Form_Steps"})
public class login_runner_register {


}
