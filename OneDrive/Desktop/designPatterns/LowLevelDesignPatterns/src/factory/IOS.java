package factory;

import factory.ui.componentfactory.AndroidComponentFactory;
import factory.ui.componentfactory.IOSComponentFactory;
import factory.ui.componentfactory.UIComponentFactory;

public class IOS extends Platform{
	 public UIComponentFactory createUIComponentFactory() {
		 return new IOSComponentFactory();
	 }

}
