public class ToolStore extends NormalLoc{
    Weapon weapon;
    public ToolStore(Player player) {
        super(player, "Mağaza");


    }
    public boolean getLocation()
    {

        System.out.println("Para : " + player.getMoney());
        System.out.println("1. Silahlar");
        System.out.println("2. Zırhlar");
        System.out.println("3. Çıkış");
        System.out.print("Seçiminiz : ");
        int selTool = scan.nextInt();
        int selItemID;
        switch (selTool) {
            case 1:
                Weapon.weaponMenu(this.player);
                break;
            case 2:
                System.out.println("zırhlar ");
                break;
            default:
                break;
        }

        return true;
    }


    // initWeapon

    //initArmor

}
