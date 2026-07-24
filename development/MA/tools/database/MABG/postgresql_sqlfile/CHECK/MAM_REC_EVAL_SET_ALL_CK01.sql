\encoding UTF-8

ALTER TABLE mam_rec_eval_set_all
 ADD CONSTRAINT mam_rec_eval_set_all_ck01 CHECK (del_flg IN ('0', '1'));

