import java.util.HashMap;
import java.util.Map;

import java.util.Scanner;

public class cars {
	public static void main(String [] args) {
		Map<String, String> model = new HashMap<>();
		
		/* Adding car models */
		
		model.put("Civic", "Honda");
		model.put("civic", "Honda");
		model.put("CRV", "Honda");
		model.put("crv", "Honda");
		model.put("Accord", "Honda");
		model.put("accord", "Honda");
		model.put("Tundra", "Toyota");
		model.put("tundra", "Toyota");
		model.put("Tacoma", "Toyota");
		model.put("tacoma", "Toyota");
		model.put("Taurus", "Ford");
		model.put("taurus", "Ford");
		model.put("F150", "Ford");
		model.put("f150", "Ford");
		
		System.out.println("What car model are you looking for?");
		Scanner input = new Scanner(System.in);
		String modelName = input.nextLine();
	
						
		/* Begin the search for the requested model */
								
		if (model.containsKey((modelName)));		
			System.out.println("I see you are looking for\s" + modelName + "'s.\s"  + "The\s" + model.get(modelName) +"\s" +  "selection is over here.");
	}
		
}
