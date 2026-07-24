\encoding UTF-8

ALTER TABLE fcm_mining_method
 ADD CONSTRAINT fcm_mining_method_ck03 CHECK (null_zero IN ('0', '1'));

