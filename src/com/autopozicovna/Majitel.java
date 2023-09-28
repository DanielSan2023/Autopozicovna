package com.autopozicovna;

import java.util.ArrayList;
import java.util.List;

public class Majitel {
    String menoMajitela;
    String priezviskoMajitela;
    String adresaMajitela;
    List<Auto> zoznamMajitel = new ArrayList<>();
   private  Auto auto;


    public Majitel(String menoMajitela, String priezviskoMajitela,
                   String adresaMajitela) {
        this.menoMajitela = menoMajitela;
        this.priezviskoMajitela = priezviskoMajitela;
        this.adresaMajitela = adresaMajitela;
        this.zoznamMajitel = zoznamMajitel;
    }

    public String getMenoMajitela() {
        return menoMajitela;
    }

    public void setMenoMajitela(String menoMajitela) {
        this.menoMajitela = menoMajitela;
    }

    public String getPriezviskoMajitela() {
        return priezviskoMajitela;
    }

    public void setPriezviskoMajitela(String priezviskoMajitela) {
        this.priezviskoMajitela = priezviskoMajitela;
    }

    public String getAdresaMajitela() {
        return adresaMajitela;
    }

    public void setAdresaMajitela(String adresaMajitela) {
        this.adresaMajitela = adresaMajitela;
    }


}
