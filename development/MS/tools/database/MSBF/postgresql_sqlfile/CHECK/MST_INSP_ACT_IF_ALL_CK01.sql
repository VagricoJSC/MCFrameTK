\encoding UTF-8

ALTER TABLE mst_insp_act_if_all
 ADD CONSTRAINT mst_insp_act_if_all_ck01 CHECK (bi_not_send_flg IN ('0', '1'));

