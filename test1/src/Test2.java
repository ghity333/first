import javax.sound.midi.MidiFileFormat;


/**
 * @Author: ghity
 * @Date: 2020/7/5 15:58
 * PACKAGE_NAME
 * jack
 */
public class Test2 {
    public static void main(String[] args) {
        int s = 12;
        String name = "jsfjg";
        if (name.startsWith("ja")) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        System.out.println(s);
        int s1 = 3;
        int s4 = 5;
        int add = add1(s1, s4);
        System.out.println(add);
        byte arr=123;
        System.out.println(arr);
        int a=123;
        int b=12345;
        int s12=a>b?a:b;
        System.out.println(s12);
    }

    private static int add1(int s1, int s4) {

        return s1 + s4;
    }
}
