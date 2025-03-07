public class CommandLineExample {
    public static void main(String[] args) {
        if(args.length > 0){
            for(int i=0;i<args.length;i++){
                System.out.println("Argument " + (i+1) + ": " + args[i]);
            }
        } else {
            System.out.println("No arguments given or passed");
        }
    }
}