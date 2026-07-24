\encoding UTF-8

ALTER TABLE mst_xfr_schd_all
 ADD CONSTRAINT mst_xfr_schd_all_ck15 CHECK (ret_ptax_xrate_inpt_flg IN ('0', '1'));

