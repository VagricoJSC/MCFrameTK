CREATE OR REPLACE PROCEDURE mbpa_bulk_imp$p_del_bulk_imp(
	 IN i_co_cd VARCHAR
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	mbc_bulk_imp_ctg_all、mbc_bulk_imp_ctl_all、
	mbc_bulk_imp_ctg_lcl_all、mbc_bulk_imp_ctl_lcl_allから引数の会社ＣＤに対応するデータを削除する。
<REMARKS>
<ARGUMENTS>
<IN>	i_co_cd
		会社ＣＤ
<HISTORY>
**********************************************************/
BEGIN
	DELETE FROM mbc_bulk_imp_ctl_all m WHERE m.co_cd = i_co_cd;
	DELETE FROM mbc_bulk_imp_ctg_all m WHERE m.co_cd = i_co_cd;
	DELETE FROM mbc_bulk_imp_ctl_lcl_all m WHERE m.co_cd = i_co_cd;
	DELETE FROM mbc_bulk_imp_ctg_lcl_all m WHERE m.co_cd = i_co_cd;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mbpa_bulk_imp$p_init_bulk_imp(
	 IN i_co_cd VARCHAR
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	mbc_bulk_imp_ctg_all、mbc_bulk_imp_ctl_all、
	mbc_bulk_imp_ctg_lcl_all、mbc_bulk_imp_ctl_lcl_allに引数の会社ＣＤの初期データを作成する。
<REMARKS>
	mbc_bulk_imp_ctg_def、mbc_bulk_imp_ctl_def、
	mbc_bulk_imp_ctg_lcl_def、mbc_bulk_imp_ctl_lcl_defをもとに作成する
<ARGUMENTS>
<IN>	i_co_cd
		会社ＣＤ
<HISTORY>
**********************************************************/
BEGIN
	CALL mbpa_bulk_imp$p_del_bulk_imp(i_co_cd);

	INSERT INTO mbc_bulk_imp_ctg_all (
		table_ctg,
		table_ctg_nm,
		table_ctg_seq,
		co_cd
		)
	SELECT	m.table_ctg,
		m.table_ctg_nm,
		m.table_ctg_seq,
		i_co_cd
	FROM	mbc_bulk_imp_ctg_def m
	WHERE	0=0
	;

	INSERT INTO mbc_bulk_imp_ctl_all (
		table_id,
		table_nm,
		table_ctg,
		db_class_path,
		chk_ope,
		upd_ope,
		table_seq,
		co_cd
		)
	SELECT	m.table_id,
		m.table_nm,
		m.table_ctg,
		m.db_class_path,
		m.chk_ope,
		m.upd_ope,
		m.table_seq,
		i_co_cd
	FROM	mbc_bulk_imp_ctl_def m
	WHERE	0=0
	;

	--上記のinsertではロケール別テーブルに常にja_JPの名称が設定されることを想定している
	--FCM_CO_ALLの標準ロケールにen_USが設定されているとロケール別テーブルのLCL_CDにen_USが設定される
	IF fcpa_context$f_get_def_locale_cd() != 'ja_JP' THEN
		UPDATE mbc_bulk_imp_ctg_lcl_all m
		SET lcl_cd = 'ja_JP'
		WHERE 0=0
		AND m.lcl_cd = fcpa_context$f_get_def_locale_cd()
		AND m.co_cd = i_co_cd
		;

		UPDATE mbc_bulk_imp_ctl_lcl_all m
		SET lcl_cd = 'ja_JP'
		WHERE 0=0
		AND m.lcl_cd = fcpa_context$f_get_def_locale_cd()
		AND m.co_cd = i_co_cd
		;

	END IF;
	

	INSERT INTO mbc_bulk_imp_ctg_lcl_all (
		table_ctg,
		table_ctg_nm,
		lcl_cd,
		co_cd
		)
	SELECT	m.table_ctg,
		m.table_ctg_nm,
		m.lcl_cd,
		i_co_cd
	FROM	mbc_bulk_imp_ctg_lcl_def m
	WHERE	0=0
	AND	NOT EXISTS (
			SELECT	'X'
			FROM	mbc_bulk_imp_ctg_lcl_all x
			WHERE	0=0
			AND	x.table_ctg = m.table_ctg
			AND	x.lcl_cd = m.lcl_cd
			AND	x.co_cd = i_co_cd
		)
	;

	INSERT INTO mbc_bulk_imp_ctl_lcl_all (
		table_id,
		table_nm,
		lcl_cd,
		co_cd
		)
	SELECT	m.table_id,
		m.table_nm,
		m.lcl_cd,
		i_co_cd
	FROM	mbc_bulk_imp_ctl_lcl_def m
	WHERE	0=0
	AND	NOT EXISTS (
			SELECT	'X'
			FROM	mbc_bulk_imp_ctl_lcl_all x
			WHERE	0=0
			AND	x.table_id = m.table_id
			AND	x.lcl_cd = m.lcl_cd
			AND	x.co_cd = i_co_cd
		)
	;

END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE PROCEDURE mbpa_bulk_imp$p_ins_bulk_imp(
	 IN i_co_cd VARCHAR
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	mbc_bulk_imp_ctg_all、mbc_bulk_imp_ctl_all、
	mbc_bulk_imp_ctg_lcl_all、mbc_bulk_imp_ctl_lcl_allに引数の会社ＣＤで登録されていないデータを追加する。
<REMARKS>
	mbc_bulk_imp_ctg_def、mbc_bulk_imp_ctl_def、
	mbc_bulk_imp_ctg_lcl_def、mbc_bulk_imp_ctl_lcl_defをもとに作成する
<ARGUMENTS>
<IN>	i_co_cd
		会社ＣＤ
<HISTORY>
**********************************************************/
BEGIN
	INSERT INTO mbc_bulk_imp_ctg_all (
		table_ctg,
		table_ctg_nm,
		table_ctg_seq,
		co_cd
		)
	SELECT	m.table_ctg,
		m.table_ctg_nm,
		m.table_ctg_seq,
		i_co_cd
	FROM	mbc_bulk_imp_ctg_def m
	WHERE	0=0
	AND	NOT EXISTS (
			SELECT	'X'
			FROM	mbc_bulk_imp_ctg_all x
			WHERE	0=0
			AND	x.table_ctg = m.table_ctg
			AND	x.co_cd = i_co_cd
		)
	;

	INSERT INTO mbc_bulk_imp_ctl_all (
		table_id,
		table_nm,
		table_ctg,
		db_class_path,
		chk_ope,
		upd_ope,
		table_seq,
		co_cd
		)
	SELECT	m.table_id,
		m.table_nm,
		m.table_ctg,
		m.db_class_path,
		m.chk_ope,
		m.upd_ope,
		m.table_seq,
		i_co_cd
	FROM	mbc_bulk_imp_ctl_def m
	WHERE	0=0
	AND	NOT EXISTS (
			SELECT	'X'
			FROM	mbc_bulk_imp_ctl_all x
			WHERE	0=0
			AND	x.table_id = m.table_id
			AND	x.co_cd = i_co_cd
		)
	;

	--上記のinsertではロケール別テーブルに常にja_JPの名称が設定されることを想定している
	--FCM_CO_ALLの標準ロケールにen_USが設定されているとロケール別テーブルのLCL_CDにen_USが設定される
	IF fcpa_context$f_get_def_locale_cd() != 'ja_JP' THEN
		UPDATE	mbc_bulk_imp_ctg_lcl_all
		SET	lcl_cd = 'ja_JP'
		WHERE	0=0
		AND	m.lcl_cd = fcpa_context$f_get_def_locale_cd()
		AND	m.co_cd = i_co_cd
		AND	1 = (
				SELECT	COUNT(*)
				FROM	mbc_bulk_imp_ctg_lcl_all x
				WHERE	0=0
				AND	x.table_ctg = m.table_ctg
				AND	x.lcl_cd = m.lcl_cd
				AND	x.co_cd = i_co_cd
			)
		;

		UPDATE	mbc_bulk_imp_ctl_lcl_all m
		SET	lcl_cd = 'ja_JP'
		WHERE	0=0
		AND	m.lcl_cd = fcpa_context$f_get_def_locale_cd()
		AND	m.co_cd = i_co_cd
		AND	1 = (
				SELECT	COUNT(*)
				FROM	mbc_bulk_imp_ctl_lcl_all x
				WHERE	0=0
				AND	x.table_id = m.table_id
				AND	x.lcl_cd = m.lcl_cd
				AND	x.co_cd = i_co_cd
			)
		;
	END IF;

	INSERT INTO mbc_bulk_imp_ctg_lcl_all (
	 table_ctg,
		table_ctg_nm,
		lcl_cd,
		co_cd
		)
	SELECT	m.table_ctg,
		m.table_ctg_nm,
		m.lcl_cd,
		i_co_cd
	FROM	mbc_bulk_imp_ctg_lcl_def m
	WHERE	0=0
	AND	NOT EXISTS (
			SELECT	'X'
			FROM	mbc_bulk_imp_ctg_lcl_all x
			WHERE	0=0
			AND	x.table_ctg = m.table_ctg
			AND	x.lcl_cd = m.lcl_cd
			AND	x.co_cd = i_co_cd
		)
	;

	INSERT INTO mbc_bulk_imp_ctl_lcl_all (
		table_id,
		table_nm,
		lcl_cd,
		co_cd
		)
	SELECT	m.table_id,
		m.table_nm,
		m.lcl_cd,
		i_co_cd
	FROM	mbc_bulk_imp_ctl_lcl_def m
	WHERE	0=0
	AND	NOT EXISTS (
			SELECT	'X'
			FROM	mbc_bulk_imp_ctl_lcl_all x
			WHERE	0=0
			AND	x.table_id = m.table_id
			AND	x.lcl_cd = m.lcl_cd
			AND	x.co_cd = i_co_cd
		)
	;

END;
$BODY$
LANGUAGE plpgsql
;
