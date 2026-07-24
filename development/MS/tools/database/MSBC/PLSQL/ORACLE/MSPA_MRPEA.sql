CREATE OR REPLACE PACKAGE MSPA_MRPEA
/*****************************
MRPea用のパッケージ本体
******************************/
IS

	PROCEDURE P_MRPEA0 (
		I_CO_CD			IN	VARCHAR2,
		I_USR_CD		IN	VARCHAR2,
		I_SCREEN_ID		IN	VARCHAR2,
		I_SRV_REQ_NO	IN	VARCHAR2,
		I_WG_CD			IN	VARCHAR2,
		I_PROC_TYP		IN	VARCHAR2,
		I_PROC_CNT		IN	VARCHAR2,
		I_SIM_MRP_NO	IN	VARCHAR2,
		I_SIM_MRP_TYP	IN	VARCHAR2
	) ;
	/**************************************************************************
	<SYNOPSIS>
			ＭＲＰセッション設定処理
	<REMARKS>
			ＭＲＰ用のセッション作成時に呼び出されるプロシージャ
	<ARGUMENTS>
	<ITEM>
		I_CO_CD			: 会社コード
		I_USR_CD		: ユーザコード
		I_SCREEN_ID		: 画面ＩＤ
		I_SRV_REQ_NO	: 更新リクエストＮＯ
		I_WG_CD			: ＷＧＣＤ
		I_PROC_TYP		: ＭＲＰ実行区分
		I_PROC_CNT		: ＭＲＰ計算ＮＯ
		I_SIM_MRP_NO	: シミュレーションＮＯ
		I_SIM_MRP_TYP	: シミュレーションＭＲＰ区分
	<HISTORY>
	**************************************************************************/

	PROCEDURE P_MRPEA1 (
		I_WG_CD			IN	VARCHAR2,
		I_PROC_TYP		IN	VARCHAR2,
		I_PROC_CNT		IN	VARCHAR2,
		I_SIM_MRP_NO	IN	VARCHAR2,
		I_SIM_MRP_TYP	IN	VARCHAR2,
		O_OUT			OUT	NUMBER
	) ;
	/**************************************************************************
	<SYNOPSIS>
			ＭＲＰ前処理
	<REMARKS>
			ＭＲＰの処理最初に呼ばれるプロシージャ
	<ARGUMENTS>

	<ITEM>
		I_WG_CD			: ＷＧＣＤ
		I_PROC_TYP		: ＭＲＰ実行区分
		I_PROC_CNT		: ＭＲＰ計算ＮＯ
		I_SIM_MRP_NO	: シミュレーションＮＯ
		I_SIM_MRP_TYP	: シミュレーションＭＲＰ区分
		O_OUT			: 処理結果	０：正常終了
	<HISTORY>
	**************************************************************************/
	
	PROCEDURE P_MRPEA2 (
		I_WG_CD			IN	VARCHAR2,
		I_PROC_TYP		IN	VARCHAR2,
		I_PROC_CNT		IN	VARCHAR2,
		I_SIM_MRP_NO	IN	VARCHAR2,
		I_SIM_MRP_TYP	IN	VARCHAR2,
		O_OUT			OUT	NUMBER
	) ;
	/**************************************************************************
	<SYNOPSIS>
			ＭＲＰ中処理
	<REMARKS>
			ＭＲＰによる未確定データ削除後に呼ばれるプロシージャ
	<ARGUMENTS>

	<ITEM>
		I_WG_CD			: ＷＧＣＤ
		I_PROC_TYP		: ＭＲＰ実行区分
		I_PROC_CNT		: ＭＲＰ計算ＮＯ
		I_SIM_MRP_NO	: シミュレーションＮＯ
		I_SIM_MRP_TYP	: シミュレーションＭＲＰ区分
		O_OUT			: 処理結果	０：正常終了
	<HISTORY>
	**************************************************************************/
	
	PROCEDURE P_MRPEA3 (
		I_WG_CD			IN	VARCHAR2,
		I_PROC_TYP		IN	VARCHAR2,
		I_PROC_CNT		IN	VARCHAR2,
		I_SIM_MRP_NO	IN	VARCHAR2,
		I_SIM_MRP_TYP	IN	VARCHAR2,
		O_OUT			OUT	NUMBER
	) ;
	/**************************************************************************
	<SYNOPSIS>
			ＭＲＰ後処理
	<REMARKS>
			ＭＲＰ実行後に呼ばれるプロシージャ
	<ARGUMENTS>

	<ITEM>
		I_WG_CD			: ＷＧＣＤ
		I_PROC_TYP		: ＭＲＰ実行区分
		I_PROC_CNT		: ＭＲＰ計算ＮＯ
		I_SIM_MRP_NO	: シミュレーションＮＯ
		I_SIM_MRP_TYP	: シミュレーションＭＲＰ区分
		O_OUT			: 処理結果	０：正常終了
	<HISTORY>
	**************************************************************************/
	
END MSPA_MRPEA ;
/
