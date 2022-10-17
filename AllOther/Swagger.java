package  com.evilempire.LabLog.AllOther;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ifmo.se.pokemon.*;
import ru.ifmo.se.pokemon.StatusMove;
public class Swagger extends StatusMove {

    private static final Logger logger = LoggerFactory.getLogger(Swagger.class);
    public Swagger (double pow, double acc){
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        logger.info("Мув Swagger добавлен");
        logger.info("Переопределен аоп");
        super.applyOppEffects(p);
        Effect.confuse(p);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        logger.info("переопределен асф");
        super.applySelfEffects(p);
        Effect effect = new Effect().stat(Stat.ATTACK, 2);
        p.addEffect(effect);
    }

    @Override
    protected String describe(){
        logger.info("Переопределен дескрайб");
        return "использует Swagger, смущает противника и повышает свою атаку на 2";
    }
}