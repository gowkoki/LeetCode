class TwoSum {
    private List<Integer> list;

    public TwoSum() {
        list = new ArrayList<>();
    }

    public void add(int number) {
        list.add(number);
    }

    public boolean find(int value) {
        Collections.sort(list);
        int left = 0;
        int right = list.size()-1;

        while (left < right) {
            int sum = list.get(left) + list.get(right);

            if (sum > value) {
                right--;
            } else if (sum < value) {
                left++;
            } else {
                return true;
            }
        }

        return false;
    }
}

/**
 * Your TwoSum object will be instantiated and called as such:
 * TwoSum obj = new TwoSum();
 * obj.add(number);
 * boolean param_2 = obj.find(value);
 */