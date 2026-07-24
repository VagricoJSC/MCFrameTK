\encoding UTF-8

ALTER TABLE fct_msg
 ADD CONSTRAINT fct_msg_ak01 UNIQUE (msgid,loc_cd);

CREATE UNIQUE INDEX fct_msg_ak01_ie ON fct_msg (msgid,COALESCE(loc_cd,''));

