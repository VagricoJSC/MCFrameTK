\encoding UTF-8

ALTER TABLE fcm_roleitem
 ADD CONSTRAINT fcm_roleitem_ck02 CHECK (chk_id IN ('0', '1'));

