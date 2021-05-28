import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;


public class DatasetModel {
    private ArrayList<RecordModel> DataList;

    public void SetData(String url) throws SAXException, IOException, ParserConfigurationException {
        DataList = Parser.GetData(url);
    }

    public ArrayList<String> AllCntrName(){//bu fonksiyonu Bütün ülkelerin ismini listelerken kullan
        ArrayList<String> list = new ArrayList<>();
        for (RecordModel rm : DataList){
            if(!list.contains(rm.GetCountry())){
                list.add(rm.GetCountry());
            }
        }
        return list;
    }

    public ArrayList<RecordModel> RcsByCountry(String cname){//Bu fonksiyon adı girilen ülkenin recordlarını döndürür.
        ArrayList<RecordModel> list = new ArrayList<>();
        for (RecordModel rm : DataList){
            if(rm.GetCountry() == cname){
                list.add(rm);
            }
        }
        return list;
    }
}