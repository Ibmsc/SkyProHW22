public class Student {
    private String name;
    private String surname;
    private int powerOfMagic;
    private int distanceTransgression;

    public Student(String name, String surname, int powerOfMagic, int distanceTransgression) {
        this.name = name;
        this.surname = surname;
        this.powerOfMagic = powerOfMagic;
        this.distanceTransgression = distanceTransgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public int getDistanceTransgression() {
        return distanceTransgression;
    }

    public void setDistanceTransgression(int distanceTransgression) {
        this.distanceTransgression = distanceTransgression;
    }


}
