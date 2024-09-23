package lotr;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter @AllArgsConstructor
public abstract class Character {
    
    private int hp;
    private int power;
    public abstract void kick(Character c);
    public void setHp(int hp) {
        if (hp<0){
            this.hp = 0;
        }else{
            this.hp = hp;
        }
    }

    public boolean isAlive(){
        return hp > 0;
    }

    @Override
    public String toString(){
        return this.getClass().getSimpleName()+"{hp=" + hp + ", power=" +power+"}";
    }
}
//   - attributes: int power, in hp
//   - methods: void kick(Character c), boolean isAlive()