package techmasterstudent.entities;

public abstract class TechMasterStudent {
    private String fullName;
    private String major;

    public TechMasterStudent(String fullName, String major) {
        this.fullName = fullName;
        this.major = major;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public abstract double getPoint();
    public String classify(){
        if(getPoint() <5){
            return "Yếu";
        }
        else if(5<= getPoint()&& getPoint()<6.5){
            return "Trung bình";

        }
        else if( 6.5 <= getPoint() && getPoint() <7.5){
            return "Khá";
        }
        else return "Giỏi";
    }

    /*public void printInfo(){
        System.out.println("Họ tên:" + fullName);
        System.out.println("Ngành:" + major);
        System.out.println("Điểm:"+ getPoint());
        System.out.println("Học lực:" + classify());
    }*/






}
