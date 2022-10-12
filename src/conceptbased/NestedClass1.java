package conceptbased;
class University{
	Department d=new Department();
	void announcement() {
		System.out.println("Exams start at july 24th");
		d.Prepare();
	}
	class Department{
		void Prepare() {
			System.out.println("preparation holidays for exams are 10days");
		}
	}
}
public class NestedClass1 {

	public static void main(String[] args) {
		University u =new University();
		u.announcement();

	}

}
