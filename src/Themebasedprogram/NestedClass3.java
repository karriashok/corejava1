package Themebasedprogram;
class GeneralMeadial{
	static void channels() {
		System.out.println("selected channels are:MAA MOVIES,ETV,GEMINI AND ZEE MOVIES ");
		
	}
	static class Entertainerment{
		static void pack1() {
			System.out.println("monthly pack=299rs");
		}
		void pack2() {
			System.out.println("yearly pack =3999rs");
		}
	}
}
public class NestedClass3 {

	public static void main(String[] args) {
		
		GeneralMeadial.channels();
		GeneralMeadial.Entertainerment.pack1();
		GeneralMeadial.Entertainerment tv=new GeneralMeadial.Entertainerment();
		tv.pack2();

	}

}
