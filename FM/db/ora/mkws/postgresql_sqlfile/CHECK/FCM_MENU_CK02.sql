\encoding UTF-8

ALTER TABLE fcm_menu
 ADD CONSTRAINT fcm_menu_ck02 CHECK (core_menu IN ('0', '1'));

