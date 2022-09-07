#define CAPACITY 100000
 
bool isHappyInner(int , int [] , int); 

bool isHappy(int n) {  
    int checked[CAPACITY];  
    int current = 0;  
     
    return isHappyInner(n , checked, current);
} 
 
 
bool isHappyInner(int n , int array[] , int current){ 
     
    if (n == 1 || n == 10) { 
        return true; 
    } 
    
    int sum = 0 , value; 
    while (n > 0) {  
        value = n%10; 
        sum += value * value;  
        n /= 10; 
    }   
      
    if (sum == 1) { 
        return true; 
    } else {   
        for (int i = 0 ; i < current ; i++) { 
            if (array[i] == sum){   
                return false; 
            } 
        } 
        array[current++] = sum; 
        return isHappyInner(sum , array , current); 
    } 

}