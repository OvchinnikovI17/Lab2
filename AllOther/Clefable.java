package  com.evilempire.LabLog.AllOther;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
public class Clefable extends Pokemon {

    private static final Logger logger = LoggerFactory.getLogger(Clefable.class);
    public Clefable (String name, int level) {
        super(name, level);
        super.setType(Type.FAIRY);
        super.setStats(95, 70, 73, 95, 90, 60);
        logger.info("Покемон клеф появился");
        logger.info("Покемону клеф были заданы special move");
        Flamethrower flamethrower = new Flamethrower(90, 100);
        Sing sing = new Sing(0, 55);
        WakeUpSlap wakeupslap = new WakeUpSlap(70, 100);
        Thunder thunder = new Thunder(110, 70);
        super.setMove(flamethrower, sing, wakeupslap, thunder);
    }
}