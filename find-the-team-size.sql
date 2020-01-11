# Write your MySQL query statement below
select employee_id, team_size from employee e, 
(select team_id, count(team_id) team_size from employee a
group by team_id) as e1 where e.team_id = e1.team_id