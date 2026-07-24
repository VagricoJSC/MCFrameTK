\encoding UTF-8

ALTER TABLE mam_stk_eval_all
 ADD CONSTRAINT mam_stk_eval_all_ck01 CHECK (cut_flg IN ('0', '1'));

