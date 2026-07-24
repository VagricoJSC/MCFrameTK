\encoding UTF-8

ALTER TABLE mst_slo_d_all
 ADD CONSTRAINT mst_slo_d_all_ck07 CHECK (pri_prnt_flg IN ('0', '1'));

