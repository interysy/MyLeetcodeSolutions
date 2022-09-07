class Solution(object): 
     
         
    def spiralOrder(self, matrix): 
         
        return self.spiralOrderInner(matrix , [])
         
         
    def spiralOrderInner(self , matrix , order):  
        if len(matrix[0]) == 0: 
            return order
        elif len(matrix) == 1: 
            return order + matrix[0]  
        elif len(matrix) == 2: 
            matrix[1] = matrix[1][::-1] 
            return order + matrix[0] + matrix[1] 
        elif len(matrix[0]) == 1: 
            for i in range(0,len(matrix)): 
                order += [matrix[i][0]]
            return  order
        else:
            order += matrix[0]   
            for i in range(1 , len(matrix) - 1): 
                order = order + [matrix[i][-1]] 

            order += matrix[-1][::-1] 

            for i in range(len(matrix)-2  , 0 ,-1):  
                order = order + [matrix[i][0]]  
             
            matrix =  matrix[1:-1] 
            
            for i in range(0,len(matrix)): 
                del matrix[i][0] 
                del matrix[i][-1] 
            
             
            return self.spiralOrderInner(matrix , order)
