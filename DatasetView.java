
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import java.io.IOException;

public class DatasetView {


    public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
        DatasetModel dataset = new DatasetModel();
        DatasetView viewer = new DatasetView();
        DatasetController controller = new DatasetController(dataset, viewer);
        controller.setDatasetData("https://opendata.ecdc.europa.eu/covid19/casedistribution/xml/");
        controller.Showcountrydata("Turkey");
    }

    public void shownewcases(int cases){
        System.out.println(cases);
    }


}