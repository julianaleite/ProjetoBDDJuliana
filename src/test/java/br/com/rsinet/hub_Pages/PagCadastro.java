package br.com.rsinet.hub_Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
//import br.com.rsinet.hub.utility.Log;

public class PagCadastro {

	WebDriver driver;
	

	
	@FindBy(how = How.NAME, using = "usernameRegisterPage")
	private WebElement campoNome;

	@FindBy(how = How.NAME, using = "emailRegisterPage")
	private WebElement campoEmail;

	@FindBy(how = How.NAME, using = "passwordRegisterPage")
	private WebElement campoSenha;

	@FindBy(how = How.NAME, using = "confirm_passwordRegisterPage")
	private WebElement campoConfirmaSenha;

	@FindBy(how = How.NAME, using = "first_nameRegisterPage")
	private WebElement campoPrimeiroName;

	@FindBy(how = How.NAME, using = "last_nameRegisterPage")
	private WebElement campoSegundoName;

	@FindBy(how = How.NAME, using = "phone_numberRegisterPage")
	private WebElement campoTelefone;

	@FindBy(how = How.NAME, using = "countryListboxRegisterPage")
	private WebElement campoPais;

	@FindBy(how = How.NAME, using = "cityRegisterPage")
	private WebElement campoCidade;

	@FindBy(how = How.NAME, using = "addressRegisterPage")
	private WebElement campoEndereco;

	@FindBy(how = How.NAME, using = "state_/_province_/_regionRegisterPage")
	private WebElement campoEstado;

	@FindBy(how = How.NAME, using = "postal_codeRegisterPage")
	private WebElement campoCodigoPostal;

	@FindBy(how = How.NAME, using = "i_agree")
	private WebElement campoAceita;

	@FindBy(how = How.ID, using = "register_btnundefined")
	private WebElement campoRegistra;
	
	public void digitaNome (String nome) {
		campoNome.sendKeys(nome);
	}
	
	public void digitaEmail (String email) {
		campoEmail.sendKeys(email);
	}
	public void digitaSenha (String senha) {
		campoSenha.sendKeys(senha);
	}
	public void confirmarSenha (String confirSenha) {
		campoConfirmaSenha.sendKeys(confirSenha);
	}
	public void digitaPrimeiroNome (String primeiroNome) {
		campoPrimeiroName.sendKeys(primeiroNome);
	}
	public void digitaSegundoNome (String segundoNome) {
		campoSegundoName.sendKeys(segundoNome);
	}
	public void digitaTelefone (String telefone) {
		campoTelefone.sendKeys(telefone);
	}
	public void escolherPais (String pais) {
		campoPais.sendKeys(pais);
	}
	
