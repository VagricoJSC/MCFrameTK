\encoding UTF-8

ALTER TABLE mst_insp_act_all
 ADD CONSTRAINT mst_insp_act_all_ck01 CHECK (not_upd_stk_flg IN ('0', '1'));

