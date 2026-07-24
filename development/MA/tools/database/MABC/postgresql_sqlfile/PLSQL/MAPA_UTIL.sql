\encoding UTF-8

CREATE OR REPLACE FUNCTION mapa_util$f_get_def_gd_cd ()
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	デフォルト格付ＣＤの取得
<REMARKS>
	格付マスタからデフォルトの格付ＣＤを取得する
<ARGUMENTS>
<RETURN VALUE>
	格付ＣＤ
<HISTORY>
**********************************************************/
DECLARE
	l_gd_cd	mam_stk_gd.gd_cd%TYPE ;
	x		RECORD ;
BEGIN
	l_gd_cd := NULL ;

	FOR x IN
		SELECT	m.gd_cd
		FROM	mam_stk_gd m
		WHERE	0=0
		AND	m.del_flg = '0' -- このユーティリティは検索処理からも呼ばれる場合があるため、論理削除ＦＬＧを条件に加える
		ORDER BY m.sort_seq, m.gd_cd
	LOOP
		l_gd_cd := x.gd_cd ;
		EXIT ;
	END LOOP ;

	IF l_gd_cd IS NULL THEN
		CALL fcpa_err$raise_app_err('MAUCD0019') ;
	END IF ;

	RETURN l_gd_cd ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION mapa_util$f_get_def_trd_cd (
	IN i_trd_ptn_typ VARCHAR
)
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	取引パタン区分に対するデフォルト取引ＣＤの取得
<REMARKS>
	取引パタン区分に対して自動時採用ＦＬＧが
	設定されている取引ＣＤを取得する
<ARGUMENTS>
<IN>	I_TRD_PTN_TYP
		取引パタン区分
<RETURN VALUE>
	格付ＣＤ
<HISTORY>
**********************************************************/
DECLARE
	l_msg		VARCHAR[] ;
	l_trd_cd	mam_trd.trd_cd%TYPE ;
	x		RECORD ;
BEGIN
	l_trd_cd := NULL ;

	FOR x IN
		SELECT	m.trd_cd
		FROM	mam_trd m
		WHERE	0=0
		AND	m.trd_ptn_typ = i_trd_ptn_typ
		AND	m.auto_adopt_flg = '1'
		AND	m.del_flg = '0' -- このユーティリティは検索処理からも呼ばれる場合があるため、論理削除ＦＬＧを条件に加える
		ORDER BY m.trd_cd
	LOOP
		l_trd_cd := x.trd_cd ;
		EXIT ;
	END LOOP ;

	IF l_trd_cd IS NULL THEN
		l_msg := fcpa_err$msg_binder(i_trd_ptn_typ) ;
		CALL fcpa_err$raise_app_err('MAUCD0020', l_msg) ;
	END IF ;

	RETURN l_trd_cd ;

END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION mapa_util$f_get_slo_xpns_purc_rsn_cd ()
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	受注紐付の経費購買で使用する業務理由ＣＤの取得
<REMARKS>
	受注紐付経費購買ＦＬＧが設定されている業務理由ＣＤを取得する
<ARGUMENTS>
<RETURN VALUE>
	業務理由ＣＤ
<HISTORY>
**********************************************************/
DECLARE
	l_biz_rsn_cd	mam_biz_rsn.biz_rsn_cd%TYPE ;
	x		RECORD ;
BEGIN
	l_biz_rsn_cd := NULL ;

	FOR x IN
		SELECT	m.biz_rsn_cd
		FROM	mam_biz_rsn m
		WHERE	0=0
		AND	m.slo_xpns_purc_flg = '1'
		ORDER BY m.biz_rsn_cd
	LOOP
		l_biz_rsn_cd := x.biz_rsn_cd ;
		EXIT ;
	END LOOP ;

	RETURN l_biz_rsn_cd ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION mapa_util$f_get_fxd_loss_rsn_cd ()
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	固定ロスで使用する業務理由ＣＤの取得
<REMARKS>
	固定ロスＦＬＧが設定されている業務理由ＣＤを取得する
<ARGUMENTS>
<RETURN VALUE>
	業務理由ＣＤ
<HISTORY>
**********************************************************/
DECLARE
	l_biz_rsn_cd	mam_biz_rsn.biz_rsn_cd%TYPE ;
	x		RECORD ;
BEGIN
	l_biz_rsn_cd := NULL ;

	FOR x IN
		SELECT	m.biz_rsn_cd
		FROM	mam_biz_rsn m
		WHERE	0=0
		AND	m.fxd_loss_flg = '1'
		ORDER BY m.biz_rsn_cd
	LOOP
		l_biz_rsn_cd := x.biz_rsn_cd ;
		EXIT ;
	END LOOP ;

	IF l_biz_rsn_cd IS NULL THEN
		CALL fcpa_err$raise_app_err('MAUCD0021') ;
	END IF ;

	RETURN l_biz_rsn_cd ;
END ;
$BODY$
LANGUAGE plpgsql
;

