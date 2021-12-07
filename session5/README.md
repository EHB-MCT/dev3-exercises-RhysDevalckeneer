# Dev 3 - Session 5

## Exercise 1 - First batch

| Query                                                         | Answer                  |
|---------------------------------------------------------------|-------------------------|
| SELECT * FROM products WHERE productCode LIKE 'S24_3856'      | 1956 Porsche 356A Coupe |
| SELECT AVG(buyPrice) FROM  products                           | 54.395182               |
| SELECT COUNT(*) FROM products WHERE productName LIKE '%Ford%' | 15                      |
| SELECT MAX(buyPrice) FROM products                            | 103.42                  |
| SELECT COUNT(*) FROM products WHERE productLine LIKE 'Ships'  | 9                       |

## Exercise 2 - Second batch

| Query                                                                                                                                                                                                                                                                                                                            | Answer |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------|
| SELECT COUNT(orderNumber) as 'Order Ammount' from orders where customerNumber="328"                                                                                                                                                                                                                                              | 3      |
| SELECT COUNT(orders.customerNumber) as 'Orders Julie', customers.contactLastName, customers.contactFirstName  from customers LEFT JOIN orders ON customers.customerNumber= orders.customerNumber where customers.contactFirstName="JULIE" AND customers.contactLastName="YOUNG"                                                  | 3      |
| SELECT count(customerName) as "# Customer USA" from customers WHERE country="usa" and creditLimit="0"                                                                                                                                                                                                                            | 1      |
| SELECT customers.customerName,customers.customerNumber, customers.contactFirstName, customers.contactLastName,  sum(amount)/count(customers.customerNumber) as "average" from customers left join payments on payments.customerNumber=customers.customerNumber  group by customers.customerNumber order by average desc limit 1; |        |