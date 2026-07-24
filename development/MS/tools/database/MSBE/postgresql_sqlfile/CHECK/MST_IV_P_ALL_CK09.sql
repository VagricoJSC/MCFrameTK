\encoding UTF-8

ALTER TABLE mst_iv_p_all
 ADD CONSTRAINT mst_iv_p_all_ck09 CHECK (iv_ship_flg IN ('0', '1'));

