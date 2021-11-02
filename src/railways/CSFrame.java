package railways;

//final
import javax.swing.JTextField;
import java.text.SimpleDateFormat; 
import java.util.Date;  
import java.io.File;
import java.io.IOException;  
import java.io.FileWriter; 

public class CSFrame  {
	
	
	Boolean success = false;
	String path = "";
	public String CreateAndWriteToFile(String i, String in1, String in2, String in3, String in4, String in5, String tp) {
		try {
			//, String in2, String in3, String in4, String in5
		      File file = new File(i + ".txt");
		      if (file.createNewFile()) {
		        System.out.println("File created: " + file.getName());
		       	path = file.getPath();        
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		try {
			  SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			  Date date = new Date();  
		      FileWriter myWriter = new FileWriter(i + ".txt");
		      myWriter.write("\nComputer Shop\n");
		      myWriter.write("*********************************\n\n");
		      myWriter.write("Date:      " + "Time:\n");
		      myWriter.write(formatter.format(date) + "\n");
		      myWriter.write("*********************************\n");
		      if(in1.trim().length() != 0) {
			      myWriter.write("_________________________________\n\n");
			      myWriter.write(in1 + "\n");
			  }
		      System.out.println("here"+ in2 + "ends");
		      if(in2.trim().length() != 0) {
			      myWriter.write("_________________________________\n\n");
			      myWriter.write(in2+ "\n");
			  }
		      if(in3.trim().length() != 0) {
			      myWriter.write("_________________________________\n\n");
			      myWriter.write(in3+ "\n");
			  }
		      if(in4.trim().length() != 0) {
			      myWriter.write("_________________________________\n\n");
			      myWriter.write(in4+ "\n");
			  }
		      if(in5.trim().length() != 0) {
			      myWriter.write("_________________________________\n\n");
			      myWriter.write(in5+ "\n");
			  }
		      
		      myWriter.write("\n:::::::::::::::::::::::::::::::::\n\n");
		      myWriter.write("Total Price: " + tp + "\n\n");
		      myWriter.write("'''''''''''''''''''''''''''''''''\n\n");
		      myWriter.write("Happy Shopping!\n");
		      myWriter.write("................................\n\n");
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		      success = true; 
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		if(success==true) {
			return path;
		}
		else {
			return "";
		}
	}
	

	public String readTF(JTextField obj) {
		
		String name;
		name = obj.getText();
		return name;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TicketGenerator();
		
	}
}
