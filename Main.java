package com.evilempire.LabLog;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ifmo.se.pokemon.Battle;
import com.evilempire.LabLog.AllOther.*;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Начало работы программы");
        logger.info("Создание боя");
        Battle b = new Battle();
        logger.info("Добавляем 6 покемонов");
        Wimpod wimpod = new Wimpod("Олег", 1);
        Seviper seviper = new Seviper("Игорь", 1);
        Golisopod golisopod = new Golisopod("Степан", 1);
        Cleffa cleffa = new Cleffa("Савва", 1);
        Clefairy clefairy = new Clefairy("Иван", 1);
        Clefable clefable = new Clefable("Дмитрий", 1);
        logger.info("Раскидываем покемонов по командам");
        b.addAlly(seviper);
        b.addFoe(cleffa);
        b.addAlly(wimpod);
        b.addFoe(clefairy);
        b.addAlly(golisopod);
        b.addFoe(clefable);
        logger.info("Запускаем бой");
        b.go();
        logger.info("Конец боя");
    }
}