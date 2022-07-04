public class Main {
    public static void main(String[] args)
    int ocak= 1, subat=2 ,mart=3, nisan=4, mayis=5, haziran=6, temmuz= 7, agustos=8, eylul=9, ekim= 10, kasim=11, aralik =12;
    int ay, gun ;

        System.out.print("OCAK:1\nSUBAT:2\nMART:3\nNISAN:4\nMAYIS:5\nHAZIRAN:6\nTEMMUZ:7\nAGUSTOS:8\nEYLUL:9\nEKIM=10\nKASIM:11\nARALIK=12");
    Scanner girdi= new Scanner(System.in);
        System.out.print("\nDOGDUGUNUZ AYI SECINIZ:");
    ay=girdi.nextInt();


        System.out.println("Hangi gunde dogdunuz ?");
    gun= girdi.nextInt();

        if (((ay==3)&&(gun>21)||((ay==4)&&(gun<20)))){
        System.out.println("Burcunuz Koctur");
    }
        if (((ay==4)&&(gun>21)||((ay==5)&&(gun<21)))){
        System.out.println("Burcunuz Boga");
    }
        if (((ay==5)&&(gun>22)||((ay==6)&&(gun<22)))){
        System.out.println("Burcunuz Ikizler");
    }
        if (((ay==6)&&(gun>23)||((ay==7)&&(gun<22)))){
        System.out.println("Burcunuz Yengec");
    }
        if (((ay==7)&&(gun>23)||((ay==8)&&(gun<22)))){
        System.out.println("Burcunuz Aslan");
    }
        if (((ay==8)&&(gun>23)||((ay==9)&&(gun<22)))){
        System.out.println("Burcunuz Basak");
    }
        if (((ay==9)&&(gun>23)||((ay==10)&&(gun<22)))){
        System.out.println("Burcunuz Terazi");
    }
        if (((ay==10)&&(gun>23)||((ay==11)&&(gun<21)))){
        System.out.println("Burcunuz Akrep");
    }
        if (((ay==11)&&(gun>22)||((ay==12)&&(gun<21)))){
        System.out.println("Burcunuz Yay");
    }
        if (((ay==12)&&(gun>22)||((ay==1)&&(gun<21)))){
        System.out.println("Burcunuz Oglak");
    }
        if (((ay==1)&&(gun>22)||((ay==2)&&(gun<19)))){
        System.out.println("Burcunuz Kova");
    }
        if (((ay==2)&&(gun>20)||((ay==3)&&(gun<20)))){
        System.out.println("Burcunuz Balik");
    }
    }
}