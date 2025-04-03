package uistore;

import org.openqa.selenium.By;

public class KurtaPageLocator {

    public By selectPage = By.xpath("//a[text()='3']");
    // public By card = By
    // .xpath("//a[@href='/vastramay-mens-maroon-georgette-kurta/p/15982065?productId=15982065&pps=1']");

    public By card = By.xpath("(//div[@class='css-ifdzs8'])[1]");
    public By checkSize = By.xpath("(//button[text()='Preview Size'])[1]");
    public By addtoBag = By.xpath("//span[text()='Add to Bag']");
}
