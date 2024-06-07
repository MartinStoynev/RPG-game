import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Aragorn", 100, 50, 1, 10, 5);
        Mage mage = new Mage("Gandalf", 80, 100, 1, 20, 30);
        Rogue rogue = new Rogue("Legolas", 90, 40, 1, 15, 25);
        System.out.println(warrior);
        System.out.println(mage);
        System.out.println(rogue);
        warrior.attack(mage);
        System.out.println(warrior);
        System.out.println(mage);
        System.out.println(rogue);
        mage.castSpell(warrior);
        System.out.println(warrior);
        System.out.println(mage);
        System.out.println(rogue);
        rogue.lie();
        System.out.println(warrior);
        System.out.println(mage);
        System.out.println(rogue);
        mage.becomeInvisible();
        System.out.println(warrior);
        System.out.println(mage);
        System.out.println(rogue);
        warrior.rest();
        System.out.println(warrior);
        System.out.println(mage);
        System.out.println(rogue);
        warrior.levelUp();
        System.out.println(warrior);
        System.out.println(mage);
        System.out.println(rogue);
        mage.levelUp();
        System.out.println(warrior);
        System.out.println(mage);
        System.out.println(rogue);
        rogue.levelUp();
        System.out.println(warrior);
        System.out.println(mage);
        System.out.println(rogue);
        warrior.defend(mage);
        System.out.println(warrior);
        System.out.println(mage);
        System.out.println(rogue);
        mage.defend(rogue);
        System.out.println(warrior);
        System.out.println(mage);
        System.out.println(rogue);
        rogue.defend(warrior);
        System.out.println(warrior);
        System.out.println(mage);
        System.out.println(rogue);
    }
}
class Character{
    private String name;
    private int health;
    private int mana;
    private int level;
    public Character(String name1, int health1, int mana1, int level1){
        name = name1;
        health = health1;
        mana = mana1;
        level = level1;
    }
    public String getName(){
        return name;
    }
    public int getHealth(){
        return health;
    }
    public int getMana(){
        return mana;
    }
    public int getLevel(){
        return level;
    }
    public void setName(String NAME){
        name = NAME;
    }
    public void setHealth(int HEALTH){
        health = HEALTH;
    }
    public void setMana(int MANA){
        mana = MANA;
    }
    public void setLevel(int LEVEL){
        level = LEVEL;
    }
    public void attack(Character a){
        level++;
        a.setHealth(a.getHealth()-1);
        mana--;
    }
    public void defend(Character b){
        level++;
        mana--;
        health--;
        b.setMana(b.getMana()-1);
    }
    public void castSpell(Character c){
        level++;
        mana--;
        c.setHealth(c.getHealth()-1);
        c.setMana(c.getMana()-1);
    }
    public void levelUp(){
        level++;
    }
    @Override
    public String toString() {
        return "GameCharacter{name='" + name + "', health=" + health + ", mana=" + mana + ", level=" + level + "}";
    }
    
}
class Warrior extends Character{
    private int strength;
    private int armor;
    public Warrior(String name1, int health1, int mana1, int level1, int strength1, int armor1){
        super(name1, health1, mana1, level1);
        strength = strength1;
        armor = armor1;
    }
    public int getStrength(){
        return strength;
    }
    public int getArmor(){
        return armor;
    }
    public void setStrength(int STRENGTH){
        strength = STRENGTH;
    }
    public void setArmor(int ARMOR){
        armor = ARMOR;
    }
    public void attack(Character a){
        super.attack(a);
        strength++;
    }
    public void defend(Character b){
        super.defend(b);
        armor--;
        strength--;
    }
    public void castSpell(Character c){
        super.castSpell(c);
        strength++;
        
    }
    public void levelUp(){
        super.levelUp();
    }
    public void rest(){
        strength +=2;
        armor +=2;
        super.setHealth(super.getHealth()+2);
        super.setMana(super.getMana()+2);
    }
    @Override
    public String toString() {
        return "Warrior{" + "name='" + getName() + "', " + "health=" + getHealth() + ", " + "mana=" + getMana() + ", " + "level=" + getLevel() + ", " + "strength=" + strength + ", " + "armor=" + armor + '}';
    }
    
}
class Mage extends Character{
    private int intelligence;
    private int spellPower;
    public Mage(String name1, int health1, int mana1, int level1, int intelligence1, int spellPower1){
        super(name1, health1, mana1, level1);
        intelligence = intelligence1;
        spellPower = spellPower1;
    }
    public int getIntelligence(){
        return intelligence;
    }
    public int getSpellPower(){
        return spellPower;
    }
    public void setIntelligence(int INTELLIGENCE){
        intelligence = INTELLIGENCE;
    }
    public void setSpellPower(int SPELLPOWER){
        spellPower = SPELLPOWER;
    }
    public void attack(Character a){
        super.attack(a);
        spellPower++;
        intelligence++;
    }
    public void defend(Character b){
        super.defend(b);
        spellPower--;
        intelligence--;
    }
    public void castSpell(Character c){
        super.castSpell(c);
        spellPower++;
        
    }
    public void levelUp(){
        super.levelUp();
    }
    public void becomeInvisible(){
        spellPower++;
        intelligence++;
        super.setHealth(super.getHealth()+1);
    }
    @Override
    public String toString() {
        return "Mage{" + "name='" + getName() + "', " + "health=" + getHealth() + ", " + "mana=" + getMana() + ", " + "level=" + getLevel() + ", " + "intelligence=" + intelligence + ", " + "spellPower=" + spellPower + '}';
    }
}
class Rogue extends Character{
    private int agility;
    private int dexterity;
    public Rogue(String name1, int health1, int mana1, int level1, int agility1, int dexterity1){
        super(name1, health1, mana1, level1);
        agility = agility1;
        dexterity = dexterity1;
    }
    public int getAgility(){
        return agility;
    }
    public int getDexterity(){
        return dexterity;
    }
    public void setAgility(int AGILITY){
        agility = AGILITY;
    }
    public void setDexterity(int DEXTERITY){
        dexterity = DEXTERITY;
    }
    public void attack(Character a){
        super.attack(a);
        agility++;
        dexterity++;
    }
    public void defend(Character b){
        super.defend(b);
        agility--;
        dexterity--;
    }
    public void castSpell(Character c){
        super.castSpell(c);
        dexterity++;
        
    }
    public void levelUp(){
        super.levelUp();
    }
    public void lie(){
        dexterity++;
        setHealth(super.getHealth()+1);
        super.setMana(super.getMana()+2);
    }
    @Override
    public String toString() {
        return "Rogue{" + "name='" + getName() + "', " + "health=" + getHealth() + ", " + "mana=" + getMana() + ", " + "level=" + getLevel() + ", " + "agility=" + agility + ", " + "dexterity=" + dexterity + '}';
    }
}