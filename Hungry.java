package Hw3;

public class Hungry implements HungerState{

	@Override
	public void setState(Swimmable state) {

		state.setHungerState(this);
	}
	
	@Override
	public String toString(){
		return "Hungry";
	}
	
	
	

}
