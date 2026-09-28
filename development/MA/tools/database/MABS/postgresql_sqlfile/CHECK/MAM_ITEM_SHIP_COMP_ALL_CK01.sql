\encoding UTF-8

ALTER TABLE mam_item_ship_comp_all
 ADD CONSTRAINT mam_item_ship_comp_all_ck01 CHECK (body_flg IN ('0', '1'));

