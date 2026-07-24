CREATE OR REPLACE PACKAGE MSPA_FRCST_SLO_SUM
IS

	PROCEDURE P_FRCST_SLO_SUM_MAIN (
		I_SUM_ST_YM				IN MAPA_META.YM%TYPE,
		I_SLS_DPT_CD			IN MAPA_META.DPT_CD%TYPE
	);
	/**************************************************************************
	<SYNOPSIS>
		顧客内示・受注集計テーブルを更新する（メイン処理）
	<REMARKS>
		
	<ARGUMENTS>
	<IN>
		I_SLS_ST_YM
			集計開始年月
	<IN>
		I_SLS_DPT_CD
			売上部門ＣＤ
	<HISTORY>
	**************************************************************************/
	
END MSPA_FRCST_SLO_SUM ;
/
