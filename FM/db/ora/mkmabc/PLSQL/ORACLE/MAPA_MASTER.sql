CREATE OR REPLACE PACKAGE MAPA_MASTER
/*********************************************************
<Synopsis>
	マスタ設定ユーティリティ
<Remarks>
<Arguments>
<History>
**********************************************************/
IS
	PROCEDURE P_MST_CTL (
		I_MST_NM	IN MAPA_META.ORA_OBJ_NM%TYPE,
		I_MST_SET_TYP	IN MAPA_META.MST_SET_TYP%TYPE,
		I_LCL_FLG	IN MAPA_META.FLG%TYPE,
		I_DB_LINK_NM	IN MAPA_META.ORA_OBJ_NM%TYPE
	) ;
	/*********************************************************
	<SYNOPSIS>
		インプット情報に従ってマスタのビューを再定義する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_MST_NM
			マスタ名
	<IN>	I_MST_SET_TYP
			マスタ設定区分
	<IN>	I_LCL_FLG
			ロケール管理ＦＬＧ
	<IN>	I_DB_LINK_NM
			共通マスタを参照するＤＢＬＩＮＫ名
	<HISTORY>
	**********************************************************/

	PROCEDURE P_MST_CTL_CHECK (
		I_DB_LINK_NM	IN MAPA_META.ORA_OBJ_NM%TYPE
	) ;
	/*********************************************************
	<SYNOPSIS>
		マスタ間の整合性を保つための処理を行なう
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_DB_LINK_NM
			共通マスタを参照するＤＢＬＩＮＫ名
	<HISTORY>
	**********************************************************/

	PROCEDURE P_MST_CTL_BATCH ;
	/*********************************************************
	<SYNOPSIS>
		マスタ制御情報に従ってマスタのビューを再定義する
	<REMARKS>
	<ARGUMENTS>
	<HISTORY>
	**********************************************************/
	PROCEDURE P_INS_BINARY (
		I_BIN	IN MAPA_META.BIN%TYPE
	) ;
	/*********************************************************
	<SYNOPSIS>
		バイナリデータを同期する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_BIN
			バイナリＩＤ
	<HISTORY>
	**********************************************************/

	PROCEDURE P_GET_BINARY ;
	/*********************************************************
	<SYNOPSIS>
		バイナリデータを取得する
	<REMARKS>
	<ARGUMENTS>
	<HISTORY>
	**********************************************************/
END MAPA_MASTER ;
/
