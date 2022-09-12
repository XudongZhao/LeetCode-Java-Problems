class Solution {

    public int findContentChildren(int[] g, int[] s) {
        int i = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        for(int j = 0; i< g.length && j < s.length; j++) {
            if(s[j] >= g[i]) i++;
        }
        return i;
    }
}

//        Input: g = [1,2,3], s = [1,1]
//        Output: 1
//
//        Input: g = [1,2], s = [1,2,3]
//        Output: 2