import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeletarUsuario {
	
	private WebDriver driver;
	private TestesPage page;

	@Before
	public void inicializa() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.grocerycrud.com/v1.x/demo/my_boss_is_in_a_hurry/bootstrap-v4");
		page = new TestesPage(driver);
	}

	@After
	public void finaliza() {
		//driver.quit();
	}
	
	@Test
	public void preencherCampoDeletarUsuario() {
		page.setSearchName("João Santos");
		page.aguardeCustomerName();
		page.clickCheckBox();
		page.clickDelete();
		Assert.assertEquals("Are you sure that you want to delete this 1 item?", page.obterMensagemConfirmacaoExclusao());
		page.clickConfirmDelete();
		
		page.mensagemDadosExcluidos();
		Assert.assertEquals("Your data has been successfully deleted from the database.", page.obterMensagemDadosExcluidos());
	}
}