	public void digitarCidade (String cidade) {
		campoCidade.sendKeys(cidade);
		
	}
	public void digitandereco (String endereco) {
		campoEndereco.sendKeys(endereco);
		
	}
	public void digitaCodigoPostal (String codigo) {
		campoCodigoPostal.sendKeys(codigo);
	}
	public void permitirOferta () {
		campoCodigoPostal.click();
	}
	public void AceitarCondicao() {
		campoAceita.click();
	}
	public void registrarNome () {
		campoRegistra.click();
	}
	
	
		
		
		
		
		
		
		
		
		
		
		
/*	
	public static WebElement metodosDeCadastarCliente;
	

	public static  String digitaNome (WebDriver driver) {
		metodosDeCadastarCliente = driver.findElement(By.name("usernameRegisterPage"));
		Log.info("Buscando o Elemento digitar nome");
		return metodosDeCadastarCliente.sendKeys(nome);
	
	
	}

	public static WebElement digitaEmail(WebDriver driver) {
		metodosDeCadastarCliente = driver.findElement(By.name("emailRegisterPage"));
		Log.info("Capturando o Elemento digitar email");
		return metodosDeCadastarCliente;
	}

	public static WebElement digitaSenha(WebDriver driver) {
		metodosDeCadastarCliente = driver.findElement(By.name("passwordRegisterPage"));
		Log.info("Capturando o elemento digitar senha");
		return metodosDeCadastarCliente;
	}

	public static WebElement confirmaSenha(WebDriver driver) {
		metodosDeCadastarCliente = driver.findElement(By.name("confirm_passwordRegisterPage"));
		Log.info("Capsturando o elemento corfimar senha");
		return metodosDeCadastarCliente;
	}

	public static WebElement primeiroNome (WebDriver driver) {
		metodosDeCadastarCliente = driver.findElement(By.name("first_nameRegisterPage"));
		Log.info("Capturando o elemento primeiro nome");
		return metodosDeCadastarCliente;
	}

	public static WebElement segundoNome(WebDriver driver) {
		metodosDeCadastarCliente = driver.findElement(By.name("last_nameRegisterPage"));
		Log.info("Capturando o elemento segundo nome");
		return metodosDeCadastarCliente;
	}

	public static WebElement numeroDeTelefone(WebDriver driver) {
		metodosDeCadastarCliente = driver.findElement(By.name("phone_numberRegisterPage"));
		Log.info("Capturando o elemento nuemro de telefone");
		return metodosDeCadastarCliente;
	}

	public static Select escolherPais(WebDriver driver) {
		metodosDeCadastarCliente = driver.findElement(By.name("countryListboxRegisterPage"));
		Select select = new Select(metodosDeCadastarCliente);
		Log.info("Capturando o Elemento Pais Brazil");
		return select;
	}

	public static WebElement digitarCidade(WebDriver driver) {
		metodosDeCadastarCliente = driver.findElement(By.name("cityRegisterPage"));
		Log.info("Capturando o elemento Digitar cidade");
		return metodosDeCadastarCliente;
	}

	public static WebElement digitarEndereco(WebDriver driver) {
		metodosDeCadastarCliente = driver.findElement(By.name("addressRegisterPage"));
		Log.info("Capturando o elemento digitar o enedereço");
		return metodosDeCadastarCliente;

	}

	public static WebElement digitarEstado(WebDriver driver) {
		metodosDeCadastarCliente = driver.findElement(By.name("state_/_province_/_regionRegisterPage"));
		Log.info("Capturando o elemento Digitar estado");
		return metodosDeCadastarCliente;
	}

	public static WebElement digitarCodigoPostal(WebDriver driver) {
		metodosDeCadastarCliente = driver.findElement(By.name("postal_codeRegisterPage"));
		Log.info("Capturando o elemento digitar codigo postal");
		return metodosDeCadastarCliente;
	}

	public static WebElement clicarEmPermitirOfertas(WebDriver driver) {
		metodosDeCadastarCliente = driver.findElement(By.name("allowOffersPromotion"));
		Log.info("Capturando o elemento Clicar em permiçoes de oferta ");
		return metodosDeCadastarCliente;
	}

	public static WebElement clicarAceitaCondicoes(WebDriver driver) {
		metodosDeCadastarCliente = driver.findElement(By.name("i_agree"));
		Log.info(" Capturando o elemento de Aceitar os termos ");
		return metodosDeCadastarCliente;
	}

	public static WebElement registrarONome(WebDriver driver) {
		metodosDeCadastarCliente = driver.findElement(By.id("register_btnundefined"));
		Log.info("Capturando o elemento registar nome ");
		return metodosDeCadastarCliente;
	}

	public static String oNomeDoUsuarioJaExiste(WebDriver driver) {
		metodosDeCadastarCliente = driver.findElement(By.cssSelector("#registerPage > article > sec-form > div.center > label.center.block.smollMargin.invalid"));
		Log.info("Capturando o elemento o usuario ja existe");
		return metodosDeCadastarCliente.getText();
	
	}
	public static WebElement ACCOUNTDETAILS (WebDriver driver) {
		metodosDeCadastarCliente = driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[1]/h3"));
		Log.info(" Capturando o Elemento ACCOUNT DETAILS ");
		return metodosDeCadastarCliente;
		
		
	} */
	

}