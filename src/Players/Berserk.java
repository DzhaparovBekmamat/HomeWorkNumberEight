package Players;
public class Bersek extends Heroes{
    public Bersek(int health, int damage, String nameOfHero) {
        super(health, damage, SuperAbilities.SAVE_DAMAGE_AND_REVERT, nameOfHero);
    }
    @Override
    public void applySuperAbility(Heroes[] heroes, Boss boss) {
    }
}
