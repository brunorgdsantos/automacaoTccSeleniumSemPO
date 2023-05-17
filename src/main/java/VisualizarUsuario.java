import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VisualizarUsuario {

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
		driver.quit();
	}
	
	@Test
	public void preencherCampoPesquisaUsuario() {
		page.setSearchName("João Santos");
		page.aguardeCustomerName();
		Assert.assertEquals("João Santos", page.obterCustomerNamePesquisado());
	}
}
