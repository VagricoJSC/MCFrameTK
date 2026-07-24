\encoding UTF-8

ALTER TABLE fcm_mining_condition
 ADD CONSTRAINT fcm_mining_condition_ck01 CHECK (require_flg IN ('0', '1'));

