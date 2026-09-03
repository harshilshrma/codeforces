import java.io.*;

public class CapsLock {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        boolean case1 = true;
        for (char c : s.toCharArray()) {
            if (!Character.isUpperCase(c)) {
                case1 = false;
                break;
            }
        }

        boolean case2 = true;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (i == 0 && !Character.isLowerCase(c)) {
                case2 = false;
                break;
            } 
            
            if (i > 0 && Character.isLowerCase(c)) {
                case2 = false;
                break;
            }
        }

        StringBuilder str = new StringBuilder();

        if (case1) {
            for (char c : s.toCharArray()) str.append(Character.toLowerCase(c));
        } else if (case2) {
            str.append(Character.toUpperCase(s.charAt(0)));
            for (int i = 1; i < s.length(); i++) {
                str.append(Character.toLowerCase(s.charAt(i)));
            }
        }

        if (case1 || case2) {
            bw.write(str.toString() + "\n");
        } else {
            bw.write(s + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}