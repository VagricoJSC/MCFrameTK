\encoding UTF-8

ALTER TABLE mgt_act_io_all
 ADD CONSTRAINT mgt_act_io_all_ck02 CHECK (eval_loop_flg IN ('0', '1'));

