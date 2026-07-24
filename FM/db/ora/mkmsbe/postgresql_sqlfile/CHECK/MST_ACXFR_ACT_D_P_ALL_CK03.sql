\encoding UTF-8

ALTER TABLE mst_acxfr_act_d_p_all
 ADD CONSTRAINT mst_acxfr_act_d_p_all_ck03 CHECK (wms_flg IN ('0', '1'));

