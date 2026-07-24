\encoding UTF-8

ALTER TABLE fcm_mining_method
 ADD CONSTRAINT fcm_mining_method_ck05 CHECK (inv_flg IN ('0', '1'));

