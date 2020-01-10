class Foo {

    int flag;
    public Foo() {
        flag =1;
    }

    public void first(Runnable printFirst) throws InterruptedException {
        
        while(flag!= 1);
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        flag = 2;
    }

    public void second(Runnable printSecond) throws InterruptedException {
        // printSecond.run() outputs "second". Do not change or remove this line.
        while(flag !=2) Thread.sleep(2);
        printSecond.run();
        flag =3;
    }

    public void third(Runnable printThird) throws InterruptedException {
        // printThird.run() outputs "third". Do not change or remove this line.
        while(flag !=3) Thread.sleep(2);
        printThird.run();
        flag =1;
    }
}