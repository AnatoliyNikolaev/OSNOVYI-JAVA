import weapon.Weapon;

class Player {

    private Weapon[] weaponSlots;


    public Player() {

        weaponSlots = new Weapon[]{
                new weapon.BigGun(),
                new weapon.Machine(),
                new weapon.RPG(),
                new weapon.Slingshot(),
                new weapon.WaterPistol(),
        };
    }

    public int getSlotsCount() {

        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        if (slot > weaponSlots.length) throw new IllegalArgumentException("Out of range");
        Weapon weapon = weaponSlots[slot];
        weapon.shot();
    }
}

