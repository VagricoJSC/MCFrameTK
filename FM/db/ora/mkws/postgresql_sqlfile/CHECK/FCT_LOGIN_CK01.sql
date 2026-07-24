\encoding UTF-8

ALTER TABLE fct_login
 ADD CONSTRAINT fct_login_ck01 CHECK (exec_flg IN ('0', '1'));

