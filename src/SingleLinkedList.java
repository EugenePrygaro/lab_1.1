public class SingleLinkedList
{
    class Node{
        String data;
        Node next;
        public Node(String str){
            data = str;
        }
    }
    private Node first;
    public int size = 0;

    private boolean IsOnlyDigits(String value)
    {
        boolean isOnlyDigits = true;
        for(int i = 0; i < value.length() && isOnlyDigits; i++) {
            if(!Character.isDigit(value.charAt(i))) {
                isOnlyDigits = false;
            }
        }
        return isOnlyDigits;
    }
    public void addFirst(String value){

        if(IsOnlyDigits(value)) {
            Node tmp = new Node(value);
            tmp.next = first;
            first = tmp;
            size++;
        }
        else System.out.println("Only positive integers!");
    }
    public void addLast(String value){

        if(IsOnlyDigits(value)) {
            Node tmp = new Node(value);

            Node current = first;

            if (first == null) {

                first = tmp;

            } else {
                while (current.next != null) {

                    current = current.next;

                }
                current.next = tmp;
            }
            size++;
        }
        else System.out.println("Only positive integers!");
    }
    public boolean Insert(String value, int index){

        if(index<0 || index > size || IsOnlyDigits(value)){

            return false;

        }

        if(index == 0) {

             addFirst(value);
        }

        if(index == size){

            addLast(value);
        }

        Node tmp = new Node(value);
        Node cur = first;

        for (int i = 1; i < index; i++) {

            cur = cur.next;

        }
        tmp.next = cur.next;
        cur.next = tmp;
        size++;
        return true;

    }
    public String deleteFirst(){
        if(first != null){
            String tmp = first.data;
            first = first.next;
            size--;
            return tmp;
        }
        else
            return null;
    }
    public String deleteLast(){
        if(first != null){
            Node cur = first;

            if(first.next==null)
                return deleteFirst();

            while(cur.next.next!= null)
                cur = cur.next;

            String tmp = cur.next.data;
            cur.next = null;
            size--;
            return tmp;
        }
        else
            return null;
    }
    public String deleteByIndex(int index){

        if(index < 0 || index >= size)
            return null;

        if(index==0){return deleteFirst();}

        if(index == size-1){return deleteLast();}

        Node cur = first;

        for(int i = 0; i < index-1; i++)
            cur = cur.next;

        String tmp = cur.next.data;//25
        cur.next = cur.next.next;
        size--;
        return tmp;
    }
    public void Show(){
        if(first == null) System.out.println("List is empty");
        else
        {
            Node cur = first;
            do
            {
                System.out.println(cur.data);
                cur = cur.next;
            }
            while(cur != null);
        }
    }
}
