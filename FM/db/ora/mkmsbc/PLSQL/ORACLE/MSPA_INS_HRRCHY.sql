CREATE OR REPLACE PACKAGE MSPA_INS_HRRCHY
/*********************************************************
<SYNOPSIS>
	品目オーダ展開処理
<REMARKS>
<ARGUMENTS>
<HISTORY>
**********************************************************/
IS
--	TYPE IOH_TYPE IS TABLE OF MSW_ITM_ORD_HRRCHY%ROWTYPE;
	TYPE IOFH_TYPE IS TABLE OF MSW_ITM_ORD_F_HRRCHY%ROWTYPE;
	TYPE IORH_TYPE IS TABLE OF MSW_ITM_ORD_R_HRRCHY%ROWTYPE;

	PROCEDURE P_INS_ITM_ORD_F_HRRCHY_O (
		I_ITM_ORD_NO	IN MAPA_META.ITM_ORD_NO%TYPE,
		I_MAX_LVL	IN INTEGER
	) ;
	/*********************************************************
	<SYNOPSIS>
		MRP所要を元に作成した品目オーダの正展開結果を一時表（MSW_ITM_ORD_F_HRRCHY）に格納する。
	<REMARKS>
		オーダ正展開用
	<ARGUMENTS>
	<IN>	I_ITM_ORD_NO
			品目オーダＮＯ
	<IN>	I_MAX_LVL
			最大階層
	<HISTORY>
	**********************************************************/

	PROCEDURE P_INS_ITM_ORD_F_HRRCHY_R(
		I_RQMT_NO IN MAPA_META.RQMT_NO%TYPE,
		I_MAX_LVL	IN INTEGER
	);
	/*********************************************************
	<SYNOPSIS>
		MRP所要を元に作成した品目オーダの階層化データを（MSW_ITM_ORD_F_HRRCHY）に格納する。
	<REMARKS>
		オーダ正展開用
	<ARGUMENTS>
	<IN>	I_RQMT_NO
			所要ＮＯ
	<IN>	I_MAX_LVL
			最大階層
	<HISTORY>
	**********************************************************/

	PROCEDURE P_INS_ITM_ORD_F_HRRCHY_L(
		I_SLO_D_NO IN MAPA_META.SLO_D_NO%TYPE,
		I_MAX_LVL	IN INTEGER
	);
	/*********************************************************
	<SYNOPSIS>
		MRP所要を元に作成した品目オーダの階層化データを（MSW_ITM_ORD_F_HRRCHY）に格納する。
	<REMARKS>
		オーダ正展開用
	<ARGUMENTS>
	<IN>	I_SLO_D_NO
			受注明細ＮＯ
	<IN>	I_MAX_LVL
			最大階層
	<HISTORY>
	**********************************************************/

	PROCEDURE P_INS_ITM_ORD_R_HRRCHY_O (
		I_ITM_ORD_NO	IN MAPA_META.ITM_ORD_NO%TYPE,
		I_MAX_LVL	IN INTEGER
	) ;
	/*********************************************************
	<SYNOPSIS>
		MRP所要を元に作成した品目オーダの逆展開結果を一時表（MSW_ITM_ORD_R_HRRCHY）に格納する。
	<REMARKS>
		オーダ逆展開用
	<ARGUMENTS>
	<IN>	I_ITM_ORD_NO
			品目オーダＮＯ
	<IN>	I_MAX_LVL
			最大階層
	<HISTORY>
	**********************************************************/

	PROCEDURE P_INS_ITM_ORD_R_HRRCHY_S (
		I_ITM_CD	IN MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN MAPA_META.ITM_SUB3%TYPE,
		I_LOT_NO	IN MAPA_META.LOT_NO%TYPE,
		I_SUBLOT_NO	IN MAPA_META.SUBLOT_NO%TYPE,
		I_LOC_CD	IN MAPA_META.LOC_CD%TYPE,
		I_MAX_LVL	IN INTEGER
	) ;
	/*********************************************************
	<SYNOPSIS>
	MRP所要を元に作成した品目オーダの階層化データをSW_ITM_ORD_R_HRRCHYに格納する。
	<REMARKS>
		オーダ逆展開用
	<ARGUMENTS>
	<IN>	I_ITM_CD
			品目ＣＤ
	<IN>	I_ITM_SUB1
			枝番１
	<IN>	I_ITM_SUB2
			枝番２
	<IN>	I_ITM_SUB3
			枝番３
	<IN>	I_LOT_NO
			ロットＮＯ
	<IN>	I_SUBLOT_NO
			サブロットＮＯ
	<IN>	I_LOC_CD
			場所ＣＤ
	<IN>	I_MAX_LVL
			最大階層
	<HISTORY>
	**********************************************************/

	PROCEDURE P_INS_SIM_ORD_F_HRRCHY_O (
		I_ITM_ORD_NO	IN MAPA_META.ITM_ORD_NO%TYPE,
		I_SIM_MRP_NO	IN MAPA_META.SIM_MRP_NO%TYPE,
		I_MAX_LVL		IN INTEGER
	) ;
	/*********************************************************
	<SYNOPSIS>
		MRP所要を元に作成したシミュレーション用品目オーダの正展開結果を一時表（MSW_ITM_ORD_F_HRRCHY）に格納する。
	<REMARKS>
		シミュレーション用オーダ正展開用
	<ARGUMENTS>
	<IN>	I_ITM_ORD_NO
			品目オーダＮＯ
	<IN>	I_SIM_MRP_NO
			シミュレーションＮＯ
	<IN>	I_MAX_LVL
			最大階層
	<HISTORY>
	**********************************************************/

	PROCEDURE P_INS_SIM_ORD_F_HRRCHY_R (
		I_RQMT_NO		IN MAPA_META.RQMT_NO%TYPE,
		I_SIM_MRP_NO	IN MAPA_META.SIM_MRP_NO%TYPE,
		I_MAX_LVL		IN INTEGER
	) ;
	/*********************************************************
	<SYNOPSIS>
		MRP所要を元に作成したシミュレーション用品目オーダの正展開結果を一時表（MSW_ITM_ORD_F_HRRCHY）に格納する。
	<REMARKS>
		シミュレーションオーダ正展開用
	<ARGUMENTS>
	<IN>	I_RQMT_NO
			所要ＮＯ
	<IN>	I_SIM_MRP_NO
			シミュレーションＮＯ
	<IN>	I_MAX_LVL
			最大階層
	<HISTORY>
	**********************************************************/
	
	PROCEDURE P_INS_SIM_ORD_F_HRRCHY_X (
		I_RQMT_NO		IN MAPA_META.RQMT_NO%TYPE,
		I_SIM_MRP_NO	IN MAPA_META.SIM_MRP_NO%TYPE,
		I_MAX_LVL		IN INTEGER
	) ;
	/*********************************************************
	<SYNOPSIS>
		納期回答を元に作成したシミュレーション用品目オーダの正展開結果を一時表（MSW_ITM_ORD_F_HRRCHY）に格納する。
	<REMARKS>
		シミュレーションオーダ正展開用
	<ARGUMENTS>
	<IN>	I_RQMT_NO
			所要ＮＯ
	<IN>	I_SIM_MRP_NO
			シミュレーションＮＯ
	<IN>	I_MAX_LVL
			最大階層
	<HISTORY>
	**********************************************************/

	PROCEDURE P_INS_SIM_ORD_F_HRRCHY_P (
		I_IO_SCHD_NO		IN MAPA_META.IO_SCHD_NO%TYPE,
		I_IO_SCHD_TYP		IN MSPA_META.IO_SCHD_TYP%TYPE,
		I_IO_SCHD_STS_TYP	IN MSPA_META.IO_SCHD_STS_TYP%TYPE,
		I_SIM_MRP_NO		IN MAPA_META.SIM_MRP_NO%TYPE,
		I_MAX_LVL			IN INTEGER
	) ;
	/*********************************************************
	<SYNOPSIS>
		納期回答を元に作成したシミュレーション用品目オーダの正展開結果を一時表（MSW_ITM_ORD_F_HRRCHY）に格納する。
	<REMARKS>
		シミュレーションオーダ正展開用
	<ARGUMENTS>
	<IN>	I_IO_SCHD_NO
			受払予定ＮＯ
	<IN>	I_IO_SCHD_TYP
			受払予定区分
	<IN>	I_IO_SCHD_STS_TYP
			受払予定状況区分
	<IN>	I_SIM_MRP_NO
			シミュレーションＮＯ
	<IN>	I_MAX_LVL
			最大階層
	<HISTORY>
	**********************************************************/

	PROCEDURE P_INS_SIM_ORD_R_HRRCHY_O (
		I_ITM_ORD_NO	IN MAPA_META.ITM_ORD_NO%TYPE,
		I_SIM_MRP_NO	IN MAPA_META.SIM_MRP_NO%TYPE,
		I_MAX_LVL	IN INTEGER
	) ;
	/*********************************************************
	<SYNOPSIS>
		MRP所要を元に作成したシミュレーション用品目オーダの逆展開結果を一時表（MSW_ITM_ORD_R_HRRCHY）に格納する。
	<REMARKS>
		シミュレーション用オーダ逆展開用
	<ARGUMENTS>
	<IN>	I_ITM_ORD_NO
			品目オーダＮＯ
	<IN>	I_SIM_MRP_NO
			シミュレーションＮＯ
	<IN>	I_MAX_LVL
			最大階層
	<HISTORY>
	**********************************************************/

	PROCEDURE P_INS_SIM_ORD_R_HRRCHY_S (
		I_ITM_CD	IN MAPA_META.ITM_CD%TYPE,
		I_ITM_SUB1	IN MAPA_META.ITM_SUB1%TYPE,
		I_ITM_SUB2	IN MAPA_META.ITM_SUB2%TYPE,
		I_ITM_SUB3	IN MAPA_META.ITM_SUB3%TYPE,
		I_LOT_NO	IN MAPA_META.LOT_NO%TYPE,
		I_SUBLOT_NO	IN MAPA_META.SUBLOT_NO%TYPE,
		I_LOC_CD	IN MAPA_META.LOC_CD%TYPE,
		I_SIM_MRP_NO	IN MAPA_META.SIM_MRP_NO%TYPE,
		I_MAX_LVL	IN INTEGER
	) ;
	/*********************************************************
	<SYNOPSIS>
	MRP所要を元に作成したシミュレーション用品目オーダの階層化データをSW_ITM_ORD_R_HRRCHYに格納する。
	<REMARKS>
		シミュレーション用オーダ逆展開用
	<ARGUMENTS>
	<IN>	I_ITM_CD
			品目ＣＤ
	<IN>	I_ITM_SUB1
			枝番１
	<IN>	I_ITM_SUB2
			枝番２
	<IN>	I_ITM_SUB3
			枝番３
	<IN>	I_LOT_NO
			ロットＮＯ
	<IN>	I_SUBLOT_NO
			サブロットＮＯ
	<IN>	I_LOC_CD
			場所ＣＤ
	<IN>	I_SIM_MRP_NO
			シミュレーションＮＯ
	<IN>	I_MAX_LVL
			最大階層
	<HISTORY>
	**********************************************************/

END  MSPA_INS_HRRCHY ;
/
