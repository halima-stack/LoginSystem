import java.util.HashMap;

public class IDandPasswords {
	
	HashMap<String, String> logininfo = new HashMap<String, String> ();
	
	IDandPasswords(){
		
		logininfo.put("Bro", "pizza");
		logininfo.put("IronMan", "Endgame1234!");
		logininfo.put("Hulkcode", "ThorismyBuddy1@");
		
		
	}
	public HashMap<String, String> getLoginInfo() {
		return logininfo;
	}

}
