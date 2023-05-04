/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.threading_kronometre;

/**
 *
 * @author melek
 */
public class Threading_kronometre {

    public static void main(String[] args) {
     
      KronometreThread thread1=new KronometreThread("thread1");

        KronometreThread thread2=new KronometreThread("thread2");

        KronometreThread thread3=new KronometreThread("thread3");

        thread1.start();
        thread2.start();
        thread3.start();   
        
        
    }
}


//bir operasyon bittikten sonra diğer operasyona geçme zorunluluğu varsa single thread
//birinde kullanılan datanın diğer operasyonu da ilgilendirip ilgilendirmediğine bakılır
//single threadda 20 sn de bitecek operasyonlar multi threadda 4 yada 5 snde bitebilir

//mobil uygulamada butona tıkladığımızda data 5 snde getirilsin
//5 saniye geçmeden ekranda birşey göstermek isteyebilir
//kullanıcının sistem yanıt vermiyor şeklinde hatalar almaması için thread uygulamalarından yararlanılır


//runner interfacesini implemente etmesi gerekir


public class KronometreThread implements Runner{
    private Thread t;  //thread nesnesi oluşturduk
    private String threadName; //threadları birbirinden ayırabilmek için isim vermeliyiz

    

    public KronometreThread(String threadName){//threadın ismini oluşturmak için bir tane constructor tanımladık
        thsi.threadName=threadName;
        System.out.println("Oluşturuluyor:"+threadName);

        

    }

    @override
    public void run() { //run metodu içindeki kodumuz tread şeklinde çalışacaktır

        System.out.println("Çalıştırılıyor: " +threadName);

        try{ //threadın bozulma ihtimaline karşı try catch bloğuna aldık

            for(int i=0; i<=10; i++){
                System.out.println(threadName+ ":" +i);
                Thread.sleep(1000); //milisaniye cinsinden 1000 yazarak 1 saniye beklemesini söyledik
            }
    

        }catch(InterrupteException exception){ 

            System.out.println("thread kesildi" + threadName);

        }
        System.out.println("thread bitti" + threadName);
        
    }

}


public void start(){//thread nesnesi oluşturmak için class

    System.out.println("threas nesnesi oluşuyor");
    if(thread==null){//threadın referansı yoksa onu oluştur
       
        thread=new Thread(this, threadName);
        thread.start();

    }


}




//for döngüsüyle sayıları sayma dışındaki kodlar standarttır
//veritabanı işlemleri için de kullanılabilir