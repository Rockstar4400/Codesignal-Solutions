/*Please add ; after each select statement*/
CREATE PROCEDURE projectsTeam()
BEGIN
	SELECT DISTINCT name from projectLog  GROUP BY id ORDER BY name ASC;
END