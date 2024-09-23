package lotr;

public class GameManager {
    public static void main(String[] args) {
        Character[] characters = new Character[2];
        characters[0] = CharacterFactory.createCharacter();
        characters[1] = CharacterFactory.createCharacter();
        System.out.println("Character 1: " + characters[0].getClass().getSimpleName());
        System.out.println("Character 2: " + characters[1].getClass().getSimpleName());
        int c = 0;
        while (characters[0].getHp() > 0 && characters[1].getHp() > 0) {
            characters[0].kick(characters[1]);
            System.out.println("Character 2 got kicked");

            if (characters[1].getHp() <= 0) {
                System.out.println("Character 2 is dead");
                c = 2;
                break;
            }
            characters[1].kick(characters[0]);
            System.out.println("Character 1 got kicked");
            if (characters[0].getHp() <= 0) {
                System.out.println("Character 1 is dead");
                c = 1;
                break;
            }
        }
        if (c == 2) {
            System.out.println("Character 1 won");
        }else{
            System.out.println("Character 2 won");
        }
    }
}
