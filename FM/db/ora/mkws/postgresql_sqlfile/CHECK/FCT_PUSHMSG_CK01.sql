\encoding UTF-8

ALTER TABLE fct_pushmsg
 ADD CONSTRAINT fct_pushmsg_ck01 CHECK (importance IN ('0', '1'));

