package leetcode;

public class lc1910 {
    public static void main(String[] args) {

        String s = "daabcbaabcbc", part = "abc";

        System.out.println(remove(s, part));

    }
    static String remove(String s, String part){
        StringBuilder ans = new StringBuilder();
        while (s.contains(part)){
            for (int i = 0; i < s.length()-2; i++) {
                String sub = s.substring(i, i+3);

                if (!part.equals(sub)){
                    ans.append(s.charAt(i));
                } else {
                    i += 2;
                }
            }

            s = ans.toString();
            ans = new StringBuilder();
        }



        return s;
    }
}
