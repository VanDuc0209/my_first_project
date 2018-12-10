package virtuoso.createntities;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class CreateEntities {
	private static String link = "http://google.com/oop/#";
	private static int countLink = 0; 
	private static List<String> time = new ArrayList<String>();
	
	public void setList(String fileName, List<String> nameList) {
		Scanner scanner;
		try {
			scanner = new Scanner(new File(fileName));
			while(scanner.hasNextLine()) {
				nameList.add(scanner.nextLine());
			}
			scanner.close();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		
	}
	public String getTime() {
		return time.get((int)(Math.random() * time.size()));
	}
	public void setTime(String fileName) {
		this.setList(fileName, time);	
	}
	public String getLink() {
		return CreateEntities.link + countLink++ + "/";
	}

}
