import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<HeavyBox> heavyBoxes = new ArrayList<>();
        heavyBoxes.add(new HeavyBox("nana", 7));
        heavyBoxes.add(new HeavyBox("meme",6));
        heavyBoxes.add(new HeavyBox("pepe",8));
        for (HeavyBox h:heavyBoxes) {
            System.out.println(h+"");
        }
        heavyBoxes.get(0).setWeight(1);
        heavyBoxes.remove(heavyBoxes.size()-1);
        for (HeavyBox h:heavyBoxes) {
            System.out.println(h+"");
        }
    }
}