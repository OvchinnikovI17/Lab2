package  com.evilempire.LabLog.AllOther;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Golisopod extends Pokemon {
    public Golisopod(String name, int level) {
        super(name, level);
        super.setType(Type.BUG, Type.WATER);
        super.setStats(75, 125, 140, 60, 90, 40);

        Facade facade = new Facade(70, 100);
        Waterfall waterfall = new Waterfall(80, 100);
        DoubleTeam doubleteam = new DoubleTeam(0, 0);
        Liquidation liquidation = new Liquidation(85,100);
        super.setMove(facade, waterfall, doubleteam, liquidation);
    }
}