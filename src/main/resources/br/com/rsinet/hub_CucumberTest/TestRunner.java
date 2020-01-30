package br.com.rsinet.hub_CucumberTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "Feature/CriarUsuario.feature",
		"Feature/TestePesquisaLupa.feature" }, glue = "br.com.rsinet.hub_stepDefinition", tags = "@CadastraUsuario,@PesquisaLupa")

public class TestRunner {

}
