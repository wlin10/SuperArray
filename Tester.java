public class Tester {
    public static void main(String[] args) {
      SuperArray words = new SuperArray();
        words.add("kani");
        words.add("uni");
        words.add("ebi");
        for(int i = 0; i < words.size(); i++){
            System.out.println( words.get(i) );
        }

        System.out.println(words.toString());

        SuperArray letters = new SuperArray();
        letters.add("a");
        letters.add("b");
        letters.add("c");
        letters.add("d");
        letters.add("e");
        letters.add("f");
        letters.add("g");
        letters.add("h");
        letters.add("i");
        letters.add("j");
        letters.add("k");
        letters.add("l");
        letters.add("m");
        letters.add("n");
        letters.add("o");
        letters.add("p");
        letters.add("q");
        letters.add("r");
        letters.add("s");
        letters.add("t");
        letters.add("u");
        letters.add("v");
        letters.add("w");
        letters.add("x");
        letters.add("y");
        letters.add("z");
        for(int i = 0; i < letters.size(); i++){
            System.out.println(letters.get(i) );
        }

        System.out.println(words.isEmpty());
        System.out.println(letters.isEmpty());

        words.clear();
        System.out.println(words.isEmpty());
        words.add("kani");
        System.out.println(words.toString());

    }
}
