\encoding UTF-8

ALTER TABLE mst_qtn_itm_comp_all
 ADD CONSTRAINT mst_qtn_itm_comp_all_ck04 CHECK (std_comp_flg IN ('0', '1'));

