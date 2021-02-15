class MainSingleton {
  public static void start(){
    System.out.println("---SINGLETON-START---");
    SingletonSimple singletonSimple1 = SingletonSimple.getInstance();
    SingletonSimple singletonSimple2 = SingletonSimple.getInstance();
    System.out.println(singletonSimple1);
    System.out.println(singletonSimple2);
    System.out.println("---SINGLETON-END---");
  }
}