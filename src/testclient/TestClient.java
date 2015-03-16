package testclient;
import pkg.composite.Composite;
import pkg.leaf.Leaf;

public class TestClient {

	public static void main(String[] args) {

		//
		//                     rootComposite
		//                    /    /        \
		//                  leaf leaf   secondComposite
		//                             /    /    /     \
		//                           leaf leaf leaf thirdComposite
		//                                              |
		//                                             leaf
		
		System.out.println("Start: Composite");
 
		// rootComposite
		Composite rootComposite = new Composite();

		rootComposite.add(new Leaf());
		rootComposite.add(new Leaf());

		// secondComposite
		Composite secondComposite = new Composite();
		rootComposite.add(secondComposite);

		secondComposite.add(new Leaf());
		secondComposite.add(new Leaf());
		secondComposite.add(new Leaf());

		// thirdComposite
		Composite thirdComposite = new Composite();
		secondComposite.add(thirdComposite);
		
		thirdComposite.add(new Leaf());

		// Print structure
		rootComposite.operation();

	}
}