class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        List<String> resultList = new ArrayList<>();
        String[] result = text.split(" ");
        for(int i=0; i< result.length -2;i++)
            if(result[i].equals(first) && result[i+1].equals(second)) resultList.add(result[i+2]);
        return resultList.toArray(new String[0]);
    }
}