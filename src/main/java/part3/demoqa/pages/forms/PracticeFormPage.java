package part3.demoqa.pages.forms;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.clickJS;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class PracticeFormPage extends FormsPage{

    private By femaleRadioButton = By.id("gender-radio-2");
    private By sportsHobbyCheckbox = By.id("hobbies-checkbox-1");
    private By readingHobbyCheckbox = By.id("hobbies-checkbox-2");
    private By musicHobbyCheckbox = By.id("hobbies-checkbox-3");

    public void clickFemaleRadioButton() {
        scrollToElementJS(femaleRadioButton);
        clickJS(femaleRadioButton);
    }

    public boolean isFemaleSelected() {
        return find(femaleRadioButton).isSelected();
    }

    public void clickSportsCheckbox() {
        scrollToElementJS(sportsHobbyCheckbox);
        if(!find(sportsHobbyCheckbox).isSelected())
            clickJS(sportsHobbyCheckbox);
    }

    public void clickReadingCheckbox() {
        scrollToElementJS(readingHobbyCheckbox);
        if(!find(readingHobbyCheckbox).isSelected())
            clickJS(readingHobbyCheckbox);
    }

    public void clickMusicCheckbox() {
        scrollToElementJS(musicHobbyCheckbox);
        if(!find(musicHobbyCheckbox).isSelected())
            clickJS(musicHobbyCheckbox);
    }

    public void unclickReadingCheckbox() {
        scrollToElementJS(readingHobbyCheckbox);
        if(find(readingHobbyCheckbox).isSelected())
            clickJS(readingHobbyCheckbox);
    }

    public boolean isReadingCheckboxSelected() {
        scrollToElementJS(readingHobbyCheckbox);
        return find(readingHobbyCheckbox).isSelected();
    }

}
