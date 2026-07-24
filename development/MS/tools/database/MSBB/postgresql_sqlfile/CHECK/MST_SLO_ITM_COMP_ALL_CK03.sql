\encoding UTF-8

ALTER TABLE mst_slo_itm_comp_all
 ADD CONSTRAINT mst_slo_itm_comp_all_ck03 CHECK (mst_flg IN ('0', '1'));

