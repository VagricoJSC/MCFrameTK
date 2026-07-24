\encoding UTF-8

CREATE OR REPLACE PROCEDURE mbpa_imp_ac$p_main(
	 IN i_ac_ym TIMESTAMP WITHOUT TIME ZONE,
	 IN i_dt_fr TIMESTAMP WITHOUT TIME ZONE,
	 IN i_dt_to TIMESTAMP WITHOUT TIME ZONE,
	 IN i_io CHARACTER,
	 IN i_stk CHARACTER,
	 IN i_rcv CHARACTER,
	 IN i_pay CHARACTER,
	 IN i_schdpay CHARACTER,
	 IN i_note CHARACTER,
	 IN i_rerun CHARACTER,
	 IN i_reget CHARACTER)
AS 
$BODY$
/**************************************************************************
<SYNOPSIS>
	取込のメイン処理
<REMARKS>
	ＳＣＭから会計ＩＦ用テーブル(MBT_AC_***)への取込処理。
<ARGUMENTS>
<IN>	i_ac_ym
		取込対象月
<IN>	i_dt_fr
		取込対象開始日 (NULLのときは指定月の開始日）
<IN>	i_dt_to
		取込対象終了日（指定日も含む)(NULLのときは指定月の最終日）
<IN>	i_io
		受払情報取込ＦＬＧ
<IN>	i_stk
		在庫情報取込ＦＬＧ
<IN>	i_rcv
		入金情報ＦＬＧ
<IN>	i_pay
		支払情報ＦＬＧ
<IN>	i_schdpay
		支払依頼情報ＦＬＧ
<IN>	i_note
		手形情報ＦＬＧ
<IN>	i_rerun
		再取込ＦＬＧ 0:未取込のレコードが対象 1:取込済みのレコードも対象
<IN>	i_reget
		マスタ再取得ＦＬＧ 0:取り込み時にトランザクションの品目情報を使用する 1:取り込み時に共通品目マスタの情報を使用する
<HISTORY>
**************************************************************************/
BEGIN
	NULL;
END;
$BODY$
LANGUAGE plpgsql
;

