\encoding UTF-8

ALTER TABLE mgt_calc_inpt_all
 ADD CONSTRAINT mgt_calc_inpt_all_ck01 CHECK (eval_loop_flg IN ('0', '1'));

