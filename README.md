# testFrameworks

Basic proof of concept framework tests utilizing Google as the test webpage. Utils class
contains all the test methods for the driver to interact with (click, sendKeys, etc.) and
the googleTests class has two tests using the Google search function.
 
Currently tests only run from the IDE. To run, right-click on tests and run as TestNG

TODO:
* Migrate all locators and xpaths to a dedicated class to attain encapsulation
* Run selenium tests from command line. 
* Create testng.xml files to run test suites.