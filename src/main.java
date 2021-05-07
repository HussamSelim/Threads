

 class Main {
    public static void main(String[] args){
        Opers fun = new Opers();
        Opers fun1=new Opers();
        Thread th= new Thread(fun);
        Thread th1=new Thread(fun1);
        th.start();
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        th1.start();
        System.out.println("a printed statment after the threads");
        }

    }
