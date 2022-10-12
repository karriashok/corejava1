package ourchoice;

	interface GeneralMeDial2{
		void packtype();
		void premium() ;
		void general();
		void rating();

		}
	abstract class movies implements GeneralMeDial2{
		void moviechannels() {
			System.out.println("selected movie channels");
		}
		}
	abstract class Serials implements GeneralMeDial2{
		void tvSerials() {
			System.out.println("selected serials channels");
		}
	}
	class channels extends movies{
		public void packtype() {
			// TODO Auto-generated method stub
			System.out.println("pack type : monthly pack");
		}


		@Override
		public void premium() {
			System.out.println("premium for movie channels is 599rs");
		}

		@Override
		public void general() {
			// TODO Auto-generated method stub
			System.out.println("general for movie channels is 399rs");
		}

		@Override
		public void rating() {
			// TODO Auto-generated method stub
			System.out.println("rating for the movie channels is 4.5\n");
		}
		
	}
	class channels1 extends Serials{
		public void packtype() {
			// TODO Auto-generated method stub
			System.out.println("pack type : monthly pack");
		}
		@Override
		public void premium() {
			// TODO Auto-generated method stub
			System.out.println("premium for serials channels is 299rs");
		}

		@Override
		public void general() {
			// TODO Auto-generated method stub
			System.out.println("general for serials channels is 199rs");
		}

		@Override
		public void rating() {
			// TODO Auto-generated method stub
			System.out.println("rating for the serials channels is 3.5");
		}

	}
	public class interfacetheme {

		public static void main(String[] args) {
			movies m;
			m=new channels();
			m.packtype();
			m.premium();
			m.general();
			m.rating();
			Serials s;
			s=new channels1();
			s.packtype();
			s.premium();
			s.general();
			s.rating();
		}
}
