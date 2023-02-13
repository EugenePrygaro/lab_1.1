public class Main {
    public static void main(String[] args) {
        // Part I
        Stack stack = new Stack(4);
        for (int i = 0; i < 4; i++) {
            stack.Add(i);
        }
        System.out.println("----Filled stack----");
        stack.Show();
        System.out.println();
        stack.Remove();
        stack.Remove();
        System.out.println("----Removing elements----");
        stack.Show();
        System.out.println();
        System.out.println();

        // Part II
        var slist = new SingleLinkedList();
        for (int i = 1; i <= 10; i++) {
            slist.addLast(Integer.toString(i));
        }
        System.out.println("----Filled single linked list----");
        slist.Show();
        System.out.println();
        System.out.println("----Removing first element----");
        slist.deleteFirst();
        slist.Show();
        System.out.println();
        System.out.println("----Removing element at index 2----");
        slist.deleteByIndex(2);
        slist.Show();
        System.out.println();
        System.out.println();

        // Part II

        Stack st = new Stack(10);
        SingleLinkedList sLinkList = new SingleLinkedList();

        sLinkList.addLast("14");
        sLinkList.addLast("13");
        sLinkList.addLast("1");
        sLinkList.addLast("4");
        sLinkList.addLast("5");
        sLinkList.addLast("3");
        sLinkList.addLast("8");
        System.out.println("----List----");
        sLinkList.Show();
        int num = 0;
        int temp = 0;
        boolean isPrime = true;
        for (int i = 0; i < 7; i++) {
            num = Integer.parseInt(sLinkList.deleteLast());
            isPrime = true;
            for (int j = 2; j <= num / 2; j++) {
                temp = num % j;
                if (temp == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) st.Add(num);
        }
        System.out.println();
        System.out.println("----Stack----");
        st.Show();
    }

}