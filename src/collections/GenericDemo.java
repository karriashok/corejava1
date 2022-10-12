package collections;

class Sample<K>{
	void details (K a) {
		System.out.println(a);
	}
}
public class GenericDemo {

	public static void main(String[] args) {
		Sample<Integer> i= new Sample<Integer>();
		i.details(110);
		i.details(223);
		Sample<String> s= new Sample<String>();
		s.details("Ashok");
		
		Sample<Long> l= new Sample<Long>();
		l.details(9640161036l);
		
		Sample<Double> d= new Sample<>();
		d.details(750.00);
		
		Sample<Float> f= new Sample<>();
		f.details(200.0f);
		
	}

}
