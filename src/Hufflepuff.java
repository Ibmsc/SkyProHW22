//Пуффендуй
//трудолюбивый(hardworking), верность(loyalty), честность(honesty).
//Захария Смит, Седрик Диггори, Джастин Финч-Флетчли.
public class Hufflepuff extends Student {

    private int hardworking;
    private int loyalty;
    private int honesty;
    public Hufflepuff(String name, String surname, int powerOfMagic, int distanceTransgression,
                      int hardworking,int loyalty,int honesty)
    {
        super(name, surname, powerOfMagic, distanceTransgression);
        this.hardworking = hardworking;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
}
