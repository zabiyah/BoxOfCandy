public class Main{
    public static void main(String[]args){
        Candy[][]box = new Candy[4][3];
        box[0][1] = new Candy("lime");
        box [1][1] = new Candy("orange");
        box[2][2] = new Candy("cherry");
        box[3][1] = new Candy("lemon");
        box[3][2] = new Candy("grape");
        System.out.println(box);
        BoxOfCandy b = new BoxOfCandy(box);
        System.out.println(b);
    }
}