class Foo<T> {
    void foo() {
        Bar bar = new Bar(this);
    }
    static class Bar<T> {
        private final Foo<T> foo;



        public Bar(Foo<T> foo) {
            this.foo = foo;
        }

        void bar() {
            foo.foo();
        }
    }

    public void test(){
        System.out.println("test");
    }
}
