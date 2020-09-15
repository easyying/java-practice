package javaPractice.RPC;

import javaPractice.RPC.First.Dto;

public class TestHAHA {
    public static void main(String[] args) {
        funA(3,4);
    }
    public static void funA(int a, int b){
        //System.out.println(a + ","+ b);
        Dto dto = new Dto();
        dto.setA(3);
        dto.setB(4);
        funB(dto);
    }
    public static void funB(Dto dto){
        System.out.println(dto.a + ","+ dto.b);
    }



}
