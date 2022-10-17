package  com.evilempire.LabLog.AllOther;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Cleffa extends Pokemon {
    public Cleffa (String name, int level) {
        super(name, level);
        super.setType(Type.FAIRY);
        super.setStats(50, 25, 28, 45, 55, 15);

        Flamethrower flamethrower = new Flamethrower(90, 100);
        Sing sing = new Sing(0, 55);
        super.setMove(flamethrower, sing);
    }
}