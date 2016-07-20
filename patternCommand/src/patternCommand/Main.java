package patternCommand;

public class Main {
	
	public static void main(String[] args){
		
		IT it = new IT();
		Server server = new Server();
		
		Issues issue = new Issues(it);
		
		server.takeIssue(issue);
		
		server.haveBreak();
		
		server.deal();
		
	}

}
