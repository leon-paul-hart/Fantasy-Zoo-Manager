package zoomanager.enclosure;

import zoomanager.creature.Creature;

import java.util.ArrayList;

public class Enclosure implements IEnclosure {

    private final String EnclosureName;
    private final String CreatureType;
    private final int MaximumCapacity;
    private final ArrayList<Creature> EnclosedCreatures;

    public Enclosure(String enclosureName, String creatureType, int maximumCapacity) {
        this.EnclosureName = enclosureName;
        this.CreatureType = creatureType;
        this.MaximumCapacity = maximumCapacity;
        this.EnclosedCreatures = new ArrayList<>();
    }

    public String getEnclosureName() {
        return this.EnclosureName;
    }

    public String getEnclosureType() {
        return this.CreatureType;
    }

    public int getEnclosureCapacity() {
        return this.MaximumCapacity;
    }

    public int countEnclosureCreatures() {
        return this.EnclosedCreatures.size();
    }

    public ArrayList<Creature> getEnclosureCreaturesList() {
        return this.EnclosedCreatures;
    }

    public void addCreatureToEnclosure(Creature creature) {
        this.EnclosedCreatures.add(creature);
    }

    public void removeCreatureFromEnclosure(Creature creature) {
        this.EnclosedCreatures.remove(creature);
    }

    public Boolean checkIfEnclosureIsEmpty() {

        int creatureCount = this.countEnclosureCreatures();

        return creatureCount == 0;
    }

    public Boolean checkIfEnclosureIsFull() {

        int creatureCount = this.countEnclosureCreatures();
        int enclosureCapacity = this.getEnclosureCapacity();

        return creatureCount == enclosureCapacity;
    }

    public void moveCreatureBetweenEnclosures(Creature creature, Enclosure newEnclosure) {
        if (!newEnclosure.checkIfEnclosureIsFull()) {
            this.removeCreatureFromEnclosure(creature);
            newEnclosure.addCreatureToEnclosure(creature);
        }
    }

}