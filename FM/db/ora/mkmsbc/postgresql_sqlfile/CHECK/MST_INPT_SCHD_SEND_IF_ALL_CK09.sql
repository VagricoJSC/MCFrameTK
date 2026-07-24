\encoding UTF-8

ALTER TABLE mst_inpt_schd_send_if_all
 ADD CONSTRAINT mst_inpt_schd_send_if_all_ck09 CHECK (alt_itm_fix_flg IN ('0', '1'));

