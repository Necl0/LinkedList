public class Client {
    public static void main(String[] args) {
        JosiahLinkedList list = new JosiahLinkedList();

        // Adding elements to the list
        list.addFront(10);
        list.addFront(20);
        list.addFront(30);
        list.addFront(40);

        System.out.println("Initial List:");
        System.out.println(list);

        System.out.println(list.size());

        System.out.println(list.get(2));

        System.out.println(list.set(1, 50));
        System.out.println(list);

        list.add(2, 60);
        System.out.println(list);

        list.removeFront();
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        int index = list.indexOf(30);
        System.out.println(index);

        System.out.println(list.isEmpty());

        list.remove(40);
        System.out.println(list);

        System.out.println(list.isEmpty());
    }
}
