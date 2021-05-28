import java.time.LocalDate;


public class RecordModel {
    private LocalDate Date;
    private int cases;
    private int deaths;
    private String count;
    private String cont;
    private int pop;

    public LocalDate GetDate(){
        return this.Date;
    }
    public int GetPop(){
        return pop;
    }
    public int GetCases(){
        return this.cases;
    }
    public int GetDeaths(){
        return this.deaths;
    }
    public String GetCountry(){
        return this.count;
    }
    public String GetCont(){
        return this.cont;
    }

    public void SetDate(LocalDate Date){
        this.Date = Date;
    }
    public void Setcases(int Cases){
        this.cases = Cases;
    }
    public void SetDeaths(int deaths){
        this.deaths = deaths;
    }
    public void SetCountry(String cntr){
        this.count = cntr;
    }
    public void SetContinent(String cont){
        this.cont = cont;
    }
    public void Setpop(int pop){
        this.pop = pop;
    }
}