class Solution2 {
    public int candy(int[] ratings) {
        int size = ratings.length;
        if (size < 2) {
            return size;
        }
        int[] c = new int[size];
        Arrays.fill(c, 1);
        for (int i = 1; i < size; ++i) {
            if (ratings[i] > ratings[i - 1]) {
                c[i] = c[i - 1] + 1;
            }
        }

        for (int i = size - 1; i > 0; --i) {
            if (ratings[i] < ratings[i - 1]) {
                c[i - 1] = Math.max(c[i - 1], c[i] + 1);
            }
        }

        return Arrays.stream(c).sum();
    }
}

//先分析输入和输出
//ratings既是小朋友的打分，也代表了一个小朋友，用下标i表示
//c代表给出的糖果数量

//Input: ratings = [1,0,2]
//Output: 5
//先让c = [1,1,1],然后从左往右循环，c = [1,1,2],再从右向左循环，c = [2,1,2]


//Input: ratings = [1,2,2]
//Output: 4
//先让c = [1,1,1],然后从左往右循环，c = [1,2,1],再从右向左循环，c = [1,2,1]

//Input
//[1,3,2,2,1]
//先让c = [1,1,1,1,1],然后从左往右循环，c = [1,2,1,1,1],再从右向左循环，c = [1,2,1,2,1]
//Output
//7

