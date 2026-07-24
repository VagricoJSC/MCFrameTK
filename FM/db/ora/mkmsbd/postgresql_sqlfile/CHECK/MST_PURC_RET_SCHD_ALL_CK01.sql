\encoding UTF-8

ALTER TABLE mst_purc_ret_schd_all
 ADD CONSTRAINT mst_purc_ret_schd_all_ck01 CHECK (xrate_inpt_flg IN ('0', '1'));

