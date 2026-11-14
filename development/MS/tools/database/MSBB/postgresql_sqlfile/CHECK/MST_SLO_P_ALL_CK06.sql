\encoding UTF-8

ALTER TABLE mst_slo_p_all
 ADD CONSTRAINT mst_slo_p_all_ck06 CHECK (ship_prnt_no_cst_nm_flg IN ('0', '1'));

