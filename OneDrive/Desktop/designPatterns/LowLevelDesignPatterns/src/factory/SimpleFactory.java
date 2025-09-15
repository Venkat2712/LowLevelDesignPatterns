package factory;

import factory.button.AndroidButton;
import factory.button.IOSButton;

public class SimpleFactory {
	
	public static Platform createPlatformByName(String platformName) {
		Platform platform = null;
		if(platformName.equals("Android")) {
			return new Android();
		}
		else if(platformName.equals("IOS")){
			return new IOS();
		}
		return platform;
	}

}
