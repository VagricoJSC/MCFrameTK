\encoding UTF-8

ALTER TABLE mst_inpt_act_recv_if_all
 ADD CONSTRAINT mst_inpt_act_recv_if_all_ck02 CHECK (not_pd_chk_flg IN ('0', '1'));

