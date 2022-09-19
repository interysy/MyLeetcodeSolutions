class Solution(object): 
     
    def __init__(self): 
        self.minutes = 0  
        self.rows = 0 
        self.columns = 0 
         
            
    def orangesRotting(self, grid):   
        self.rows = len(grid) 
        self.columns = len(grid[0])  
        
        done = {} 
        flag = False
        while True: 
            results = []
            for i in range(self.rows): 
                for j in range(self.columns):   
                    if grid[i][j] == 2 and done.get((i,j),False) == False:  
                        self.addCoordinates(i,j-1,results) 
                        self.addCoordinates(i-1,j,results)  
                        self.addCoordinates(i+1,j,results)   
                        self.addCoordinates(i,j+1,results)  
                        done[(i,j)] = True   
                    elif grid[i][j] == 1: 
                        flag = True
              
            if not flag: 
                return 0
            elif len(results) == 0:  
                for i in range(self.rows): 
                    for j in range(self.columns):    
                        if grid[i][j] == 1: 
                            return -1
                return self.minutes-1
        
            for i,j in results: 
                self.rotOranges(grid,i,j)
            self.minutes += 1   
     
    def addCoordinates(self,i,j , results): 
        if (self.rows > i >= 0 and self.columns > j >= 0): 
            results.append((i,j))
    
    def rotOranges(self,grid, i , j):  
        if self.rows > i >= 0 and self.columns >j >= 0 and grid[i][j] == 1:
            grid[i][j] = 2
            return True 
        return False