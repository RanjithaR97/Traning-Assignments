import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class Java11Ass4 {

	public static void main(String[] args) {
		var path="C:\\Users\\Ranjitha R\\Desktop\\Student.txt";
		try {
			String data=Files.readString(Path.of(path));
		   String input=data.stripTrailing();
		   System.out.println(input);
		  
		 
			
			}
		catch(IOException e) {
			e.printStackTrace();
			
		}
		

	}

}
