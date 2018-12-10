package virtuoso.relationship;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Relasionship {
	
	private List<String> relationship = new ArrayList<String>();
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
	public String getRelationship() {
		return relationship.get((int)(Math.random() * relationship.size()));
	}
	public void setRelationship(String fileName) {
		this.setList(fileName, relationship);
	}
	public Relasionship() {}
	public Relasionship(String relasionship) {
		this.setRelationship(relasionship);
		}
}
