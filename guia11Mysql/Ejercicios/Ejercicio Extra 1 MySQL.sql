/*1. Mostrar el nombre de todos los jugadores ordenados alfabéticamente.*/
select j.nombre from nba.jugador j order by j.nombre;
/*2. Mostrar el nombre de los jugadores que sean pivots (‘C’) y que pesen más de 200 libras,
ordenados por nombre alfabéticamente.*/
select j.nombre from nba.jugador j where j.posicion  = 'c' and j.peso >= 200 order by j.nombre;
/*3. Mostrar el nombre de todos los equipos ordenados alfabéticamente.*/
select e.nombre as Nombre_equipo from nba.equipo e order by e.nombre asc;
/*4. Mostrar el nombre de los equipos del este (East).*/
select e.nombre from nba.equipo e where e.conferencia ='East';
/*5. Mostrar los equipos donde su ciudad empieza con la letra ‘c’, ordenados por nombre.*/
select * from nba.equipo e where e.ciudad like 'c%';
/*6. Mostrar todos los jugadores y su equipo ordenados por nombre del equipo.*/
select  j.nombre as Nombre_jugador,j.nombre_equipo from nba.jugador j order by j.nombre_equipo;
/*7. Mostrar todos los jugadores del equipo “Raptors” ordenados por nombre.*/
select  j.nombre as Nombre_jugador,j.nombre_equipo from nba.jugador j where j.nombre_equipo = 'Raptors' order by j.nombre;
/*8. Mostrar los puntos por partido del jugador ‘Pau Gasol’.*/
select e.jugador as 'Pau Gasol',
e.Puntos_por_partido
from nba.estadistica e 
where e.jugador = (select  j.codigo from nba.jugador j where j.nombre = 'Pau Gasol');
/*9. Mostrar los puntos por partido del jugador ‘Pau Gasol’ en la temporada ’04/05′.*/
select e.jugador as 'Pau Gasol',
e.Puntos_por_partido,
e.temporada
from nba.estadistica e 
where e.jugador = (select  j.codigo from nba.jugador j where j.nombre = 'Pau Gasol') and e.temporada = '04/05';
/*10. Mostrar el número de puntos de cada jugador en toda su carrera.*/
select j.nombre,sum(e.Puntos_por_partido) as Puntos_carrera 
from nba.jugador j 
inner join nba.estadistica e 
on (j.codigo = e.jugador ) 
group by j.nombre 
order by j.nombre asc;
/*11. Mostrar el número de jugadores de cada equipo.*/
select j.nombre_equipo,count(*) as Jugadores from nba.jugador j group by j.nombre_equipo;
/*12. Mostrar el jugador que más puntos ha realizado en toda su carrera.*/
select j.nombre,sum(e.Puntos_por_partido) as Puntos_carrera 
from nba.jugador j 
inner join nba.estadistica e 
on (j.codigo = e.jugador ) 
group by j.nombre
order by Puntos_carrera  desc
limit 1;
/*13. Mostrar el nombre del equipo, conferencia y división del jugador más alto de la NBA.*/
select j.nombre as Jugador,
j.nombre_equipo,
eq.conferencia,
eq.division
from nba.jugador j 
inner join nba.equipo eq
on(j.nombre_equipo = eq.nombre)
order by j.altura desc limit 1;
/*14. Mostrar la media de puntos en partidos de los equipos de la división Pacific.*/
select eq.nombre as Equipo,
eq.division,
avg(p.puntos_local+p.puntos_visitante) as 'Media Puntos de partidos'
from nba.partido p 
inner join nba.equipo eq on( p.equipo_local = eq.nombre or p.equipo_visitante = eq.nombre)
where eq.division = 'pacific'
group by eq.nombre;
/*15. Mostrar el partido o partidos (equipo_local, equipo_visitante y diferencia) con mayor
diferencia de puntos.*/
select p.equipo_local,
p.equipo_visitante,
(p.puntos_local-p.puntos_visitante) as "Diferencia puntos (Local - Visitante)"
from nba.partido p
where (p.puntos_local-p.puntos_visitante) = (select max(p.puntos_local-p.puntos_visitante) from nba.partido p) 
or (p.puntos_local-p.puntos_visitante) =  -(select max(p.puntos_local-p.puntos_visitante) from nba.partido p);
/*16. Mostrar la media de puntos en partidos de los equipos de la división Pacific. De nuevo? ya fue Atlantic*/
select eq.nombre as Equipo,
eq.division,
avg(p.puntos_local+p.puntos_visitante) as 'Media Puntos de partidos'
from nba.partido p 
inner join nba.equipo eq on( p.equipo_local = eq.nombre or p.equipo_visitante = eq.nombre)
where eq.division = 'Atlantic'
group by eq.nombre;