\encoding UTF-8

ALTER TABLE mgt_io_act_rcv_all
 ADD CONSTRAINT mgt_io_act_rcv_all_ck05 CHECK (zero_effect_flg IN ('0', '1'));

