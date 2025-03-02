-- Problem Link ::: https://leetcode.com/problems/product-sales-analysis-i/description/

SELECT prod.product_name, sale.year, sale.price 
FROM Sales sale JOIN Product prod using (product_id) 
GROUP BY sale.year , sale.sale_id;