package C206_CaseStudy.src;

import java.util.ArrayList;

import C206_CaseStudy.src.Accounts;
import C206_CaseStudy.src.Cluster;
import C206_CaseStudy.src.Subjects;
import sun.security.tools.PathList;
import C206_CaseStudy.src.Pathway;
import C206_CaseStudy.src.Helper;

public class C206_CaseStudy {
	//Update git

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Accounts> accountlist = new ArrayList<Accounts>();
		accountlist.add(new Accounts(1, "John", "Student", "johnstar@gmail.com", "lovelife123"));
		ArrayList<Pathway> PathwayList = new ArrayList<Pathway>();
		PathwayList.add(new Pathway(1, "PolyTechnic"));

		int option = 0;

<<<<<<< HEAD
		while (option != 6) {
=======
		while (option != 7) {
>>>>>>> branch 'master' of https://github.com/HazelHeng222/W67M-T4-CPA.git

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

				C206_CaseStudy.setHeader("CAREER INFORMATION");
				System.out.println("1. Add");
				System.out.println("2. View");
				System.out.println("3. Delete");

				int optionType = Helper.readInt("Enter option to select tasks > ");

				if (optionType == 1) {
					C206_CaseStudy.addnewCareer(careerList);
				
				} else if (optionType == 2) {
					C206_CaseStudy.viewAllCareers(careerList);
				
				} else if (optionType == 3) {
					C206_CaseStudy.viewAllCareers(careerList);
					C206_CaseStudy.removeCareer(careerList);
				}

//---------------SUBJECTS INFORMATION----------------------------------------------------------			
			} else if (option == 4) {

				C206_CaseStudy.setHeader("SUBJECTS");
				System.out.println("1. Add");
				System.out.println("2. View");
				System.out.println("3. Delete");

				int optionType = Helper.readInt("Enter option to select tasks > ");

				if (optionType == 1) {
					// Add Subjects
					C206_CaseStudy.addNewSubjects(SubjectsList);

				} else if (optionType == 2) {
					// View Subjects
					C206_CaseStudy.viewAllSubjects(SubjectsList);

				} else if (optionType == 3) {
					// Delete Subjects
					C206_CaseStudy.viewAllSubjects(SubjectsList);
					C206_CaseStudy.removeSubjects(SubjectsList);
				}

//---------------PATHWAY----------------------------------------------------------	
			} else if (option == 5) {
				
				C206_CaseStudy.setHeader("PATHWAYS");
				System.out.println("1. Add");
				System.out.println("2. View");
				System.out.println("3. Delete");

				int optionType = Helper.readInt("Enter option to select tasks > ");

				if (optionType == 1) {
					// Add Subjects
					C206_CaseStudy.addNewPathway(PathwayList);

				} else if (optionType == 2) {
					// View Subjects
					C206_CaseStudy.viewAllPathway(PathwayList);

				} else if (optionType == 3) {
					// Delete Subjects
					C206_CaseStudy.viewAllPathway(PathwayList);
					C206_CaseStudy.removePathway(PathwayList);
				}

//---------------PREREQUISITE----------------------------------------------------------	
			} else if (option == 6) {
				Prerequisite pre1 = new Prerequisite(0, "Physics", "Engineering" );
				ArrayList<Prerequisite> prerequisiteList = new ArrayList<Prerequisite>(); 

				C206_CaseStudy.setHeader("ALL PREREQUISITES");
				System.out.println("1. Add");
				System.out.println("2. View");
				System.out.println("3. Delete");

				int optionType = Helper.readInt("Enter option to select tasks > ");

				if (optionType == 1) {
					// Add Prerequisite
<<<<<<< HEAD
					C206_CaseStudy.addPrerequisite(prerequisiteList);
=======
					Prerequisite pre = addPrerequisite();
					C206_CaseStudy.addPrerequisite();
>>>>>>> branch 'master' of https://github.com/HazelHeng222/W67M-T4-CPA.git
				} else if (optionType == 2) {
					// View Prerequisite
					C206_CaseStudy.viewAllPrerequisite(prerequisiteList);
				} 
				else if (optionType == 3) {
					//edit Prerequisite
					C206_CaseStudy.getEditPrerequisite(prerequisiteList);
				}  else if (optionType == 4) {
					// Delete Prerequisite
					C206_CaseStudy.getRemovePrerequisite(prerequisiteList);
					C206_CaseStudy.viewAllPrerequisite(prerequisiteList);
				}
				else {
					System.out.println("Invalid option");
				}

				//---------------EXIT----------------------------------------------------------	
			} else if (option == 7) {
				System.out.println("Bye!");
			} else {
				System.out.println("Invalid option");
			}

		}

	}

	private static ArrayList<Career> careerList = new ArrayList<Career>();
	private static ArrayList<Subjects> SubjectsList = new ArrayList<Subjects>(); 
	private Career career1 = new Career(1, "test");
	private Career career2 = new Career(2, "test");
	


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

