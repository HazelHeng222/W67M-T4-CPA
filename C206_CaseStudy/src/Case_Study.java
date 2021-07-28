import java.util.ArrayList;

public class Case_Study {
	
	public static void main(String[] args) {
		
		ArrayList<Accounts> accountList = new ArrayList<Accounts>();

		int option = 0;

		while (option != 5) {

			Case_Study.menu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				// Create user account (user id, name, role, email, password)
				int id = Helper.readInt("");
				String name = Helper.readString("");
				String role = Helper.readString("");
				String email = Helper.readString("");
				String password = Helper.readString("");
				
				accountList.add(id, name, role, email, password);

			} else if (option == 2) {
				// Add a new item
				Case_Study.setHeader("ADD");			
				Case_Study.setHeader("ITEM TYPES");
				System.out.println("1. Camcorder");
				System.out.println("2. Chromebook");
				
				int itemType = Helper.readInt("Enter option to select item type > ");

				if (itemType == 1) {
					// Add a camcorder
					Camcorder cc = inputCamcorder();
					Case_Study.addCamcorder(camcorderList, cc);

				} else if (itemType == 2) {
					// Add a Chromebook
					Chromebook cb = inputChromebook();
					Case_Study.addChromebook(chromebookList, cb);

				} else {
					System.out.println("Invalid type");
				}

			} else if (option == 3) {
				// Loan item
				Case_Study.setHeader("LOAN");			
				Case_Study.setHeader("ITEM TYPES");
				System.out.println("1. Camcorder");
				System.out.println("2. Chromebook");
				
				int itemType = Helper.readInt("Enter option to select item type > ");

				if (itemType == 1) {
					// Loan camcorder
					Case_Study.loanCamcorder(camcorderList);
				} else if (itemType == 2) {
					// Loan Chromebook
					Case_Study.loanChromebook(chromebookList);
				} else {
					System.out.println("Invalid type");
				}

			} else if (option == 4) {
				// Return item
				Case_Study.setHeader("RETURN");				
				Case_Study.setHeader("ITEM TYPES");
				System.out.println("1. Camcorder");
				System.out.println("2. Chromebook");
				
				int itemType = Helper.readInt("Enter option to select item type > ");
				if (itemType == 1) {
					// Return camcorder
					Case_Study.returnCamcorder(camcorderList);
				} else if (itemType == 2) {
					// Return Chromebook
					Case_Study.returnChromebook(chromebookList);
				} else {
					System.out.println("Invalid type");
				}

			} else if (option == 5) {
				System.out.println("Bye!");
			} else {
				System.out.println("Invalid option");
			}

		}

	}
	
	
	public static void menu() {
		Case_Study.setHeader("CASE STUDY APP");
		System.out.println("1. Create user account");
		System.out.println("2. View list of all users");
		System.out.println("3. Print menu options");
		System.out.println("4. Delete a user");
		System.out.println("5. Quit");
		Helper.line(80, "-");

	}
	
	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}
	
	
}
