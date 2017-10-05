package io.robusta.java.classic.pingouins;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nicorama on 28/09/2017.
 */
public class PenguinApp {


    Penguin createSimplePenguin(){
        Penguin penguin = new Penguin("penguin");
        return penguin;
    }

    List<Penguin> getPenguins(Penguin p1, Penguin p2, Penguin p3, Penguin p4, Penguin p5){
        List<Penguin> list = new ArrayList<>();
        if(p1!=null)
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        return list;

    }


    Penguin getPenguinByName(Penguin[] pingouins, String name){
        return null;
    }


    Penguin getFastest(List<Penguin> penguins){
        return null;
    }

    Penguin getFriend(Penguin penguin){
        return null;
    }

    List<Penguin> getPenguinsWithLetter(    Penguin[] pengouins, String letters){
        return null;
    }

    Penguin[] getPenguinsWithLetter(    List<Penguin> pengouins, String letters){
        return null;
    }


    Object getSmallestSize(Penguin[] array, List<Penguin> list){
        return null;
    }





    List<Penguin> getFriends(Penguin[] penguins){
        return null;
    }




}
