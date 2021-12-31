package rekursion;

public class OrtDemoApp {

    public static void main(String[] args) {

        Ort graz = new Ort("graz");
        Ort wien = new Ort("wien");
        Ort marburg = new Ort("marburg");
        Ort linz = new Ort("linz");

        graz.addNachbar(marburg);
        graz.addNachbar(wien);

        wien.addNachbar(linz);

        linz.addNachbar(graz);
        marburg.addNachbar(graz);
        wien.addNachbar(graz);
        linz.addNachbar(wien);

        System.out.println("hasCircle(graz): " + hasCircle(graz));

        System.out.println("graz.countHops(graz, linz) = " + graz.countHops(graz, linz));
        System.out.println("graz.countHops(graz, marburg) = " + graz.countHops(graz, marburg));
        System.out.println("graz.countHops(wien, marburg) = " + wien.countHops(wien, marburg));
    }

    public static boolean hasCircle(Ort o){
        return hasCircle(o, o, null);
    }

    public static boolean hasCircle(Ort start, Ort current, Ort previous){
        for(Ort n : current.getNachbarn()){
            if(n == previous){
                return false;
            }

            if(n == start){
                return true;
            }

            else{
                boolean result = hasCircle(start, n, current);
                if(result){
                    return true;
                }
            }
        }
        return false;

    }

}
