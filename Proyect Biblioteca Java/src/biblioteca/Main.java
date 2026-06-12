package biblioteca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<RecursoBibliografico> biblioteca = new ArrayList<>();

        biblioteca.add(new LibroElectronico("Cien años de soledad", "Gabriel Garcia Marquez", 1967, "ePub", 2.80, 471, false));
        biblioteca.add(new LibroElectronico("Hamlet", "William Shakespeare", 1603, "PDF", 1.50, 289, false));
        biblioteca.add(new LibroElectronico("Satanas", "Mario Mendoza", 2002, "PDF", 3.10, 280, true));
        biblioteca.add(new RecursoDigital("Guia de programacion en Java", "Equipo Tecnologia", 2021, "PDF", 6.45));
        biblioteca.add(new RecursoDigital("Manual de bases de datos", "Departamento de Sistemas", 2023, "HTML", 9.20));

        System.out.println("Resumenes de libros de la biblioteca:");
        biblioteca.forEach(recurso -> System.out.println("- " + recurso.obtenerResumen()));

        Optional<LibroElectronico> libroMasAntiguo = buscarLibroElectronicoMasAntiguo(biblioteca);

        System.out.println("\nLibro electronico más antiguo:");
        libroMasAntiguo.ifPresentOrElse(
                libro -> System.out.println(libro.obtenerResumen()),
                () -> System.out.println("No se encontraron libros electronicos en la biblioteca.")
        );
    }
    public static Optional<LibroElectronico> buscarLibroElectronicoMasAntiguo(List<RecursoBibliografico> biblioteca) {
        return biblioteca.stream()
                .filter(recurso -> recurso instanceof LibroElectronico)
                .map(recurso -> (LibroElectronico) recurso)
                .min(Comparator.comparingInt(LibroElectronico::getAnioPublicacion));
    }
}
