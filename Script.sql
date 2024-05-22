--Para insertar la nueva ruta en los menus
INSERT INTO public.menu(
	id_menu, icon, name, url)
	VALUES (9, 'favorite', 'Vital Signs', '/pages/sign');	

--permisos para ver la opcion (solo se le otorgo al admin)
INSERT INTO public.menu_role(
	id_menu, id_role)
	VALUES (9, 1);	
	
