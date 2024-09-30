public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        for (int i=0; i<45;i++){
            for(int j=0;j<i;j++){
                System.out.print('*');
            }
            System.out.print('\n');
        }
        System.out.print("\nfinalizado");
    }
}
