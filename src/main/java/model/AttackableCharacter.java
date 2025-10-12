package model;

public abstract class AttackableCharacter extends Character{

    private int hp;
    private int strength;
    private int shield;

    public AttackableCharacter(GameContext gameContext, int x, int y, int width, int height, int speed, int hp, int strength, int shield) {
        super(gameContext, x, y, width, height, speed);
        this.hp = hp;
        this.strength = strength;
        this.shield = shield;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getShield() {
        return shield;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }


    public int getDefense() {
        return shield;
    }

    public int getAttack() {
        return strength;
    }

    /**
     * Method called by an AttackableCharacter when he is attacked.
     * @param strength
     */
    public void attacked(int strength) {
        int finalStrength = strength - getDefense();

        if(finalStrength > 0) {
            setHp(hp - finalStrength);
        }
    }

    public void attack(AttackableCharacter target) {
        target.attacked(getAttack());
    }

}
