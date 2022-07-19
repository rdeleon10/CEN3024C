package rdserver;

import java.io.*;
import java.net.*;
import java.util.Scanner;

/* Imported java Utilities. */

/* rdclient created on July 19th 2022
 * author by Ryan Deleon
 * 
 * */
public class rdclient {
	
public static void main(String[] args) {
	
Scanner sysscan = new Scanner(System.in);

try {
	
Socket mainsocket = new Socket( "localhost" ,8080);

DataInputStream inputdatastream = new DataInputStream(mainsocket.getInputStream());

DataOutputStream outputdatastream = new DataOutputStream(mainsocket.getOutputStream());

/* Inputs user information. */

System.out.print("\n Input any number : ");

int number = sysscan.nextInt();

/* Addresses integer as number. */

outputdatastream.writeInt(number);

String datainputstream = (String)inputdatastream.readUTF();

System.out.println("\n Number "+number+
		
" primenum: " + datainputstream);

outputdatastream.flush();
/* Flushes data stream output. */ 

outputdatastream.close();
/* Closes output and release data associated within stream. */ 

mainsocket.close();
/* Closes the main socket used in RDclient java. */ 

}
catch(Exception except)		{
	
System.out.println (except) ;

	}

sysscan.close();

		}

					}

