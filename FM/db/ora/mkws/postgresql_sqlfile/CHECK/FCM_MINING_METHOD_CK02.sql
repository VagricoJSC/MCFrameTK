\encoding UTF-8

ALTER TABLE fcm_mining_method
 ADD CONSTRAINT fcm_mining_method_ck02 CHECK (fill_dt_flg IN ('0', '1'));

