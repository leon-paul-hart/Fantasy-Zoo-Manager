package zoomanager.enclosure;

import zoomanager.creature.Creature;

import java.util.ArrayList;

public class Enclosure implements IEnclosure {

    private final String enclosureName;
    private final String creatureType;
    private final int maximumCapacity;
    private final ArrayList<Creature> enclosedCreatures;

    public Enclosure(String name, String type, int capacity) {
        this.enclosureName = name;
        this.creatureType = type;
        this.maximumCapacity = capacity;
        this.enclosedCreatures = new ArrayList<>();
    }

    public String getEnclosureName() {
        return this.enclosureName;
    }

    public String getEnclosureType() {
        return this.creatureType;
    }

    public int getEnclosureCapacity() {
        return this.maximumCapacity;
    }

    public int countEnclosureCreatures() {
        return this.enclosedCreatures.size();
    }

    public ArrayList<Creature> getEnclosureCreaturesList() {
        return this.enclosedCreatures;
    }

    public void addCreatureToEnclosure(Creature creature) {
        this.enclosedCreatures.add(creature);
    }

    public void removeCreatureFromEnclosure(Creature creature) {
        this.enclosedCreatures.remove(creature);
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