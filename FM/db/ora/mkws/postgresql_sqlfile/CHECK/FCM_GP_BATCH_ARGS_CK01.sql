\encoding UTF-8

ALTER TABLE fcm_gp_batch_args
 ADD CONSTRAINT fcm_gp_batch_args_ck01 CHECK (required IN ('0', '1'));

