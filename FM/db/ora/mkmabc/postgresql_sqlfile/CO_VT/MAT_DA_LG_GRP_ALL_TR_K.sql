\encoding UTF-8

CREATE OR REPLACE FUNCTION mat_da_lg_grp_all_tr_k_body() RETURNS trigger AS $BODY$
DECLARE
	cocd varchar(10);
BEGIN
	cocd := fcpa_context$f_get_co_cd();
	IF cocd IS NOT NULL THEN
		IF NEW.co_cd IS NULL THEN
			NEW.co_cd := cocd;
	END IF;
END IF;
RETURN NEW;
END;
$BODY$ LANGUAGE plpgsql;

CREATE TRIGGER mat_da_lg_grp_all_tr_k
BEFORE INSERT ON mat_da_lg_grp_all
FOR EACH ROW
EXECUTE FUNCTION mat_da_lg_grp_all_tr_k_body();


