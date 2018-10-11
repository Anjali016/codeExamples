package design.pattern.creational.singleton;

public class Singleton {
  public static Singleton firstInstance = null;

  Singleton() {}

  public static Singleton getInstance() {
    if (firstInstance == null) {
      firstInstance = new Singleton();
    }
    return firstInstance;
  }
}
