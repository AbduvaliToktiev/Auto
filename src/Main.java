import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Audi> sedan = new ArrayList<>();
        ArrayList<Audi> cabriolet = new ArrayList<>();
        ArrayList<Audi> offroad = new ArrayList<>();
        Audi A3 = new Audi(2020, "Sedan", 7500, "black");
        Audi A4 = new Audi(2019, "Sedan", 7000, "red");
        Audi A5 = new Audi(2004, "Sedan", 6300, "white");
        Audi A6 = new Audi(2006, "Sedan", 6500, "black");
        Audi A7 = new Audi(1998, "Sedan", 5000, "blue");
        Audi Q3 = new Audi(2018, "Sedan", 9500, "white");
        Audi Q5 = new Audi(2000, "Sedan", 5700, "red");
        Audi Q7 = new Audi(2013, "Sedan", 8500, "black");
        sedan.add(A3);
        sedan.add(A4);
        sedan.add(A5);
        sedan.add(A6);
        sedan.add(A7);
        sedan.add(Q3);
        sedan.add(Q5);
        sedan.add(Q7);
        System.out.println(sedan);
        Audi R8 = new Audi(2020, "Cabriolet", 7900, "black");
        Audi RS5 = new Audi(2019, "Cabriolet", 78000, "red");
        Audi S3 = new Audi(2004, "Cabriolet", 6300, "white");
        Audi S5 = new Audi(2006, "Cabriolet", 6500, "black");
        Audi TT = new Audi(1998, "Cabriolet", 50000, "blue");
        Audi TTS = new Audi(2018, "Cabriolet", 90500, "white");
        Audi Roadster = new Audi(2000, "Cabriolet", 50700, "red");
        Audi S3Cabriolet = new Audi(2013, "Cabriolet", 9500, "black");
        cabriolet.add(R8);
        cabriolet.add(RS5);
        cabriolet.add(S3);
        cabriolet.add(S3Cabriolet);
        cabriolet.add(S5);
        cabriolet.add(TT);
        cabriolet.add(TTS);
        cabriolet.add(Roadster);
        System.out.println(cabriolet);
        Audi Q2 = new Audi(2020, "Offroad", 85500, "black");
        Audi SQ2 = new Audi(2019, "Offroad", 9000, "red");
        Audi SQ3 = new Audi(2004, "Offroad", 6300, "white");
        Audi QS3 = new Audi(2006, "Offroad", 6500, "black");
        Audi Q4 = new Audi(1998, "Offroad", 5000, "blue");
        Audi Q5FY = new Audi(2018, "Offroad", 50000, "white");
        Audi GE = new Audi(2000, "Offroad", 5700, "red");
        Audi SQ8 = new Audi(2013, "Offroad", 85500, "black");
        offroad.add(Q2);
        offroad.add(SQ3);
        offroad.add(SQ2);
        offroad.add(QS3);
        offroad.add(Q4);
        offroad.add(Q5FY);
        offroad.add(GE);
        offroad.add(SQ8);
        System.out.println(offroad);

    }
}
