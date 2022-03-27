package methodoverriding24;

public class Test2 {
    public static void main(String[] args) {
        //multilevel inheritance
        SBI s=new SBI();       //object referece of SBI
        ICICI i=new ICICI();   //object referece of ICICI
        AXIS a=new AXIS();     //object referece of AXIS
        System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());
    }
}
