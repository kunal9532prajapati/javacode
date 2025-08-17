public class string {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
        System.out.println(str);  //Hello

        str.setCharAt(0,'C');
        System.out.println(str); //Cello

        str.insert(2,'l');
        System.out.println(str); //Celllo

        str.append(" world");//Celllo world
        System.out.println(str);

        str.delete(2, 4);//Celo world
        System.out.println(str);

    }
    
}
