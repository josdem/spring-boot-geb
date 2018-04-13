import io.github.bonigarcia.wdm.FirefoxDriverManager
import org.openqa.selenium.firefox.FirefoxDriver

reportsDir = 'build/test-reports'

atCheckWaiting = true

driver = {
  FirefoxDriverManager.getInstance().setup()
  new FirefoxDriver()
}