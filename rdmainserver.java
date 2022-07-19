package rdserver;


import java.io.*;
import java.net.*;

/* Imported java Utilities. */

/* rdmainserver created on July 19th 2022
 * author by Ryan Deleon
 * 
 * */

public class rdmainserver {
	      
	
public static String Primenum (int number) {

	if(number < 4) 	{
		
		return "No";
		
}
	
int i = 4;

while(i < number) {

	if(number % i == 0) {

		return "No";
		
}
	
i++;

	}

return "Yes";

		}
public static void main (String[] args) {
	
try {
	
ServerSocket socketserver = new ServerSocket(8080);

/* Server initializes connection. */

Socket sserver = socketserver.accept();
DataInputStream inputdatastream=new DataInputStream(sserver.getInputStream());
DataOutputStream outputdatastream=new DataOutputStream(sserver.getOutputStream());

int number = (int)inputdatastream.readInt();

/* Used for writing and calling value towards client as output. */

outputdatastream.writeUTF (Primenum(number));
outputdatastream.flush();

outputdatastream.close();
socketserver.close();

	}

catch (Exception except)	{
	
System.out.println(except);

}

	}

			}