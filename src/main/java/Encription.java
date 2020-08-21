public class Encription {

    final char[] a = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public static void main(String[] args) {

        Encription e = new Encription();
        System.out.println(e.performEncription("18ind2aus9", "r2ilk4"));

    }

    public int getIndexOf(char c) {
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (Character.toLowerCase(c) == a[i]) {
                index = i;
                break;
            } else {
                index = 50;
            }
        }
        return index;
    }

    public String convert(String sentence, String keyword) {

        char[] sent_array = sentence.toCharArray();
        char[] key_array = keyword.toCharArray();
        int slen = sent_array.length;
        int klen = key_array.length;

        char[] res = new char[slen];
        String result = null;

        for (int i = 0; i < slen; i++) {
            int key_val;
            if (i <= klen - 1) {
                key_val = i;
            } else {
                key_val = i % klen;
                if (key_val == 0) {
                    key_val = klen - 1;
                } else {
                    key_val = key_val - 1;
                }
            }

            int m = getIndexOf(sent_array[i]);
            int n = getIndexOf(key_array[key_val]);

            if (n != 50) {
                if (m != 50) {
                    int value = m + n;

                    if (value <= 25) {
                        //System.out.print(a[value]);
                        res[i] = a[value];
                    } else {
                        //System.out.print(a[value-25]);
                        res[i] = a[value - 25];
                    }
                } else {
                    //System.out.print(sent_array[i]);
                    res[i] = sent_array[i];
                }
            } else {
                //System.out.print(sent_array[i]);
                res[i] = sent_array[i];
            }

        }
        result = new String(res);
        return result;
    }

    public String performEncription(String sentence, String keyword) {
        if (sentence.length() < 500 && keyword.length() < sentence.length()) {
            return convert(sentence, keyword);
        } else {
            return "Sorry, encryption can't be performed";
        }

    }
}
