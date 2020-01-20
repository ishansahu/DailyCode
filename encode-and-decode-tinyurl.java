public class Codec {

    // Encodes a URL to a shortened URL.
    static String start = "http://tinyurl.com/";
    HashMap<String, String> map;
    HashMap<String, String> keymap;
    public String encode(String longUrl){
        map = new HashMap();
        keymap = new HashMap();
        if(map.containsKey(longUrl)) return start + map.get(longUrl);
        char[] charset = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
        StringBuilder sb;
        do{
            sb = new StringBuilder();
            for(int i=0; i<6; i++){
                sb.append(charset[(int)Math.random()*62]);  
            }
        }while(map.containsKey(sb.toString()));
        map.put(longUrl, sb.toString());
        keymap.put(sb.toString(), longUrl);
        return start + sb.toString();
    }
    
    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return keymap.get(shortUrl.replace(start,""));
    }
    
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));