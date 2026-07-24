\encoding UTF-8

ALTER TABLE mst_purc_ret_schd_d_all
 ADD CONSTRAINT mst_purc_ret_schd_d_all_ck05 CHECK (abort_flg IN ('0', '1'));

