package enhörningInheritance.src;

public class Pony extends Horse{

    private String reccomendAgeInfo;

    public Pony(String name, int age2, int price3, String reccomendAgeInfo) {
        super (name, age2);
        this.reccomendAgeInfo = reccomendAgeInfo;
    }
    public String getReccomendAgeInfo() {return reccomendAgeInfo;}
    public void setReccomendAgeInfo(String reccomendAgeInfo) {this.reccomendAgeInfo = reccomendAgeInfo;}
}
