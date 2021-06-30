public class Example implements ChildInterface{


    @Override
    public void displayfromParent() {
        System.out.println("This is the display from Parent Interface");
    }
        @Override
        public void displayFromChild() {
            System.out.println("This is the display from child Interface");
        }

    public static void main(String[] args) {
        Example example=new Example();
        example.displayfromParent();
        example.displayFromChild();
    }

}
