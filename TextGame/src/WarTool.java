public class WarTool
{  private  int Id;
    private int Money;
    private String Name;


    public WarTool(int wId, int wMoney, String wName) {
        this.Id = wId;
        this.Money = wMoney;
        this.Name = wName;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getMoney() {
        return Money;
    }

    public void setMoney(int money) {
        Money = money;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
