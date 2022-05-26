import java.util.Iterator;

public class SuperList extends ListManager {


    @Override
    public void addElement(Object element) {
        list.add(element);
    }

    @Override
    public Object removeElement(int position) {
        Object elemento = list.remove(position);
        return elemento;
    }
    @Override
    public void showElements() {
        Iterator<Object> it = list.iterator() ;
        while (it.hasNext()) {
            Object valor = it.next() ;
            System.out.println(valor) ;
        }
    }

    @Override
    public void showReversedElements() {
        for (int i = list.size(); i >= list.size() ; i--) {
                Object valor = list.get(i);
                System.out.println(valor);
            }
        }
    }
}
