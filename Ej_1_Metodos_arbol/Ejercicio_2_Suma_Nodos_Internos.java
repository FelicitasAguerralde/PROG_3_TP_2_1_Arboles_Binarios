public class Ejercicio_2_Suma_Nodos_Internos {

    private Tree tree;

    public Ejercicio_2_Suma_Nodos_Internos(Tree tree) {
        this.tree = tree;
    }

    public Integer getSumaNodosInternos() {
        if (tree.getRoot() == null) {
            return 0;
        }
        return sumaRec(tree.getRootNode());
    }

    private Integer sumaRec(Node actual) {
        if (actual == null) {
            return 0;
        }

        int suma = 0;

        // Es nodo interno si tiene al menos un hijo
        if (actual.getLeft() != null || actual.getRight() != null) {
            suma += actual.getValue();
        }

        suma += sumaRec(actual.getLeft());
        suma += sumaRec(actual.getRight());

        return suma;
    }
}
