package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ComposeMail {

	WebDriver driver = new ChromeDriver();

	@Given("User access the home page of the gmail")
	public void userAccessTheHomePageOfTheGmail() {
		driver.get("https://mail.google.com");

	}

	@Given("User login to page using id and password")
	public void userLoginToPageUsingIdAndPassword() {
		// Locate and fill in username and password fields
		WebElement usernameField = driver.findElement(By.id("identifierId"));
		usernameField.sendKeys("your_username");
		usernameField.sendKeys(Keys.ENTER);
		// Wait for password field to appear
		// Then locate and fill in password field
		WebElement passwordField = driver.findElement(By.name("password"));
		passwordField.sendKeys("your_password");
		passwordField.sendKeys(Keys.ENTER);
	}

	@Given("User access the compose window by clicking the {string} button")
	public void userAccessTheComposeWindowByClickingTheButton(String composeButton) {
		// Click on the compose button
		WebElement composeButtonElement = driver.findElement(By.xpath("//div[text()='Compose']"));
		composeButtonElement.click();
	}

	@Then("User is navigated to the compose window called {string}")
	public void userIsNavigatedToTheComposeWindowCalled(String windowName) {
		// Check if the compose window is opened with the specified name
		WebElement composeWindowTitle = driver.findElement(By.xpath("//div[contains(text(),'" + windowName + "')]"));
		assert (composeWindowTitle.isDisplayed());
	}

	@Then("The mouse cursor should be active in to field.")
	public void theMouseCursorShouldBeActiveInToField() {
		WebElement toField = driver.findElement(By.name("to"));
		assert (toField.equals(driver.switchTo().activeElement()));
	}

	@When("User clicks in the body field")
	public void userClicksInTheBodyField() {

	}

	@Then("User should be able to enter the text message")
	public void userShouldBeAbleToEnterTheTextMessage() {

	}

	@Then("Text Formatting options should be available for text modification")
	public void textFormattingOptionsShouldBeAvailableForTextModification() {

	}

	@When("User enters the invalid email in the {string} field")
	public void userEntersTheInvalidEmailInTheField(String invalidEmail) {

	}

	@Then("The invalid formate email is marked with red Underline")
	public void theInvalidFormateEmailIsMarkedWithRedUnderline() {

	}

	@When("User enters the valid email formate of the recipent")
	public void userEntersTheValidEmailFormateOfTheRecipent() {

	}

	@Then("User gets the suggestions for the emails in the drop down to select from them")
	public void userGetsTheSuggestionsForTheEmailsInTheDropDownToSelectFromThem() {

	}

	@Then("User is able to enter more than one valid emails")
	public void userIsAbleToEnterMoreThanOneValidEmails() {

	}

	@When("User press enter button")
	public void userPressEnterButton() {

	}

	@Then("The email is added to the recipents list")
	public void theEmailIsAddedToTheRecipentsList() {

	}

	@When("User clicks on {string} and {string}")
	public void userClicksOnAnd(String string, String string2) {

	}

	@Then("The input box should open for corusponding field")
	public void theInputBoxShouldOpenForCoruspondingField() {

	}

	@Then("valid email is acceptible")
	public void validEmailIsAcceptible() {

	}

	@When("User clicks on {string} field it should get active")
	public void userClicksOnFieldItShouldGetActive(String string) {

	}

	@When("User enters the text to the field")
	public void userEntersTheTextToTheField() {

	}

	@Then("The Subject field should contain entred text")
	public void theSubjectFieldShouldContainEntredText() {

	}

	@When("User cliks on {string}")
	public void userCliksOn(String string) {

	}

	@Then("Formatting ribbon or options must appear or disappear")
	public void formattingRibbonOrOptionsMustAppearOrDisappear() {

	}

	@When("User clicks on {string}")
	public void userClicksOn(String string) {

	}

	@Then("The System window should open for uploading the file")
	public void theSystemWindowShouldOpenForUploadingTheFile() {

	}

	@Then("Edit link window shold open")
	public void editLinkWindowSholdOpen() {

	}

	@Then("Window should open for selecting emoji")
	public void windowShouldOpenForSelectingEmoji() {

	}

	@Then("Users google drive window should open")
	public void usersGoogleDriveWindowShouldOpen() {

	}

	@Then("Users system window should open to upload photo")
	public void usersSystemWindowShouldOpenToUploadPhoto() {

	}

}
