public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.canConstruct("aa","aab"));

//        String a = "ab";
//        System.out.println(a.substring(0,0) + a.substring(1));
    }



  public boolean canConstruct(String ransonNote, String magazine) {
      for (int i = 0; i < ransonNote.length(); i++) {
          char r = ransonNote.charAt(i);

          int matchingIndex = magazine.indexOf(r);

          if (matchingIndex == -1) {
              return false;
          }
          magazine = magazine.substring(0, matchingIndex) + magazine.substring(matchingIndex + 1);
      }
      return true;

  }

}
