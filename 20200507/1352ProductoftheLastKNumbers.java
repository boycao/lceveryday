class ProductOfNumbers {
    List<Integer> list;
    int prev;
    public ProductOfNumbers() {
        list = new ArrayList<>();
        prev = 1;
    }
    
    public void add(int num) {
        if(num==0){
            list = new ArrayList<>();
            prev = 1;
            return;
        }
        prev *= num;
        list.add(prev);
    }
    
    public int getProduct(int k) {
        if(list.size()<k) return 0;
        if(list.size()==k) return list.get(list.size()-1);
        return list.get(list.size()-1)/list.get(list.size()-1-k);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */