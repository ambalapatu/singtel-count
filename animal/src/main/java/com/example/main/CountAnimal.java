package com.example.main;

import com.example.rest.model.Animal;
import com.example.rest.model.Bird;
import com.example.rest.model.Butterfly;
import com.example.rest.model.Cat;
import com.example.rest.model.Chicken;
import com.example.rest.model.ClownFish;
import com.example.rest.model.Dog;
import com.example.rest.model.Dolphin;
import com.example.rest.model.Duck;
import com.example.rest.model.Fish;
import com.example.rest.model.Frog;
import com.example.rest.model.Parrot;
import com.example.rest.model.Rooster;
import com.example.rest.model.Shark;

public class CountAnimal {
	
	public static void main(String args[]) {
	
		Animal[] animals = new Animal[] {
			new Bird(),
			new Duck(),
			new Chicken(),
			new Rooster(),
			new Parrot(),
			new Fish(),
			new Shark(),
			new ClownFish(),
			new Dolphin(),
			new Frog(),
			new Dog(),
			new Butterfly(),
			new Cat()
		};
		
		int flyCount = 0;
		int walkCount = 0;
		int singCount = 0;
		int swimCount = 0;
		
		for(Animal animal : animals) {
	        if(animal instanceof Bird) {
	        	Bird obj = new Bird();
	        	if(obj.fly()) flyCount++;
	        	if(obj.walk()) walkCount++;
	        	if(obj.sing()) singCount++;
	        	if(obj.swim()) swimCount++;	
	        }
	        if(animal instanceof Duck) {
	        	Duck obj = new Duck();
	        	if(obj.fly()) flyCount++;
	        	if(obj.walk()) walkCount++;
	        	if(obj.sing()) singCount++;
	        	if(obj.swim()) swimCount++;	
	        }
	        if(animal instanceof Chicken) {
	        	Chicken obj = new Chicken();
	        	if(obj.fly()) flyCount++;
	        	if(obj.walk()) walkCount++;
	        	if(obj.sing()) singCount++;
	        	if(obj.swim()) swimCount++;	
	        }
	        if(animal instanceof Rooster) {
	        	Rooster obj = new Rooster();
	        	if(obj.fly()) flyCount++;
	        	if(obj.walk()) walkCount++;
	        	if(obj.sing()) singCount++;
	        	if(obj.swim()) swimCount++;	
	        }
	        if(animal instanceof Parrot) {
	        	Parrot obj = new Parrot();
	        	if(obj.fly()) flyCount++;
	        	if(obj.walk()) walkCount++;
	        	if(obj.sing()) singCount++;
	        	if(obj.swim()) swimCount++;	
	        }
	        if(animal instanceof Fish) {
	        	Fish obj = new Fish();
	        	if(obj.fly()) flyCount++;
	        	if(obj.walk()) walkCount++;
	        	if(obj.sing()) singCount++;
	        	if(obj.swim()) swimCount++;	
	        }
	        if(animal instanceof Shark) {
	        	Shark obj = new Shark();
	        	if(obj.fly()) flyCount++;
	        	if(obj.walk()) walkCount++;
	        	if(obj.sing()) singCount++;
	        	if(obj.swim()) swimCount++;	
	        }
	        if(animal instanceof ClownFish) {
	        	ClownFish obj = new ClownFish();
	        	if(obj.fly()) flyCount++;
	        	if(obj.walk()) walkCount++;
	        	if(obj.sing()) singCount++;
	        	if(obj.swim()) swimCount++;	
	        }
	        if(animal instanceof Dolphin) {
	        	Dolphin obj = new Dolphin();
	        	if(obj.fly()) flyCount++;
	        	if(obj.walk()) walkCount++;
	        	if(obj.sing()) singCount++;
	        	if(obj.swim()) swimCount++;	
	        }
	        if(animal instanceof Frog) {
	        	Frog obj = new Frog();
	        	if(obj.fly()) flyCount++;
	        	if(obj.walk()) walkCount++;
	        	if(obj.sing()) singCount++;
	        	if(obj.swim()) swimCount++;	
	        }
	        if(animal instanceof Dog) {
	        	Dog obj = new Dog();
	        	if(obj.fly()) flyCount++;
	        	if(obj.walk()) walkCount++;
	        	if(obj.sing()) singCount++;
	        	if(obj.swim()) swimCount++;	
	        }
	        if(animal instanceof Butterfly) {
	        	Butterfly obj = new Butterfly();
	        	if(obj.fly()) flyCount++;
	        	if(obj.walk()) walkCount++;
	        	if(obj.sing()) singCount++;
	        	if(obj.swim()) swimCount++;	
	        }
	        if(animal instanceof Cat) {
	        	Cat obj = new Cat();
	        	if(obj.fly()) flyCount++;
	        	if(obj.walk()) walkCount++;
	        	if(obj.sing()) singCount++;
	        	if(obj.swim()) swimCount++;	
	        }
		}
		
		System.out.println("animals can fly = " + flyCount);
		System.out.println("animals can walk = " + walkCount);
		System.out.println("animals can sing = " + singCount);
		System.out.println("animals can swim = " + swimCount);
		
	}
	


}
