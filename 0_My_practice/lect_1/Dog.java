public class Dog {
    public int size;
    public Dog(int size) {
        this.size = size;
    }
    public void bark(){
        if(size <= 10){
            System.out.println("awawawawaw");

        } else if (size <= 30) {
            System.out.println("bark, bark!");
            
        }else {
            System.out.println("woof!");
        }
    }
}
