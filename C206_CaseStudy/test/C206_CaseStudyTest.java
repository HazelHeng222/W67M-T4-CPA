import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	//Junit Adding test
	private Accounts al1;
	
	private ArrayList<Accounts> accountlist;
	
	public C206_CaseStudyTest() {
		super();
	}

	@Before
	public void setUp() throws Exception {
		al1 = new Accounts(1,"John", "Student", "johnstar@gmail.com", "lovelife123");
		
		accountlist = new ArrayList<Accounts>();
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
		testOutput = String.format("%-10d %-10s %-20s %-10s\n", 1,"John", "johnstar@gmail.com", "Student");
		
		assertEquals("Test that viewAllAccounts", testOutput, allAccounts);
	}

	@After
	public void tearDown() throws Exception {
		al1 = null;
	}

	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}

}
