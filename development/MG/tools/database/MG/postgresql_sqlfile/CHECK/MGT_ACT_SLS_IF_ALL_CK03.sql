\encoding UTF-8

ALTER TABLE mgt_act_sls_if_all
 ADD CONSTRAINT mgt_act_sls_if_all_ck03 CHECK (no_eval_flg IN ('0', '1'));

