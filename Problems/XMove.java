package Problems;

public class XMove {

    public static void X_Move_to_end(String str, int index, int count, String NewString) {

        if (index == str.length()) {
            for (int i = 0; i < count; i++) {
                NewString += 'x';
            }
            System.out.println(NewString);
            return;
        }

        char CurrentChar = str.charAt(index);
        if (CurrentChar == 'x') {
            count++;
            X_Move_to_end(str, index + 1, count, NewString);
        } else {
            NewString += CurrentChar;
            X_Move_to_end(str, index + 1, count, NewString);

        }
    }

    public static void main(String[] args) {
        String str = "axbcxxd";
        X_Move_to_end(str, 0, 0, "");
    }
}
