# DBAssignment10

<p>We created a system which gets the need endpoints (as GeoJson format) in java, then we added the files data to a sql database.</p>

<h1>Setup</h1>

<p>Create a schema with name 'spatialData', then run the following  <a href="https://github.com/Mokayed/DBAssignment10/blob/master/spatialDataDump.sql" rel="nofollow">sql dump file</a>.</p>
  
<h1>Exercise 1</h1>
  
<h2>How many parks are located in exposed areas?<g-emoji class="g-emoji" alias="fountain" fallback-src="https://github.githubassets.com/images/icons/emoji/unicode/26f2.png">⛲️</g-emoji><h2>
  
  ```sql 
  SELECT count(*) as 'amount of parks in exposed areas' FROM spatialData.property where delomraade LIKE '%park%';
  ```
<h3>RESULT:</h3>

<img src="https://github.com/Mokayed/DBAssignment10/blob/master/Query1E1.PNG"/>

<h2>How many trees are located in exposed areas?<g-emoji class="g-emoji" alias="deciduous_tree" fallback-src="https://github.githubassets.com/images/icons/emoji/unicode/1f333.png">🌳</g-emoji></h2>

```sql
SELECT count(distinct traeart) as 'amount of trees in exposed area', bydelsnavn as 'tree location', byomraade as 'exposed area'  FROM spatialData.treeProperties inner join property on treeProperties.bydelsnavn = property.byomraade;
```
<h3>RESULT:</h3>

<img src="https://github.com/Mokayed/DBAssignment10/blob/master/Query2E1.PNG"/>

<h1>Exercise 2</h1>
<p>We managed  to create the needed code in our java project to read the needed endpoints (files) from http://wfs-kbhkort.kk.dk/web/ for the ex2 but we could not come more then that since we run out of time to solve the whole exercise.</p>
