SELECT NAME,
       AGE(FINISH_DATE, START_DATE) AS project_duration
FROM PROJECT
ORDER BY project_duration DESC
LIMIT 1;