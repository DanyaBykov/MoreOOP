package lotr;

import java.util.Random;

public class CharacterFactory {
    public static Character createCharacter() {
        int i = new Random().nextInt(4);
        switch (i) {
            case 1:
                return new Hobbit();
            case 2:
                return new King();
            case 3:
                return new Knight();
            default:
                return new Elf();
        }
    }
}
