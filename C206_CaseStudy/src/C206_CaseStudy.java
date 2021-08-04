package C206_CaseStudy.src;

import java.util.ArrayList;

import C206_CaseStudy.src.Accounts;
import C206_CaseStudy.src.Cluster;
import C206_CaseStudy.src.Subjects;
import C206_CaseStudy.src.Helper;

public class C206_CaseStudy {
//Update git

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Accounts> accountlist = new ArrayList<Accounts>();
		accountlist.add(new Accounts(1, "John", "Student", "johnstar@gmail.com", "lovelife123"));

		int option = 0;

		while (option != 5) {

			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");

//---------------ACCOUNTS----------------------------------------------------------
			if (option == 1) {
				// Options for user accounts
				C206_CaseStudy.setHeader("USER ACCOUNTS");
				System.out.println("1. Add");
				System.out.println("2. View");
				System.out.println("3. Delete");

				int optionType = Helper.readInt("Enter option to select tasks > ");

				if (optionType == 1) {
					// Add user account
					Accounts ac = inputAccounts();
					C206_CaseStudy.addAccounts(accountlist, ac);
				} else if (optionType == 2) {
					// View user accounts
					C206_CaseStudy.viewAllAccounts(accountlist);
				} else if (optionType == 3) {
					// Delete user accounts
					C206_CaseStudy.removeAccounts(accountlist);
					C206_CaseStudy.viewAllAccounts(accountlist);
				}
//---------------CLUSTERS----------------------------------------------------------
			} else if (option == 2) {
				// Options for clusters
				Cluster cluster1 = new Cluster(01, "Engineering");

				ArrayList<Cluster> ClusterList = new ArrayList<Cluster>();
				ClusterList.add(cluster1);

				C206_CaseStudy.setHeader("ACADEMIC CLUSTERS");
				System.out.println("1. Add");
				System.out.println("2. View");
				System.out.println("3. Delete");

				int optionType = Helper.readInt("Enter option to select tasks > ");

				if (optionType == 1) {
					// Add clusters
					Cluster cl = addCluster();
					C206_CaseStudy.addnewCluster(ClusterList, cl);

				} else if (optionType == 2) {
					// View clusters
					C206_CaseStudy.viewAllClusters(ClusterList);

				} else if (optionType == 3) {
					// Delete clusters
					C206_CaseStudy.removeCluster(ClusterList);
					C206_CaseStudy.viewAllClusters(ClusterList);
				}

//---------------CAREER INFORMATION----------------------------------------------------------
			} else if (option == 3) {
							
//---------------SUBJECTS INFORMATION----------------------------------------------------------			
			} else if (option == 4) {
				Subjects subject = new Subjects(01, "Engineering");

				ArrayList<Subjects> SubjectsList = new ArrayList<Subjects>();
				SubjectsList.add(subject);

				C206_CaseStudy.setHeader("SUBJECTS");
				System.out.println("1. View");
				System.out.println("2. Delete");

				int optionType = Helper.readInt("Enter option to select tasks > ");

				if (optionType == 1) {
					// View clusters
					C206_CaseStudy.viewAllSubjects(SubjectsList);

				} else if (optionType == 2) {
					// Delete clusters
					C206_CaseStudy.removeSubjects(SubjectsList);
					C206_CaseStudy.viewAllSubjects(SubjectsList);
				}				
//---------------PATHWAY INFORMATION----------------------------------------------------------			
			} else if (option == 5) {
			
//---------------PREREQUISITE----------------------------------------------------------	
			} else if (option == 6) {
				
//---------------EXIT----------------------------------------------------------	
			} else if (option == 7) {
				System.out.println("Bye!");
			} else {
				System.out.println("Invalid option");
			}
	
		}

	}

	public static void menu() {
		C206_CaseStudy.setHeader("Career Planning Application");
		System.out.println("1. User Accounts");
		System.out.println("2. Academic Clusters");
		System.out.println("3. Career Information");
		System.out.println("4. Subjects Information");
		System.out.println("5. Pathway Information");
		System.out.println("6. Pre-requisite Information");
		System.out.print("7. Quit\n");
		Helper.line(80, "-");

	}

	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}

