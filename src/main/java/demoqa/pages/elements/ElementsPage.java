package demoqa.pages.elements;

import org.openqa.selenium.By;
import demoqa.pages.HomePage;

public class ElementsPage extends HomePage {

    private By webTablesMenuItem = By.xpath("//span[text()='Web Tables']");
    private By linksMenuItem = By.xpath("//span[text()='Links']");

    public WebTablesPage clickWebTables() {
        click(webTablesMenuItem);
        return new WebTablesPage();
    }

    public LinksPage clickLinks() {
        click(linksMenuItem);
        return new LinksPage();
    }
}
