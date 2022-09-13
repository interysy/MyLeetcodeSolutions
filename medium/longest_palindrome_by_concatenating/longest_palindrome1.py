from collections import defaultdict 
     
class Solution(object): 
     
    def checkPalindrome(self, string):  
        return string == string[::-1]
                
    def checkOdd(self,value): 
        return value % 2 == 1 

    def longestPalindrome(self, words):    
        if len(words) == 0 : 
            return 0 
        elif len(words) == 1 and self.checkPalindrome(words[0]): 
            return len(words[0]) 
        elif len(words) == 1: 
            return 0 

        total = 0  
        longest = 0
        dct = defaultdict(int) 
         
        for word in words: 
            dct[word]+=1 
       
        for key,val in dct.items():  
            reverse_key = key[::-1] 
            key_length = len(key) 
            
            if dct[reverse_key]> 0 and reverse_key != key:  
                while (dct[key] > 0 and dct[reverse_key] > 0):  
                    total += key_length * 2 
                    dct[key] -= 1
                    dct[reverse_key] -= 1 
            elif key == reverse_key:   
                if self.checkOdd(val): 
                    val -= 1
                total += key_length * val  
                dct[key] -= val
      
        for key,val in dct.items():  
            if val > 0:   
                key_length = len(key)
                if key_length > longest and self.checkPalindrome(key):  
                    longest = key_length 
                     
        return total + longest
                 