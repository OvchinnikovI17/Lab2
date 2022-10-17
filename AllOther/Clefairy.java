package  com.evilempire.LabLog.AllOther;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Clefairy extends Pokemon {
    public Clefairy (String name, int level) {
        super(name, level);
        super.setType(Type.FAIRY);
        super.setStats(70, 45, 48, 60, 65, 35);

        Flamethrower flamethrower = new Flamethrower(90, 100);
        Sing sing = new Sing(0, 55);
        WakeUpSlap wakeupslap = new WakeUpSlap(70, 100);
        super.setMove(flamethrower, sing, wakeupslap);
    }
}