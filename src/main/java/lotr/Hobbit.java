package lotr;

public class Hobbit extends Character{
    public Hobbit() {
        super(3, 0);
    }

    @Override
    public void kick(Character c) {

        toCry();
    }

    public void toCry(){
        System.out.println("😭😭😭");
    }
//   - attributes: int power=0, int hp=3
//   - methods: void kick(Character c) { toCry() }
}
