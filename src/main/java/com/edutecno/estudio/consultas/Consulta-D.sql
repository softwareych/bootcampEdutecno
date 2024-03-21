/*CONSULTA D
cantidad de inventario de productos por marca, ordenado descendentemente*/

SELECT    PRODUCTO.brand_id
		, MARCA.brand_name
		, SUM(STOCK.quantity)
FROM bikeshop.products AS PRODUCTO
INNER JOIN bikeshop.brands AS MARCA ON PRODUCTO.brand_id = MARCA.brand_id
INNER JOIN bikeshop.stocks AS STOCK ON PRODUCTO.product_id = STOCK.product_id
GROUP BY 1
ORDER BY 3 DESC
;

