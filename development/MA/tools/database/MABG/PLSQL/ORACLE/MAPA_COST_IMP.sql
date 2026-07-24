CREATE OR REPLACE PACKAGE MAPA_COST_IMP
/*********************************************************
<SYNOPSIS>
		原価連携処理
<REMARKS>
<ARGUMENTS>
<HISTORY>
**********************************************************/
IS
	PROCEDURE P_MAIN (
		I_TERM	IN	MAPA_META.YM%TYPE,
		I_DT	IN	MAPA_META.DT%TYPE
	);
	/*********************************************************
	<SYNOPSIS>
		品目情報を原価管理の標準単価関連データに連携する
	<REMARKS>

	<ARGUMENTS>
	<IN>	I_TERM
			期
	<IN>	I_DT
			対象日
	<HISTORY>
	**********************************************************/
	
END MAPA_COST_IMP;
/
