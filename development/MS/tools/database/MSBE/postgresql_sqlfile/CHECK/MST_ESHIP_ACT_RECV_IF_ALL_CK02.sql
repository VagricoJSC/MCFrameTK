\encoding UTF-8

ALTER TABLE mst_eship_act_recv_if_all
 ADD CONSTRAINT mst_eship_act_recv_if_all_ck02 CHECK (inc_tax_flg IN ('0', '1'));

