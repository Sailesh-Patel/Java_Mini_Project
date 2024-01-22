package library;

import java.util.ArrayList;

public class Library {

	private ArrayList<Material> materials = new ArrayList<>();

	public Library(String name) {
		super();
	}

	public void add(Material material) {
		materials.add(material);
	}

	public void remove(Material material) {
		materials.remove(material);
	}

	public void update(Material material) {
		materials.update(material);
	}

	public void checkout(Material material) {
		materials.checkout(material);
	}

	public void checkin(Material material) {
		materials.checkin(material);
	}

	public Material remove(int index) {
		return this.materials.remove(index);
	}

	public void print() {
		for (Material material : materials) {
			material.print();
		}
	}

}
