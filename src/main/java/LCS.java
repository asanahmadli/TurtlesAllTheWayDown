public class LCS {

    public String lcs(String a, String b) {
        int start = 0;
        int length = 0;

        if (a.length() <= b.length()) {
            if (start == a.length()) return "";
            String lcs = "";
            for (int i = start = 0; i < b.length(); i++) {
                if (a.charAt(start) == b.charAt(i)) {
                    lcs = a.charAt(start) + "";
                }
            }
            return lcs + lcs(a.substring(start + 1), b);
        } else {
            if (start == b.length()) return "";
            String lcs1 = "";
            for (int i = start = 0; i < a.length(); i++) {
                if (b.charAt(start) == a.charAt(i)) {
                    lcs1 = b.charAt(start) + "";
                }
            }
            return lcs1 + lcs(a, b.substring(start + 1));
        }


    }

}
