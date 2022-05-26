public class Main {

    public static void main(String[] args) {
      SuperList lista = new SuperList();
      lista.addElement(1);
      lista.addElement(2);
      lista.addElement(3);
      lista.addElement(4);

      lista.removeElement(3);

      lista.showElements();

      lista.showReversedElements();
      System.out.println("\n" + lista + "\n");

    }
}
