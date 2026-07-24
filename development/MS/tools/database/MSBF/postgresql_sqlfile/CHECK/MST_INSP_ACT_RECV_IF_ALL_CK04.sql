\encoding UTF-8

ALTER TABLE mst_insp_act_recv_if_all
 ADD CONSTRAINT mst_insp_act_recv_if_all_ck04 CHECK (imp_flg IN ('0', '1'));

