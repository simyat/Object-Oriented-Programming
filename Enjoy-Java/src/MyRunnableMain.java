public class MyRunnableMain {
    public static void main(String[] args) {
        RunnableExecute runnableExecute = new RunnableExecute();
        runnableExecute.execute(
                () -> {
                        System.out.println("anonymous class!");
                }
        );


//                MyRunnable r = new MyRunnable() {
//            @Override
//            public void run() {
//                System.out.println("myrunnable run!");
//            }
//        };
//
//        r.run();

//        MyRunnable runnable = new MyRunnable() {
//            @Override
//            public void run() {
//                System.out.println("anonymous class!");
//            }
//        };
//
//        RunnableExecute execute = new RunnableExecute();
//        execute.execute(runnable);


//        RunnableExecute runnableExecute = new RunnableExecute();
//        runnableExecute.execute(new MyRunnable() {
//            @Override
//            public void run() {
//                System.out.println("anonymous class!");
//            }
//        });
    }
}
