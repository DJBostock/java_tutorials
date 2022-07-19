public class PrimitiveTypesChallenge
{
    public static void main(String[] args)
    {
        byte myByteVariable = (byte) 1;
        System.out.println("myByteVariable is: " + myByteVariable);

        short myShortVariable = (short) 2;
        System.out.println("myShortVariable is: " + myShortVariable);

        int myIntVariable = 3;
        System.out.println("myIntVariable is: " + myIntVariable);

        long myLongVariable = (long) 50_000 + 10 * (myByteVariable + myShortVariable + myIntVariable);
        System.out.println("myLongVariable is: " + myLongVariable);
    }
}
