class Solution {
    public boolean isAnagram(String s, String t) {
      char[] p = s.toCharArray();
      Arrays.sort(p);

    s = new String(p);
    char[] q = t.toCharArray();
    Arrays.sort(q);

     t = new String(q);
     
    return Arrays.equals(p, q);
    }
}
