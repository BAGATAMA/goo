package gag.bagatama.bean;

/**
 * Created by gooagoo on 2017/3/15.
 */
public class Apple extends Fruit {
    Integer size;

    Integer ripenState;

    @Override
    public void ad() {
        System.out.println("I have an apple !" + this.name);
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getRipenState() {
        return ripenState;
    }

    public void setRipenState(Integer ripenState) {
        this.ripenState = ripenState;
    }
}
