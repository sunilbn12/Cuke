package cucumberRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



/********************
 * Runner class of Cucumber
 * @author Sunil
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features",glue="stepDefination")
public class TestRunner {

}
