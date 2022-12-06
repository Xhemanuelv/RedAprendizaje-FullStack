/*Abrir el script de la base de datos llamada “tienda.sql” y ejecutarlo para crear sus tablas e
insertar datos en las mismas. A continuación, generar el modelo de entidad relación. Deberá
obtener un diagrama de entidad relación igual al que se muestra a continuación:
*/
/*A continuación, se deben realizar las siguientes consultas sobre la base de datos:
1. Devuelve todos los productos del fabricante Lenovo. (Sin utilizar INNER JOIN).
2. Devuelve todos los datos de los productos que tienen el mismo precio que el producto
más caro del fabricante Lenovo. (Sin utilizar INNER JOIN).
3. Lista el nombre del producto más caro del fabricante Lenovo.
4. Lista todos los productos del fabricante Asus que tienen un precio superior al precio
medio de todos sus productos.

Subconsultas con IN y NOT IN

1. Devuelve los nombres de los fabricantes que tienen productos asociados. (Utilizando IN o
NOT IN).
2. Devuelve los nombres de los fabricantes que no tienen productos asociados. (Utilizando
IN o NOT IN).
Subconsultas (En la cláusula HAVING)
1. Devuelve un listado con todos los nombres de los fabricantes que tienen el mismo número
de productos que el fabricante Lenovo.*/
/*1. Lista el nombre de todos los productos que hay en la tabla producto.*/
select p.nombre from tienda.producto p;
/*2. Lista los nombres y los precios de todos los productos de la tabla producto.*/
select p.nombre,p.precio from tienda.producto p;
/*3. Lista todas las columnas de la tabla producto.*/
select * from tienda.producto;
/*4. Lista los nombres y los precios de todos los productos de la tabla producto, redondeando
el valor del precio.*/
select p.nombre, round(p.precio) as Precio_redondeado from tienda.producto p;
/*5. Lista el código de los fabricantes que tienen productos en la tabla producto.*/
select f.nombre as Nombre_fabricante,
p.codigo_fabricante as ID_fabricante 
from tienda.producto p 
inner join tienda.fabricante f 
on (p.codigo_fabricante = f.codigo);
/*6. Lista el código de los fabricantes que tienen productos en la tabla producto, sin mostrar
los repetidos.*/
select distinct f.nombre as Nombre_fabricante,
p.codigo_fabricante as ID_fabricante 
from tienda.producto p 
inner join tienda.fabricante f 
on (p.codigo_fabricante = f.codigo);
/*7. Lista los nombres de los fabricantes ordenados de forma ascendente.*/
select f.nombre from tienda.fabricante f order by f.nombre asc;
/*8. Lista los nombres de los productos ordenados en primer lugar por el nombre de forma
ascendente y en segundo lugar por el precio de forma descendente.*/
select p.nombre,p.precio from tienda.producto p order by p.nombre asc,p.precio desc;
/*9. Devuelve una lista con las 5 primeras filas de la tabla fabricante.*/
select  *,row_number() over(order by f.nombre asc) as Fila from tienda.fabricante f limit 5;
/*10. Lista el nombre y el precio del producto más barato. (Utilice solamente las cláusulas
ORDER BY y LIMIT)*/
select p.nombre,p.precio from tienda.producto p order by p.precio asc limit 1;
/*11. Lista el nombre y el precio del producto más caro. (Utilice solamente las cláusulas ORDER
BY y LIMIT)*/
select p.nombre,p.precio from tienda.producto p order by p.precio desc limit 1;
/*12. Lista el nombre de los productos que tienen un precio menor o igual a $120.*/
select p.nombre from tienda.producto p where p.precio <= 120;
/*13. Lista todos los productos que tengan un precio entre $60 y $200. Utilizando el operador
BETWEEN.*/
select * from tienda.producto where tienda.producto.precio between 60 and 200;
/*14. Lista todos los productos donde el código de fabricante sea 1, 3 o 5. Utilizando el operador
IN.*/
select * from tienda.producto where tienda.producto.codigo_fabricante in(1,3,5);
/*15. Devuelve una lista con el nombre de todos los productos que contienen la cadena Portátil
en el nombre.*/
select tienda.producto.nombre from tienda.producto where tienda.producto.nombre like 'portatil%';
/*

Consultas Multitabla

*/
/*1. Devuelve una lista con el código del producto, nombre del producto, código del fabricante
y nombre del fabricante, de todos los productos de la base de datos.*/
select p.codigo as "Codigo producto",
p.nombre as "Nombre del producto",
f.codigo as "Codigo Fabricante",
f.nombre as "Nombre del fabricante"
from tienda.producto p 
inner join tienda.fabricante f 
on (p.codigo_fabricante = f.codigo);
/*2. Devuelve una lista con el nombre del producto, precio y nombre de fabricante de todos
los productos de la base de datos. Ordene el resultado por el nombre del fabricante, por
orden alfabético.*/
select p.nombre,
p.precio,
f.nombre 
from tienda.producto p 
inner join tienda.fabricante f 
on(p.codigo_fabricante = f.codigo) 
order by f.nombre asc;
/*3. Devuelve el nombre del producto, su precio y el nombre de su fabricante, del producto
más barato.*/
select p.nombre as Producto,
p.precio as Precio,
f.nombre as Fabricante
from tienda.producto p 
inner join tienda.fabricante f
on (p.codigo_fabricante =f.codigo)
order by precio asc limit 1;
/*4. Devuelve una lista de todos los productos del fabricante Lenovo.*/
select p.codigo as Cod_prod,
p.nombre as Nombre_prod,
p.precio as Precio,
p.codigo_fabricante as Cod_Fabricante,
f.nombre as Nombre_fabricante 
from tienda.producto p 
inner join tienda.fabricante f 
on(p.codigo_fabricante = f.codigo) 
where f.nombre = 'Lenovo'; 
/*5. Devuelve una lista de todos los productos del fabricante Crucial que tengan un precio
mayor que $200.*/
select p.codigo as Cod_prod,
p.nombre as Nombre_prod,
p.precio as Precio,
p.codigo_fabricante as Cod_Fabricante,
f.nombre as Nombre_fabricante 
from tienda.producto p 
inner join tienda.fabricante f 
on(p.codigo_fabricante = f.codigo) 
where f.nombre = 'Crucial' 
and p.precio > 200;
/*6. Devuelve un listado con todos los productos de los fabricantes Asus, Hewlett-Packard.
Utilizando el operador IN.*/
select p.codigo as Cod_prod,
p.nombre as Nombre_prod,
p.precio as Precio,
p.codigo_fabricante as Cod_Fabricante,
f.nombre as Nombre_fabricante 
from tienda.producto p 
inner join tienda.fabricante f 
on(p.codigo_fabricante = f.codigo) 
where f.nombre in('Asus','Hewlett-Packard');
/*7. Devuelve un listado con el nombre de producto, precio y nombre de fabricante, de todos
los productos que tengan un precio mayor o igual a $180. Ordene el resultado en primer
lugar por el precio (en orden descendente) y en segundo lugar por el nombre (en orden
ascendente)*/
select 
p.nombre as Nombre_producto,
p.precio as Precio,
f.nombre as Nombre_fabricante 
from tienda.producto p 
inner join tienda.fabricante f 
on(p.codigo_fabricante = f.codigo) 
where p.precio >= 180
order by p.precio desc,p.nombre asc;
/*
Consultas Multitabla
Resuelva todas las consultas utilizando las cláusulas LEFT JOIN y RIGHT JOIN.
*/
/*1. Devuelve un listado de todos los fabricantes que existen en la base de datos, junto con los
productos que tiene cada uno de ellos. El listado deberá mostrar también aquellos
fabricantes que no tienen productos asociados.*/
select f.nombre as Fabricante,
p.nombre as Producto,
p.precio as "Precio(USD)"
from tienda.fabricante f 
left join tienda.producto p 
on (p.codigo_fabricante = f.codigo);
/*2. Devuelve un listado donde sólo aparezcan aquellos fabricantes que no tienen ningún
producto asociado.*/
select f.nombre as Fabricante,
p.nombre as Producto,
p.precio as "Precio(USD)"
from tienda.fabricante f 
left join tienda.producto p 
on (p.codigo_fabricante = f.codigo);
select * 
from tienda.fabricante f 
left join tienda.producto p 
on (p.codigo_fabricante = f.codigo)
where p.codigo_fabricante is null;
/*
Subconsultas (En la cláusula WHERE)
Con operadores básicos de comparación
*/
/*1. Devuelve todos los productos del fabricante Lenovo. (Sin utilizar INNER JOIN).*/
select * from tienda.producto p where p.codigo_fabricante = (select f.codigo from tienda.fabricante f where f.nombre ='lenovo');