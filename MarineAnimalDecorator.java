package Hw3;
import java.awt.Color;

public class MarineAnimalDecorator implements MarineAnimal
{
	protected  Swimmable theSwimm = null;
	
	public MarineAnimalDecorator(Swimmable theSwimm){
		this.theSwimm = theSwimm;
	}
	
	@Override
	public void PaintFish(Color newcol) {
		theSwimm.PaintFish(newcol);
		
	}

}
