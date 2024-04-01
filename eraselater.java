
public class eraselater {

    public static void main(String[] args) {
        // Test the List class implementation
        
        // Create a new list
        List list = new List();

        // Add some characters to the list
        list.addFirst('c');
        list.addFirst('o');
        list.addFirst('m');
        list.update('m');
        list.addFirst('i');
        list.addFirst('t');
        list.update('t');
        list.addFirst('e');
        list.update('e');
        list.addFirst('_');

        // Print the size of the list
        System.out.println("Size of the list: " + list.getSize());

        // Print the first element of the list
        System.out.println("First element of the list: " + list.getFirst());

        // Print the list as a string
        System.out.println("List as string: " + list.toString());

        // Get the index of a character in the list
        char searchChar = 'm';
        int index = list.indexOf(searchChar);
        if (index != -1) {
            System.out.println("Index of '" + searchChar + "' in the list: " + index);
        } else {
            System.out.println("'" + searchChar + "' not found in the list.");
        }

        // Test removing a character from the list
        char removeChar = 'i';
        boolean removed = list.remove(removeChar);
        if (removed) {
            System.out.println("'" + removeChar + "' removed from the list.");
            System.out.println("Updated list: " + list.toString());
        } else {
            System.out.println("'" + removeChar + "' not found in the list.");
        }

        // Test getting an element by index
        int getIndex = 2;
        CharData element = list.get(getIndex);
        if (element != null) {
            System.out.println("Element at index " + getIndex + ": " + element);
        } else {
            System.out.println("Invalid index or element not found.");
        }

        // Test converting the list to an array
        CharData[] array = list.toArray();
        System.out.println("Array representation of the list:");
        for (CharData item : array) {
            System.out.print(item + " ");
        }
        System.out.println();

        // Test creating an iterator
        ListIterator iterator = list.listIterator(2);
        if (iterator != null) {
            System.out.println("List elements from index 2 using iterator:");
            while (iterator.hasNext()) {
                System.out.print(iterator.next() + " ");
            }
            System.out.println();
        } else {
            System.out.println("List is empty, cannot create iterator.");
        }
    }
}