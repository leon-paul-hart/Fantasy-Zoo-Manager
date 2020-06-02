package zoomanager.enclosure;

import zoomanager.creature.Creature;

import java.util.ArrayList;

public interface IEnclosure {

    String getEnclosureName();

    String getEnclosureType();

    int getEnclosureCapacity();

    int countEnclosureCreatures();

    ArrayList<Creature> getEnclosureCreaturesList();

    void addCreatureToEnclosure(Creature creature);

    void removeCreatureFromEnclosure(Creature creature);

    Boolean checkIfEnclosureIsEmpty();

    Boolean checkIfEnclosureIsFull();

    void moveCreatureBetweenEnclosures(Creature creature, Enclosure enclosure);

}
