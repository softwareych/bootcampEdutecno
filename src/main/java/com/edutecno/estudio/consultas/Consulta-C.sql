/*CONSULTA C
la cantidad de productos de cada categoría, ordenado de mayor a menor cantidad*/

SELECT    PRODUCT.category_id
		, CATEGORY.category_name
		, COUNT(*)
FROM bikeshop.products AS PRODUCT
INNER JOIN bikeshop.categories AS CATEGORY ON PRODUCT.category_id = CATEGORY.category_id
GROUP BY 1
ORDER BY 3 DESC
;