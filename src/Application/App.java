package Application;

import java.util.ArrayList;
import java.util.List;

import Colection.MyActionOnDay;

public class App {

	public static void main(String[] args) {
		MyActionOnDay myAction = new MyActionOnDay();
		//myAction.addAction();
		
		
		List<String> argurmList = new ArrayList<>();
		argurmList.add("aa");
		argurmList.add("bb");
		argurmList.add("aa");
		argurmList.add("bb");
		argurmList.add("cc");
		argurmList.add("dd");
		argurmList.add("dd");
		
		//myAction.addArgument(argurmList);
		myAction.dex();
		
		
		

	}

}
