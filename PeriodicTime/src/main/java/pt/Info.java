/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt;

/**
 *
 * @author Tonicraft
 */
public class Info {
    private String name[] = {"Hidrógeno","Litio","Sodio","Potasio","Rubidio","Cesio","Francio","Berilio","Magnesio","Calcio"
            ,"Estroncio","Bario","Radio","Escandio","Itrio","Lantano","Actinio","Titanio","Circonio","Hafnio","Rutherfordio"
            ,"Vanadio","Niobio","Tantalio","Cromo","Molibdeno","Volframio","Manganeso","Tecnecio","Renio","Hierro","Rutenio"
            ,"Osmio","Cobalto","Rodio","Iridio","Níquel","Paladio","Platino","Cobre","Plata","Oro","Cinc","Cadmio","Mercurio"
            ,"Boro","Aluminio","Galio","Indio","Talio","Carbono","Silicio","Germano","Estaño","Plomo","Nitrógeno","Fósforo"
            ,"Arsénico","Antimonio","Bismuto","Oxígeno","Azufre","Selenio","Teluro","Polonio","Flúor","Cloro","Boro","Yodo"
            ,"Astato","Helio","Neón","Argón","Kripton","Xenon","Radón"};
    private String nox[] = {"+1","+1","+1","+1","+1","+1","+1","+2","+2","+2","+2","+2","+2","+3","+3","+3","+3","+2 +3 +4"
            ,"+3 +4","+3 +4","+3 +4","+2 +3 +4 +5","+2 +3 +4 +5","+3 +4 +5","+2 +3 +6","+2 +3 +4 +5 +6","+2 +3 +4 +5 +6"
            ,"+2 +3 +6 +7","+4 +5 +6 +7","+2 +3 (+4 +6 +7)","+2 +3","+2 +3 +4 +5 +6 +7 +8","+2 +3 +4 +5 +6 +7 +8"
            ,"+2 +3","+2 +3 +4 +5 +6","+2 +3 +4 +5 +6","+2 +3","+2 +4","+2 +4","+1 +2","+1","+1 +3","+2","+2","+1 +2"
            ,"+3 -3","+3","+1 +3","+1 +3","+1 +3","+2 +4 -4","+2 +4 -4","+2 +4","+2 +4","+2 +4","+1 +2 +3 +4 +5 -1 -2 -3"
            ,"+3 +5 -3","+3 +5 -3","+3 +5 -3","+3 +5","-1 -2","+2 +4 +6 -2","+4 +6 -2","+2 +4 +6 -2","+2 +4 +6 -2"
            ,"-1","+1 +3 +5 +7 -1","+1 +3 +5 +7 -1","+1 +3 +5 +7 -1","+1 +5 -1","Gas Noble","Gas Noble","Gas Noble"
            ,"Gas Noble","Gas Noble","Gas Noble"};
    private float ma[] = {1.008f,6.94f,22.990f,39.098f,85.468f,132.91f,223,9.0122f,24.305f,40.078f,87.62f,137.33f,226,44.956f,88.906f
            ,138.91f,227,47.867f,91.224f,178.49f,267,50.942f,92.906f,180.95f,51.996f,95.95f,183.84f,54.938f,98,186.21f,55.845f
            ,101.07f,190.23f,58.933f,102.91f,192.22f,58.693f,106.42f,195.08f,63.546f,107.87f,196.97f,65.38f,112.41f,200.59f,10.81f,26.982f
            ,69.723f,114.82f,204.38f,12.011f,28.085f,72.63f,118.71f,207.2f,14.007f,30.974f,74.922f,121.76f,208.98f,15.999f,32.06f,78.971f
            ,127.6f,209,18.998f,35.45f,79.904f,126.9f,210,4.0026f,20.18f,39.948f,83.798f,131.29f,222};

    public String getName(int i) {
        return name[i];
    }

    public String getNox(int i) {
        return nox[i];
    }

    public float getMa(int i) {
        return ma[i];
    }
    
}
