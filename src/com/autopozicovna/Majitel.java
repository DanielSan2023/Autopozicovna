package com.autopozicovna;

import java.util.ArrayList;
import java.util.List;

public class Majitel {
   private String menoMajitela;
   private Auto auto;


    public Majitel(String menoMajitela, Auto auto) {
        this.menoMajitela = menoMajitela;
        this.auto = auto;
    }

    //region Gettery a settery pre atribúty meno a auto

    public String getMenoMajitela() {
        return menoMajitela;
    }

    public void setMenoMajitela(String menoMajitela) {
        this.menoMajitela = menoMajitela;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }


    //endregion
}
