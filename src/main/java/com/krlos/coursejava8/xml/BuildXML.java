package com.krlos.coursejava8.xml;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class BuildXML {
public static void main (String [] args){
    File fichero = new File("test.txt");
    File fichero2 = new File(fichero.getAbsolutePath());
    System.out.println("El directorio padre del fichero es " + fichero2.getParent(

    ));
}
/*
    public static void main (String [] args){
        Map<String, String> stringStringMap = new HashMap<>();
        stringStringMap.put("value", "RFTR^&");
        stringStringMap.put("name", "carlos");
        stringStringMap.put("dob", "89-98-09");
        stringStringMap.put("tube", "RFTR^&");
        try {

            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            // elemento raiz
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("compania");
            doc.appendChild(rootElement);

            // empleado
            Element empleado = doc.createElement("empleado");
            stringStringMap.forEach((k, v) -> empleado.setAttribute(k, v));
            rootElement.appendChild(empleado);


            // atributo del elemento empleado
            Attr attr = doc.createAttribute("id");
            attr.setValue("1");
            empleado.setAttributeNode(attr);

            // nombre
            Element nombre = doc.createElement("nombre");
            nombre.appendChild(doc.createTextNode("Manuel"));
            empleado.appendChild(nombre);

            // apellidos
            Element apellidos = doc.createElement("appellidos");
            apellidos.appendChild(doc.createTextNode("Gonzalez"));
            empleado.appendChild(apellidos);

            // seccion
            Element seccion = doc.createElement("seccion");
            seccion.appendChild(doc.createTextNode("almacen"));
            empleado.appendChild(seccion);

            // salario
            Element salario = doc.createElement("salario");
            salario.appendChild(doc.createTextNode("1000"));
            empleado.appendChild(salario);

            // escribimos el contenido en un archivo .xml
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("/Users/krlos/Documents/DYMO Label Software/barcode.xml"));
            //StreamResult result = new StreamResult(new File("archivo.xml"));

            // Si se quiere mostrar por la consola...
            // StreamResult result = new StreamResult(System.out);

            transformer.transform(source, result);

            System.out.println("File saved!");

        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        }
    }
*/
}
