package week2.day2.Assignments;

public class CreateContact {

	public static void main(String[] args) {
		
		
	
		  ChromeDriver driver=new ChromeDriver(); 
	    driver.get("http://leaftaps.com/opentaps/contol/login");
            driver.manage().window().maximize();
            driver.findElement(By.id("username")).sendKeys("demoSalesManager");
            driver.findElement(By.id("password")).sendKeys("crmsfa");
            driver.findElement(By.className("decorativeSubmit")).click();
            driver.findElement(By.linkText("CRM/SFA")).click();
	    driver.findElement(By.className("x-panel-header")).click();
	    driver.findElement(By.linkText("Create Contact")).click();
	    driver.findElement(By.id("firstNameField")).sendKeys("Infanteena");
            driver.findElement(By.id("lastNameField")).sendKeys("A");
            driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Infanteena");
	    driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("A");
            driver.findElement(By.id("createContactForm_departmentName")).sendKeys("ECE");
            driver.findElement(By.id("createContactForm_description")).sendKeys("hi this is me");
            driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("infanteena123@gmail.com");
            WebElement selectprovince = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
            Select op=new Select(selectprovince);
            op.selectByVisibleText("New York");
	    driver.findElement(By.className("smallSubmit")).click();
	    driver.findElement(By.linkText("subMenuButton")).click();
            driver.findElement(By.id("updateContactForm_description")).clear();
	    driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("goodmorning");
	    driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
            driver.findElement(By.className("smallSubmit")).click();
	    System.out.println("the tile is "+ driver.getTitle());
		 
		
	}

}
