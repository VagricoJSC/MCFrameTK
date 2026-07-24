CREATE OR REPLACE PACKAGE MAPA_PURC_UPRI
/*********************************************************
<Synopsis>
		購買単価取得ユーティリティ
<Remarks>
<Arguments>
<History>
**********************************************************/
IS
	PROCEDURE P_SET_PURC_UPRI_WK ;
	/*********************************************************
	<SYNOPSIS>
		購買単価を取得してMAW_PURC_UPRI_SRVにセットする
	<REMARKS>
		購買単価を取得する対象は呼び出し前にMAW_PURC_UPRI_SRVにデータを作成する
	<ARGUMENTS>
	<HISTORY>
	**********************************************************/

END MAPA_PURC_UPRI ;
/
