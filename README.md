# AutomationTesting
All the Automation testing scripts I wrote are here.

Automation Scripting is done in Eclipse IDE.
To write automation script in eclipse IDE, first download selenium java: https://www.selenium.dev/downloads/
Download selenium webdriver for any browser.
links to download webdriver for browsers:
  Chrome: https://sites.google.com/a/chromium.org/chromedriver/
  Edge: https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/#downloads
  Firefox: https://github.com/mozilla/geckodriver/releases
Go to Eclipse IDE.
Create a new Project, Package and java file.
Go to Project properties. Go to java build path.
Go to Libraries. Click on Add external JAR's.
Add all the files in the Selenium Java file we downloaded.

go to Java files.
  we need to import files according to the browser we want to use.
  Chrome: import org.openqa.selenium.chrome.ChromeDriver;
          Add   System.setProperty("webdriver.chrome.driver", "___downloaded webdriver path here___");
		            WebDriver driver = new ChromeDriver();
          in the public static void main()
  Firefox: import org.openqa.selenium.firefox.FirefoxDriver;
           Add  System.setProperty("webdriver.gecko.driver", "___downloaded webdriver path here___");
		            WebDriver driver = new FirefoxDriver();
           in the public static void main()
  Edge: import org.openqa.selenium.edge.EdgeDriver;
        Add   System.setProperty("webdriver.edge.driver", "___downloaded webdriver path here___");
              WebDriver driver = new EdgeDriver();
        in the public static void main()
