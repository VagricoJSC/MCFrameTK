\encoding UTF-8

ALTER TABLE fcm_mining
 ADD CONSTRAINT fcm_mining_ck01 CHECK (gadget_cache_flg IN ('0', '1'));

