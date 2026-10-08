public class objectcreation{
    int x=20;
    int y=30;
    public static void main(String[] args){
        objectcreation obj=new objectcreation();
        objectcreation obj1=new objectcreation();
        System.out.println(obj.x);//single object is created for a class and the instance variable can be accessed using the object reference.
        System.out.println(obj1.y);
        System.out.println(obj.x+obj1.y);
        //multiple objects can be created for a class and each object will have its own copy of instance variables.

    }
}