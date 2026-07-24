\encoding UTF-8

ALTER TABLE mst_re_ext_hst_all
 ADD CONSTRAINT mst_re_ext_hst_all_ck01 CHECK (oper_chng_flg IN ('0', '1'));

