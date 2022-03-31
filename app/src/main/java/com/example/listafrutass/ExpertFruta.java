package com.example.listafrutass;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class ExpertFruta {

    public String[] getFrutas(Context context){
        return context.getResources().getStringArray(R.array.lista_fruta);
    }

    public List<String> get(){

        List<String> info = new ArrayList<>();

        info.add("Proteina: 1,06 g\nCaloria: 65 kcal\nGorduras: 0,2 g"); //0
        info.add("Proteina: 0.11 g\nCaloria: 3.60 kcal\nGorduras: 0.04 g"); //1
        info.add("Proteina: 20,8 g\nCarboidrato: 0 kcal\nGorduras: 6,1 g"); //2
        info.add("Proteina: ??? g\nCaloria: ?? kcal\nGorduras: !? g"); //3
        info.add("Proteina: 1,06 g\nCaloria: 65 kcal\nGorduras: 0,2 g"); //4

        return info;
    }
}
