\encoding UTF-8

ALTER TABLE mst_inpt_schd_p_all
 ADD CONSTRAINT mst_inpt_schd_p_all_ck11 CHECK (alt_itm_fix_flg IN ('0', '1'));

