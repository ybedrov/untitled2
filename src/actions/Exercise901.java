packagenew actions;

public class Exercise901 {
    /** field 1 */
    private String field1;
    /** field 2 */
    private String field2;
    public static void main(String[]args) {
        String Taste = "Way too hot";



    }

    public void test(){
        System.out.println("test");
    }

    private String Taste;
    int AdjustTemp = switch (Taste){
        case "too cold" -> 1;
        case "too hot" -> -1;
        case "Way too hot" -> -2;
        case "just right" -> 0;
        default -> 0;
    };
}

