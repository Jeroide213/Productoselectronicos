class Fonos {
    String modelo;
    int anio;
    float almacenamiento;
    double procesador;
    int ram;


    public Fonos(String modelo,int anio, float almacenamiento, double procesador, int ram){
        this.modelo = modelo;
        this.anio = anio;
        this.almacenamiento = almacenamiento;
        this.procesador = procesador;
        this.ram = ram;
    }
    public void mostrarfonos(){
        if (anio >= 2014 && anio <= 2022){
            System.out.println("Este producto tiene 6 cuotas sin interes.");
        }
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
        System.out.println("Gb: " + almacenamiento);
        System.out.println("Procesador: " + procesador);
        System.out.println("Ram: " + ram);
    }
}
class Celulares extends Fonos{
    Double camara;
    public Celulares(String modelo, int anio, float almacenamiento, double procesador, int ram){
        super(modelo,anio,almacenamiento,procesador,ram);
        this.camara = camara;
    }
}
class Tablets extends Fonos {
    double pulgadas;

    public Tablets(String modelo, int anio, float almacenamiento, double procesador, int ram, double pulgadas) {
        super(modelo, anio, almacenamiento, procesador, ram);
        this.pulgadas = pulgadas;
    }
}
public class Main{
    public static void main(String[] args){
        Celulares Celular1 = new Celulares("J7", 2017, 128, 3.6, 8);
        Tablets Tablet1 = new Tablets("Tab 3", 2014, 36, 2.6, 4, 10.5);
        Celulares Celular2 = new Celulares("Note 10 Plus", 2019, 256, 3.6, 12);
        Tablets Tablet2 = new Tablets("Tab A7", 2023, 32, 2.0, 3, 8.7);
        Fonos[] inventario = {Celular1, Celular2, Tablet1, Tablet2};
        for (Fonos productos : inventario){
            productos.mostrarfonos();
            System.out.println();
        }
    }
}