public class LinkedList {
    Node head;

    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    public static LinkedList insert(LinkedList list,int data){
        Node new_node = new Node(data);
        new_node.next = null;


        if(list.head == null){
            list.head = new_node;
        }
        else{
            Node current = list.head;
            while (current.next!= null){
                current = current.next;
            }
            current.next = new_node;
        }
        return list;
    }

    public static void display(LinkedList list){
        Node currentNode = list.head;
        if(currentNode == null){
            System.out.println("List is Empty");
        }
        else{
            while(currentNode!=  null){
                System.out.print(currentNode.data+ " -> ");
                currentNode = currentNode.next;
            }

        }
    }


    public static LinkedList delete(LinkedList list,int key){
        Node currentNode = list.head;
        Node prev= null;

        if (currentNode != null && currentNode.data == key){
            list.head = currentNode.next;
            System.out.println(key + " found and deleted");
            // Return the updated List
            return list;
        }

        while(currentNode!=null && currentNode.data != key){
            prev = currentNode;
            currentNode = currentNode.next;
        }
        if(currentNode!= null){
            prev.next = currentNode.next;
            System.out.println(key + " found and deleted");
        }
        if (currentNode == null) {
            // Display the message
            System.out.println(key + " not found");
        }
        return list;
    }

    public static void main(String[] args)
    {
        /* Start with the empty list. */
        LinkedList list = new LinkedList();
        // ******INSERTION******


        // Insert the values
        insert(list, 1);
         insert(list, 2);
         insert(list, 3);
       insert(list, 4);
        insert(list, 5);
         insert(list, 6);
        insert(list, 7);


        // Print the LinkedList
        display(list);

        //
        // ******DELETION BY KEY******
        //

        // Delete node with value 1
        // In this case the key is ***at head***
        delete(list, 1);

        // Print the LinkedList
        display(list);

        // Delete node with value 4
        // In this case the key is present ***in the
        // middle***
        delete(list, 4);

        // Print the LinkedList
        display(list);

        // Delete node with value 10
        // In this case the key is ***not present***
        delete(list, 10);

        // Print the LinkedList
        display(list);
    }
}
//