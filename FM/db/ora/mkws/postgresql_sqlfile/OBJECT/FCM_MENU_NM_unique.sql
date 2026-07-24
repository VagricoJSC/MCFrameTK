\encoding UTF-8

ALTER TABLE fcm_menu_nm
 ADD CONSTRAINT fcm_menu_nm_ak01 UNIQUE (menu_id,co_cd,ext_attr1,ext_attr2,ext_attr3,locale);

CREATE UNIQUE INDEX fcm_menu_nm_ak01_ie ON fcm_menu_nm (menu_id,COALESCE(co_cd,''),COALESCE(ext_attr1,''),COALESCE(ext_attr2,''),COALESCE(ext_attr3,''),COALESCE(locale,''));

