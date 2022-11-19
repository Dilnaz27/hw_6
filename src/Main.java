public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(50);
        boss.wpn.setWeaponType(WeaponType.MAGICAL_WEAPON);
        boss.wpn.setWeaponName(" Stick ");
        System.out.println("Boss health: " + boss.getHealth() + " Boss damage: "
                + boss.getDamage() + " Weapon: " + boss.wpn.getWeaponType() + " " + boss.wpn.getWeaponName());


        System.out.println(boss.printInfo());

        Skeleton skeleton = new Skeleton();
        skeleton.setHealth(200);
        skeleton.setDamage(30);
        skeleton.setNumbersOfArrows(10);
        skeleton.wpn.setWeaponType(WeaponType.FIREARM);
        skeleton.getWpn().setWeaponName(" Gun ");
        System.out.println(skeleton.printInfo());

        Skeleton skeleton1 = new Skeleton();
        skeleton1.setHealth(225);
        skeleton1.setDamage(30);
        skeleton1.setNumbersOfArrows(15);
        skeleton1.wpn.setWeaponType(WeaponType.STEEL_ARM);
        skeleton1.wpn.setWeaponName(" Katana ");
        System.out.println(skeleton1.printInfo());
    }
}