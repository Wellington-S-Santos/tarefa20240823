public class Main {
    public static void main(String[] args) {
        int [] lista1={4,5,6,12,22,41,54};
        int [] lista2={20,29,33,41,12,10};
        int [] listaNova = new int[lista1.length + lista2.length];
        int indiceLista = 0;




            for (int i = 0; i < lista1.length; i++) {
                listaNova[indiceLista] = lista1[i];
                indiceLista++;

            }
            for (int j = 0; j <lista2.length; j++) {
                listaNova[indiceLista] = lista2[j];
                indiceLista++;

            }

            for (int y = 0; y < listaNova.length; y++) {
                System.out.println("Número " +y+": " + listaNova[y]);

            }
    }
}