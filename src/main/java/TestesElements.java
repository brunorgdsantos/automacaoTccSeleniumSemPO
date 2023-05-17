import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestesElements {
	
	private WebDriver driver;
	
	public TestesElements(WebDriver driver) {
		this.driver = driver;
	}
	
	public void selecionaBootstrapTheme(String id_campo, String valor) {
		WebElement element = driver.findElement(By.id(id_campo));
		Select theme = new Select(element);
		theme.selectByVisibleText(valor);
	}
	
	public void escreve(String id_campo, String texto) {
		driver.findElement(By.id(id_campo)).sendKeys(texto);
	}
	
	public void clicarButton(String id_button) {
		driver.findElement(By.className(id_button)).click();
	}
	
	public Boolean aguardaMensagemSucesso(String id_campo, String text) {
	return new WebDriverWait(driver, 10)
			.until(ExpectedConditions.textToBePresentInElement(By.xpath(id_campo),	text));
	}
	
	public String obterTexto(String by) {
		return driver.findElement(By.xpath(by)).getText();
	}
	
	public void clicarBotao(String id_button) {
		driver.findElement(By.linkText(id_button)).click();
	}
	
	public void escreveClass(String id_campo, String texto) {
		driver.findElement(By.className(id_campo)).sendKeys(texto + "\n");
	}
	
	public void clicarBotaoX(String id_button) {
		driver.findElement(By.xpath(id_button)).click();
	}
	
	public String obterMensagemDelete(String by) {
		return driver.findElement(By.className(by)).getText();
	}
	
	public Boolean aguardaMensagemDadosExcluidos(String id_campo, String text) {
		return new WebDriverWait(driver, 10)
				.until(ExpectedConditions.textToBePresentInElement(By.className(id_campo),	text));
	}
	
	public String obterTextoClass(String by) {
		return driver.findElement(By.className(by)).getText();
	}
	
	public void clearCampo(String id_button) {
		driver.findElement(By.id("campo-id")).clear();
	}
}
