import java.util.*;

public class RollNumComparator implements Comparator<Student>{
	@Override
	public int compare(Student s1, Student s2) {
		return Integer.compare(s1.rollNum, s2.rollNum);
	}
}
