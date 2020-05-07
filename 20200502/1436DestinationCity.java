class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> dest = new HashSet<>();
        Set<String> start = new HashSet<>();
        for(List<String> path:paths){
            dest.add(path.get(1));
            start.add(path.get(0));
        }
        for(String s:dest){
            if(!start.contains(s)) return s;
        }
        throw null;
    }
}