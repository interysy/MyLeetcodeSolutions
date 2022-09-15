class Solution(object): 
     
         
    def binarySearch(self, elements, target): 
          
      
        if len(elements) == 1:  
            if elements[0] != target: 
                return False 
            else: 
                return True 
        elif len(elements) == 0 : 
            return False 
        
        mid_point = len(elements) // 2  
        mid_element = elements[mid_point] 
         
        if mid_element > target: 
            return self.binarySearch(elements[:mid_point],target) 
        elif mid_element < target: 
            return self.binarySearch(elements[mid_point+1:] , target) 
        elif mid_element == target: 
            return True  
        
        
    def searchMatrix(self, matrix, target):
          
        matrix_row_length = len(matrix)  
         
        if matrix_row_length == 0: 
            return False 
        elif matrix_row_length == 1:
            return self.binarySearch(matrix[0] , target)
        
        mid_row = matrix_row_length / 2 
        continue_search = self.binarySearch(matrix[mid_row] , target) 
         
        if continue_search: 
            return True  
        else: 
            if matrix[mid_row][0] == target: 
                return True
            elif matrix[mid_row][0] > target: 
                matrix = matrix[:mid_row]   
            else:   
                matrix = matrix[mid_row+1:]  
        
        return self.searchMatrix(matrix , target)