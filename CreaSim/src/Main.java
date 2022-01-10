import java.util.Scanner;
import java.util.Vector;


public class Main {

	Scanner scan = new Scanner(System.in);
	Vector<Species> species = new Vector<>();
	
	int getInput() {
		int input;
		
		try {
			input = scan.nextInt();
			scan.nextLine();
		} catch (Exception e) {
			System.out.println("Input must be an integer!");
			scan.nextLine();
			input = -1;
		}
		
		return input;
	}
	
	void cls() {
		for (int i = 0; i < 30; i++) System.out.println();
	}

//	View Function (Tampilan awal)
	void view() {
		System.out.println("CreaSim");
		System.out.println("=======");
		
		if(species == null) {
			
			//
			
		} else {
			
			//
			
		}
		
		System.out.println("");
	}
	
//	Menu 2 Time Skip
	void timeSkip() {
		// check empty
		if(species == null) {
			System.out.println("[i] Nothing changed...");
		} else {
			
			//
			
		}
		
	}
	


//	Menu 1 Input
	void createNewSpecies() {
		String type, name, size, habitat, description, light;
		double lifespan;
		
//		Input species type. Validate the input must be between “Animal” or “Plant”. (case-sensitive)
		do {
			System.out.println("Input species type [Animal | Plant] : ");
			type = scan.nextLine();
		}while(!type.equals("Animal") && !type.equals("Plant")); 
		
//		Input species name. Validate the input must be between 5 to 30 characters long. (inclusive)
		do {
			System.out.println("Input species name [5 - 30 character] : ");
			name = scan.nextLine();
		}while(name.length() < 1 || name.length() > 30); 
		
//		Input species size. Validate the input must be between “Teeny”, “Tall”, or “Titanic”. (case-sensitive)
		do {
			System.out.println("Input species size [Teeny | Tall| Titanic] : ");
			size = scan.nextLine();
		}while(!size.equals("Teeny") && !size.equals("Tall") && !size.equals("Titanic")); 
		
//		Input species habitat. Validate the input must be between “Land”, “Water”, or “Air”. (case-sensitive)
		do {
			System.out.println("Input species habitat [Land | Water| Air] : ");
			habitat = scan.nextLine();
		}while(!habitat.equals("Land") && !habitat.equals("Water") && !habitat.equals("Air"));
		
		
//		Input species description. Validate the input must be between 1 to 30 characters long. (inclusive)
		do {
			System.out.println("Input species description [1 - 30 character] : ");
			description = scan.nextLine();
		}while(description.length() < 1 || description.length() > 30);
		
//		Input species lifespan (Animal). Validate the input must be between 1 to 150. (inclusive)
		if(species.equals("Animal")) {
			do {
				System.out.println("Input species lifespan [1 - 150]");
				lifespan = scan.nextDouble(); scan.nextLine();
			}while(lifespan < 1 || lifespan > 150);
			
			this.species = new Animal(lifespan);
		
//		Input species light dependency (Plant). Validate the input must be between “Yes” or “No”. (case-sensitive)
		}else {
			do {
				System.out.println("Input species light dependency [Yes | No]");
				light = scan.nextLine();
			}while(light.equals("Yes") && light.equals("No"));
			
			this.species = new Plant(light);
		}
		
	}
	
	public Main() {
		int option;
		
		do {
			view();
			System.out.println("1. Create new species");
			System.out.println("2. Time Skip");
			System.out.println("3. Exit");
			
			option = getInput();
			
			switch (option) {
			case 1:
				createNewSpecies();
				break;
				
			case 2:
				timeSkip();
				break;
				
			case 3:
				System.out.println("Thank You ");
				break;
			
			default:
				System.out.println("Please input 1 - 3");
				break;
			}
			
		}while(option != 3);
	}

	public static void main(String[] args) {
		new Main();
	}

}