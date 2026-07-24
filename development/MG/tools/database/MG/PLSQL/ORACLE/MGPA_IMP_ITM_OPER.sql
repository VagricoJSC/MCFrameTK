CREATE OR REPLACE PACKAGE MGPA_IMP_ITM_OPER
/*********************************************************
<SYNOPSIS>
		原価マスタ取込(品目工程)
<REMARKS>
<ARGUMENTS>
<HISTORY>
**********************************************************/
IS
	PROCEDURE P_INS_MGW (
		I_CALC_CTG		IN	MAPA_META.CALC_CTG_CD%TYPE,
		I_WG_CD			IN	MAPA_META.WG_CD%TYPE,
		I_TERM			IN	MAPA_META.YM%TYPE,
		I_DT			IN	MAPA_META.DT%TYPE,
		I_IMP_OPE_TYP		IN	MGPA_META.IMP_OPE_TYP%TYPE DEFAULT '2'
	);
	/*********************************************************
	<SYNOPSIS>
			品目工程マスタ用のデータをコピー用ワークテーブルに作成する。
	<REMARKS>
			メイン処理を起動するプロシージャ
	<ARGUMENTS>
	<IN>	I_CALC_CTG
			計算カテゴリＣＤ
	<IN>	I_WG_CD
			ワーキンググループＣＤ
	<IN>	I_TERM
			期
	<IN>	I_DT
			対象日
	<IN>	I_IMP_OPE_TYP
			マスタ取込処理区分
	<HISTORY>
	**********************************************************/

	PROCEDURE P_IMP_MGT (
		I_TERM			IN	MAPA_META.YM%TYPE,
		I_IMP_OPE_TYP		IN	MGPA_META.IMP_OPE_TYP%TYPE DEFAULT '2'
	);
	/*********************************************************
	<SYNOPSIS>
			原価マスタ(品目工程)を取り込む。
	<REMARKS>
			メイン処理を起動するプロシージャ
	<ARGUMENTS>
	<IN>	I_TERM
			期
	<IN>	I_IMP_OPE_TYP
			マスタ取込処理区分
	<HISTORY>
	**********************************************************/

	PROCEDURE P_SET_KEY (
		I_TERM			IN	MAPA_META.YM%TYPE,
		I_DT			IN	MAPA_META.DT%TYPE
	);
	/*********************************************************
	<SYNOPSIS>
			取り込み処理を実行するためのワークテーブルを作成する
	<REMARKS>
			MAW_IMP_ITMをもとにMGW_IMP_INTERACTIVE_KEYを作成する
	<ARGUMENTS>
	<IN>	I_TERM
			期
	<IN>	I_DT
			対象日
	<HISTORY>
	**********************************************************/

END MGPA_IMP_ITM_OPER;
/
