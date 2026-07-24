CREATE OR REPLACE PACKAGE MAPA_SLS_UPRI
/*********************************************************
<Synopsis>
		販売単価取得ユーティリティ
<Remarks>
<Arguments>
<History>
**********************************************************/
IS
	PROCEDURE P_SET_SLS_UPRI_WK ;
	/*********************************************************
	<SYNOPSIS>
		販売単価・標準販売単価・標準単価を取得してMAW_SLS_UPRI_SRV
		にセットする
	<REMARKS>
		販売単価を取得する対象は呼び出し前にMAW_SLS_UPRI_SRVにデータを作成する
	<ARGUMENTS>
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_SLS_UPRI_RANK (
		I_CST_CD 	IN MAPA_META.BP_CD%TYPE,
		I_DLV_CD	IN MAPA_META.BP_CD%TYPE,
		I_DEST_CD1	IN MAPA_META.BP_CD%TYPE,
		I_DEST_CD2	IN MAPA_META.BP_CD%TYPE,
		I_DEST_CD3	IN MAPA_META.BP_CD%TYPE,
		I_DT		IN MAPA_META.DT%TYPE
	) RETURN MAPA_META.SLS_UPRI_RANK_CD%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		販売単価ランクＣＤを取得する
	<REMARKS>
		得意先販売単価ランクマスタが存在しない場合はＮＵＬＬを返す
	<ARGUMENTS>
	<IN>	I_CST_CD
			得意先ＣＤ
	<IN>	I_DLV_CD
			納品先ＣＤ
	<IN>	I_DEST_CD1
			仕向先ＣＤ１
	<IN>	I_DEST_CD2
			仕向先ＣＤ２
	<IN>	I_DEST_CD3
			仕向先ＣＤ３
	<IN>	I_DT
			基準日
	<RETURNVALUE>
		販売単価ランクＣＤ
	<HISTORY>
	**********************************************************/

	PROCEDURE P_SET_SLS_UPRI_WK_NE ;
	/*********************************************************
	<SYNOPSIS>
		販売単価・標準販売単価・標準単価を取得してMAW_SLS_UPRI_SRV
		にセットする
	<REMARKS>
		販売単価を取得する対象は呼び出し前にMAW_SLS_UPRI_SRVにデータを作成する
		P_SET_SLS_UPRI_WK：標準販売単価マスタが存在しない場合はエラー
		P_SET_SLS_UPRI_WK_NE：標準販売単価マスタが存在しない場合は単価がNULL
	<ARGUMENTS>
	<HISTORY>
	**********************************************************/

END MAPA_SLS_UPRI ;
/
