import org.jetbrains.annotations.NotNull;

public class CC {


    public @NotNull
    String[] ss = new String[1];

    public void test(){


        ss[0]= null;

        ss=null;
        System.out.println("test");
    }
}
