/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eralab
 */
public class Utama {
    public static void main(String[] args) {
        MyThread obj = new MyThread();
        Thread thread1 = new Thread(obj,"Threadku");
        thread1.start();
        cekThread(thread1);
        
        System.out.println("Nama Thread : "+thread1.getName());
        System.out.println("Id Thread : "+thread1.getId());
        try {
            thread1.sleep(3000);
            cekThread(thread1);
            obj.setFinish(true);
            cekThread(thread1);
            thread1.join(2000);
            cekThread(thread1);
        } catch (Exception e) {
        }
    }
    
    public static void cekThread(Thread thread){
        if (thread.isAlive())
            System.out.println("Thread Masih Hidup");
        else
            System.out.println("Thread Sudah Mati");
    }
}
