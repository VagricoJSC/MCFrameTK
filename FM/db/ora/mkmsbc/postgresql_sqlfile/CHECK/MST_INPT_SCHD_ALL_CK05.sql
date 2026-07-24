\encoding UTF-8

ALTER TABLE mst_inpt_schd_all
 ADD CONSTRAINT mst_inpt_schd_all_ck05 CHECK (main_itm_flg IN ('0', '1'));

