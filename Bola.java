public class Bola{
    private double jariJari;

    public Bola(){
        this.jariJari=0.0;
    }

    public void setJariJari(double jariJari){
        if (jariJari>0){
            this.jariJari=jariJari;
        }else{
            System.out.println("jari jari harus lebih dari 0");
        }
    }

    public double showDiameter(){
        return 2*jariJari;
    }
    
    public double showLuasPermukaan(){
        return 4*Math.PI*Math.pow(jariJari, 2);
    }

    public double showVolume(){
        return(4/3)*Math.PI*Math.pow(jariJari, 3);
    }

    public static void main(String[] args) {
        //langkah 1 : membuat variabel jarijari
        double jariJariVariable = 5.0;

        //langkah 2 : menciptakan objek bola
        Bola bolaObjek = new Bola();

        //langkah 3 : memanggil method showdiameter(), showluaspermukaan(), showvolume()
            System.out.println("diameter: "+bolaObjek.showDiameter());
            System.out.println("luas permukaan: "+bolaObjek.showLuasPermukaan());
            System.out.println("volume: "+bolaObjek.showVolume());

            //langkah 4 : memanipulasi objek dengan memanggil method setJariJari()
            bolaObjek.setJariJari(jariJariVariable);

            //langkah 5 : menampilkan hasil setelah manipulasi
            System.out.println("\nsetelah manipulasi");
            System.out.println("diameter: "+bolaObjek.showDiameter());
            System.out.println("luas permukaan: "+bolaObjek.showLuasPermukaan());
            System.out.println("volume :"+bolaObjek.showVolume();

    }
}