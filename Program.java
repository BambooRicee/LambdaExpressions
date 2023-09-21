import java.util.Comparator;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {

        Stream<Player> playerStream = Stream.of(new Player(" Опарин Михаил", "Ахмат", 82),
                new Player("Шунин Антон", "Динамо", 81),
                new Player("Медведев Никита", "Ростов", 76),
                new Player("Агкацев Станислав ", "Краснодар", 74),
                new Player("Заболотный Николай ", "Сочи", 84));

        var result =  playerStream.mapToInt(Player::getWeight).average().orElseThrow();
        System.out.println("Средний вес игроков: "+result);
    }
}
class PlayerComparator implements Comparator<Player> {
    public int compare(Player a, Player b) {
        return a.getName().toUpperCase().compareTo(b.getName().toUpperCase());
    }
}