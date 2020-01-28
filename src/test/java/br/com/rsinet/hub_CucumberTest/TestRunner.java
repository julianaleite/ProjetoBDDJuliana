package br.com.rsinet.hub_CucumberTest;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/CriarUsuario.feature", glue = "br.com.rsinet.hub_stepDefinition")

public class TestRunner {

}
