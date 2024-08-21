public class Escseq{
    public static void main(String[] args) {
        int count = 1;
        boolean tab = false;

        while (count <=5) {
            int multiple = count * 7;

            if (tab) {
                System.out.println("\t" + multiple);
            } else {
                System.out.println(multiple);
            }
            
            tab = !tab;

            count++;
        }

    }

}