/*
3. Mostrar los pokemon de tipo agua.
4. Mostrar los pokemon de tipo agua, fuego o tierra ordenados por tipo.
5. Mostrar los pokemon que son de tipo fuego y volador.
6. Mostrar los pokemon con una estadística base de ps mayor que 200.
7. Mostrar los datos (nombre, peso, altura) de la prevolución de Arbok.
8. Mostrar aquellos pokemon que evolucionan por intercambio.
9. Mostrar el nombre del movimiento con más prioridad.
*/
/*1. Mostrar el nombre de todos los pokemon.*/
select pkmn.nombre 
from pokemondb.pokemon pkmn
order by pkmn.numero_pokedex asc;
/*2. Mostrar los pokemon que pesen menos de 10k.*/
select * 
from pokemondb.pokemon pkmn
where pkmn.peso < 10
order by pkmn.numero_pokedex asc;
/*3. Mostrar los pokemon de tipo agua.*/