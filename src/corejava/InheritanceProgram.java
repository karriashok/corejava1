package corejava;

	class electronics{
		void charging()
		{
			System.out.println("charge...");
		}
	}
	class laptop extends electronics{
		void programing()
		{
			System.out.println("programs..");
		}
	}
	class mobile extends laptop {

		void gaming ()
		{
			System.out.println("games ...");
		}
	}

	public class InheritanceProgram {
		public static void main (String args[]) {
			mobile m = new mobile();
			m.gaming();
			m.programing();
			m.charging();
		}
}
