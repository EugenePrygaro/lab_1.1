import java.io.Console;

public class Stack
{
        private Integer [] vect;
        private int last;
        public Stack (int size){
            vect = new Integer[size];
            last = -1;
        }
        boolean isEmpty(){
            return (last == -1);
        }
        boolean isFull(){
            return (last == vect.length-1);
        }
    public boolean Add(int value){
        if(isFull()){
            return false;
        }
        vect [last+1] = value;
        last++;
        return true;
    }

    public Integer Remove () {

        if(isEmpty()) {
            return null;
        }
        int temp = vect[last];
        vect[last--] = null;
        return temp;
    }
    public void Show(){
        if(!isEmpty())
            for (Object i:vect)
            {
                if(i != null)
                System.out.print(i + " ");
            }
        else
            System.out.println("Is Empty!");
    }
}
