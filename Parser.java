import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.io.*;
import java.net.URL;
import java.util.ArrayList;

public class Parser {


    public static ArrayList<RecordModel> GetData(String urlstring) throws SAXException, IOException, ParserConfigurationException {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        URL url = new URL(urlstring);
        Document document = builder.parse(url.openStream());

        document.getDocumentElement().normalize();

        Element root = document.getDocumentElement();
        System.out.println(root.getNodeName());
        ArrayList<RecordModel> rlist = new ArrayList<RecordModel>();
        NodeList list = document.getElementsByTagName("record");
        for (int i = 0; i < list.getLength(); i++) {
            Node record = list.item(i);
            Element el = (Element) record;
            RecordModel r = new RecordModel();
            try {
                
                r.SetCountry(el.getElementsByTagName("countriesAndTerritories").item(0).getTextContent());
                
            } catch (Exception e) {
                continue;
            }
            r.SetContinent(el.getElementsByTagName("continentExp").item(0).getTextContent());
                r.Setpop(Integer.parseInt(el.getElementsByTagName("popData2018").item(0).getTextContent()));
                r.Setcases(Integer.parseInt(el.getElementsByTagName("cases").item(0).getTextContent()));
                r.SetDeaths(Integer.parseInt(el.getElementsByTagName("deaths").item(0).getTextContent()));//Parantez içindeki stringleri,
                // hocanın ödevi anlatmak için verdiği pdf de "Extracting Data from EU Open Data Portal" altında bulabilirsiniz.
                //r.SetDate(); Ters çevirme yapılması gerekiyordu
                rlist.add(r);
        }
        return rlist;
    }
}