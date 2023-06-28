package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.CorejavaPage;
import pomPages.SkillraryPage;
import pomPages.WishListPage;

public class Testcase3 extends BaseClass
{
	@Test
	public void tc3() throws IOException, InterruptedException
	{
		SkillraryPage s=new SkillraryPage(driver);
		s.serachtextbox(pdata.getData("serachtextbox"));
		s.serachbutton();
		
		CorejavaPage c=new CorejavaPage(driver);
		c.seleniumcourse();
		
		WishListPage w=new WishListPage(driver);
		driverutilities.switchtoframe(driver);
		Point loc = w.getTwitter().getLocation();
		int x=loc.getX();
		int y=loc.getY();
		driverutilities.scrollBar(driver, x,y);
		//w.playbutton();
		//Thread.sleep(10000);
		//w.pausebutton();
		driverutilities.switchbackframe(driver);
		w.wishlistbtn();
		w.twittericon();
     }
}

