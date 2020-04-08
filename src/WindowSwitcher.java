import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class WindowSwitcher {
	public static void windowSwitcher(WebDriver dr){
		Set<String> windowHandles = dr.getWindowHandles();
		Iterator<String> windowHandleIterator = windowHandles.iterator();

		System.out.println("Enter the window number you want to switch to.");
		Scanner sc = new Scanner(System.in);
		int userWindowNo = sc.nextInt();

		int winNo = 0;
		while(winNo < windowHandles.size()){
			dr.switchTo().window(windowHandleIterator.next());
			winNo++;
			if(userWindowNo == (winNo + 1)){
				System.out.println("Desired window reached.");
				break;
			}
		}
	}
}
