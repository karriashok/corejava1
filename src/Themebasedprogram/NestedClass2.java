package Themebasedprogram;
class Generlmedia{
	meadia m =new meadia();
	void channels1() {
		System.out.println("selected channels are:MAA MOVIES,ETV,GEMINI AND ZEE MOVIES");
		m.channels2();
	}
	class meadia{
		void channels2(){
			System.out.println("selected channels are:DICOVERY,SPORTS AND MUSIC");
		}
	}
}
public class NestedClass2 {
	public static void main(String[] args) {
		Generlmedia g=new Generlmedia();
		g.channels1();
	}
}
