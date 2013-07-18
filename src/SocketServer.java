import java.io.*;
import java.net.*;
import java.util.Date;


public class SocketServer {


	
	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		  ServerSocket serverSocket = null;
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
	                        
	                        
	                       
	                        
	                        	 BufferedReader in = new BufferedReader(
	         			               new InputStreamReader(
	         			               socket.getInputStream()));
	                        	 String student_id = in.readLine();
	         	        		    //  System.out.println(student_id);
	         	        		     
	         	        		       out.println("Student Number : " + student_id);    
	         	        		       out.println("Thanks for the Student Number");
	         	        		      out.println("Please Input the Student's Name:");
	         	        		      
	         	        		      
	         	        		      
	         	        		     BufferedReader in2 = new BufferedReader(
	  	         			               new InputStreamReader(
	  	         			               socket.getInputStream()));
	  	                        	 String studentName = in2.readLine();
	  	                        	 out.println("Student Name : " + studentName);    
	         	        		       out.println("Thanks for the Replies");
	         	        		      out.println("Have a Good Day... Exiting...");
	                        
	                    } finally {
	                        socket.close();
	                    }
	                }
	            }
	            finally {
	                serverSocket.close();
	            }

	        	
	        	
//	            clientSocket = serverSocket.accept();
//	            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
//		        BufferedReader in = new BufferedReader(
//		                new InputStreamReader(
//		                clientSocket.getInputStream()));
//		        String inputLine, outputLine;
//		        out.println("Hahahhahahahah");
////		        while ((inputLine = in.readLine()) != null) {
//////		             outputLine = kkp.processInput(inputLine);
////		             out.println(inputLine);
//////		             if (outputLine.equals("Bye."))
//////		                break;
////		        }
//		        out.close();
//		        in.close();
//		        clientSocket.close();
//		        serverSocket.close();
//	            
	        } catch (IOException e) {
	            System.err.println("Accept failed.");
	            System.exit(1);
	        }
	 
	       
//	        KnockKnockProtocol kkp = new KnockKnockProtocol();
//	 
//	        outputLine = kkp.processInput(null);
//	        out.println(outputLine);
//	 
	       
	        
	       
	    }
	}


