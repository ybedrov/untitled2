public class Temp {

    public static void main(String[] args) {
        API api = null;
        api.foo();

        OverridernAPI overridernAPI = null;
        overridernAPI.foo();
    }

    public void test(){
        System.out.println("test");
    }
}

interface API{
    @Deprecated
    default void foo(){
        foo();
    }

}

class OverridernAPI implements API{
    @Override
    public void foo(){

    }
}
