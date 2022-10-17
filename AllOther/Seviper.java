package  com.evilempire.LabLog.AllOther;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Seviper extends Pokemon{
    public Seviper(String name, int level){
        super(name, level);
        super.setType(Type.POISON);
        super.setStats(73, 100, 60, 100, 60, 65);

        PoisonTail poisonTail = new PoisonTail(50, 100);
        Swagger swagger = new Swagger(0, 85);
        Rest rest= new Rest(0, 0);
        DarkPulse darkpulse = new DarkPulse(80, 100);
        super.setMove(poisonTail, swagger, rest, darkpulse);
    }
}
