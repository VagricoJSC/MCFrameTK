\encoding UTF-8

ALTER TABLE mst_purc_act_d_all
 ADD CONSTRAINT mst_purc_act_d_all_ck06 CHECK (purc_dtl_upd_flg IN ('0', '1'));

