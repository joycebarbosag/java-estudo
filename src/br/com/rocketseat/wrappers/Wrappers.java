package br.com.rocketseat.wrappers;

public class Wrappers {

    public static void main(String[] args){
        double numeroDouble = 123.56;
        int numeroInt = (int) numeroDouble;
        System.out.println(numeroInt);

        Double d = 100.856;
        Integer i = d.intValue();
        System.out.println(i);

        String num = "100";
        int a = Integer.parseInt(num);
        double b = Double.parseDouble(num);

        String c = "123";
        Integer dd = Integer.valueOf(c);

        Integer obj1 = Integer.valueOf("100");
        Integer obj2 = Integer.valueOf("101");
        //0 para iguais, -1 para obj2 maior que obj1 e 1 para obj1 maior que obj2
        System.out.println(obj1.compareTo(obj2));
    }
}
