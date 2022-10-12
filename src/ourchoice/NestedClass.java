package ourchoice;

class Mist{
	
	static void Exams() {
		System.out.println("Exams starts from 24th july ");
		
	}
	static class Department{
		static void prepare() {
			System.out.println("preperation holidays for exams are 10 days");
		}
		void CompletedExams() {
			System.out.println("Exams completed at agust 8th");
		}
	}
}
public class NestedClass {

	public static void main(String[] args) {
		Mist.Exams();
		Mist.Department.prepare();
		Mist.Department civil=new Mist.Department();
		civil.CompletedExams();

	}

}
