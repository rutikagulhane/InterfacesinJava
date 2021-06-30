public interface InterfacewithDefaultMethod {
    final int no=10;
    default  void print()
    {
        System.out.println("this is a default method");
    }

}
