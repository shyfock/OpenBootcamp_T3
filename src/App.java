package Ejercicio_3.src;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(sumar(10, 20, 30));

        Coche miCoche = new Coche(4);
        miCoche.addPuerta(1);

        System.out.println(miCoche.getNum_puertas());
    }

    /**
     * sumar
     */
    public static Integer sumar(int a, int b, int c) {
        return a + b + c;

    }
}

/**
 * Coche
 */
class Coche {
    public Coche(Integer num_puertas) {
        this.num_puertas = num_puertas;
    }

    public Integer getNum_puertas() {
        return num_puertas;
    }

    public void setNum_puertas(Integer num_puertas) {
        this.num_puertas = num_puertas;
    }

    Integer num_puertas = 0;

    public void addPuerta(int puerta) {
        num_puertas += 1;

    }

}
