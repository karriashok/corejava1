package Themebasedprogram;

class GeneralMedia{
	void packtype() {
		System.out.println("select packtype");
	}
	void packcost() {
		System.out.println("slelect packcost");
	}
}
class Media extends GeneralMedia{
	void packtype() {
		System.out.println("selected pact type is : monthly");
	}
	void packcost() {
		System.out.println("cost of the selected pack is=2500rs");
	}
}
class Media1 extends Media{
    void packtype() {
		System.out.println("selected pack type is : yearly");
	}
	void packcost() {
		System.out.println("cost of the pack is = 5999rs");
	}
}


public class MethodOverriding2 {

	public static void main(String[] args) {
		GeneralMedia g =new GeneralMedia();
		g.packtype();
		g.packcost();
		g=new Media();
		g.packtype();
		g.packcost();
		g=new Media1();
		g.packtype();
		g.packcost();

	}

}
