
package clientwsperiodictable;

import java.io.File;
import java.util.Scanner;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;


public class ClientWSPeriodicTable {

    
    public static void main(String[] args) throws Exception {
        Serializer serializer = new Persister();
        element elemento = new element();
        File source = new File(elemento.getElmentSymbol());
        element element = serializer.read(element.class, source);
        
        System.out.println("Símbolo:" + element.getElmentSymbol());
        
        /*Scanner entrada = new Scanner(System.in);
        System.out.println("Elige un elemento de la tabla periódica: ");
        String elemento = entrada.next();
        
        System.out.println("Seleccionar función deseada:\n1.Número atómico\n2.Peso atómico\n3.Átomos\n4.Símbolo del elemento");
        int select = entrada.nextInt();
        
        switch (select){
            case 1: System.out.println(getAtomicNumber(elemento));
                break;
            case 2: System.out.println(getAtomicWeight(elemento));
                break;
            case 3: System.out.println(getAtoms());
                break;
            case 4: System.out.println(getElementSymbol(elemento));
                break;
        }
        */
        
    }

    private static String getElementSymbol(java.lang.String elementName) {
        net.webservicex.Periodictable service = new net.webservicex.Periodictable();
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getElementSymbol(elementName);
    }

    private static String getAtoms() {
        net.webservicex.Periodictable service = new net.webservicex.Periodictable();
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getAtoms();
    }

    private static String getAtomicWeight(java.lang.String elementName) {
        net.webservicex.Periodictable service = new net.webservicex.Periodictable();
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getAtomicWeight(elementName);
    }

    private static String getAtomicNumber(java.lang.String elementName) {
        net.webservicex.Periodictable service = new net.webservicex.Periodictable();
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getAtomicNumber(elementName);
    }
    
}
