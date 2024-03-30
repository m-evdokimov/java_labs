package src.lab3;


class LinkedList {
    Node head = null;
    Node tail = null;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void createHead(int[] values) {
        for (int value: values) {
            Node newNode = new Node(value, null);
            if (tail == null) {
                head = newNode;
            } else {
                tail.next = newNode;
            }
            tail = newNode;
        }
    }

    public void createTail (int[] values) {
        for (int value: values) {
            Node newNode = new Node(value, null);
            if (tail == null) {
                head = newNode;
            } else {
                tail.next = newNode;
            }
            tail = newNode;
        }
    }

    public String toString() {
        String s = "";
        Node curr = head;
        while (curr != null) {
            s += (curr.value + " ");
            curr = curr.next;
        }
        return s;
    }

    public void AddFirst(int value) {
        head = new Node(value, head);
    }
    public void AddLast(int value) {
        Node newTail = new Node(value, null);
        if (head == null) {
            head = newTail;
            return;
        }
        Node ref = head;
        while (ref.next != null) {
            ref = ref.next;
        }
        ref.next = newTail;
    }

    public void Insert(int value, int index) {
        if (index == 0) {
            head = new Node(value, head);
            return;
        }
        Node newNode = new Node(value, null);
        Node ref = head;
        int k = 1;
        while (ref.next != null && (k < index)) {
            ref = ref.next;
            k++;
        }
        newNode.next = ref.next;
        ref.next = newNode;
    }

    public void RemoveFirst() {
        head = head.next;
    }
    public void RemoveLast() {
        Node ref = head;
        while (ref.next.next != null) {
            ref = ref.next;
        }
        ref.next = null;
    }

    public void Remove(int index) {
        Node ref = head;
        int k = 1;
        while (ref.next != null && (k < index)) {
            ref = ref.next;
            k++;
        }
        ref.next = ref.next.next;
    }

    public void createHeadRec(int[] values, int valuesLength) {
        if (valuesLength > 1) {
            createHeadRec(values, valuesLength - 1);
        }
        AddFirst(values[valuesLength - 1]);
    }

    public void createTailRec(int[] values, int valuesLength) {
        if (valuesLength > 1) {
            createTailRec(values, valuesLength - 1);
        }
        AddFirst(values[valuesLength - 1]);
    }

    public String toStringRec(Node curr) {
        if (curr.next == null) {
            return "" + curr.value;
        } else {
            return curr.value + " " + toStringRec(curr.next);
        }
    }
}

public class Task8 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        LinkedList listHead = new LinkedList();
        listHead.createHead(array);
        System.out.println("Заполняем с головы: " + listHead.toString());

        LinkedList listTail = new LinkedList();
        listTail.createTail(array);
        System.out.println("Заполняем с хвоста: " + listTail.toString());

        listTail.AddFirst(0);
        listTail.AddLast(6);
        System.out.println("Добавляем 0 в начало, 6 в конец: " + listTail.toString());
        
        listTail.Insert(7, 4);
        System.out.println("Добавляем 7 в ячейку с индексом 4: " + listTail.toString());

        listTail.RemoveFirst();
        listTail.RemoveLast();
        System.out.println("Удаляем первый и последний элементы: " + listTail.toString());
        
        listTail.Remove(1);
        System.out.println("Удаляем элемент с индексом 1: " + listTail.toString());
        
        
        LinkedList listHeadRec = new LinkedList();
        listHeadRec.createHeadRec(array, array.length);
        System.out.println("\nЗаполняем с головы рекурсивно: " + listHeadRec.toStringRec(listHeadRec.head));
        LinkedList listTailRec = new LinkedList();
        listTailRec.createTailRec(array, array.length);
        System.out.println("Заполняем с хвоста рекурсивно: " + listTailRec.toStringRec(listTailRec.head));
    }
}