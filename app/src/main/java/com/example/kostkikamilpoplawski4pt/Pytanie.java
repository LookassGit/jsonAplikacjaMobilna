package com.example.kostkikamilpoplawski4pt;

import com.google.gson.annotations.SerializedName;

public class Pytanie {
    @SerializedName("tresc")
    public String tresc;
    @SerializedName("odp_a")
    public String odpA;
    @SerializedName("odp_b")
    public String odpB;
    @SerializedName("odp_c")
    public String odpC;
    @SerializedName("poprawna")
    public int odpPoprawna;
}
