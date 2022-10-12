package ourchoice;

	interface Electronics1{
		void cost1();
		void battery1();
		void features1();
	}
	abstract class Mobile1 implements Electronics1{
		void company() {
			System.out.println("comapany of the mobile is iphone");
		}
	}
	abstract class Laptop1 implements Electronics1{
		void brand() {
			System.out.println("company of the laptop is hp");
		}
	}
	class vivo2 extends Mobile1{

		@Override
		public void cost1() {
			// TODO Auto-generated method stub
			System.out.println("cost of the mobile is 50000rs ");
		}

		@Override
		public void battery1() {
			// TODO Auto-generated method stub
			System.out.println("battery capacity is 3000mAh");
		}

		@Override
		public void features1() {
			// TODO Auto-generated method stub
			System.out.println("features are : 4GB ram,128GB ROM and camera 30px\n");
		}
		
	}
	class hp1 extends Laptop1{

		@Override
		public void cost1() {
			// TODO Auto-generated method stub
			System.out.println("cost of the laptop is 58000rs");
		}

		@Override
		public void battery1() {
			// TODO Auto-generated method stub
			System.out.println("battery capacity is 2hours");
		}

		@Override
		public void features1() {
			// TODO Auto-generated method stub
			System.out.println("8GB ram, core i5 and 11th generation");
		}
		
	}
	public class Interfacel {

		public static void main(String[] args) {
			Mobile1 m;
			m=new vivo2();
			m.company();
			m.cost1();
			m.battery1();
			m.features1();
			Laptop1 l;
			l=new hp1();
			l.brand();
			l.cost1();
			l.battery1();
			l.features1();
			}
		}

