class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb= new StringBuilder();
        for(int i=0; i<address.length(); i++){
            if(address.charAt(i)=='.'){
                sb.append("[.]");
            }else{
                sb.append(address.charAt(i));
            }
        }
        return sb.toString();
    }    
}
/*

class Solution {
    public String defangIPaddr(String address) {
        String str= address.replace(".","[.]");
        return str;
    }    
}
*/
