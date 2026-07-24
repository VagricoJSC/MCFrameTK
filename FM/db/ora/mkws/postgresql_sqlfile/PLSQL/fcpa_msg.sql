\encoding UTF-8

CREATE OR REPLACE FUNCTION fcpa_msg$msg_binder(
	VARIADIC i_array VARCHAR[]
) RETURNS VARCHAR[]
AS $BODY$
BEGIN
	RETURN $1::VARCHAR(10000)[];
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION fcpa_msg$f_get_message_level(
	IN i_msgid VARCHAR
) RETURNS VARCHAR
AS $BODY$
-- ==============================================================================
-- メッセージIDのレベルを取得する
-- ==============================================================================
DECLARE
	w_ret VARCHAR(1);
BEGIN
	BEGIN
		SELECT lvl INTO STRICT w_ret FROM fct_msg WHERE msgid = i_msgid AND loc_cd IS NULL;
	EXCEPTION
		WHEN NO_DATA_FOUND THEN
			NULL;
	END;

	RETURN w_ret;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION fcpa_msg$f_get_message(
	IN i_msgid VARCHAR
) RETURNS VARCHAR
AS $BODY$
-- ==============================================================================
-- メッセージIDの文言を取得する
-- ==============================================================================
DECLARE
	w_ret VARCHAR(1000);
	w_lcl VARCHAR(20);
BEGIN
	/* ロケールの解釈 */
	w_lcl := fcpa_context$f_get_locale();
	IF w_lcl = 'ja_JP' OR w_lcl IS NULL THEN
		SELECT msg INTO STRICT w_ret FROM fct_msg WHERE msgid = i_msgid AND loc_cd IS NULL;
	ELSE
		BEGIN
			SELECT msg INTO STRICT w_ret FROM fct_msg WHERE msgid = i_msgid AND loc_cd = w_lcl;
		EXCEPTION
			WHEN NO_DATA_FOUND THEN
				BEGIN
					SELECT msg INTO STRICT w_ret FROM fct_msg WHERE msgid = i_msgid AND loc_cd IS NULL;
				EXCEPTION
					WHEN NO_DATA_FOUND THEN
						w_ret := CONCAT('MESSAGE NOT FOUND. MESSSAGEID=', i_msgid);
				END;
		END;
	END IF;

	RETURN w_ret;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE fcpa_msg$p_inlay(
	IN i_msgid VARCHAR,
	IN i_bind VARCHAR[],
	INOUT o_msg VARCHAR
)
AS $BODY$
-- ===============================================================================
-- 書式文字列内のプレースフォルダ({n})のある場所へ
-- 与えられた引数(PL/SQL表)の値を埋め込む
-- ===============================================================================
DECLARE
	cpos	INTEGER := 1;
	npos	INTEGER;
	bkey	VARCHAR(10);
	buf		VARCHAR(32767) := NULL;
	buf_s	VARCHAR(32767);
BEGIN
	IF i_bind IS NOT NULL THEN
		/* {n} のある場所へ引数で与えられた文字列を順番に埋め込む */
		buf := fcpa_msg$f_get_message(i_msgid);
		buf := replace(buf, '\n', CHR(13) || CHR(10));
		FOR idx IN 1..COALESCE(ARRAY_LENGTH(i_bind, 1), 0) LOOP
			bkey := '{' || idx || '}';
			npos := fcpa_postgres_util$instr(buf, bkey, 1);
			IF npos > 0 THEN
				buf_s := NULL;
				cpos := 1;
				WHILE npos > 0 LOOP
					buf_s := CONCAT(buf_s, SUBSTR(buf, cpos, npos - cpos), i_bind[idx]);
					cpos := npos + LENGTH(bkey);
					npos := fcpa_postgres_util$instr(buf, bkey, cpos);
				END LOOP;
				buf_s := CONCAT(buf_s, SUBSTR(buf, cpos, LENGTH(buf) + 1 - cpos));
				buf := buf_s;
			END IF;
		END LOOP;
		/* メッセージを最大長でトリム */
		IF LENGTH(buf) > 1000 THEN
			buf := SUBSTR(buf, 1, 1000 - 3) || '...';
		END IF;
		o_msg := buf;
	ELSE
		o_msg := fcpa_msg$f_get_message(i_msgid);
		o_msg := replace(o_msg, '\n', CHR(13) || CHR(10));
	END IF;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE fcpa_msg$p_sprintf(
	INOUT o_msg VARCHAR,
	IN i_msgid VARCHAR,
	VARIADIC i_array VARCHAR[]
)
AS $BODY$
-- ==============================================================================
-- 書式文字列のプレースフォルダに引数で与えた文字列を埋め込んだ
-- メッセージ文字列を出力変数へ代入
-- ==============================================================================
BEGIN
	call fcpa_msg$p_inlay(
		i_msgid,
		i_array,
		o_msg
	);
END;
$BODY$
LANGUAGE plpgsql
;

