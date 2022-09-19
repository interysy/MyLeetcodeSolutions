class Solution: 
    
    def findBall(self, grid: List[List[int]]) -> List[int]: 
          
        columns = len(grid[0]) 
        rows = len(grid) 
        answer = []
         
        for ball_number in range(columns):   
            position = ball_number  
            stopped = False 
            row = 0
            for row in range(rows):   
                left = position - 1 
                right = position + 1  
                
                if columns > left >= 0:  
                    if grid[row][left] == 1 and grid[row][position] == -1: 
                        stopped = True
                        break
                elif grid[row][position] == -1: 
                        stopped = True
                        break 
                        
                if (columns > right >= 0):   
                    if grid[row][right] == -1 and grid[row][position] == 1: 
                        stopped = True
                        break    
                elif grid[row][position] == 1: 
                        stopped = True
                        break 
                      
                if grid[row][position] == 1:
                    position += 1 
                elif grid[row][position] == -1:
                    position -= 1 
                     
                if not (columns > position >= 0): 
                    stopped = True
                    break 
                     
                
            if not stopped: 
                answer.append(position)
            else: 
                answer.append(-1)
                
        return answer
            
            
                
        
        
