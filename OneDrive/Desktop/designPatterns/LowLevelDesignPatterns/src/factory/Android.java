package factory;

import factory.ui.componentfactory.AndroidComponentFactory;
import factory.ui.componentfactory.UIComponentFactory;

public class Android extends Platform {
	
	 public UIComponentFactory createUIComponentFactory() {
		 return new AndroidComponentFactory();
	 }

}
