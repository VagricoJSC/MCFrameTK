CREATE OR REPLACE PACKAGE MAPA_PROC_UPRI
/*********************************************************
<Synopsis>
		加工単価取得ユーティリティ
<Remarks>
<Arguments>
<History>
**********************************************************/
IS
	PROCEDURE P_SET_PROC_UPRI_WK ;
	/*********************************************************
	<SYNOPSIS>
		加工単価を取得してMAW_PROC_UPRI_SRVにセットする
	<REMARKS>
		加工単価を取得する対象は呼び出し前にMAW_PROC_UPRI_SRVにデータを作成する
	<ARGUMENTS>
	<HISTORY>
	**********************************************************/

END MAPA_PROC_UPRI ;
/
