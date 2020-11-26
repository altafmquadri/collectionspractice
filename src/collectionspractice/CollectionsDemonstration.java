package collectionspractice;
import java.util.ArrayList;
import java.util.List;

public class CollectionsDemonstration {
	
	public static void main(String[] args) {
		
		List<Student> studentList = new ArrayList<Student>(); 
		studentList.add(new Student("Aibek", 1, 28));
		studentList.add(new Student("Altaf", 2, 39));
		studentList.add(new Student("Vivica", 3, 33));
		
		for (Student student : studentList) {
			System.out.println(student);
		}
	}
	
	
	
}