//================================= Option Add an item (CRUD - Create) =================================
	public static Accounts inputAccounts() {
		// TODO Auto-generated method stub
		int id = Helper.readInt("Enter User ID > ");
		String name = Helper.readString("Enter User Name > ");
		String password = Helper.readString("Enter Password > ");
		String role = Helper.readString("Enter User Role > ");
		String email = Helper.readString("Enter User Email > ");

		Accounts ac = new Accounts(id, name, role, email, password);
		return ac;
	}

	public static void addAccounts(ArrayList<Accounts> accountlist, Accounts ac) {
		accountlist.add(ac);
		System.out.println("Account added");

	}

//================================= Option View items (CRUD- Read) =================================
	public static String retrieveAllAccount(ArrayList<Accounts> accountlist) {
		String output = "";

		for (int i = 0; i < accountlist.size(); i++) {

			output += String.format("%-10d %-10s %-20s %-10s\n", accountlist.get(i).getId(),
					accountlist.get(i).getName(), accountlist.get(i).getEmail(), accountlist.get(i).getRole());

		}
		return output;
	}

	public static void viewAllAccounts(ArrayList<Accounts> accountlist) {
		C206_CaseStudy.setHeader("USER ACCOUNT LIST");
		String output = String.format("%-10s %-10s %-20s %-10s\n", "ID", "NAME", "EMAIL", "ROLE");
		output += retrieveAllAccount(accountlist);
		System.out.println(output);
	}

//================================= Option Delete items (CRUD- Remove) =================================
	public static int getAccounts(ArrayList<Accounts> accountlist) {
		int position = 0;
		int option = Helper.readInt("Enter User ID > ");
		for (int i = 0; i < accountlist.size(); i++) {
			if (option == accountlist.get(i).getId()) {
				position = i;
			}
		}
		return position;
	}

	public static void removeAccounts(ArrayList<Accounts> accountlist) {
		accountlist.remove(getAccounts(accountlist));
		System.out.println("Account has been removed");
	}

//================================ Option View Clusters ====================================
	public static String retrieveAllClusters(ArrayList<Cluster> ClusterList) {
		String output = "";

		for (int i = 0; i < ClusterList.size(); i++) {

			output += String.format("%-10d %-10s\n", ClusterList.get(i).getId(), ClusterList.get(i).getCluster());
		}

		return output;
	}

	public static void viewAllClusters(ArrayList<Cluster> ClusterList) {
		C206_CaseStudy.setHeader("ACADEMIC CLUSTERS");
		String output = String.format("%-10s %-10s \n", "ID", "CLUSTER");
		output += retrieveAllClusters(ClusterList);
		System.out.println(output);
	}
	

//================================ Option Add Clusters ====================================
	public static Cluster addCluster() {
		// TODO Auto-generated method stub
		int id = Helper.readInt("Enter new Cluster ID > ");
		String name = Helper.readString("Enter new Cluster Name > ");

		Cluster clusternew = new Cluster(id, name);
		return clusternew;
	}

	public static void addnewCluster(ArrayList<Cluster> ClusterList, Cluster newcluster) {
		ClusterList.add(newcluster);
		System.out.println("Cluster has been added successfully!");
	}
	

//================================ Option Delete Clusters ====================================
	public static int getClusters(ArrayList<Cluster> ClusterList) {
		int pos = 0;
		int input = Helper.readInt("Enter the Cluster ID you wish to delete > ");
		for (int i = 0; i < ClusterList.size(); i++) {
			if (input == ClusterList.get(i).getId()) {
				pos = i;
			}
		}
		return pos;
	}

	public static void removeCluster(ArrayList<Cluster> ClusterList) {
		ClusterList.remove(getClusters(ClusterList));
		System.out.println("The Cluster has been successfully removed");
	}


//================================ Option View Subjects ====================================
	public static String retrieveAllSubjects(ArrayList<Subjects> SubjectsList) {
		String output = "";

		for (int i = 0; i < SubjectsList.size(); i++) {

			output += String.format("%-10d %-10s\n", SubjectsList.get(i).getSubjectId(), SubjectsList.get(i).getSubjectName());
		}

		return output;
	}

	public static void viewAllSubjects(ArrayList<Subjects> SubjectsList) {
		C206_CaseStudy.setHeader("ACADEMIC CLUSTERS");
		String output = String.format("%-10s %-10s \n", "ID", "CLUSTER");
		output += retrieveAllSubjects(SubjectsList);
		System.out.println(output);
	}