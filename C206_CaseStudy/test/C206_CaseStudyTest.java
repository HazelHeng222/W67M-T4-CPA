import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import C206_CaseStudy.src.Accounts;
import C206_CaseStudy.src.C206_CaseStudy;
import C206_CaseStudy.src.Cluster;
import C206_CaseStudy.src.Career;
import C206_CaseStudy.src.Prerequisite;
import C206_CaseStudy.src.Subjects;

public class C206_CaseStudyTest {
	// Junit Adding test
	private Accounts al1;
	private Cluster cluster1;
	private Career career1;
	private Career career2;
	private Subjects subject1;
	private Prerequisite p1;

	private ArrayList<Accounts> accountlist;
	private ArrayList<Cluster> ClusterList;
	private ArrayList<Career> careerList;
	private ArrayList<Subjects> SubjectsList;
	private ArrayList<Prerequisite> prerequisiteList;

	public C206_CaseStudyTest() {
		super();
	}

	@Before
	public void setUp() throws Exception {
		al1 = new Accounts(1, "John", "Student", "johnstar@gmail.com", "lovelife123");
		cluster1 = new Cluster(1, "Engineering");
		subject1 = new Subjects(1, "Mathematics");
		p1 = new Prerequisite(0, "Physics", "Engineering");

		accountlist = new ArrayList<Accounts>();
		ClusterList = new ArrayList<Cluster>();
		SubjectsList = new ArrayList<Subjects>();
		prerequisiteList = new ArrayList<Prerequisite>();

	}

	@Test
	public void addAccountTest() {
		assertNotNull("Check if there is valid account arraylist to add to", accountlist);

		C206_CaseStudy.addAccounts(accountlist, al1);
		assertEquals("Check that Account arraylist size is 1", 1, accountlist.size());
		assertSame("Check that student is added", al1, accountlist.get(0));
	}

	@Test
	public void removeAccountTest() {
		C206_CaseStudy.removeAccounts(accountlist);
		assertEquals("Check that Account arraylist size is 1", 1, accountlist.size());

		C206_CaseStudy.removeAccounts(accountlist);
		assertEquals("Check that Accounts arraylist size is 0", 0, accountlist.size());

		assertNotNull("Check if there is valid account arraylist to delete from", accountlist);

	}

	@Test
	public void retrieveAllAccountTest() {
		assertNotNull("Test if there is valid account arraylist to retrieve accounts", accountlist);

		String allAccounts = C206_CaseStudy.retrieveAllAccount(accountlist);
		String testOutput = "";
		assertEquals("Check that viewAllAccounts", testOutput, allAccounts);

		C206_CaseStudy.addAccounts(accountlist, al1);
		assertEquals("Test that Account arraylist size is 1", 1, accountlist.size());

		allAccounts = C206_CaseStudy.retrieveAllAccount(accountlist);
		testOutput = String.format("%-10d %-10s %-20s %-10s\n", 1, "John", "johnstar@gmail.com", "Student");

		assertEquals("Test that viewAllAccounts", testOutput, allAccounts);
	}

	@Test
	public void addClusterTest() {
		assertNotNull("Check if there is valid Cluster arraylist to add to", ClusterList);

		C206_CaseStudy.addnewCluster(ClusterList, cluster1);
		assertEquals("Check that Cluster arraylist size is 1", 1, ClusterList.size());
		assertSame("Check that Cluster is added", cluster1, ClusterList.get(0));
	}

	@Test
	public void removeClusterTest() {
		C206_CaseStudy.removeCluster(ClusterList);
		assertEquals("Check that Cluster arraylist size is 1", 1, ClusterList.size());

		C206_CaseStudy.removeCluster(ClusterList);
		assertEquals("Check that Cluster arraylist size is 0", 0, ClusterList.size());

		assertNotNull("Check if there is valid Cluster arraylist to delete from", ClusterList);

	}

	@Test
	public void retrieveAllClustersTest() {
		assertNotNull("Test if there is valid Cluster arraylist to add cluster", ClusterList);

		String allClusters = C206_CaseStudy.retrieveAllClusters(ClusterList);
		String testclusterOutput = "";
		assertEquals("Check that viewClusterList", testclusterOutput, allClusters);

		C206_CaseStudy.addnewCluster(ClusterList, cluster1);
		assertEquals("Test that Cluster arraylist size is 1", 1, ClusterList.size());


		testclusterOutput = String.format("%-10d %-10s \n", 1, "Engineering");

		assertEquals("Test that viewAllClusterList", testclusterOutput, allClusters);

	}

