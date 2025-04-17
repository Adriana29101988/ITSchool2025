package Session16_Hash;

public class Pair<K,V>{
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public Pair() {

    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
class PairTest{
    public static void main(String [] args ){
        Pair<String, String> pairSS = new Pair<>();
        pairSS.setKey("key");
        pairSS.setValue("value");

        System.out.println("key:" +pairSS.getKey() + "value:" +pairSS.getValue());
        Pair<Integer, Integer> pairII = new Pair<>();
        pairII.getKey();
        pairII.getValue();

    }
}
