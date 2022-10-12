package conceptbased;
interface parent{
	int age=55;

interface child{
	int age=22;
}
}
class details implements parent{
	void details() {
		System.out.println("parent age is ="+parent.age);
		System.out.println("child age is ="+child.age);
	}
}
public class Interface2 {

	public static void main(String[] args) {
		details d =new details();
		d.details();

	}

}
