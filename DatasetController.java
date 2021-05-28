import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public class DatasetController {
    DatasetModel Model;
    DatasetView View;

    public DatasetController(DatasetModel model, DatasetView view) {
        Model = model;
        View = view;
    }

    public void setDatasetData(String url) throws SAXException, IOException, ParserConfigurationException {
        Model.SetData(url);
    }

    public void Showcountrydata(String cname){
        RecordModel rm = this.Model.RcsByCountry(cname).get(0);//en gücel veri en yukarı atıldığı için  en sonki veriyi temsil eder.
        View.shownewcases(rm.GetCases());
    }
}