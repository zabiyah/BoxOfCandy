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
        
        Candy[][]box1 = new Candy[3][5]; // test case 
        box1[0][0] = new Candy("lime");
        box1 [0][1] = new Candy("lime");
        box1 [0][3] = new Candy("lemon");
        box1 [1][0] = new Candy("orange");
        box1 [1][3] = new Candy("lime");
        box1 [1][4] = new Candy("lime");
        box1[2][0] = new Candy("cherry");
        box1[2][2] = new Candy("lemon");
        box1[0][4] = new Candy("orange");
        BoxOfCandy a = new BoxOfCandy(box1);
        System.out.println(a.removeNextByFlavor("cherry"));
        System.out.println(a);
        System.out.println(a.removeNextByFlavor("lime"));
        System.out.println(a);
        System.out.println(a.removeNextByFlavor("grape"));
        System.out.println(a);
    }
}