//================================ Option Add Subjects ====================================

	public static void addNewSubjects(ArrayList<Subjects> SubjectsList) {
		int id = Helper.readInt("Enter new Subject ID > ");
		String name = Helper.readString("Enter new Subject Name > ");
		Subjects Subject = new Subjects(id, name);
		SubjectsList.add(Subject);
		System.out.println("Subject has been added successfully!");
		C206_CaseStudy.viewAllSubjects(SubjectsList);
	}

//================================ Option View Subjects ====================================

	public static String viewAllSubjects(ArrayList<Subjects> SubjectsList) {
		C206_CaseStudy.setHeader("ACADEMIC SUBJECTS");
		String output = String.format("%-10s %-10s \n", "ID", "SUBJECTS");

		for (int i = 0; i < SubjectsList.size(); i++) {
			output += String.format("%-10d %-10s\n", SubjectsList.get(i).getSubjectId(),
					SubjectsList.get(i).getSubjectName());
		}

		System.out.println(output);
		return output;
	}

//================================ Option Delete Subjects ====================================
	public static int getSubjects(ArrayList<Subjects> SubjectsList) {
		int pos = 0;
		int input = Helper.readInt("Enter the Subject ID you wish to delete > ");
		for (int i = 0; i < SubjectsList.size(); i++) {
			if (input == SubjectsList.get(i).getSubjectId()) {
				pos = i;
			}
		}
		return pos;
	}

	public static void removeSubjects(ArrayList<Subjects> SubjectsList) {
		SubjectsList.remove(getSubjects(SubjectsList));
		System.out.println("The Subject has been successfully removed");
	}

//================================ Option Add Pathway ====================================

		public static void addNewPathway(ArrayList<Pathway> PathwayList) {
			int id = Helper.readInt("Enter new Pathway ID > ");
			String name = Helper.readString("Enter Pathway name > ");
			Pathway pathway = new Pathway(id, name);
			PathwayList.add(pathway);
			System.out.println("Pathway has been added successfully!");
			C206_CaseStudy.viewAllPathway(PathwayList);
		}

//================================ Option View Pathway ====================================

		public static String viewAllPathway(ArrayList<Pathway> PathwayList) {
			C206_CaseStudy.setHeader("ACADEMIC PATHWAYS");
			String output = String.format("%-10s %-10s \n", "ID", "PATHWAYS");

			for (int i = 0; i < PathwayList.size(); i++) {
				output += String.format("%-10d %-10s\n", PathwayList.get(i).getPathway_id(),
						PathwayList.get(i).getPathway_name());
			}

			System.out.println(output);
			return output;
		}

		
//================================ Option Delete Pathway ====================================
		public static int getPathway(ArrayList<Pathway> PathwayList) {
			int pos = 0;
			int input = Helper.readInt("Enter the Pathway ID you wish to delete > ");
			for (int i = 0; i < PathwayList.size(); i++) {
				if (input == PathwayList.get(i).getPathway_id()) {
					pos = i;
				}
			}
			return pos;
		}

		public static void removePathway(ArrayList<Pathway> PathwayList) {
			PathwayList.remove(getPathway(PathwayList));
			System.out.println("The Pathway has been successfully removed");
		}

//================================ Option View prerequisites ====================================

	public static String retrieveAllPrerequisite(ArrayList<Prerequisite> prerequisiteList) {
		String output = "";

		for (int i = 0; i < prerequisiteList.size(); i++) {

			output += String.format("%-10d %-10s %-10s\n", prerequisiteList.get(i).getPId(),
					prerequisiteList.get(i).getPrerequisiteName(), prerequisiteList.get(i).getPSubject());
		}

		return output;
	}

	public static void viewAllPrerequisite(ArrayList<Prerequisite> prerequisiteList) {
		C206_CaseStudy.setHeader("PREREQUISITE");
		String output = String.format("%-10s %-10s \n", "ID", "PREREQUISITE");
		output += retrieveAllPrerequisite(prerequisiteList);
		System.out.println(output);
	}

//================================ Option add prerequisites ====================================
	public static boolean checkPidunique(int testValue, ArrayList<Prerequisite> prerequisiteList) {
		boolean isUnique = true;
		for (int i = 0; i < prerequisiteList.size(); i++) {
	        if (testValue == prerequisiteList.get(i).getPId()) {
	            isUnique = false;
	            return isUnique;
	        }
	    }
	    return isUnique;
	} //referenced code from https://stackoverflow.com/questions/51354196/java-how-to-check-if-entered-integer-is-unique/51354292 
	
	
	public static void addPrerequisite(ArrayList<Prerequisite> prerequisiteList) {
		// TODO Auto-generated method stub
		int id = Helper.readInt("Enter new Prerequisite ID > ");
		String name = Helper.readString("Enter new Prerequisite Name > ");
		String subject = Helper.readString("Enter subject the Prerequisite is related to > ");

		Prerequisite prereNew = new Prerequisite(id, subject, name);
		int dupCount = 0; 
		for (int i = 0; i < prerequisiteList.size(); i++) {
			if (prereNew.getPId() != prerequisiteList.get(i).getPId()) {
				dupCount += 1; 
			}
		}
		
		if (dupCount == 0) { //no duplicated id
			System.out.println("Prerequisite added!");
			C206_CaseStudy.viewAllPrerequisite(prerequisiteList);
		}
		else {
			System.out.println("Error: Add Prerequisite Failed");
		}

	}

