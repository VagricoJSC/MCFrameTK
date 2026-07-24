CREATE OR REPLACE PACKAGE BODY MBPA_IMP_AC
/**************************************************************************
<SYNOPSIS>
	会計ＩＦ用データ取込処理
<REMARKS>

<ARGUMENTS>

<HISTORY>
**************************************************************************/
IS

PROCEDURE P_MAIN (
	I_AC_YM		IN	MAPA_META.YM%TYPE,
	I_DT_FR		IN	MAPA_META.DT%TYPE,
	I_DT_TO		IN	MAPA_META.DT%TYPE,
	I_IO		IN	MAPA_META.FLG%TYPE,
	I_STK		IN	MAPA_META.FLG%TYPE,
	I_RCV		IN	MAPA_META.FLG%TYPE,
	I_PAY		IN	MAPA_META.FLG%TYPE,
	I_SCHDPAY	IN	MAPA_META.FLG%TYPE,
	I_NOTE		IN	MAPA_META.FLG%TYPE,
	I_RERUN		IN	MAPA_META.FLG%TYPE,
	I_REGET		IN	MAPA_META.FLG%TYPE
)
/**************************************************************************
<SYNOPSIS>
	取込のメイン処理
<REMARKS>
	ＳＣＭから会計ＩＦ用テーブル(MBT_AC_***)への取込処理。
<ARGUMENTS>
<IN>	I_AC_YM
		取込対象月
<IN>	I_ST_DT
		取込対象開始日 (NULLのときは指定月の開始日）
<IN>	I_END_DT
		取込対象終了日（指定日も含む)(NULLのときは指定月の最終日）
<IN>	I_IO
		受払情報取込ＦＬＧ
<IN>	I_STK
		在庫情報取込ＦＬＧ
<IN>	I_RCV
		入金情報ＦＬＧ
<IN>	I_PAY
		支払情報ＦＬＧ
<IN>	I_NOTE
		手形情報ＦＬＧ
<IN>	I_RERUN
		再取込ＦＬＧ 0:未取込のレコードが対象 1:取込済みのレコードも対象
<IN>	I_REGET
		マスタ再取得ＦＬＧ 0:取り込み時にトランザクションの品目情報を使用する 1:取り込み時に共通品目マスタの情報を使用する
<HISTORY>
**************************************************************************/
IS
BEGIN
	NULL ;
END P_MAIN ;

END MBPA_IMP_AC ;
/