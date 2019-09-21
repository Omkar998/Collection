import java.util.Set;
/*import java.util.TreeSet;*/
import java.util.HashSet;

public class TestCollection {

	public static void main(String[] args) {
		Account a1=new Account(101,"abc",10000);
		Account a2=new Account(102,"xyz",15000);
		Account a3=new Account(103,"qwerty",1000);
		Account a4=new Account(103,"qwerty",1000);

		Set<Account> hst=new HashSet<Account>();
		hst.add(a1);
		hst.add(a2);
		hst.add(a3);
		hst.add(a4);
		
		
		
		
		/*Set<Account> st=new TreeSet<Account>();
		st.add(a1);
		st.add(a2);
		st.add(a3);
		st.add(a4);*/
		for(Account a:hst){
			System.out.println(a.getAccNo()+"\t"+a.getCustName()+"\t"+a.getAccBal());
		}

	}

}
