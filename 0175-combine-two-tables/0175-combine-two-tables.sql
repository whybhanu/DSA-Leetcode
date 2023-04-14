# Write your MySQL query statement below
Select FirstName, LastName, City, State
from Person
Left Join Address
Using(PersonId)