public class Boss extends GameEntity {
    Weapon wpn = new Weapon();


    public Weapon getWpn() {
        return wpn;
    }

    public void setWpn(Weapon wpn) {
        this.wpn = wpn;
    }

    public String printInfo() {
        return "HEALTH: " + getHealth() + " DAMAGE: "
                + getDamage() + " WEAPON:" + " "+ wpn.getWeaponType() + wpn.getWeaponName()  ;
    }
}
