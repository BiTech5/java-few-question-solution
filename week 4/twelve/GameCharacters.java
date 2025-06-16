/*
12. Game Character Classes

Instructions:

    Base class GameCharacter: field name, method attack()
    Subclasses:
        Warrior: override attack() to return melee damage
        Archer: uses arrowCount
        Mage: uses mana
    Override attack() in each and demonstrate use via polymorphic method calls.
    File: GameCharacters.java.
 */

class GameCharacter {
    String name;
    
    public GameCharacter(String name) {
        this.name = name;
    }
    
    public void attack() {
        System.out.println(name + " is attacking!");
    }
}

class Warrior extends GameCharacter {
    private int meleeDamage;
    
    public Warrior(String name, int meleeDamage) {
        super(name);
        this.meleeDamage = meleeDamage;
    }
    
    @Override
    public void attack() {
        System.out.println(name + " attacks with sword dealing " + meleeDamage + " damage!");
    }
}
class Archer extends GameCharacter {
    private int arrowCount;
    
    public Archer(String name, int arrowCount) {
        super(name);
        this.arrowCount = arrowCount;
    }
    
    @Override
    public void attack() {
        if (arrowCount > 0) {
            System.out.println(name + " shoots an arrow!");
            arrowCount--;
        } else {
            System.out.println(name + " has no arrows left!");
        }
    }
}

class Mage extends GameCharacter {
    private int mana;
    
    public Mage(String name, int mana) {
        super(name);
        this.mana = mana;
    }
    
    @Override
    public void attack() {
        if (mana >= 10) {
            System.out.println(name + " Using magic");
            mana -= 10;
        } else {
            System.out.println(name + " doesn't have enough mana");
        }
    }
}

class GameCharacters {
    public static void main(String[] args) {
        GameCharacter[] characters = new GameCharacter[3];
        characters[0] = new Warrior("Shiva", 25);
        characters[1] = new Archer("Bishnu", 5);
        characters[2] = new Mage("Bramha", 50);
        
        System.out.println("Battle begins!");
        for (GameCharacter character : characters) {
            character.attack();
        }
    }
}
