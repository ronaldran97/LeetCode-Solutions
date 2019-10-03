/*
Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".

 

Example 1:

Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"
Example 2:

Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"
*/

class Solution {
    public String defangIPaddr(String address) {
        String defanged = "";
        for (int i = 0; i < address.length(); i++) {
            //System.out.println(address.charAt(i));
            
            if (address.charAt(i) == '.') {

                defanged += "[.]";  //add the [.]

            } else {
                defanged += address.charAt(i);
            }
        }
        
        return defanged;
    }
}
