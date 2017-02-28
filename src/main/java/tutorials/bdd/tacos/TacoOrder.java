package tutorials.bdd.tacos;

/**
 * Created by erikwilliams on 1/23/17.
 */
public class TacoOrder {
    private int totalTacos;
    private int hardShellCount;
    private int softShellCount;
    public void setTotalTacos(Integer taco){
        this.totalTacos = taco;
    }

    public int getTotalNumberOfTacos(){
        return totalTacos;
    }

    public void setShellTypes(int soft, int hard) {
        totalTacos=soft+hard;
        hardShellCount=hard;
        softShellCount=soft;
        softShellCount=soft;

    }

    public int getHardShellCount(){
        return  hardShellCount;
    }

    public int getSoftShellCount(){
        return softShellCount;
    }

}
