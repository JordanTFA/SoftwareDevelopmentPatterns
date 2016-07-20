package patternCommand;

import java.util.ArrayList;

public class Server {
	
	private ArrayList <IssueOrder> issueOrders = new ArrayList<IssueOrder>();
	
	public void takeIssue(IssueOrder issue){
		this.issueOrders.add(issue);
	}
	
	public void deal(){
		for(IssueOrder order : this.issueOrders ){
			order.fix();
		}
	}
	
	public void haveBreak(){
		
		System.out.println("...zzz...");
	
		try{
			Thread.sleep(5000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		System.out.println("Back!");
	}

}
