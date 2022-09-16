int searchInner(int * ,int , int, int,int);

int search(int* nums, int numsSize, int target){ 
     
    return searchInner(nums , numsSize , target , 0 , numsSize-1);
} 
 

int searchInner(int * nums , int numsSize , int target, int start , int end) { 
    
    int midpoint = (numsSize / 2) + start; 
   
    int middleElement = *(nums+midpoint); 
    int startElement = *(nums+start); 
    int endElement = *(nums+end);  
    
    if (middleElement == target) {  
        return midpoint; 
    } else if (numsSize >= 2 && target == *(nums+midpoint-1)) {  
        return midpoint-1;  
    } else if (numsSize >= 3 && target == *(nums+midpoint+1)) {  
        return midpoint+1; 
    }  
     
    if (numsSize > 3) { 
         
        if (startElement < middleElement) {  
            if (startElement <= target && target <= middleElement) {  
                return searchInner(nums , midpoint - start , target , start , midpoint-1); 
            }  
            return searchInner(nums , (numsSize - (midpoint + 1 - start)) , target , midpoint+1 , end); 
            
        } 
         
        if (middleElement < endElement) {  
            if (middleElement <= target && target <= endElement) {   
                return searchInner(nums , numsSize - (midpoint + 1 - start) , target , midpoint+1 , end); 
            }   
            return searchInner(nums , midpoint - start , target , start , midpoint-1);
        }
    }   
    return -1;
    
    
     
}