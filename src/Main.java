public class Main {
    public static void main(String[] args) {
        CustomStringMethods methods = new CustomStringMethods();

        String str = methods.removeCharacter("Halloween", 5);
        System.out.println(str);
        str = methods.removeCharacter("Halloween", 0);
        System.out.println(str);
        str = methods.removeCharacter("Halloween", 8);
        System.out.println(str);
        str = methods.removeCharacter("Halloween", 9);
        System.out.println(str);
        str = methods.removeCharacter("Halloween", 20);
        System.out.println(str);
        str = methods.removeCharacter("Hi friend", 0);
        System.out.println(str);
        str = methods.removeCharacter("Hi friend", 1);
        System.out.println(str);
        str = methods.removeCharacter("Hi friend", 2);
        System.out.println(str);
        str = methods.removeCharacter(" Hi friend", 0);
        System.out.println(str);
        str = methods.removeCharacter("A", 0);
        System.out.println(str);
        str = methods.removeCharacter("A ", 0);
        System.out.println(str);
        str = methods.removeCharacter("A", 1);
        System.out.println(str);
        str = methods.removeCharacter("A ", 1);
        System.out.println(str);


    }
}