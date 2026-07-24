\encoding UTF-8

ALTER TABLE fcm_roleitem
 ADD CONSTRAINT fcm_roleitem_ck01 CHECK (chk_pw IN ('0', '1'));

