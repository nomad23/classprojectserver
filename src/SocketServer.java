import java.io.*;
import java.net.*;
import java.util.Date;

import javax.swing.JOptionPane;


public class SocketServer {


	public static String reader(Socket mySocket) throws IOException{
		 BufferedReader in = new BufferedReader(
	               new InputStreamReader(
	               mySocket.getInputStream()));
      	 String input = in.readLine();
      	 return input;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		  ServerSocket serverSocket = null;
		  serverProtocol sProtocol = new serverProtocol();
		  int port = 8080;
		 
	        try {
	            serverSocket = new ServerSocket(9101, 0, InetAddress.getByName(null));
	            
	        } catch (IOException e) {
	            System.err.println("Could not listen on port: " + port);
	            System.exit(1);
	        }
	 
	        //Socket clientSocket = null;
	       // Socket listener = null;
	       
	        try {
	        	
	        	
	        	try {
	                while (true) {
	                    Socket socket = serverSocket.accept();
	                    try {
	                        PrintWriter out =
	                            new PrintWriter(socket.getOutputStream(), true);
	                        out.println("Server Connected... ");
	                        out.println("Please Enter The student's Number: ");
	                        
	                       // result = name(parameter);
//	                        out.write(JOptionPane.showInputDialog(
//	        	                    "Enter The Student's Number:"));
	                       
	                        
//	                        	 BufferedReader in = new BufferedReader(
//	         			               new InputStreamReader(
//	         			               socket.getInputStream()));
//	                        	 String student_id = in.readLine();
	         	        		    //  System.out.println(student_id);
	                        	 String studentNumber = SocketServer.reader(socket);
	         	        		     
	                        	 String sendString =  sProtocol.getNumber(studentNumber);
	                        			// ("Student Number : " + student_id+"\nThanks for the Student Number \nPlease Input the Student's Name:");    
	         	        		   int length = (sendString.length()); 
	         	        		   out.println(length);
		  	                       out.println(sendString);
	         	        		      
//	         	        		     BufferedReader in2 = new BufferedReader(
//	  	         			               new InputStreamReader(
//	  	         			               socket.getInputStream()));
//	  	                        	 String studentName = in2.readLine();
//	  	                        	 System.out.println(studentName);
	  	                        	String studentName = SocketServer.reader(socket);
	  	                        	 String nameString = sProtocol.getSummary(studentName, studentNumber);
	  	                        			 //("STUDENT DETAILS:"+"\nStudent Name : " + studentName +"\nStudent Number : " + student_id+ "\n\nThanks for the Replies" +" \nHave a Good Day... Exiting...");    
	  	                        	int length2 = (nameString.length()); 
	         	        		     out.println(length2);
		  	                        	out.println(nameString);
	                        
	                    } finally {
	                        socket.close();
	                    }
	                }
	            }
	            finally {
	                serverSocket.close();
	            }

           
	        } catch (IOException e) {
	            System.err.println("Accept failed.");
	            System.exit(1);
	        }
	 
   
	       
	    }
	}


