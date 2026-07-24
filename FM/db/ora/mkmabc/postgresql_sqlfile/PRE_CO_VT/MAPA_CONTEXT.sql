\encoding UTF-8

CREATE OR REPLACE FUNCTION mapa_context$del_flg_ctl_key ()
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	論理削除ＦＬＧ制御の値を取得するためのキーを取得する
<REMARKS>
<ARGUMENTS>
<IN>
<RETURNVALUE>
	論理削除ＦＬＧ制御の値を取得するためのキー
<HISTORY>
**********************************************************/
BEGIN
	RETURN 'DEL_FLG_CTL' ;
END ;
$BODY$
LANGUAGE plpgsql IMMUTABLE
;

CREATE OR REPLACE FUNCTION mapa_context$f_get_del_flg_ctl ()
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	論理削除ＦＬＧ制御の値を取得する
<REMARKS>
<ARGUMENTS>
<IN>
<RETURNVALUE>
	論理削除ＦＬＧ制御の値
<HISTORY>
**********************************************************/
BEGIN
	RETURN fcpa_postgres_util$get_var('mapa_context', 'v_del_flg_ctl') ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE mapa_context$set_del_flg_ctl (
	IN i_del_flg_ctl VARCHAR
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	論理削除ＦＬＧ制御の値を設定する
<REMARKS>
<ARGUMENTS>
<IN>	I_DEL_FLG_CTL
		論理削除ＦＬＧ制御の値
<HISTORY>
**********************************************************/
BEGIN
	PERFORM fcpa_postgres_util$set_var('mapa_context', 'v_del_flg_ctl', i_del_flg_ctl) ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION mapa_context$release_flg_ctl_key ()
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	リリースＦＬＧ制御の値を取得するためのキーを取得する
<REMARKS>
<ARGUMENTS>
<IN>
<RETURNVALUE>
	リリースＦＬＧ制御の値を取得するためのキー
<HISTORY>
**********************************************************/
BEGIN
	RETURN 'RELEASE_FLG_CTL' ;
END ;
$BODY$
LANGUAGE plpgsql IMMUTABLE
;

CREATE OR REPLACE FUNCTION mapa_context$f_get_release_flg_ctl ()
RETURNS VARCHAR
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	リリースＦＬＧ制御の値を取得する
<REMARKS>
<ARGUMENTS>
<IN>
<RETURNVALUE>
	リリースＦＬＧ制御の値
<HISTORY>
**********************************************************/
BEGIN
	RETURN fcpa_postgres_util$get_var('mapa_context', 'v_release_flg_ctl') ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE PROCEDURE mapa_context$set_release_flg_ctl (
	IN i_release_flg_ctl VARCHAR
)
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	リリースＦＬＧ制御の値を設定する
<REMARKS>
<ARGUMENTS>
<IN>	I_DEL_FLG_CTL
		リリースＦＬＧ制御の値
<HISTORY>
**********************************************************/
BEGIN
	PERFORM fcpa_postgres_util$set_var('mapa_context', 'v_release_flg_ctl', i_release_flg_ctl) ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION mapa_context$f_itm_unit ()
RETURNS BIGINT
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	品目単位マスタ(MAM_ITM_UNIT)使用チェック
<REMARKS>
	MAM_ITM_UNITを利用することは想定していない
	MAVM_ITM_UNITを利用する
<ARGUMENTS>
<IN>
<RETURNVALUE>
<HISTORY>
**********************************************************/
BEGIN
	CALL fcpa_err$raise_app_err('MAUDD0001') ;
	RETURN 999 ;
END ;
$BODY$
LANGUAGE plpgsql
;

CREATE OR REPLACE FUNCTION mapa_context$f_itm_wg ()
RETURNS BIGINT
AS
$BODY$
/*********************************************************
<SYNOPSIS>
	品目マスタ（ＷＧ）(MAM_ITM_WG)使用チェック
<REMARKS>
	MAM_ITM_WGを利用することは想定していない
	MAVM_ITM_WGを利用する
<ARGUMENTS>
<IN>
<RETURNVALUE>
<HISTORY>
**********************************************************/
BEGIN
	CALL fcpa_err$raise_app_err('MAUDD0002') ;
	RETURN 999 ;
END ;
$BODY$
LANGUAGE plpgsql
;

