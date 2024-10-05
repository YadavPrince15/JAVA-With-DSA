package JAVA_CODE.oops;
//Run in intelij

public class getset {
    public static void main(String[] args) {
         Pen p1 = new Pen(); // create a pen object called p1
         p1.setColor("pink");
        System.out.println(p1.getColor());
    //     p1.setTip(5);
    //     System.out.println(p1.getTip());
    //    // p1.setColor("yellow");
    //     p1.setColor("yellow");
    //     System.out.println(p1.getColor());

    }
}

class Pen{
    //poperties + function
    private String color;
    private int tip;
    String getColor(){
        return color;
    }
    int getTip(){
        return this.tip;
    }
    void setColor(String newColor){  
        this.color = newColor;
    }
    void setTip(int newTip){
        this.tip = newTip;
}
}