package gag.bagatama.bean;

import java.math.BigDecimal;

public class Fruit {

    Long id;

    String name;

    BigDecimal prize;

    Integer color;

    public enum FruitColor {
        GREEN(1,"green"), RED(2,"red"), BLUE(3,"blue"),YELLOW(4,"yellow"),WHITE(5,"white");
        FruitColor(int colorId, String desc){
            this.colorId = colorId;
            this.desc = desc;
        }
        int colorId;
        String desc;

        public int getColorId() {
            return colorId;
        }

        public String getDesc() {
            return desc;
        }

        public static String getDescByColorId(int colorId){
            for (FruitColor fc : FruitColor.values()){
                if (fc.getColorId() == colorId){
                    return fc.getDesc();
                }
            }
            return "unknown";
        }
    }

    public void ad(){
        System.out.println("I'm a fruit! my name is " + this.name + ", and my color is totally "+ FruitColor.getDescByColorId(this.color));
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrize() {
        return prize;
    }

    public void setPrize(BigDecimal prize) {
        this.prize = prize;
    }

    public Integer getColor() {
        return color;
    }

    public void setColor(Integer color) {
        this.color = color;
    }
}
