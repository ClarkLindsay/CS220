package major_project.character;

import major_project.item.weapon.*;
import major_project.item.weapon.rangedWeapon.*;
import major_project.item.weapon.meleeWeapon.*;
import major_project.item.defensiveItem.*;
import major_project.item.spell.Spell;
import major_project.item.spell.healingSpell.*;
import major_project.item.spell.attackSpell.*;
import major_project.monster.Monster;
import java.util.Random;

//This class is used for the player character
public class CharacterClass{
	
   private int hitPoints;
   private int strength;
   private int dexterity;
   private int intelligence;
   private int speed;
   private int armorClass;
   private int attackDice;
   private int healDice;
   private Weapon leftHandWeapon;
   private Weapon rightHandWeapon;
   private Weapon twoHandedWeapon;
   private Spell leftHandSpell;
   private Spell rightHandSpell;
   private DefensiveItem shield;
	
   public CharacterClass(){
      this.strength = 0;
      this.dexterity = 0;
      this.intelligence = 0;
      this.attackDice = 0;
      this.healDice = 0;
      this.armorClass = 0;
      this.hitPoints = 0;
      this.speed = 0;
      this.leftHandWeapon = null;
      this.rightHandWeapon = null;
      this.twoHandedWeapon = null;
      this.leftHandSpell = null;
      this.rightHandSpell = null;
      this.shield = null;
   }
   
   public void setAttackDice(Weapon weapon){
      attackDice = weapon.getAttack();
   }
   
   public void setHealDice(HealingSpell healingSpell){
      healDice = healingSpell.getHeal();
   }
   
   public void setArmorClass(int armorClass){
      this.armorClass = armorClass;
   }
   
   public void setHitPoints(int hitPoints){
      this.hitPoints = hitPoints;
   }
   
   public void setSpeed(int speed){
      this.speed = speed;
   }
   
   public void setStrength(int strength){
      this.strength = strength;
   }
   
   public void setDexterity(int dexterity){
      this.dexterity = dexterity;
   }
   
   public void setIntelligence(int intelligence){
      this.intelligence = intelligence;
   }

   public void setLeftHandWeapon(Weapon weapon){
      this.leftHandWeapon = weapon;
   }

   public void setRightHandWeapon(Weapon weapon){
      this.rightHandWeapon = weapon;
   }
   
   public void setTwoHandedWeapon(Weapon weapon){
      this.twoHandedWeapon = weapon;
   }
   
   public void setLeftHandSpell(Spell spell){
      this.leftHandSpell = spell;
   }
   
   public void setRightHandSpell(Spell spell){
      this.rightHandSpell = spell;
   }
   
   public void setShield(DefensiveItem shield){
      this.shield = shield;
   }

   public int meleeAttack(Monster target, Weapon weapon){
      int damage = -1;
      Random rand = new Random();
      
      if (target.getArmorClass() <= (rand.nextInt(20) + 1 + strength)){
         damage = rand.nextInt(weapon.getAttack()) + dexterity;
         target.setHitPoints(target.getHitPoints() - damage);
      }
            
      return damage;
   }
	
   public int rangedAttack(Monster target, Weapon weapon){
      int damage = -1;
      Random rand = new Random();
      
      if (target.getArmorClass() <= (rand.nextInt(20) + 1 + dexterity)){
         damage = rand.nextInt(weapon.getAttack()) + dexterity;
         target.setHitPoints(target.getHitPoints() - damage);
      }
            
      return damage;
   }
   
   public int spellAttack(Monster target, Spell spell){
      int damage = -1;
      Random rand = new Random();
      
      if (target.getArmorClass() <= (rand.nextInt(20) + 1 + intelligence)){
         damage = rand.nextInt(spell.getAttack()) + intelligence;
         target.setHitPoints(target.getHitPoints() - damage);
      }
            
      return damage;
   }
   
   public int spellHeal(CharacterClass target, Spell spell){
      int heal = -1;
      Random rand = new Random();
      
      heal = rand.nextInt(spell.getHeal()) + intelligence;
      
      target.setHitPoints(target.getHitPoints() + heal);
      
      if (target.getHitPoints() > 100)
         target.setHitPoints(100);
         
      return heal; 
   }
   
   public int getHitPoints(){
      return hitPoints;
   }
	
   public int getStrength(){
      return strength;
   }
	
   public int getDexterity(){
      return dexterity;
   }
	
   public int getIntelligence(){
      return intelligence;
   }
   
   public int getArmorClass(){
      return armorClass;
   }
   
   public int getSpeed(){
      return speed;
   }
   
   public Weapon getLeftHandWeapon(){
      return this.leftHandWeapon;
   }
   
   public Weapon getRightHandWeapon(){
      return this.rightHandWeapon;
   }
   
   public Weapon getTwoHandedWeapon(){
      return this.twoHandedWeapon;
   }
   
   public Spell getLeftHandSpell(){
      return this.leftHandSpell;
   }
   
   public Spell getRightHandSpell(){
      return this.rightHandSpell;
   }
   
   public DefensiveItem getShield(){
      return this.shield;
   }
}