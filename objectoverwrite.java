public class objectoverwrite {//to overwrite we use final keyword
    int x=10;//if we use final we will get error final int x=10
    int y=20;
    public static void main(String[] args){
        objectoverwrite myobj=new objectoverwrite();
        myobj.x=50;
        myobj.y=60;
        System.out.println(myobj.x);
        System.out.println(myobj.y);

    }
    
}
