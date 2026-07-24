\encoding UTF-8

ALTER TABLE fcm_mining_condition
 ADD CONSTRAINT fcm_mining_condition_ck02 CHECK (editable_flg IN ('0', '1'));

