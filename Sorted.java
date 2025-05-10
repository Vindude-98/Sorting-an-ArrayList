import java.util.ArrayList;
import java.util.Iterator;

public class Sorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> students = new ArrayList<>();
		
		students.add(new Student(1, "Gavin", "123 Address"));
		students.add(new Student(2, "John", "456 Address"));
		students.add(new Student(3, "Alex", "789 Address"));

		
		// Sorted by Student name
		System.out.println("**SORTED BY STUDENT NAME**\n");
		
		CustomSorter.selectionSort(students, new NameComparator());
		
		Iterator<Student> itr = students.iterator();
		
		
		while(itr.hasNext()) {
			Student st = (Student)itr.next();
			System.out.println(
					"Student Name: " + st.name + "\n" + 
					"Student Roll Number: " + st.rollNum + "\n" + 
					"Student Address: " + st.address + "\n"
					);
		}
		
		// Sorted by Student Roll Number
		System.out.println("\n**SORTED BY STUDENT ROLL NUMBER**\n");
		
		CustomSorter.selectionSort(students, new RollNumComparator());
				
		// Reset the iterator before the second loop
		itr = students.iterator();
		
		while(itr.hasNext()) {
			Student st = (Student)itr.next();
			System.out.println(
					"Student Name: " + st.name + "\n" + 
					"Student Roll Number: " + st.rollNum + "\n" + 
					"Student Address: " + st.address + "\n"
					);
		}
	}

}
