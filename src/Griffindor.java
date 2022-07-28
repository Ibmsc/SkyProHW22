//Гриффиндор
//благородство(nobility), честь(honor) и храбрость(bravery)
//Гарри Поттер, Гермиона Грейнджер и Рон Уизли
public class Griffindor extends Student {

    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String name, String surname, int powerOfMagic, int distanceTransgression,
                      int nobility,int honor,int bravery)
     {
        super(name, surname, powerOfMagic, distanceTransgression);
        this.bravery = bravery;
        this.honor = honor;
        this.nobility = nobility;
    }
    public int getNobility() {
        return nobility;
    }
    public void setNobility(int nobility) {
        this.nobility = nobility;
    }
    public int getHonor() {
        return honor;
    }
    public void setHonor(int honor) {
        this.honor = honor;
    }
    public int getBravery() {
        return bravery;
    }
    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
}