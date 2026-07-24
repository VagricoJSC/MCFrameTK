\encoding UTF-8

ALTER TABLE mst_xfr_act_all
 ADD CONSTRAINT mst_xfr_act_all_ck01 CHECK (dlv_prnt_flg IN ('0', '1'));

