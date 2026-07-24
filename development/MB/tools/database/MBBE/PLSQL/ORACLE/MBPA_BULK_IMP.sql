CREATE OR REPLACE PACKAGE MBPA_BULK_IMP
/*********************************************************
<SYNOPSIS>
		まとめ登録実行関連ユーティリティ
<REMARKS>
<ARGUMENTS>
<HISTORY>
**********************************************************/
IS

	PROCEDURE P_DEL_BULK_IMP (
		I_CO_CD			IN	MAPA_META.CO_CD%TYPE
	);
	/*********************************************************
	<SYNOPSIS>
		MBC_BULK_IMP_CTG_ALL、MBC_BULK_IMP_CTL_ALL、
		MBC_BULK_IMP_CTG_LCL_ALL、MBC_BULK_IMP_CTL_LCL_ALLから引数の会社ＣＤに対応するデータを削除する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_CO_CD
			会社ＣＤ
	<HISTORY>
	**********************************************************/

	PROCEDURE P_INIT_BULK_IMP (
		I_CO_CD			IN	MAPA_META.CO_CD%TYPE
	);
	/*********************************************************
	<SYNOPSIS>
		MBC_BULK_IMP_CTG_ALL、MBC_BULK_IMP_CTL_ALL、
		MBC_BULK_IMP_CTG_LCL_ALL、MBC_BULK_IMP_CTL_LCL_ALLに引数の会社ＣＤの初期データを作成する。
	<REMARKS>
		MBC_BULK_IMP_CTG_DEF、MBC_BULK_IMP_CTL_DEF、
		MBC_BULK_IMP_CTG_LCL_DEF、MBC_BULK_IMP_CTL_LCL_DEFをもとに作成する
	<ARGUMENTS>
	<IN>	I_CO_CD
			会社ＣＤ
	<HISTORY>
	**********************************************************/

	PROCEDURE P_INS_BULK_IMP (
		I_CO_CD			IN	MAPA_META.CO_CD%TYPE
	);
	/*********************************************************
	<SYNOPSIS>
		MBC_BULK_IMP_CTG_ALL、MBC_BULK_IMP_CTL_ALL、
		MBC_BULK_IMP_CTG_LCL_ALL、MBC_BULK_IMP_CTL_LCL_ALLに引数の会社ＣＤで登録されていないデータを追加する。
	<REMARKS>
		MBC_BULK_IMP_CTG_DEF、MBC_BULK_IMP_CTL_DEF、
		MBC_BULK_IMP_CTG_LCL_DEF、MBC_BULK_IMP_CTL_LCL_DEFをもとに作成する
	<ARGUMENTS>
	<IN>	I_CO_CD
			会社ＣＤ
	<HISTORY>
	**********************************************************/

END MBPA_BULK_IMP;
/
