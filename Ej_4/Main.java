package Ej_4;

public class Main {
    public static void main(String[] args) {
        // Create an empty binary search tree
        Ej_4 tree = new Ej_4(null);

        // Add some sample values
        tree.add(10);
        tree.add(5);
        tree.add(7);
        tree.add(2);

        // Print the tree before processing
        System.out.println("Tree before processing:");
        tree.printInOrder(); // Assuming you have a printInOrder method

        // Call the method to process the tree and assign values to internal nodes
        tree.cargarValores();

        // Print the tree after processing
        System.out.println("\nTree after processing:");
        tree.printInOrder();
    }
}
