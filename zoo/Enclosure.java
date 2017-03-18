package zoo;

public class Enclosure {
  private String name;
  private String type;
  private int capacity;
  private String resident;

  public Enclosure( String name , String type , int capacity , String resident ) {
    this.name = name;
    this.type = type;
    this.capacity = capacity;
    this.resident = resident;
  }

  public String getEnclosureName() {
    return this.name;
  }

}
