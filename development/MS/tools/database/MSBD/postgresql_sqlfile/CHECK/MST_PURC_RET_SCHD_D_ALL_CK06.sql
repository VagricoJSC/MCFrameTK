\encoding UTF-8

ALTER TABLE mst_purc_ret_schd_d_all
 ADD CONSTRAINT mst_purc_ret_schd_d_all_ck06 CHECK (cmpl_flg IN ('0', '1'));

