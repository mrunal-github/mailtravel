# mailtravel
Maven: Using Maven for build, execution, and dependency purpose.
In this project, I am using Hybrid Framework by using Page Object Design Pattern.
As per the Page Object Model, we have maintained a class for every web page. Each web page has a separate class and that holds the functionality and members of that web page. Separate classes for every individual test.
Packages: We have separate packages for Pages and Tests. All the web page related classes come under the Pages package and all the tests related classes come under Tests package.
Utility Class : Utility class (TestUtil.java) stores and handles the functions (The code which is repetitive in nature such as waits, actions, capturing screenshots, accessing excels, sending email, etc.,) which can be commonly used across the entire framework. The reason behind creating a utility class is to achieve reusability. This class extends the TestBase class to inherit the properties of TestBase in TestUtil.
Properties file: This file (config.properties) stores the information that remains static throughout the framework such as browser-specific information, application URL, screenshots path, etc.
Extent Reports: For the reporting purpose, we are using Extent Reports. It generates beautiful HTML reports. We use the extent reports for maintaining logs and also to include the screenshots of failed test cases in the Extent Report.
OOP’s concept in this Framework.
1.	Locators & methods in Page class by utilizing in tests hiding implementation. (Abstraction)
2.	Webdriver(interface) driver(reference variable)new (keyword) ChromeDriver(class)
3.	Extending BasePage in other Pages (Inheritance)
4.	Used Implicit wait. Implicit wait is an example of overloading. In Implicit wait we use different time   stamps such as SECONDS, MINUTES, HOURS etc. (Method Overloading)
5.	Get and navigate methods of different drivers (Method OverRiding)
6.	 @FindBy and initialization of data members will be done using Constructor to utilize those in methods.(Encapsulation)
Dependencies
1.Junit
2. commons io
3. log4j
4.cucmber-junit
5.cucumber-extent report
