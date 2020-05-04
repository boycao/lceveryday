class Solution {
    public String entityParser(String text) {
        LinkedHashMap<String,String> map = new LinkedHashMap<>();
        map.put("&quot;","\"");
        map.put("&apos;","\'");
        map.put("&gt;",">");
        map.put("&lt;","<");
        map.put("&frasl;","/");
        map.put("&amp;","&");
        //testcase "&amp;gt;" wont pass if using a normal hashamp since the &amp; will creat a new & that will cause new replace
        // thus we use a linked hashmap , so that it would be iterate through order, and only till end we creat the &
        for(String key:map.keySet()){
            if(text.contains(key)){
                //string is immutable, you have to assign it back to itself
                text=text.replaceAll(key,map.get(key));
            }
        }
        return text;
    }
}