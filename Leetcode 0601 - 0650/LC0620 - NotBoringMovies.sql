-- Problem Link ::: https://leetcode.com/problems/not-boring-movies/description/

SELECT * FROM Cinema cin
WHERE cin.id % 2 != 0 
AND cin.description != "boring"
ORDER BY cin.rating DESC;