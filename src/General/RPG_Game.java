import Players.*;

import java.util.Random;

public class RPG_Game {
    private static int roundNumber;
    public static Random random = new Random();

    public static void start() {
        Boss boss = new Boss(700, 70);
        Medic doctor = new Medic(250, 25, "DOCTOR");
        Bersek bersek = new Bersek(300, 30, "BERSEK");
        Magic magic = new Magic(280, 35, "MAGIC");
        Warrior warrior = new Warrior(350, 32, "WARRIOR");
        Medic assistant = new Medic(225, 23, "ASSISTANT");
        Heroes[] heroes = {doctor, bersek, magic, warrior, assistant};
    }

    private static void round(Boss boss, Heroes[] heroes) {
    }

    private static void printStatics(Boss boss, Heroes[] heroes) {
        System.out.println("----------| " + roundNumber + " |----------");
        System.out.println("BOSS HEALTH - " + boss.getHealth() + " [ " + boss.getDamage() + " ] ");
        for (Heroes hero : heroes) {
            System.out.println(hero.getHealth() + " HERO HEALTH - " + " [ " + hero.getDamage() + " ] ");
        }
    }

    private static void bossHit(Boss boss, Heroes[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
      
            }
        }
    }
}