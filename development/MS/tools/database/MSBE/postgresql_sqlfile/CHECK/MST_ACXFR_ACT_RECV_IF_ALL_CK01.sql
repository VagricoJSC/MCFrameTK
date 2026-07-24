\encoding UTF-8

ALTER TABLE mst_acxfr_act_recv_if_all
 ADD CONSTRAINT mst_acxfr_act_recv_if_all_ck01 CHECK (abort_flg IN ('0', '1'));

