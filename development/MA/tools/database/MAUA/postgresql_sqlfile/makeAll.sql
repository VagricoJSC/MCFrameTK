\encoding UTF-8

\i ./make1MAUA.sql

\i ./make1MAUA-s.sql

\i ./make2MAUA.sql

\i ./make3MAUA.sql

\i ./makeComment_MAUA.sql

\i ./makeHistoryTab_MAUA.sql

\i ./makeHistoryTrigger_MAUA.sql

\i ./makeExctrlTrigg_MAUA.sql

DO $$
DECLARE
/************************************************************************/
/* SYNOPSIS :								*/
/*	ST_DT,END_DTに対する値を設定するトリガを作成し、実行します。	*/
/*	実行するためには、CREATE権限、 TRIGGER権限が必要です。	*/
/************************************************************************/
	cur_sql CURSOR FOR
		SELECT 
			tbl.table_name,
			LOWER(tbl.table_name)  || '_tr_d' trg_name,
			'CREATE OR REPLACE FUNCTION ' || LOWER(tbl.table_name) || '_tr_d_body ()
RETURNS TRIGGER
AS
$BODY$
BEGIN
	NEW.st_dt := DATE_TRUNC(''DAY'', NEW.st_dt) ;
	NEW.end_dt := DATE_TRUNC(''DAY'', NEW.end_dt) + ''23 hours 59 minutes 59 seconds''::INTERVAL ;

	RETURN NEW ;
END ;
$BODY$
LANGUAGE plpgsql
;' trg_func_sql,
			'DROP TRIGGER IF EXISTS ' ||  LOWER(tbl.table_name) || '_tr_d ON ' ||  LOWER(tbl.table_name) || ' ;'  drop_trg_sql,
			'CREATE TRIGGER ' || tbl.TABLE_NAME || '_tr_d
BEFORE INSERT OR UPDATE
ON ' || LOWER(tbl.table_name) || '
FOR EACH ROW
EXECUTE PROCEDURE ' || LOWER(tbl.table_name)  || '_tr_d_body()
;' trg_sql
		FROM	(
			SELECT	t.table_name
			FROM	information_schema.tables t
			WHERE	0=0
			AND t.table_type = 'BASE TABLE'
			AND	t.table_name ILIKE 'mam%'
			AND	t.table_name NOT ILIKE '%_r'
			AND	EXISTS (SELECT 'x' FROM information_schema.columns x WHERE x.table_name = t.table_name AND x.column_name ILIKE 'st_dt')
			AND	EXISTS (SELECT 'x' FROM information_schema.columns x WHERE x.table_name = t.table_name AND x.column_name ILIKE 'end_dt')
			ORDER BY t.table_name
			) tbl
		WHERE	0=0
		;
	x RECORD ;
BEGIN
	FOR x IN cur_sql LOOP
		RAISE INFO '%', x.table_name || ' CREATE TRIGGER(' || x.trg_name || ')' ;
		EXECUTE x.trg_func_sql ;
		EXECUTE x.drop_trg_sql ;
		EXECUTE x.trg_sql ;
		RAISE INFO '%', x.table_name || ' SUCCEED TRIGGER(' || x.trg_name || ')' ;
	END LOOP ;

EXCEPTION
	WHEN OTHERS THEN
		RAISE WARNING 'ERROR !!%', SQLSTATE ;
		RAISE WARNING USING MESSAGE = SQLERRM ;
END ;
$$
;

call mapa_master$p_mst_ctl_batch();

\i ./makeAll_PJ.sql

