/**
 * // This is the HtmlParser's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface HtmlParser {
 *     public List<String> getUrls(String url) {}
 * }
 */
class Solution {
    public List<String> crawl(String startUrl, HtmlParser htmlParser) {
        Queue<String> queue = new LinkedList<>();
        Set<String> set =new HashSet<>();
        String host = startUrl.split("/")[2];
        queue.offer(startUrl);
        set.add(startUrl);
        while(!queue.isEmpty()){
            String url = queue.poll();
            for(String s:htmlParser.getUrls(url)){
                if(s.contains(host) && !set.contains(s)){
                    queue.offer(s);
                    set.add(s);
                }
            }
        }
        List<String> res = new ArrayList<>();
        res.addAll(set);
        return res;
    }
}