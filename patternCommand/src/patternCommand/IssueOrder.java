package patternCommand;

public abstract class IssueOrder {

	protected IT it;
	
	public abstract void fix();

	public IT getIt() {
		return it;
	}

	public void setIt(IT it) {
		this.it = it;
	}
}
