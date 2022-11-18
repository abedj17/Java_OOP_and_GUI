package Hw3;
/**
	 * Abstract interface SeaFactory
	 *  to produce SeaCreature  like Sea Plants (Zostera ,Laminaria) Or Sea Animals (Fish ,JellyFish)
	 * 
	 */
public interface AbstractSeaFactory {
	public SeaCreature produceSeaCreature(String type);
}

