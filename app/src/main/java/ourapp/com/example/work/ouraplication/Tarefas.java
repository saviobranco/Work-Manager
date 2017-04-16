package ourapp.com.example.work.ouraplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Tarefas {

    public static ArrayList<String> tags = new ArrayList<String>();

    public static ArrayList<String> tarefas_temp = new ArrayList<String>();
    public static ArrayList<String> tarefas_mostra = new ArrayList<String>();

    public static List<List<String>> meioAmbiente_7_30 = new ArrayList<List<String>>();
    public static List<List<String>> meioAmbiente_8_00 = new ArrayList<List<String>>();
    public static List<List<String>> meioAmbiente_8_30 = new ArrayList<List<String>>();
    public static List<List<String>> meioAmbiente_9_00 = new ArrayList<List<String>>();

    public static void criaTarefa(List<List<String>> a) {
        int n = 0;
        if(a.size()< 5)
        a.add(new ArrayList<String>());

        while (n < tags.size()) {
            a.get(a.size()-1).add(tags.get(n));
            n++;
            }
        //tags.clear();
    }

    public static void listaDeTarefas(){
        String displayTarefas = "";
        for(String palavra : tags) {
            displayTarefas +="-"+ palavra;
        }
        tarefas_mostra.add(displayTarefas);
        tags.clear();
    }

    public static void addTag(){
        tags.add(0,tagLocal);
    }
   // blabla
}

