class Solution(object): 
     
        
    def plusOne(self, digits): 
         
        length = len(digits) 
        
        if length == 0: 
            return digits 
        elif digits == [9]: 
            return [1,0] 
        elif length == 1: 
            digits[length-1] = digits[length-1] + 1
            return digits
        
        remainder = 1 
        for i in range(length-1 , -1 , -1):  
            result = digits[i] + remainder  
            if result > 9: 
                digits[i] = result % 10 
                if i == 0:   
                    digits = [1] + digits
            else:  
                digits[i] = result
                break   
                
        return digits
        
            
        