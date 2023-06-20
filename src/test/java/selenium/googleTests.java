package selenium;

import org.testng.annotations.Test;

public class googleTests {

    //Change the variable for different Google search results
    String searchTerm = "Lancelot";
    String luckyButtonID = "RNmpXc";
    @Test
    public void searchGoogle(){
        utils.navigateGoogle();
        utils.searchGoogle(searchTerm);
    }

    @Test
    public void searchGoogleLucky(){
        utils.maximizeCurr();
        utils.navigateGoogle();
        utils.typeSearchBar(searchTerm);
        utils.tapButton(luckyButtonID);
    }
}
