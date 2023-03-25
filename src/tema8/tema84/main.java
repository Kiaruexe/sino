package tema8.tema84;

public class main {
    public static void main(String[] args) {
        piano piano = new piano();
        piano.add(notas.Do);
        piano.add(notas.Fa);
        piano.add(notas.Mi);
        piano.add(notas.Do);
        piano.add(notas.Sol);
        piano.add(notas.Do);
        piano.add(notas.La);
        piano.add(notas.Si);
        piano.interpretar();

        String [][] tabla = new String [3][3];
        instrumento [] patas = new instrumento[] {new piano(), new piano(), new piano()};
        patas[0] = new piano();


    }

}
