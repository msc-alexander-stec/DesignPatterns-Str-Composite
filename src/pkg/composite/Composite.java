package pkg.composite;
import java.util.ArrayList;

import pkg.component.AComponent;

public class Composite implements AComponent {

	// hier: Components als Liste vorgehalten
	private ArrayList<AComponent> childComponents = new ArrayList<AComponent>();

	@Override
	public void operation() {
		// rekursiver Aufruf auf kindComponents, ggf. hinzufuegen von eigener
		// Logik
		System.out.println("I am a Composite. My children are:");
		for (AComponent childComps : childComponents) {
			childComps.operation();
		}
	}

	// Ueberschreiben der Defaulimplementierung
	public void add(AComponent pComp) {
		childComponents.add(pComp);
	}

	public void remove(AComponent pComp) {
		childComponents.remove(pComp);
	}

	public AComponent getChild(int pIndex) {
		return childComponents.get(pIndex);
	}

}