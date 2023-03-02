package Colection;

import java.util.*;
import java.util.Map.Entry;

public class MyActionOnDay {

	public void addAction() {
		
		List<String> myAction = new ArrayList<>();
		myAction.add("Brash teeth");
		myAction.add("Drink");
		myAction.add("Eat");
		myAction.add("Make the bad");
		myAction.add("go to work");
		myAction.add("walk");
		
		
		for (String action : myAction) {
			System.out.println(action);
			
		}
	}
	
	public void addArgument(List<String> argurmList) {
		
		Set<String> set = new HashSet<>();
		set.addAll(argurmList);
		
		for (String string : set) {
			
			System.out.println(string);
			
		}
		
	}
	
	public void dex() {
		Map<String, String> dexRoEN = new HashMap<>();
		dexRoEN.put("cumpara","bay");
		dexRoEN.put("intreba", "ask");
		dexRoEN.put("a face", "do");
		dexRoEN.put("manca", "eat");
		dexRoEN.put("simiti","feel");
		dexRoEN.put("oferi", "give");
		dexRoEN.put("avea", "have");
		dexRoEN.put("a stri", "know");
		dexRoEN.put("invata", "learn");
		dexRoEN.put("auzi", "hear");
		String answare = "";
			
		while(!answare.equals("stop")) {
			System.out.println("====================\n");
			for (String word : dexRoEN.keySet()) {
				System.out.println(dexRoEN.get(word));
			}
			Scanner sc = new Scanner(System.in);
			System.out.println("What do you translate ?");
			answare = sc.nextLine();
			
			for (Entry<String, String> word : dexRoEN.entrySet()) {
				if (word.getValue().equals(answare)) {
					System.out.println(word.getKey() + " - " + word.getValue());
				}
			}
		}
		

	}
	
}


















