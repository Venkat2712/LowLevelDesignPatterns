package factory;

import factory.button.AndroidButton;
import factory.button.Button;
import factory.button.IOSButton;
import factory.menu.Menu;
import factory.ui.componentfactory.UIComponentFactory;

public class Client {
	

	public static void main(String[] args) {
		
		Platform platform = SimpleFactory.createPlatformByName("Android");
		
//		Button button = null;
//		if(platform instanceof Android) {
//			button = new AndroidButton();
//		}
//		else {
//			button = new IOSButton();
//		}
//		
//		
//		button.createButton();
		
		
		UIComponentFactory uiFactory = platform.createUIComponentFactory();
		Button button =uiFactory.createButton();
		button.createButton();
		Menu menu = uiFactory.createMenu();
		menu.createMenu();
		

	}

}
