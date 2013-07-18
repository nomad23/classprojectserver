
public class serverProtocol {
	public String getSummary(String studentName,String studentId){
		return ("STUDENT DETAILS:"+"\nStudent Name : " + studentName +"\nStudent Number : " + studentId+ "\n\nThanks for the Replies" +" \nHave a Good Day... Exiting...");
	}
	
	public String getNumber(String studentId){
		return ("Student Number : " + studentId+"\nThanks for the Student Number \nPlease Input the Student's Name:");
	}
	
	
}
