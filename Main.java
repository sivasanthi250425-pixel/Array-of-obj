 public class Main{
    public static void main(String[] args) {
        car c1=new car("BMW","Black");
        car c2=new car("tesla","Black");
        car[] c ={c1,c2};
        for(int i=0;i<c.length;i++){
            c[i].drive();
        }

    }
}
 class car {
    String model;
    String color;
    car(String model,String color){
        this.model=model;
        this.color=color;

    }
    void drive(){
        System.out.println("you drive the"+this.model+this.color);
    }
}

