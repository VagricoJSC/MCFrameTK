\encoding UTF-8

ALTER TABLE fcm_gp_batch_args
 ADD CONSTRAINT fcm_gp_batch_args_ck02 CHECK (editable IN ('0', '1'));

