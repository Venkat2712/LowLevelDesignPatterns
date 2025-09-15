package factory.ui.componentfactory;
import factory.button.AndroidButton;
import factory.button.Button;
import factory.button.IOSButton;
import factory.menu.AndroidMenu;
import factory.menu.Menu;


public class AndroidComponentFactory implements UIComponentFactory{
	
	@Override
	public Button createButton() {
		return new AndroidButton();
	}
	
	@Override
	public Menu createMenu() {
		return new AndroidMenu();
	}

}
