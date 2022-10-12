package ourchoice;
abstract class Animal{
	abstract void LifeSpan();
	abstract void breath();
	void life() {
		System.out.println("every animals has different life sapn");
		
	}
}
class Dog extends Animal{
	
	void LifeSpan() {
		System.out.println("the life span of the Dog is 15 years");
	}
	void  breath() {
		System.out.println("Dog is breathing oxygen");
	}
}
class Wolf extends Dog {
	void LifeSpan() {
		System.out.println("the life span of the Wolf is 20 years");
	}
	void  breath() {
		System.out.println("Wolf is breathing oxygen");
	}
}
public class Abstract1 {

	public static void main(String[] args) {
		Animal x;
		x=new Dog();
		x.life();
		x.LifeSpan();
		x.breath();
		x=new Wolf();
		x.LifeSpan();
		x.breath();
	}

}
