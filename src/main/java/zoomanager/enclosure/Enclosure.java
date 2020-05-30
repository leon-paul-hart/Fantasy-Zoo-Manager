package zoomanager.enclosure;

import zoomanager.creature.Creature;

import java.util.ArrayList;

public class Enclosure {
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

    public int countCreatures() {
        return this.EnclosedCreatures.size();
    }

    // returns all the contents of the zoomanager.creature array list.
    public ArrayList<Creature> getEnclosureCreatures() {
        return this.EnclosedCreatures;
    }

    public void addCreature(Creature creature) {
        this.EnclosedCreatures.add(creature);
    }

    public void removeCreature(Creature creature) {
        this.EnclosedCreatures.remove(creature);
    }

    public Boolean checkIfEnclosureIsEmpty() {
        int creatureCount = countCreatures();
        return creatureCount == 0;
    }

    public Boolean checkIfEnclosureIsFull() {
        return countCreatures() == getEnclosureCapacity();
    }

    public void moveCreatureBetweenEnclosures(Creature creature, Enclosure enclosure2) {
        if (!enclosure2.checkIfEnclosureIsFull()) {
            this.removeCreature(creature);
            enclosure2.addCreature(creature);
        }
    }

}