package OOP.Classes;

public class WrapperExample {
    public static void main(String[] args) {


// At first the Wrapper class intitialisation is down below
        //it works as final keyword too, so the wrapper classes are not able to change their value

        Integer rp = 8;
        Integer rp2 = 15;
        swap(rp,rp2);
        System.out.println(rp + " " + rp2);

        //as same we cannot change the varibales same because they only pass by value
        int a=9;
        int b=19;
        swapnormal(a,b);
        System.out.println(a + " " + b);

        //the final keyword may also not changable as we know
        //it gives an error when we try to do
        //the final varible must be initialised ,since it is not able to change
        final int k=9;
        final String car="bmw";



//when a non premitive is final , you cannot reassign it but you can just change it's value,
// so the final works for the premitive only??
       final A student=new A("Tony stark");
       student.name="Iron Man";



    }

    static void swap(Integer rap,Integer rap2){
        Integer temp=rap;
        rap=rap2;
        rap2=temp;
    }

    static void swapnormal(int a,int b){
        int temp=a;
        a=b;
        b=temp;


    }
}

class A {
    final int j=98;
    String name;

    public A(String name){
        this.name=name;
    }


    //it means when we create new object or reassign the object then the previous one get collected by the
    //garbage colletctor ,so we cannot do it manually but ,every time a object collected bby GC we can specify some tasks to it
    // so it does the thing when garbage colletcting
    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is destroyed");
    }
}
