
int getSum(int); 
  
bool isHappy(int n) {   
    int slow, fast; 
    slow = fast = n; 
     
    do {    
        slow = getSum(slow);
        fast = getSum(fast); 
        fast = getSum(fast);
    } while (fast != 1 && slow != fast); 
     
    if (fast == 1) { 
        return true;
    } 
    return false;
}

int getSum(int n) { 
     
   if (n == 1 || n == 10) { 
        return 1; 
    } 
    
    int sum = 0 , value; 
    while (n > 0) {  
        value = n%10; 
        sum += value * value;  
        n /= 10; 
    }     
     
    return sum;    
} 
 