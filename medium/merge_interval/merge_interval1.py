class Solution: 
    
    def merge(self, intervals: List[List[int]]) -> List[List[int]]: 
         
        if len(intervals) == 1 or len(intervals) == 0: 
            return intervals; 
        
        length_intervals = len(intervals)
        intervals = sorted(intervals ,  key=lambda x: x[0]) 
        previous = intervals[0] 
        to_remove = []
         
        for i in range(1,length_intervals): 
            current_interval = intervals[i] 
            current_low = current_interval[0] 
            current_high = current_interval[1] 
            previous_low = previous[0] 
            previous_high = previous[1]   

            if previous_high >= current_low >= previous_low:  
                if previous_high <= current_high:  
                    intervals[i][0] = previous_low 
                    to_remove.append(i-1) 
                    previous = current_interval
                elif previous_high >= current_high: 
                    to_remove.append(i) 
            
            else: 
                previous = current_interval 
                
        for index,index_to_remove in enumerate(to_remove): 
            del intervals[index_to_remove - index] 
              
        return intervals
             
            
                
          
        
                    
        