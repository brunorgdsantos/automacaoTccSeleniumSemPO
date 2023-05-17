import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CadastrarUsuario {
	
	private WebDriver driver;
	private TestesPage page;
	
	@Before
	public void inicializa() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.grocerycrud.com/v1.x/demo/my_boss_is_in_a_hurry/bootstrap");
		page = new TestesPage(driver);
	}
	
	@After
	public void finaliza() {
		driver.quit();
	}
	
	@Test
	public void preencherCamposFormulario() {
		
		page.setBootstrap("Bootstrap V4 Theme");
		page.setAddRecord();
		page.setCustomerName("João Santos");
		page.setContactLastName("Santos");
		page.setContactFirstName("João");
		page.setPhone("999999999");
		page.setAddressLine1("Rua Epitacio Pessoa");
		page.setAddressLine2("Av. Ruy Carneiro");
		page.setCity("João Pessoa");
		page.setState("Paraíba");
		page.setPostalCode("58051000");
		page.setCountry("Brasil");
		page.setSalesRepEmployeeNumber("120");
		page.setCreditLimit("120");
		page.setSave();
		
		page.mensagemSucesso();
		Assert.assertEquals("Your data has been successfully stored into the database. Edit Record or Go back to list", page.obterMensagemSucesso());
	}
}
