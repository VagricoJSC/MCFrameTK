CREATE OR REPLACE FUNCTION mgt_arg_usr_all_tr_usr_body()
RETURNS TRIGGER
AS
$BODY$
BEGIN
	new.usr_cd := COALESCE(fcpa_context$f_get_userid(), fcpa_context$f_get_os_usr()) ;
	RETURN NEW ;
END ;
$BODY$
LANGUAGE plpgsql
;

DROP TRIGGER IF EXISTS mgt_arg_usr_all_tr_usr ON mgt_arg_usr_all ;

CREATE TRIGGER mgt_arg_usr_all_tr_usr
BEFORE INSERT
ON mgt_arg_usr_all
FOR EACH ROW
EXECUTE PROCEDURE mgt_arg_usr_all_tr_usr_body()
;
