\encoding UTF-8

ALTER TABLE mgt_act_wk_rcv_all
 ADD CONSTRAINT mgt_act_wk_rcv_all_ck02 CHECK (no_itm_info_flg IN ('0', '1'));

