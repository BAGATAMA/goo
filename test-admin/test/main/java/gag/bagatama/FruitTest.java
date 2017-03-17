package gag.bagatama;

import gag.bagatama.bean.Apple;
import gag.bagatama.bean.Fruit;
import gag.bagatama.bean.Fuji;
import org.junit.Test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FruitTest {

    public <T> List addToBox(List<? super T> box, T... fruits) {
        for (T aFruit : fruits) {
            box.add(aFruit);
        }
        return box;
    }

    public <T> List removeFromBox(List<? extends T> box, T aFruit) {
        Iterator<? extends T> it = box.iterator();
        while (it.hasNext()) {
            T fruit = it.next();
            if (fruit.equals(aFruit)) {
                it.remove();
            }
        }
        return box;
    }

    public void adBox(List<Fruit> box) {
        for (Fruit f : box) {
            f.ad();
        }
    }

    @Test
    public void makeSomeFruit() {
        List box = new LinkedList<Fruit>();
        Fruit a = new Fuji();
        a.setName("红富士");
        a.setColor(Fruit.FruitColor.RED.getColorId());

        Fruit b = new Apple();
        b.setName("蛇果");
        b.setColor(Fruit.FruitColor.RED.getColorId());

        Fruit c = new Fruit();
        c.setName("山竹");
        c.setColor(Fruit.FruitColor.WHITE.getColorId());

        addToBox(box, a, b, c);

        adBox(box);
    }
}
