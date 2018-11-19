package main.states;

import java.awt.Graphics;

import main.Synthesis;
import main.adapters.KeyInput;
import main.adapters.MouseInput;
import main.files.MonsterListWriter;

public class Saving extends State {

	private MonsterListWriter recorder;
	
	public Saving(KeyInput keyInput, MouseInput mouseInput, Synthesis syn) {
		super(StateID.Saving, keyInput, mouseInput, syn);
		recorder = new MonsterListWriter(syn);
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		
	}
	
	public void save() {
		//recorder.writeMonsterList();
		//recorder.writeRecipes();
		System.out.println("Saving...");
		recorder.writeMonsterList();
		recorder.writeRecipes();
		System.out.println("Saved");
	}

}
