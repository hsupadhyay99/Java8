package funcational.interfaceExp;

import java.util.function.Function;

public class FunctionStudentDemo {

	public static void main(String[] args) {
		Function<Student,Double> marksRetriever = (student) -> student.getMarks();
		
		Student student1 = new Student(101,"Jane Doe",78.5);
		
		double marks = marksRetriever.apply(student1);
		System.out.println("marks:"+marks);

	}

}
