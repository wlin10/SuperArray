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
    if (data.length == this.size()) {
      this.resize();
    }
    this.data[this.size] = element;
    this.size += 1;
    return true;
  }

  public String get(int index) {
    return (this.data[index]);
  }

  public String set(int index, String element) {
    String replaced = this.data[index];
    this.data[index] = element;
    return (replaced);
  }

  private void resize() {
    String[] temp = data;
    data = new String[size * 2];
    for (int i = 0; i < temp.length; i++) {
      data[i] = temp[i];
    }
  }

  public boolean isEmpty() {
    return (size == 0);
  }

  public void clear() {
    size = 0;
    data = new String[10];
  }

  public String toString() {
    String ans = "[";
    for (int i = 0; i < size - 1; i++) {
      ans += (data[i] + ", ");
    }
    return (ans + data[size-1] + "]");
  }

  public boolean contains(String s) {
    for (int i = 0; i < size; i++) {
      if (s.equals(data[i])) {
        return true;
      }
    }
    return false;
  }

  public SuperArray (int initialCapacity) {
    data = new String[initialCapacity];
    size = 0;
  }

  public void add(int index, String element) {
    for (int i = size - 1; i > index; i--) {
      data[i+1] = data[i];
    }
    data[index] = element;
  }

  public String remove(int index) {
    String ans = data[index];
    data[index] = null;
    return ans;
  }

}
