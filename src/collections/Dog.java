package collections;

public interface Dog {
void bark();
static void eat() {
	System.out.println("Dog eats meet");
}
default void sleep() {
	System.out.println("Sleeps 12 hours");
}
}
