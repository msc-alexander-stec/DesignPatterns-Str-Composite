package pkg.leaf;
import pkg.component.AComponent;

// File implements the "lowest common denominator"
public class Leaf implements AComponent {

	@Override
	public void operation() {
		System.out.println("I am a leaf!");
	}
}
