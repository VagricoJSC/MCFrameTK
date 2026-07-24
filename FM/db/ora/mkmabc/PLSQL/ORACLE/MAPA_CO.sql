CREATE OR REPLACE PACKAGE MAPA_CO
/*********************************************************
<Synopsis>
		会社関連ユーティリティ
<Remarks>
<Arguments>
<History>
**********************************************************/
IS
	FUNCTION F_GET_CO_REC
	RETURN MAM_CO%ROWTYPE ;
	/*********************************************************
	<SYNOPSIS>
		会社マスタのレコードを返す
	<REMARKS>
	<ARGUMENTS>
	<RETURN VALUE>
		会社マスタのレコード
	<HISTORY>
	**********************************************************/

	PROCEDURE P_DEL_SYS_PARM (
		I_CO_CD	IN	MAPA_META.CO_CD%TYPE
	) ;
	/*********************************************************
	<SYNOPSIS>
		MAM_SYS_PARM_ALLから引数の会社ＣＤに対応するデータを削除する。
	<REMARKS>
	<ARGUMENTS>
	<ITEM>	I_CO_CD
			会社ＣＤ
	<HISTORY>
	**********************************************************/

	PROCEDURE P_INIT_SYS_PARM (
		I_CO_CD	IN	MAPA_META.CO_CD%TYPE
	) ;
	/*********************************************************
	<SYNOPSIS>
		MAM_SYS_PARM_ALLに引数の会社ＣＤの初期データを作成する。
	<REMARKS>
		MAM_SYS_PARM_DEFをもとに作成する
	<ARGUMENTS>
	<ITEM>	I_CO_CD
			会社ＣＤ
	<HISTORY>
	**********************************************************/

	PROCEDURE P_DEL_GP_BATCH_GRP (
		I_CO_CD	IN	MAPA_META.CO_CD%TYPE
	) ;
	/*********************************************************
	<SYNOPSIS>
		FCM_GP_BATCH_GRP_ALL、FCM_GP_BATCH_GRP_LCL_ALLから引数の会社ＣＤに対応するデータを削除する。
	<REMARKS>
	<ARGUMENTS>
	<ITEM>	I_CO_CD
			会社ＣＤ
	<HISTORY>
	**********************************************************/

	PROCEDURE P_INIT_GP_BATCH_GRP (
		I_CO_CD	IN	MAPA_META.CO_CD%TYPE
	) ;
	/*********************************************************
	<SYNOPSIS>
		FCM_GP_BATCH_GRP_ALL、FCM_GP_BATCH_GRP_LCL_ALLに引数の会社ＣＤの初期データを作成する。
	<REMARKS>
		MAM_GP_BATCH_GRP_DEFをもとに作成する
	<ARGUMENTS>
	<ITEM>	I_CO_CD
			会社ＣＤ
	<HISTORY>
	**********************************************************/
	PROCEDURE P_INS_SYS_PARM (
		I_CO_CD	IN	MAPA_META.CO_CD%TYPE
	) ;
	/*********************************************************
	<SYNOPSIS>
		MAM_SYS_PARM_ALLに引数の会社ＣＤで登録されていないデータを追加する。
	<REMARKS>
		MAM_SYS_PARM_DEFをもとに作成する
	<ARGUMENTS>
	<ITEM>	I_CO_CD
			会社ＣＤ
	<HISTORY>
	**********************************************************/

	PROCEDURE P_INS_GP_BATCH_GRP (
		I_CO_CD	IN	MAPA_META.CO_CD%TYPE
	) ;
	/*********************************************************
	<SYNOPSIS>
		FCM_GP_BATCH_GRP_ALL、FCM_GP_BATCH_GRP_LCL_ALLに引数の会社ＣＤで登録されていないデータを追加する。
	<REMARKS>
		MAM_GP_BATCH_GRP_DEFをもとに作成する
	<ARGUMENTS>
	<ITEM>	I_CO_CD
			会社ＣＤ
	<HISTORY>
	**********************************************************/

	PROCEDURE P_INS_DEF_ALL ;
	/*********************************************************
	<SYNOPSIS>
		すべての会社にバッチ処理グループ、システムパラメータ、滞留制御情報、発番パタン、在庫分析制御情報、滞留予定制御情報の差分追加を行う。
	<REMARKS>
		以下の処理を実行する
		MAPA_CO.P_INS_SYS_PARM
		MAPA_CO.P_INS_GP_BATCH_GRP
		MAPA_COST_SYS.P_INS_NON_MOV_CTL
		MAPA_NUM.P_INS_NUM_PTN
		MAPA_CO.P_INS_STK_ANLY_CTL
		MAPA_CO.P_INS_NON_MOV_SCHD_CTL
	<ARGUMENTS>
	<ITEM>
	<HISTORY>
	**********************************************************/
	PROCEDURE P_CLEAR_PUSH_NTC (
		I_CO_CD	IN	MAPA_META.CO_CD%TYPE DEFAULT NULL,
		I_TS	IN	MAPA_META.SYS_TS%TYPE DEFAULT NULL
	) ;
	/*********************************************************
	<SYNOPSIS>
		プッシュ通知関連のデータを削除する。
		会社を指定しない場合はすべての会社のデータを削除する。
		日時を指定した場合は指定した日時以前に登録されたデータを削除する。
		日時を指定しない場合はすべての日時のデータを削除する。
	<REMARKS>
		以下のテーブルを削除する
		MAT_PUSH_NTC_H_ALL
		MAT_PUSH_NTC_MSG_ALL
		MAT_PUSH_NTC_TRANS_ALL
		MAT_PUSH_NTC_USR_ALL
	<ARGUMENTS>
	<ITEM>	I_CO_CD
			会社ＣＤ
	<ITEM>	I_TS
			日時
	<HISTORY>
	**********************************************************/

	PROCEDURE P_INIT_STK_ANLY_CTL (
		I_CO_CD		IN	MAPA_META.CO_CD%TYPE
	);
	/*********************************************************
	<SYNOPSIS>
		在庫分析制御情報を初期化する。
	<REMARKS>
		MSC_STK_ANLY_CTL_ALL、MSC_STK_ANLY_CTL_DEFが存在しない場合は
		何も行なわない
	<ARGUMENTS>
	<IN>	I_CO_CD
			会社ＣＤ
	<HISTORY>
	**********************************************************/

	PROCEDURE P_DEL_STK_ANLY_CTL (
		I_CO_CD			IN	MAPA_META.CO_CD%TYPE
	);
	/*********************************************************
	<SYNOPSIS>
		在庫分析制御情報を削除する。
	<REMARKS>
		MSC_STK_ANLY_CTL_ALLが存在しない場合は
		何も行なわない
	<ARGUMENTS>
	<IN>	I_CO_CD
			会社ＣＤ
	<HISTORY>
	**********************************************************/

	PROCEDURE P_INS_STK_ANLY_CTL (
		I_CO_CD		IN	MAPA_META.CO_CD%TYPE
	);
	/*********************************************************
	<SYNOPSIS>
		MSC_STK_ANLY_CTL_ALLに引数の会社ＣＤで登録されていないデータを追加する。
	<REMARKS>
		MSC_STK_ANLY_CTL_ALL、MSC_STK_ANLY_CTL_DEFが存在しない場合は
		何も行なわない
	<ARGUMENTS>
	<IN>	I_CO_CD
			会社ＣＤ
	<HISTORY>
	**********************************************************/

	PROCEDURE P_INIT_NON_MOV_SCHD_CTL (
		I_CO_CD		IN	MAPA_META.CO_CD%TYPE
	);
	/*********************************************************
	<SYNOPSIS>
		滞留予定制御情報を初期化する。
	<REMARKS>
		MSC_NON_MOV_SCHD_CTL_ALL、MSC_NON_MOV_SCHD_CTL_DEFが存在しない場合は
		何も行なわない
	<ARGUMENTS>
	<IN>	I_CO_CD
			会社ＣＤ
	<HISTORY>
	**********************************************************/

	PROCEDURE P_DEL_NON_MOV_SCHD_CTL (
		I_CO_CD			IN	MAPA_META.CO_CD%TYPE
	);
	/*********************************************************
	<SYNOPSIS>
		滞留予定情報を削除する。
	<REMARKS>
		MSC_NON_MOV_SCHD_CTL_ALLが存在しない場合は
		何も行なわない
	<ARGUMENTS>
	<IN>	I_CO_CD
			会社ＣＤ
	<HISTORY>
	**********************************************************/

	PROCEDURE P_INS_NON_MOV_SCHD_CTL (
		I_CO_CD		IN	MAPA_META.CO_CD%TYPE
	);
	/*********************************************************
	<SYNOPSIS>
		MSC_NON_MOV_SCHD_CTL_ALLに引数の会社ＣＤで登録されていないデータを追加する。
	<REMARKS>
		MSC_NON_MOV_SCHD_CTL_ALL、MSC_NON_MOV_SCHD_CTL_DEFが存在しない場合は
		何も行なわない
	<ARGUMENTS>
	<IN>	I_CO_CD
			会社ＣＤ
	<HISTORY>
	**********************************************************/

END MAPA_CO ;
/
