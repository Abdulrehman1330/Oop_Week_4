import java.util.Arrays;

public class Person {
    public Card inhand[] = new Card[52/4];


    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for(int i = 0;i<52/4;i++) {
            str.append(inhand[i] + ", ");

        }
        return str.toString();
    }
}


