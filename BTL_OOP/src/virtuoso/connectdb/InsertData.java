package virtuoso.connectdb;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import virtuoso.createntities.CreatePerson;
import virtuoso.entity.Person;
import virtuoso.filedata.FileData;
public class InsertData {
	
	static Scanner read;
	public static void main(String[] args) {
		List<String> demo = new ArrayList<String>();
//		CreatePerson CP = new CreatePerson();
//		CreatePerson CP1 = new CreatePerson();
//		FileData FD = new FileData();
//		Person Person1 = new Person("Person1",CP.getPersonLabel(), "he is good", "20/10/2018", CP.getLink(), "Viet Nam");
//		System.out.println(Person1.toString());
//		Person Person2 = new Person("Person2",CP1.getPersonLabel(), "he is good", "20/10/2018", CP1.getLink(), "Viet Nam");
//		System.out.println(Person2.toString());
		File file = new File("src/virtuoso/filedata/personDes.txt");
		try {
			read = new Scanner(file);
			while(read.hasNextLine()) {
				demo.add(read.nextLine());
			}
			read.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(demo.size());
	}
}
