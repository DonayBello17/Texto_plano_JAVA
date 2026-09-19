import java.util.ArrayList;
import java.util.Iterator;

public class ListaProductos {
    public static void main(String[] args) {
        ArrayList<String> productos = new ArrayList<>();
        productos.add("Pan");
        productos.add("Leche");
        productos.add("Queso");
        Iterator<String> it = productos.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
