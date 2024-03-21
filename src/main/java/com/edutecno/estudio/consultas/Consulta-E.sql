/*CONSULTA E
inventario para la tienda Santa Cruz Bike de los productos que tienen en
 existencia en la categoría Electric Bikes
*/
SELECT    PRODUCTO.product_id
		, PRODUCTO.product_name
		, STOCK.quantity
FROM bikeshop.products AS PRODUCTO
INNER JOIN bikeshop.stocks AS STOCK ON PRODUCTO.product_id = STOCK.product_id
INNER JOIN bikeshop.stores AS TIENDA ON STOCK.store_id = TIENDA.store_id
INNER JOIN bikeshop.categories AS CATEGORY ON PRODUCTO.category_id = CATEGORY.category_id
WHERE TIENDA.store_name = "Santa Cruz Bikes"
AND CATEGORY.category_name = "Electric Bikes"
ORDER BY PRODUCTO.product_name
;