package EnjoyJava;

public class MyRunnableMain {
    public static void main(String[] args) {
        RunnableExecute runnableExecute = new RunnableExecute();
        runnableExecute.execute(
                () -> {
                        System.out.println("anonymous class!");
                }
        );


//                EnjoyJava.MyRunnable r = new EnjoyJava.MyRunnable() {
//            @Override
//            public void run() {
//                System.out.println("myrunnable run!");
//            }
//        };
//
//        r.run();

//        EnjoyJava.MyRunnable runnable = new EnjoyJava.MyRunnable() {
//            @Override
//            public void run() {
//                System.out.println("anonymous class!");
//            }
//        };
//
//        EnjoyJava.RunnableExecute execute = new EnjoyJava.RunnableExecute();
//        execute.execute(runnable);


//        EnjoyJava.RunnableExecute runnableExecute = new EnjoyJava.RunnableExecute();
//        runnableExecute.execute(new EnjoyJava.MyRunnable() {
//            @Override
//            public void run() {
//                System.out.println("anonymous class!");
//            }
//        });
    }
}
