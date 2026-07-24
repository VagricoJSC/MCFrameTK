CREATE OR REPLACE PACKAGE MGPA_COST_IF
/*********************************************************
<SYNOPSIS>
		原価インターフェースユーティリティ
<REMARKS>
<ARGUMENTS>
<HISTORY>
**********************************************************/
IS
	TYPE LIST_DPT IS TABLE OF MAPA_META.COST_DPT_CD%TYPE INDEX BY MAPA_META.DPT_CD%TYPE ;

	FUNCTION F_GET_DPT (
		I_DPT		IN 	MAPA_META.DPT_CD%TYPE,
		I_FIX_DPT	IN	MAPA_META.COST_DPT_CD%TYPE,
		I_DT		IN	MAPA_META.DT%TYPE,
		I_NOT_FLG	IN	MAPA_META.FLG%TYPE
	)
	RETURN MAPA_META.COST_DPT_CD%TYPE;
	/************************************************************************
	<SYNOPSIS>
		部門ＣＤを原価部門ＣＤに変換する。
	<REMARKS>

	<ARGUMENTS>
	<IN>	I_DPT
			対象部門ＣＤ
	<IN>	I_FIX_DPT
			固定部門ＣＤ
	<IN>	I_DT
			対象日
	<IN>	I_NOT_FLG
			変換無効フラグ
	<RETURNVALUE>
			変換した原価部門ＣＤ
	<HISTORY>
	*************************************************************************/

	PROCEDURE P_GET_DPT (
		I_DPT		IN 	MAPA_META.DPT_CD%TYPE,
		I_FIX_DPT	IN	MAPA_META.COST_DPT_CD%TYPE,
		I_DT		IN	MAPA_META.DT%TYPE,
		IO_REC_DPT	IN OUT NOCOPY LIST_DPT,
		O_COST_DPT	OUT	MAPA_META.COST_DPT_CD%TYPE,
		I_DPT_WARN	IN	MAPA_META.FLG%TYPE
		) ;
	/************************************************************************
	<SYNOPSIS>
		部門マスタから原価部門を取得する。
	<REMARKS>

	<ARGUMENTS>
	<IN>	I_DPT
			対象部門ＣＤ
	<IN>	I_FIX_DPT
			固定部門ＣＤ
	<IN>	I_DT
			対象日
	<IN><OUT>	IO_REC_DPT
			部門ＣＤから原価部門ＣＤへの変換対応キャッシュデータ
	<OUT>	O_COST_DPT
			変換した原価部門ＣＤ
	<IN>	I_DPT_WARN
			部門が取得できない場合にログを出力するか
	<HISTORY>
	*************************************************************************/

	PROCEDURE P_LOC_INIT ;
	/************************************************************************
	<SYNOPSIS>
		キャッシュをクリアする
	<REMARKS>

	<ARGUMENTS>
	<HISTORY>
	*************************************************************************/

	PROCEDURE P_LOC_CACHE (
		I_LOC		IN 	MAPA_META.LOC_CD%TYPE,
		I_COST_DPT	IN 	MAPA_META.COST_DPT_CD%TYPE
		) ;
	/************************************************************************
	<SYNOPSIS>
		場所ＣＤと原価部門ＣＤの組み合わせをキャッシュする
	<REMARKS>

	<ARGUMENTS>
	<IN>	I_LOC
			対象場所ＣＤ
	<IN>	I_COST_DPT
			変換した原価部門ＣＤ
	<HISTORY>
	*************************************************************************/

	FUNCTION F_GET_LOC_TO_DPT (
		I_LOC		IN 	MAPA_META.LOC_CD%TYPE
	)
	RETURN MAPA_META.COST_DPT_CD%TYPE ;
	/************************************************************************
	<SYNOPSIS>
		キャッシュから場所ＣＤに対する原価部門ＣＤを取得する
	<REMARKS>

	<ARGUMENTS>
	<IN>	I_LOC
			対象場所ＣＤ
	<RETURNVALUE>
			変換した原価部門ＣＤ
	<HISTORY>
	*************************************************************************/

END MGPA_COST_IF ;
/
