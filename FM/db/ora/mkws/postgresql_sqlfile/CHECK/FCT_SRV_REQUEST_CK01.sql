\encoding UTF-8

ALTER TABLE fct_srv_request
 ADD CONSTRAINT fct_srv_request_ck01 CHECK (async_flg IN ('0', '1'));

