package techmasterstudent.entities;

public class BizStudent extends TechMasterStudent {
    private double marketingScore;
    private double salesScore;



    public BizStudent(String fullName, String major, double marketingScore, double salesScore) {
        super(fullName, major);
        this.marketingScore = marketingScore;
        this.salesScore = salesScore;
    }

    @Override
    public double getPoint() {
        return Math.round(((2*marketingScore + salesScore) /3)*100.0) / 100.0;
    }

    @Override
    public String toString() {
        return "BizStudent{" +"\t"+
                "name:" + getFullName() +"\t"+
                "major:" + getMajor() +"\t"+
                "marketingScore=" + marketingScore +"\t"+
                "salesScore=" + salesScore +"\t"+
                "Average Score=" + getPoint()+"\t"+
                "Classify:" + classify()+
                '}';
    }
}
