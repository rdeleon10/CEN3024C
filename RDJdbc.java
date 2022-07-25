package database;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/* Imported Java Utilities and SQL. */

/* RDJava DB created by Ryan Deleon on 7/12/2022 */

public class RDJdbc

{	

public static void main(String[] args)

{

int choices;

/* Used to loop and store words. */

do{	

/*Scans user keyword input. */	

Scanner input = new Scanner(System.in);

/* Try catch to handle exceptions. */

try {

/* Asking user to enter a word. */	

System.out.println("Input a keyword:");

String words = input.next();

/* Used to load JDBC driver. */

Class.forName("com.mysql.jdbc.Driver");

/* Used to establish Connection for word occurrences java file. */

Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/wordoccurrences","root","admin");

/* Used to prepare statement. */

PreparedStatement StatementPreparation = connect.prepareStatement("insert into word (words) values(?)");

/* Sets the word entered by the user in the query. */

StatementPreparation.setString(1,words);

/* Executes Query from object constraints. */

StatementPreparation.executeUpdate();

/* Displays database as table word as additional word from the users input. */

System.out.println("Table word as additional word from the users input");

Statement statment = connect.createStatement();

ResultSet resuSet = statment.executeQuery("select * from word");

while(resuSet.next())	{

System.out.println(resuSet.getString(1));

}

connect.close();

}

catch(ClassNotFoundException |SQLException ccnotfound){

System.out.println(ccnotfound.getMessage());

}

System.out.println("Enter more than one word ( enter 1 for yes )");

choices = input.nextInt();

} while(choices == 1);

/* Used for Word Frequency Section Calculation. */

System.out.println("Frequency of words in database is:");

/* Makes a HashMap for storing both words and its current frequency. */

Map<String,Integer> primaryfrequency = new LinkedHashMap<>();

/* Used for storing words access by database and gets the ResultSet. */

try {

Class.forName("com.mysql.jdbc.Driver");

Connection conclose = DriverManager.getConnection("jdbc:mysql://localhost:3306/wordoccurrences","root","admin");

Statement cstatement = conclose.createStatement();

ResultSet sresult = cstatement.executeQuery("Select * from word");

while(sresult.next())	{

/*  Used to retrieve word from  database. */

String sclass = sresult.getString(1);

/* Checks primary frequency if word is currently present on HashMap. */

if(primaryfrequency.get(sclass)== null){

/* If not present, word with frequency 1 is applied to the map. */

primaryfrequency.put(sclass,1);

		}

else {	

/* Used to increase frequency currently being used. */	

primaryfrequency.put(sclass,primaryfrequency.get(sclass)+1);

	}

			}

/* Closes DB connection. */

conclose.close();

}

catch (ClassNotFoundException | SQLException exsql) 	{

System.out.println(exsql.getMessage());

}

/* Prints words along with primary frequency. */

Set<String> key = primaryfrequency.keySet();

for(String setkey:key){

System.out.println("Words: "+ setkey + " frequency: " + primaryfrequency.get(setkey));

}

	}
			}