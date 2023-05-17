import org.openqa.selenium.WebDriver;

public class TestesPage {

	private TestesElements elements;

	public TestesPage(WebDriver driver) {
		elements = new TestesElements(driver);
	}

	public void setBootstrap(String text) {
		elements.selecionaBootstrapTheme("switch-version-select", text);
	}

	public void setAddRecord() {
		elements.clicarButton("btn");
		;
	}

	public void setCustomerName(String nome) {
		elements.escreve("field-customerName", nome);
	}

	public void setContactLastName(String nome) {
		elements.escreve("field-contactLastName", nome);
	}

	public void setContactFirstName(String nome) {
		elements.escreve("field-contactFirstName", nome);
	}

	public void setPhone(String nome) {
		elements.escreve("field-phone", nome);
	}

	public void setAddressLine1(String nome) {
		elements.escreve("field-addressLine1", nome);
	}

	public void setAddressLine2(String nome) {
		elements.escreve("field-addressLine2", nome);
	}

	public void setCity(String nome) {
		elements.escreve("field-city", nome);
	}

	public void setState(String nome) {
		elements.escreve("field-state", nome);
	}

	public void setPostalCode(String nome) {
		elements.escreve("field-postalCode", nome);
	}

	public void setCountry(String nome) {
		elements.escreve("field-country", nome);
	}

	public void setSalesRepEmployeeNumber(String nome) {
		elements.escreve("field-salesRepEmployeeNumber", nome);
	}

	public void setCreditLimit(String nome) {
		elements.escreve("field-creditLimit", nome);
	}

	public void setSave() {
		elements.clicarButton("btn");
	}

	public void mensagemSucesso() {
		elements.aguardaMensagemSucesso("//div[@id='report-success']/p",
				"Your data has been successfully stored into the database. Edit Record or Go back to list");
	}

	public void mensagemSucessoUpdate() {
		elements.aguardaMensagemSucesso("//div[@id='report-success']/p",
				"Your data has been successfully updated. Go back to list");
	}

	public String obterMensagemSucesso() {
		return elements.obterTexto("//div[@id='report-success']/p");
	}

	public void clickGoBackToList() {
		elements.clicarBotao("Go back to list");
	}

	public void setSearchName(String nome) {
		elements.escreveClass("form-control", nome);
	}

	public void aguardeCustomerName() {
		elements.aguardaMensagemSucesso("//form[@id='gcrud-search-form']/div[2]/table/tbody/tr/td[3]", "João Santos");
	}

	public void clickCheckBox() {
		elements.clicarBotaoX("//tbody/tr/td/input");
	}

	public void clickDelete() {
		elements.clicarButton("text-danger");
	}

	public String obterMensagemConfirmacaoExclusao() {
		return elements.obterMensagemDelete("alert-delete-multiple-one");
	}

	public void clickConfirmDelete() {
		elements.clicarBotaoX("//div[3]/div/div/div[3]/button[2]");
	}

	public void mensagemDadosExcluidos() {
		elements.aguardaMensagemDadosExcluidos("alert", "Your data has been successfully deleted from the database");
	}

	public String obterMensagemDadosExcluidos() {
		return elements.obterTexto("//p[contains(.,'Your data has been successfully deleted from the database.')]");
	}

	public String obterCustomerNamePesquisado() {
		return elements.obterTexto("/html/body/div[2]/div[2]/div[1]/div[2]/form/div[2]/table/tbody/tr/td[3]");
	}

	public void clickEdit() {
		elements.clicarBotaoX("/html/body/div[2]/div[2]/div[1]/div[2]/form/div[2]/table/tbody/tr/td[2]/div[1]/a");
	}

	public void limparCampo() {
		elements.clearCampo("field-customerName");
	}

	public void clickUpdateChanges() {
		elements.clicarBotaoX("/html/body/div[2]/div[2]/div[1]/div[2]/form/div[2]/table/tbody/tr/td[2]/div[1]/a");
	}

	public String obterMensagemSuccessfullyUpdated() {
		return elements.obterTexto("/html/body/div[2]/div/div/div/div[2]/form/div[14]/div[2]/p");
	}

}
