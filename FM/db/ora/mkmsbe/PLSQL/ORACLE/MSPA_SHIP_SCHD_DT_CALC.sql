CREATE OR REPLACE PACKAGE MSPA_SHIP_SCHD_DT_CALC
/**************************************************************************
<SYNOPSIS>
		出荷予定日計算パッケージ
<REMARKS>
<ARGUMENTS>
<HISTORY>
**************************************************************************/
IS

	PROCEDURE P_CAL_SHIP_SCHD_DT;
	/*********************************************************
	<SYNOPSIS>
		出荷予定日計算処理
	<REMARKS>
		ワークテーブル(MSW_SHIP_SCHD_DT_CALC)のデータを対象に
		出荷予定日時、および納品予定日時を計算する。
	<ARGUMENTS>
	<HISTORY>
	**********************************************************/

END MSPA_SHIP_SCHD_DT_CALC;
/
