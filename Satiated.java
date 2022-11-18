package Hw3;

public class Satiated implements HungerState
{
	@Override
	public void setState(Swimmable state) {
		state.setHungerState(this);	
	}
	
	@Override
	public String toString(){
		return "Satiated";
	}
	
}
