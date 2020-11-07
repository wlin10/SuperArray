public class Demo{
  public static void removeDuplicates(SuperArray s) {
    for (int i = 0; i < s.size(); i++) {
      if (s.indexOf(s.get(i)) < i) {
        s.remove(i);
        i--;
      }
    }
  }

  public static SuperArray findOverlap(SuperArray a, SuperArray b) {
    SuperArray ans = new SuperArray();
    for (int i = 0; i < a.size(); i++) {
      if (b.contains(a.get(i))) {
        ans.add(a.get(i));
      }
    }
    removeDuplicates(ans);
    return ans;
  }

  public static SuperArray zip(SuperArray a, SuperArray b) {
    SuperArray ans = new SuperArray();
    if (a.size() <= b.size()) {
      for (int i = 0; i < a.size(); i++) {
        ans.add(a.get(i));
        ans.add(b.get(i));
      }
      for (int i = a.size(); i < b.size(); i++) {
        ans.add(b.get(i));
      }
    }
    if (a.size() > b.size()) {
      for (int i = 0; i < b.size(); i++) {
        ans.add(a.get(i));
        ans.add(b.get(i));
      }
      for (int i = b.size(); i < a.size(); i++) {
        ans.add(a.get(i));
      }
    }
    return ans;
  }

  public static void main(String[]args){
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");

    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);

    SuperArray a = new SuperArray();
    a.add("a"); a.add("b"); a.add("c");
    a.add("d"); a.add("e"); a.add("f");
    SuperArray b = new SuperArray();
    b.add("e"); b.add("f"); b.add("g");
    b.add("h"); b.add("i"); b.add("j");
    b.add("k"); b.add("l"); b.add("d");

    System.out.println(findOverlap(a,b));
    System.out.println(zip(a,b));

    }
}
