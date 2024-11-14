package datatypes.objectorientedprogramming;

public class WrapperExample {
    Byte wrapperByte;
    Short wrapperShort;
    Integer wrapperInt;
    Long wrapperLong = 200L;
    Float wrapperFloat;
    Double wrapperDouble;
    Boolean wrapperBoolean;
    Character wrapperChar='A';
    String stringExample = "This is java session";
    public void printWrapperInfo(){
        System.out.println("Wrapper byte " + wrapperByte);
        System.out.println("Wrapper short " + wrapperShort);
        System.out.println("Wrapper int " + wrapperInt);
        System.out.println("Wrapper long " + wrapperLong);
        System.out.println("wrapper long value "+ wrapperLong.longValue());
        System.out.println("Wrapper float " + wrapperFloat);
        System.out.println("Wrapper double " + wrapperDouble);
        System.out.println("Wrapper boolean " + wrapperBoolean);
        System.out.println("Wrapper char " + wrapperChar);
        System.out.println("Wrapper charvalue" + wrapperChar.charValue());
        System.out.println("Sting example "+ stringExample);






    }



}
