package Tienda;

public class MainInventario {
    public static void main(String[] args) {

        Producto productoUno = new Producto();
        productoUno.nombre = "Teclado Magnetico";
        productoUno.codigo = "P-001";
        productoUno.precio = 100000;
        productoUno.stock = 10;

        productoUno.venderUnidades(2);
        productoUno.reponerStock(7);
        productoUno.actualizarPrecio(90000);
        productoUno.mostrarFicha();

        System.out.println();
        System.out.println("----------------------------");
        System.out.println();

        Producto productoDos = new Producto();
        productoDos.nombre = "Mouse Logitech";
        productoDos.codigo = "P-002";
        productoDos.precio = 60000;
        productoDos.stock = 40;

        productoDos.venderUnidades(7);
        productoDos.reponerStock(30);
        productoDos.actualizarPrecio(65000);
        productoDos.mostrarFicha();

        System.out.println();
        System.out.println("----------------------------");
        System.out.println();

        Producto productoTres = new Producto();
        productoTres.nombre = "Gabinete";
        productoTres.codigo = "P-003";
        productoTres.precio = 25000;
        productoTres.stock = 25;

        productoTres.venderUnidades(1);
        productoTres.reponerStock(10);
        productoTres.actualizarPrecio(20000);
        productoTres.mostrarFicha();

        System.out.println();
        System.out.println("----------------------------");
        System.out.println();

        System.out.println("el atributo stock del productoUno tiene: " + productoUno.stock);
        Producto copia = productoUno;
        System.out.println("el atributo stock de copia tiene: " + copia.stock);
        copia.reponerStock(10);
        System.out.println("ahora copia tiene un stock de: " + copia.stock);
        System.out.println("y productoUno tambien tiene: " + productoUno.stock + " en su stock");
    }
}
