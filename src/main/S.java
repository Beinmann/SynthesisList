package main;

import java.awt.Color;

import main.monsterList.Monster;

//Klasse für statische methoden
public class S {
	public static int clamp(int cur, int min, int max) {
		int actMin = Math.min(min,max);
		int actMax = Math.max(min,max);
		if(cur < min) {
			return min;
		}
		if(cur > max) {
			return max;
		}
		return cur;
	}
	
	public static Color getRankColor(Monster monster) {
		String rank = monster.getRank().toUpperCase();
		Color tempColor;
		switch(rank) {
		case "X": tempColor = Color.MAGENTA;
		break;
		case "S": tempColor = Color.yellow;
		break;
		case "A": tempColor = Color.red;
		break;
		case "B": tempColor = Color.orange;
		break;
		case "C": tempColor = Color.GREEN;
		break;
		case "D": tempColor = Color.blue;
		break;
		case "E": tempColor = Color.white;
		break;
		case "F": tempColor = Color.lightGray;
		break;
		default: tempColor = Color.darkGray;
		break;
		}
		return tempColor;
	}
	
	public static Color getTypeColor(Monster monster) {
		String type = monster.getType().toLowerCase();
		Color tempColor;
		switch(type) {
		case "slime" : tempColor = Color.blue;
		break;
		case "nature" : tempColor = Color.green;
		break;
		case "material" : tempColor = Color.lightGray;
		break;
		case "dragon" : tempColor = Color.yellow;
		break;
		case "undead" : tempColor = Color.MAGENTA;
		break;
		case "demon" : tempColor = Color.darkGray;
		break;
		case "incarnus" : tempColor = Color.white;
		break;
		case "beast" : tempColor = Color.gray;
		break;
		default : tempColor = Color.white;
		}
		return tempColor;
	}
}
