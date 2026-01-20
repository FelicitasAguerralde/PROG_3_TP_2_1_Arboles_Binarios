package Ej_4;

public class Ej_4 {
    //Atributo
    private Node root;
    //Suponemos la estructura de arbol


    public Ej_4(Node root) {
        this.root = null;
    }
    //Metodos
    public Integer getRoot() {
        if (root != null) {
            return root.getValue(); // Regresa el valor solo si root existe
        } else {
            return null; // Indica árbol vacío
        }
    }
    //----------------Add--------------------
    public void add(Integer value) {
        if (this.root == null)
            this.root = new Node(value);
        else
            this.addRecursive(this.root, value);
    }

    private void addRecursive(Node actual, Integer value) {
        if (actual.getValue() > value) {
            if (actual.getLeft() == null) {
                Node temp = new Node(value);
                actual.setLeft(temp);
            } else {
                addRecursive(actual.getLeft(), value);
            }
        } else if (actual.getValue() < value) {
            if (actual.getRight() == null) {
                Node temp = new Node(value);
                actual.setRight(temp);
            } else {
                addRecursive(actual.getRight(), value);
            }
        }
    }
    //Ejercicio 4
    public void cargarValores(){
        if(root ==null){
            cargarRecursiva(root);
        }
    }
    private void cargarRecursiva(Node node){
        if(node.getRight()!=null && node.getLeft()!=null){
            //el nodo se vuelve el valor del nodo derecho menos el valor del nodo izquierdo
            node.setValue(node.getRight().getValue() - node.getLeft().getValue());
        }
        else if(node.getRight()==null || node.getLeft()==null){
            if(node.getRight()==null){
                node.setRight(new Node(0)); // Agregar un hijo derecho con valor 0
            }
            else{
                node.setLeft(new Node(0));  // Agregar un hijo izquierdo con valor 0
            }
            }
        }
    //-------------Is Empty---------------------
    public boolean isEmpty() {
        return this.root == null;
    }

    //---------------InOrder------------
    public void printInOrder() {
        if (!isEmpty())
            this.printInOrder(this.root);
    }

    private void printInOrder(Node node) {
        if (node != null) {
            printInOrder(node.getLeft());
            System.out.println(node.getValue());
            printInOrder(node.getRight());
        }
    }

}

