public class Option {

  private final START_COUNT = 0;

  private String name;
  private int count;

  public Option(String name) {
    this(name, START_COUNT);
  }

  public Option(String name, int count) {
    this.name = name;
    this.count = count;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getCount() {
    return this.count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  public void incrementCount() {
    count++;
  }
}