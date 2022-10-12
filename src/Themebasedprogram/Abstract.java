package Themebasedprogram;

abstract class Generelmedia2{
	abstract void channels() ;
	abstract void packtype();
	void entertainement() {
		System.out.println("select channels are ");
	}
}
class Movies extends Generelmedia2{
	void channels() {
		System.out.println("MAA MOVIES,ETV,GEMINI AND ZEE MOVIES");
	}
	void packtype() {
		System.out.println("selected pact type : Monthly");
	}
}
class Media2 extends Movies{
	void channels() {
		System.out.println("DICOVERY,SPORTS AND MUSIC");
	}
	void packtype() {
		System.out.println("selected pact type : 3 Months");
	}
}
public class Abstract {

	public static void main(String[] args) {
		Generelmedia2 GM;
		GM=new Movies();
		GM.entertainement();
		GM.channels();
		GM.packtype();
		GM=new Media2();
		GM.entertainement();
		GM.channels();
		GM.packtype();
		
	}

}
