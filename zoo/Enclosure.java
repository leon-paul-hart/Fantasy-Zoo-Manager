package zoo;

public class Enclosure {
  private String enclosure;
  private String type;
  private int capacity;
  private String resident;

  public Enclosure( String enclosure , String type , int capacity , String resident ) {
    this.enclosure = enclosure;
    this.type = type;
    this.capacity = capacity;
    this.resident = resident;
  }

  public String getEnclosureName() {
    return this.enclosure;
  }

  public String getEnclosureType() {
    return this.type;
  }

  public int getEnclosureCapacity() {
    return this.capacity;
  }

  public String getEnclosureResident() {
    return this.resident;
  }

}
