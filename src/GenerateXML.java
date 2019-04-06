import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

public class GenerateXML {
    public void generateXML(HashMap<Integer,Department> deps){
        ArrayList<Department> depArray = new ArrayList();
        depArray.addAll(deps.values());
        try {
            DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document doc = builder.newDocument();
            Element rootElement = doc.createElement("div");
            doc.appendChild(rootElement);

            for(int i=0; i<deps.size(); i++) {
                Element trElement = doc.createElement("tr");

                for (int j = 0; j < depArray.get(i).getStaff().getStaffList().size()+2; j++) {
                    rootElement.appendChild(trElement);
                    Element tdElement = doc.createElement("td");
                    trElement.appendChild(tdElement);
                    Element td1Element = doc.createElement("td");
                    trElement.appendChild(td1Element);
                    Element td2Element = doc.createElement("td");
                    trElement.appendChild(td2Element);
                    Element td3Element = doc.createElement("td");
                    trElement.appendChild(td3Element);
                    Element td4Element = doc.createElement("td");
                    trElement.appendChild(td4Element);
                    tdElement.setTextContent(depArray.get(i).getName());

                        switch (j){
                            case 0:
                                td1Element.setTextContent("Директор");
                                td2Element.setTextContent(""+depArray.get(j).getDirector().getExp());
                                td3Element.setTextContent(""+depArray.get(j).getDirector().getSalary());
                                td4Element.setTextContent(depArray.get(j).getDirector().getFio());
                                break;
                            case 1:
                                td1Element.setTextContent("Заместитель");
                                td2Element.setTextContent(""+depArray.get(j).getVice().getExp());
                                td3Element.setTextContent(""+depArray.get(j).getVice().getSalary());
                                td4Element.setTextContent(depArray.get(j).getVice().getFio());
                                break;

//                                for(WhiteCollar whiteCollar :depArray.get(0).getStaff().getStaffList().getClass()){
//
//                                }

                        }

                }
            }
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);

            StreamResult result =  new StreamResult(new File("testing.xml"));
            transformer.transform(source, result);
        } catch (ParserConfigurationException | TransformerException e) {
            e.printStackTrace();
        }
    }
}
