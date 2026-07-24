\encoding UTF-8

CREATE OR REPLACE FUNCTION fcpa_message_queue$f_get_paramStr (
	IN i_message_queue_id	VARCHAR
)
RETURNS VARCHAR
AS
$BODY$
-- ===============================================================================
-- 指定されたメッセージキューIDのパラメータ情報を文字列化する
-- ===============================================================================
DECLARE
	rtn VARCHAR ;
	cur CURSOR FOR SELECT concat(T.param_key, '=', T.param_val) as s FROM fct_message_queue_param T WHERE T.message_queue_id = i_message_queue_id;
BEGIN
	rtn := NULL;
	FOR var_rec IN cur LOOP
		IF rtn IS NULL THEN
			rtn := var_rec.s;
		ELSE
			rtn := rtn || chr(13) || chr(10) || var_rec.s;
		END IF;
	END LOOP;

	RETURN rtn ;

END ;
$BODY$
LANGUAGE plpgsql
;

