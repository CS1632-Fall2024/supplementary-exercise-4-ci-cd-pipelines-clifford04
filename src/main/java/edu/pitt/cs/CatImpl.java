package edu.pitt.cs;

public class CatImpl implements Cat {

	// TODO: Fill in with member variables
	// ID, name, rented
	private int id;
	private String name;
	private boolean rented;


	public CatImpl(int id, String name) {
		this.id = id;
		this.name = name;
		this.rented = false;
		// TODO: Fill in
	}

	public void rentCat() {
		this.rented = true;
		// TODO: Fill in
	}

	public void returnCat() {
		this.rented=false;
		// TODO: Fill in
	}

	public void renameCat(String name) {
		this.name = name;
		// TODO: Fill in
	}

	public String getName() {
		return this.name;
		// TODO: Fill in
		
	}

	public int getId() {
		// TODO: Fill in
		return this.id;
		
	}

	public boolean getRented() {
		return this.rented;
		// TODO: Fill in
		
	}

	public String toString() {
		// TODO: Fill in
		//ID 1. Jennyanydots"
		return "ID " + this.id + ". " + this.name;
	}

}