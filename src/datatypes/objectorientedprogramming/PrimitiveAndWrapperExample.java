package datatypes.objectorientedprogramming;

public class PrimitiveAndWrapperExample {
    public static void main(String[] args) {
        PrimitiveExample primitiveexample = new PrimitiveExample();
        primitiveexample.primitiveByte=99;
        primitiveexample.printPrimitiveInfo();

        WrapperExample wrapperexample = new WrapperExample();
        wrapperexample.wrapperByte = 99;
        wrapperexample.printWrapperInfo();

    }
}
