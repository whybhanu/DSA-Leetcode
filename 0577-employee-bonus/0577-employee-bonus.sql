# Write your MySQL query statement below
Select name, bonus 
from employee Left Join Bonus USING(empId)
Where coalesce(bonus, 0) < 1000; 