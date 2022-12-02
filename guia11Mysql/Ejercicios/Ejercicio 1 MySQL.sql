/*a) A continuación, realizar las siguientes consultas sobre la base de datos personal:
22. Hallar el salario más alto, el más bajo y la diferencia entre ellos.
23. Hallar el salario promedio por departamento.
Consultas con Having
24. Hallar los departamentos que tienen más de tres empleados. Mostrar el número de
empleados de esos departamentos.
25. Mostrar el código y nombre de cada jefe, junto al número de empleados que dirige.
Solo los que tengan más de dos empleados (2 incluido).
26. Hallar los departamentos que no tienen empleados
Consulta con Subconsulta
27. Mostrar la lista de los empleados cuyo salario es mayor o igual que el promedio de la
empresa. Ordenarlo por departamento.
*/
/*1. Obtener los datos completos de los empleados.*/
select * from personal.empleado;
/*2. Obtener los datos completos de los departamentos.*/
select * from personal.departamento;
/*3. Listar el nombre de los departamentos.*/
select distinct d.nombre_depto from personal.departamento d;
/*4. Obtener el nombre y salario de todos los empleados.*/
select e.nombre,e.salario from personal.empleado e;
/*5. Listar todas las comisiones.*/
select e.comision from personal.empleado e;
/*6. Obtener los datos de los empleados cuyo cargo sea ‘Secretaria’.*/
select * from personal.empleado e where e.cargo ='Secretaria';
/*7. Obtener los datos de los empleados vendedores, ordenados por nombre alfabéticamente.*/
select * from personal.empleado e where e.cargo ='vendedor' order by e.nombre asc;
/*8. Obtener el nombre y cargo de todos los empleados, ordenados por salario de menor a mayor.*/
select e.nombre,e.cargo from personal.empleado e order by salario asc;
/*9. Elabore un listado donde para cada fila, figure el alias ‘Nombre’ y ‘Cargo’ para las respectivas tablas de empleados.*/
select e.nombre as Nombre,e.cargo as Cargo from personal.empleado e order by e.nombre asc;
/*10. Listar los salarios y comisiones de los empleados del departamento 2000, ordenado
por comisión de menor a mayor.*/
select e.salario as Salario,
e.comision as Comisiones
from personal.empleado e where e.id_depto = 2000 order by e.comision asc;
/*11. Obtener el valor total a pagar que resulta de sumar el salario y la comisión de los
empleados del departamento 3000 una bonificación de 500, en orden alfabético del
empleado.*/
select e.nombre as Nombre, 
e.salario+e.comision+500 as Total_a_Pagar 
from personal.empleado e where e.id_depto = 3000 order by e.nombre asc;
/*12. Muestra los empleados cuyo nombre empiece con la letra J.*/
select * from personal.empleado e where e.nombre like 'j%';
/*13. Listar el salario, la comisión, el salario total (salario + comisión) y nombre, de aquellos
empleados que tienen comisión superior a 1000.*/
select e.salario as Salario,e.comision as Comision,e.salario+e.comision as Salario_total from personal.empleado e;
/*14. Obtener un listado similar al anterior, pero de aquellos empleados que NO tienen
comisión.*/
select e.salario as Salario,
e.comision as Comision,
e.salario+e.comision as Salario_total 
from personal.empleado 
e where e.comision = 0;
/*15. Obtener la lista de los empleados que ganan una comisión superior a su sueldo.*/
select e.salario as Salario,
e.comision as Comision,
e.salario+e.comision as Salario_total 
from personal.empleado 
e where e.comision = 0;
/*16. Listar los empleados cuya comisión es menor o igual que el 30% de su sueldo.*/
select * from personal.empleado e where e.comision <= ( e.salario * 0.3);
/*17. Hallar los empleados cuyo nombre no contiene la cadena “MA”*/
select * from personal.empleado e where e.nombre not like '%MA%';
/*18. Obtener los nombres de los departamentos que sean “Ventas”,“Investigación” y
‘Mantenimiento.*/
select distinct
d.nombre_depto
from personal.departamento d
where d.nombre_depto in('Ventas','Investigación','Mantenimiento');
/*19. Ahora obtener los nombres de los departamentos que no sean “Ventas” ni
“Investigación” ni ‘Mantenimiento.*/
select 
d.nombre_depto
from personal.departamento d
where d.nombre_depto not in('Ventas','Investigación','Mantenimiento');
/*20. Mostrar el salario más alto de la empresa.*/
select max(e.salario) as salario_más_alto from personal.empleado e;
/*21. Mostrar el nombre del último empleado de la lista por orden alfabético.*/
select e.nombre from personal.empleado e where e.nombre =(select e.nombre from personal.empleado e order by e.nombre desc limit 1);