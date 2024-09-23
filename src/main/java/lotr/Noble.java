package lotr;

import java.util.Random;

import lotr.Character;

public abstract class Noble extends Character{
    public Noble(int min, int max) {
        super(new Random().nextInt(max)+min, new Random().nextInt(max)+min);
    }

    @Override
    public void kick(Character c){
        c.setHp(c.getHp() - new Random().nextInt(c.getPower()));
    }
}
