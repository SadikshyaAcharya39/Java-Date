public class OuterClass {
    public void printMessage(){
        System.out.println("This is a message from Outer Class...");
    }

    public class InnerClass {
        public void printMessage() {
            System.out.println("This is a message from Inner Class...");
        }
    }

        public static void main(String[] args) {
            OuterClass outerClass = new OuterClass();
            outerClass.printMessage();

            OuterClass.InnerClass innerClass = outerClass.new InnerClass();
            innerClass.printMessage();
        }
    }

