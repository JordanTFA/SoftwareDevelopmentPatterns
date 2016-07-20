package patternCommand;

public class Issues extends IssueOrder {

	public Issues(IT it){
		setIt(it);
	}
	
	public void fix(){
		this.it.prepare("Bug");
	}
}
