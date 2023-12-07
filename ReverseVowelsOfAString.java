
/*


345. Reverse Vowels of a String
Easy
4.2K
2.7K
Companies
Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

 

Example 1:

Input: s = "hello"
Output: "holle"
Example 2:

Input: s = "leetcode"
Output: "leotcede"

*/
class Solution {
  static Set<Character> set = new HashSet<>();

    public static String reverseVowels(String str) {


        //String s = str;
        char[] s = str.toCharArray();

        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        
        System.out.println(set);
        int i = 0;
        int j = s.length - 1;


        while (i < j) {
            boolean isIAVowel = isVowel(s[i]);
            boolean isJAVowel = isVowel(s[j]);

            if ((isIAVowel) && (isJAVowel)) {
                //swap the vowels
                char temp = s[i];
                s[i] = s[j];
                s[j] = temp;

                i++;
                j--;
            } else if ((isIAVowel) && (!isJAVowel)) {
                j--;
            } else {
                i++;
            } 
        }
        return String.valueOf(s);
    }

    public static boolean isVowel(char ch) {
        return set.contains(ch);
    }
}