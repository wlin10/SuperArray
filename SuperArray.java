public class SuperArray {

  private String[] data;
  private int size; //The current size

  public SuperArray() {
    data = new String[10];
    size = 0;
  }

  public int size() {
    return this.size;
  }

  public boolean add(String element) {
    this.data[this.size] = element;
    this.size += 1;
    return true;
  }

  public String get(int index) {
    return (this.data[index]);
  }

}
