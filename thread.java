class thread1 extends Thread
{
    public void run()
    {
        for(int i=1; i<=5; i++)
        {
            System.out.println("thread1 " + i);
        }
    }
}

class thread2 extends Thread
{
    public void run()
    {
        for(int i=1; i<=5; i++)
        {
            System.out.println("thread2 " + i);
        }
    }
}

 class threadMain
{
    public static void main(String args[])
    {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        t1.start();
        t2.start();
    }
}
