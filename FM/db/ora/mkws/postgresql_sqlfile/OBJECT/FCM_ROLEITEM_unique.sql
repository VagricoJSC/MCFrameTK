\encoding UTF-8

ALTER TABLE fcm_roleitem
 ADD CONSTRAINT fcm_roleitem_ak01 UNIQUE (rid,type_cd,actype);

