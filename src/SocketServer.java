import java.io.*;
import java.net.*;


public class SocketServer {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		  ServerSocket serverSocket = null;
		  int port = 8080;
	        try {
	            serverSocket = new ServerSocket(9091, 0, InetAddress.getByName(null));
	        } catch (IOException e) {
	            System.err.println("Could not listen on port: " + port);
	            System.exit(1);
	        }
	 
	        Socket clientSocket = null;
	        try {
	            clientSocket = serverSocket.accept();
	        } catch (IOException e) {
	            System.err.println("Accept failed.");
	            System.exit(1);
	        }
	 
	        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
	        BufferedReader in = new BufferedReader(
	                new InputStreamReader(
	                clientSocket.getInputStream()));
	        String inputLine, outputLine;
//	        KnockKnockProtocol kkp = new KnockKnockProtocol();
//	 
//	        outputLine = kkp.processInput(null);
//	        out.println(outputLine);
//	 
	        while ((inputLine = in.readLine()) != null) {
//	             outputLine = kkp.processInput(inputLine);
	             out.println("Hahhaha");
//	             if (outputLine.equals("Bye."))
//	                break;
	        }
	        out.close();
	        in.close();
	        clientSocket.close();
	        serverSocket.close();
	    }
	}


