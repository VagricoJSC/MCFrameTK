\encoding UTF-8

ALTER TABLE fcm_menu
 ADD CONSTRAINT fcm_menu_ck01 CHECK (menu_visible IN ('0', '1'));

