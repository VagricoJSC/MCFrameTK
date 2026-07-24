\encoding UTF-8

ALTER TABLE fcm_gp_batch_all
 ADD CONSTRAINT fcm_gp_batch_all_ck01 CHECK (err_continue IN ('0', '1'));

