import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String kullaniciAdi,sifre;
        int hak=3;
        int bakiye=20000;
        int select;
        int tutar;
        Scanner inp = new Scanner(System.in);
        while (hak>0) {
            System.out.print("Kullanıcı Adınızı Giriniz: ");
            kullaniciAdi = inp.nextLine();
            System.out.print("Lütfen Şifrenizi Giriniz: ");
            sifre = inp.nextLine();
            if (kullaniciAdi.equals("can") && sifre.equals("parababasi1")){
                System.out.println("Bankamıza hoşgeldiniz.");
            do {
                System.out.println("Lütfen yapmak istediğiniz işlemi seçermisiniz:");
                System.out.println("1 - Para Yatırma\n" +
                        "2 - Para Çekme\n"+
                        "3 - Bakiye Sorgulama\n"+
                        "4 - Çıkış");
                System.out.print("Tuşlayın: ");
                select = inp.nextInt();
                switch (select){
                    case 1:
                        System.out.println("Lütfen tutar girişi yapınız: ");
                        tutar = inp.nextInt();
                        bakiye += tutar;
                        System.out.println("Yeni Bakiyeniz: " + bakiye);
                        break;
                    case 2:
                        System.out.print("Lütfen tutar girişi yapınız: ");
                        tutar = inp.nextInt();
                        if (tutar > bakiye){
                            System.out.println("Yetersiz bakiye");
                        }else {
                            bakiye -=tutar;
                            System.out.println("Yeni bakiyeniz: " + bakiye);
                        }
                        break;
                    case 3:
                        System.out.println("Bakiyeniz: " + bakiye);
                        break;

                    default:
                }
            }while (select != 4);
                System.out.println("Tekrar Görüşmek Dileğiyle, İyi Günler Dileriz.");
            break;
        }else {
                hak--;
                if (hak==0){
                    System.out.println("Hesabınız blokelendi, Lütfen bankamızla iletişime geçiniz.");
                }else {
                    System.out.println("Hatalı Giriş Yaptınız, Lütfen Tekrar Deneyiniz.");
                    System.out.println("Kalan Hakkınız: " + hak);
                }
            }
        }


    }
}