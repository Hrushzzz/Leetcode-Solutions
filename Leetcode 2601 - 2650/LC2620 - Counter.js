// Problem Link ::: https://leetcode.com/problems/counter/description/

var createCounter = function(n) {
    let count = n-1;
    return () => {
        count++;
        return(count);
    }
};