	@Test
	public void addSubjectsTest() {
		assertNotNull("Check if there is valid subject arraylist to add to", SubjectsList);

		C206_CaseStudy.addNewSubjects(SubjectsList);
		assertEquals("Check that Subjects arraylist size is 1", 1, SubjectsList.size());
		assertSame("Check that Subject is added", subject1, SubjectsList.get(0));
	}

	@Test
	public void removeSubjectsTest() {
		assertEquals("Check that Subjects arraylist size is 1", 1, SubjectsList.size());

		C206_CaseStudy.removeSubjects(SubjectsList);
		assertEquals("Check that Subjects arraylist size is 0", 0, SubjectsList.size());

		assertNotNull("Check if there is valid Subjects arraylist to delete from", SubjectsList);

	}
	

	@Test
	public void retrieveAllSubjectsTest() {
		assertNotNull("Test if there is valid Subjects arraylist to retrieve accounts", SubjectsList);

		String allSubjects = C206_CaseStudy.viewAllSubjects(SubjectsList);
		String testOutput = "";
		assertEquals("Check that viewAllSubjects", testOutput, allSubjects);

		C206_CaseStudy.addNewSubjects(SubjectsList);
		assertEquals("Test that Subjects arraylist size is 1", 1, SubjectsList.size());

		allSubjects = C206_CaseStudy.viewAllSubjects(SubjectsList);
		testOutput = String.format("%-10d %-10s \n", 1, "Mathematics");

		assertEquals("Test that viewAllSubjects", testOutput, allSubjects);
	}

	@Test
	public void addPrerequisiteTest() {
		assertNotNull("Check if there is valid prerequisite arraylist to add to", prerequisiteList);

		prerequisiteList.add(p1);
		assertEquals("Check that Prerequiste arraylist size is 1", 1, prerequisiteList.size());
		assertSame("Check that prerequisite is added", p1, prerequisiteList.get(0));
	}

	@Test
	public void removePrerequisiteTest() {
		C206_CaseStudy.getRemovePrerequisite(prerequisiteList);
		assertEquals("Check that Prerequisite arraylist size is 1", 1, prerequisiteList.size());

		C206_CaseStudy.getRemovePrerequisite(prerequisiteList);
		assertEquals("Check that Prerequisite arraylist size is 0", 0, prerequisiteList.size());

		assertNotNull("Check if there is valid Prerequisite arraylist to delete from", prerequisiteList);

	}

	@Test
	public void retrieveAllPrerequisiteTest() {
		assertNotNull("Test if there is valid Prerequiste arraylist to retrieve Prerequisites", prerequisiteList);

		String allPrerequisites = C206_CaseStudy.retrieveAllPrerequisite(prerequisiteList);
		String testOutput = "";
		assertEquals("Check that viewAllPrerequisite", testOutput, allPrerequisites);

		prerequisiteList.add(p1);
		assertEquals("Test that Prerequisite arraylist size is 1", 1, prerequisiteList.size());

		allPrerequisites = C206_CaseStudy.retrieveAllPrerequisite(prerequisiteList);
		testOutput = String.format("%-10d %-10s %-10s\n", 0, "Physics", "Engineering");

		assertEquals("Test that viewAllPrerequisite", testOutput, allPrerequisites);
	}

	@Test
	public void editPrerequisiteTest() {
		assertNotNull("Test if there is valid Prerequisites arraylist to edit Prerequisites", prerequisiteList);

		String allPrerequisites = C206_CaseStudy.retrieveAllPrerequisite(prerequisiteList); //get prerequisites
		String testOutput = "";

		int pos = 0;
		String name = "NewName";
		String subject = "NewSubject";
		assertEquals("Check that viewAllPrerequisite", testOutput, allPrerequisites); //check prerequisite is same


		allPrerequisites = C206_CaseStudy.retrieveAllPrerequisite(prerequisiteList);
		assertEquals("Test that Prerequisite arraylist size is 1", 1, prerequisiteList.size()); //check arraylist still same size

		C206_CaseStudy.editPrerequisite(prerequisiteList, pos); //selecting prerequisite based on position
		prerequisiteList.get(pos).setPrereuisiteName(name); //update
		prerequisiteList.get(pos).setPSubject(subject);
		testOutput = String.format("%-10d %-10s %-10s\n", pos , subject, name);


		assertNotEquals("Test that viewAllPrerequisite is updated", testOutput, allPrerequisites); //check contents of prerequisite is different
	}



	@After
	public void tearDown() throws Exception {
		al1 = null;
		cluster1 = null;
		career1 = null;
		career2 = null;
		subject1 = null;
		p1 = null;

	}

	@Test
	public void c206_test() {
		// fail("Not yet implemented");
		assertTrue("C206_CaseStudy_SampleTest ", true);
	}

}