package factory.ui.componentfactory;

import factory.button.Button;
import factory.menu.Menu;

public interface UIComponentFactory {
	
	Button createButton();
	
	Menu createMenu();

}
