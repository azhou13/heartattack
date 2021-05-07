public class Patient {
    private int age;
    private int sex;
    private int cp;
    private int trestbps;
    private int chol;
    private int fbs;
    private int restecg;
    private int thalach;
    private int exang;
    private double oldpeak;
    
    public Patient(int theAge, int theSex, int theChol) {
        age = theAge;
        sex = theSex;
        chol = theChol;
    }
    
    public int getAge() {
        return age;
    }
    
    public int getSex() {
        return sex;
    }
    
    public int getChol() {
        return chol;
    }
}