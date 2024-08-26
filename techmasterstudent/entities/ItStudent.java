package techmasterstudent.entities;

public class ItStudent extends TechMasterStudent {
    private double javaScore;
    private double htmlScore;
    private double cssScore;


    public ItStudent(String fullName, String major, double javaScore, double htmlScore, double cssScore) {
        super(fullName, major);
        this.javaScore = javaScore;
        this.htmlScore = htmlScore;
        this.cssScore = cssScore;
    }

    @Override
    public double getPoint() {
        return Math.round(((2*javaScore + htmlScore + cssScore)/4)*100.0) / 100.0;
    }

    @Override
    public String toString() {
        return "ItStudent{" +"\t"+
                "name:" + getFullName() +"\t"+
                "major:" + getMajor() +"\t"+
                "javaScore=" + javaScore +
                ", htmlScore=" + htmlScore +
                ", cssScore=" + cssScore +
                "Average Score=" + getPoint()+"\t"+
                "Classify:" + classify()+
                '}';
    }
}
