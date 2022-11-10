package lecture04;

public class Fighter {
    private int hitPoint;
    private final int power;
    private final String name;

    public Fighter(int hitPoint, int power, String name){
        this.hitPoint = hitPoint;
        this.power = power;
        this.name = name;
    }

    public void attack (Fighter enemy){
        enemy.hitPoint = enemy.hitPoint - power;
        System.out.println(getName() + "は" + enemy.getName() + "に" + power + "ダメージ与えた。");
    }

    public boolean isAlive(){
            return getHitPoint() > 0;
    }

    public int getHitPoint(){
        return hitPoint;
    }

    public void setHitPoint(){
        System.out.println(this.getName() + "は残りHP:" + getHitPoint());
    }

    public String getName(){
        return name;
    }
}
