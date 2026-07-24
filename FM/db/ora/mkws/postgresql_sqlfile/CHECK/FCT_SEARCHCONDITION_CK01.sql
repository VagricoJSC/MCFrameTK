\encoding UTF-8

ALTER TABLE fct_searchcondition
 ADD CONSTRAINT fct_searchcondition_ck01 CHECK (valid_flg IN ('0', '1'));