<<<<<<< HEAD
=======
	public static void addnewPrerequisite(ArrayList<Prerequisite> prerequisiteList, Prerequisite newPrerequisite) {
		prerequisiteList.add(newPrerequisite);
		System.out.println("Prerequisite has been added successfully!");
	}
>>>>>>> branch 'master' of https://github.com/HazelHeng222/W67M-T4-CPA.git

//================================ Option edit prerequisites ====================================

	public static int getEditPrerequisite(ArrayList<Prerequisite> prerequisiteList) {
		int pos = 0;
		int input = Helper.readInt("Enter the Prerequisite ID you wish to edit > ");
		for (int i = 0; i < prerequisiteList.size(); i++) {
			if (input == prerequisiteList.get(i).getPId()) {
				pos = i;
			}
		}
		return pos;
	}

	public static void editPrerequisite(ArrayList<Prerequisite> prerequisiteList, int pos) { //id unchanged to make sure id is distinct

		String name = Helper.readString("Change Prerequisite name > ");
		String subject = Helper.readString("Change subject Prerequisite > ");

		if (!name.isEmpty() && !subject.isEmpty()) { // set new details
			prerequisiteList.get(pos).setPrereuisiteName(name);
			prerequisiteList.get(pos).setPSubject(subject);

			System.out.println("The prerequisite has been successfully edited");
		}
		else if (name.equals(prerequisiteList.get(pos).getPrerequisiteName()) || subject.equals(prerequisiteList.get(pos).getPSubject())) {
			System.out.println("Prerequisite unchanged"); // if name or subject remains the same
		}
		else {
			System.out.println("Prerequisite editing failed"); // if name/subject field is empty
		}		

	}

//================================ Option delete prerequisites ====================================
	public static void getRemovePrerequisite(ArrayList<Prerequisite> prerequisiteList) {
		int pos = 0;
		int i = 0;
		int input = Helper.readInt("Enter the Prerequisite ID you wish to delete > ");
		for (i = 0; i < prerequisiteList.size(); i++) { //find the id to delete
			if (input == prerequisiteList.get(i).getPId()) {
				pos = i;
			}
		}
<<<<<<< HEAD
		
		if (pos == i && !prerequisiteList.isEmpty()) { //if input not same as any id thus pos is unchanged, or not empty
=======

		if (pos == -1) { //if input not same as any id thus pos is unchanged
			System.out.println("The prerequisite removal failed");
		}
		else {
>>>>>>> branch 'master' of https://github.com/HazelHeng222/W67M-T4-CPA.git
			prerequisiteList.remove(prerequisiteList.get(pos)); //delete
			System.out.println("The prerequisite has been successfully removed");
		}
<<<<<<< HEAD
		else if (prerequisiteList.isEmpty()){
			System.out.println("The prerequisite list is empty");
		}
		else {
			System.out.println("Error: Remove Prerequisite Failed");
		}
		
=======

>>>>>>> branch 'master' of https://github.com/HazelHeng222/W67M-T4-CPA.git
	}


//================================ Option View Career ====================================
	public static String viewAllCareers(ArrayList<Career> careerList) {
		C206_CaseStudy.setHeader("CAREER INFORMATION");
		String output = String.format("%-10s %-10s \n", "ID", "CAREER NAME");



		for (int i = 0; i < careerList.size(); i++) {
			output += String.format("%-10d %-10s\n", careerList.get(i).getCareerID(),
					careerList.get(i).getCareerName());
		}



		System.out.println(output);
		return output;
	}

//================================ Option Add Career ====================================
	public static void addnewCareer(ArrayList<Career> careerList) {
		int id = Helper.readInt("Enter new Career ID > ");
		String name = Helper.readString("Enter new Career Name > ");
		Career career = new Career(id, name);
		careerList.add(career);
		System.out.println("Career has been added successfully!");
		C206_CaseStudy.viewAllCareers(careerList);
	}



//================================ Option Delete Career ====================================
	public static void removeCareer(ArrayList<Career> careerList) {
		int pos = 0;
		int input = Helper.readInt("Enter the Career ID you wish to delete > ");
		for (int i = 0; i < careerList.size(); i++) {
			if (input == careerList.get(i).getCareerID()) {
				pos = i;
			}
		}


		careerList.remove(pos);
		System.out.println("Career has been successfully removed");
	}
}


