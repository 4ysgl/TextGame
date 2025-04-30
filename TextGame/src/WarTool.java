public class WarTool
{  private  int wId;
    private int wMoney;
    private String wName;


    public WarTool(int wId, int wMoney, String wName) {
        this.wId = wId;
        this.wMoney = wMoney;
        this.wName = wName;
    }

    public int getwId() {
        return wId;
    }

    public void setwId(int wId) {
        this.wId = wId;
    }

    public int getwMoney() {
        return wMoney;
    }

    public void setwMoney(int wMoney) {
        this.wMoney = wMoney;
    }

    public String getwName() {
        return wName;
    }

    public void setwName(String wName) {
        this.wName = wName;
    }
}
