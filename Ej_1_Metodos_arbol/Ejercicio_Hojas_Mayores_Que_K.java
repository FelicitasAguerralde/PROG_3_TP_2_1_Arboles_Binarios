import java.util.ArrayList;
import java.util.List;

public class Ejercicio_Hojas_Mayores_Que_K {

    private Tree tree;
    private List<Integer> resultado;
    private Integer k;

    public Ejercicio_Hojas_Mayores_Que_K(Tree tree, Integer k) {
        this.tree = tree;
        this.k = k;
        this.resultado = new ArrayList<>();
    }

    public List<Integer> hojasMayoresQue() {
        resultado.clear();
        
        if (tree.isEmpty()) {
            return new ArrayList<>();
        }

        hojasRec(tree.getRootNode());
        return resultado;
    }

    private void hojasRec(Node actual) {
        if (actual == null) {
            return;
        }

        // Si es hoja y su valor supera K
        if (actual.getLeft() == null && actual.getRight() == null) {
            if (actual.getValue() > k) {
                resultado.add(actual.getValue());
            }
            return; // no tiene hijos
        }

        hojasRec(actual.getLeft());
        hojasRec(actual.getRight());
    }
}
