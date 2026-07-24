\encoding UTF-8

ALTER TABLE mst_iv_d_p_all
 ADD CONSTRAINT mst_iv_d_p_all_ck04 CHECK (sundry_itm_flg IN ('0', '1'));

