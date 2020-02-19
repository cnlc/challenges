package challenges.flow;

import flow.IAction;

public class EmailAction implements IAction<String>{
	  

	  public EmailAction(String emailContent) {
	    this.emailContent = emailContent;
	  }

	  public String execute() {
	    return emailContent;
	  }

	  public String getType() {
	    return "EMAIL";
	  }
	  
	  private String emailContent;
}
