package factory.ui.componentfactory;

import factory.button.AndroidButton;
import factory.button.Button;
import factory.button.IOSButton;
import factory.menu.AndroidMenu;
import factory.menu.IOSMenu;
import factory.menu.Menu;

public class IOSComponentFactory implements UIComponentFactory{
	
	@Override
	public Button createButton() {
		return new IOSButton();
	}
	
	@Override
	public Menu createMenu() {
		return new IOSMenu();
	}

}
