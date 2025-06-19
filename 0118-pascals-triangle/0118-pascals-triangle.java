class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        list.add(1);
        result.add(list);

        List<Integer> preRow = list;

        for (int i = 1; i < numRows; i++) {
            List<Integer> currRow = new ArrayList<>();
            currRow.add(1);
            for (int j = 1; j < i; j++) {
                currRow.add(preRow.get(j) + preRow.get(j - 1));
            }
            currRow.add(1);
            result.add(currRow);
            preRow = currRow;
        }
        return result;
    }
}