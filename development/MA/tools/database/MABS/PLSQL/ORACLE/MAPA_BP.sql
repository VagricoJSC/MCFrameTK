CREATE OR REPLACE PACKAGE MAPA_BP
/*********************************************************
<Synopsis>
		取引先関連ユーティリティ
<Remarks>
<Arguments>
<History>
**********************************************************/
IS
	FUNCTION F_IS_SLO_STOP (
		I_BP_CD		IN	MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.FLG%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		取引先が受注禁止かどうかを判定する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_BP_CD
			取引先ＣＤ
	<IN>	I_BASE_DT
			基準日
	<RETURN VALUE>
		1: 受注禁止 / 0: 受注可能
	<HISTORY>
	**********************************************************/

	FUNCTION F_IS_PO_STOP (
		I_BP_CD		IN	MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.FLG%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		取引先が発注禁止かどうかを判定する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_BP_CD
			取引先ＣＤ
	<IN>	I_BASE_DT
			基準日
	<RETURN VALUE>
		1: 発注禁止 / 0: 発注可能
	<HISTORY>
	**********************************************************/

	FUNCTION F_IS_SLS_STOP (
		I_BP_CD		IN	MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.FLG%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		取引先が売上・出荷禁止かどうかを判定する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_BP_CD
			取引先ＣＤ
	<IN>	I_BASE_DT
			基準日
	<RETURN VALUE>
		1: 売上・出荷禁止 / 0: 売上・出荷可能
	<HISTORY>
	**********************************************************/

	FUNCTION F_IS_PURC_STOP (
		I_BP_CD		IN	MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.FLG%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		取引先が仕入・入荷禁止かどうかを判定する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_BP_CD
			取引先ＣＤ
	<IN>	I_BASE_DT
			基準日
	<RETURN VALUE>
		1: 仕入・入荷禁止 / 0: 仕入・入荷可能
	<HISTORY>
	**********************************************************/

	FUNCTION F_IS_ORDER_STOP (
		I_BP_CD		IN	MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.FLG%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		取引先が所要・オーダ禁止かどうかを判定する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_BP_CD
			取引先ＣＤ
	<IN>	I_BASE_DT
			基準日
	<RETURN VALUE>
		1: 所要・オーダ禁止 / 0: 所要・オーダ可能
	<HISTORY>
	**********************************************************/

	FUNCTION F_IS_MFG_INST_STOP (
		I_BP_CD		IN	MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.FLG%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		取引先が製造指図禁止かどうかを判定する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_BP_CD
			取引先ＣＤ
	<IN>	I_BASE_DT
			基準日
	<RETURN VALUE>
		1: 製造指図禁止 / 0: 製造指図可能
	<HISTORY>
	**********************************************************/

	FUNCTION F_IS_SHIP_INST_STOP (
		I_BP_CD		IN	MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.FLG%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		取引先が出荷指図禁止かどうかを判定する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_BP_CD
			取引先ＣＤ
	<IN>	I_BASE_DT
			基準日
	<RETURN VALUE>
		1: 出荷指図禁止 / 0: 出荷指図可能
	<HISTORY>
	**********************************************************/

	FUNCTION F_IS_XFR_STOP (
		I_BP_CD		IN	MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.FLG%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		取引先が移送・移動禁止かどうかを判定する。
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_BP_CD
			取引先ＣＤ
	<IN>	I_BASE_DT
			基準日
	<RETURN VALUE>
		1: 移送・移動禁止 / 0: 移送・移動可能
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_CRED_OF_CST (
		I_CST_CD	IN	MAPA_META.BP_CD%TYPE
	)
	RETURN MAPA_META.BP_CD%TYPE;
	/*********************************************************
	<SYNOPSIS>
			得意先から与信管理先を取得する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_CST_CD
			得意先ＣＤ
	<ReturnValue>
		与信管理先ＣＤ
	**********************************************************/

	FUNCTION F_GET_CRED_OF_ACST (
		I_ACST_CD	IN	MAPA_META.BP_CD%TYPE
	)
	RETURN MAPA_META.BP_CD%TYPE;
	/*********************************************************
	<SYNOPSIS>
		売掛先から与信管理先を取得する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_ACST_CD
			売掛先ＣＤ
	<ReturnValue>
		与信管理先ＣＤ
	**********************************************************/

	FUNCTION F_GET_CRED_OF_BCST (
		I_BCST_CD	IN	MAPA_META.BP_CD%TYPE
	)
	RETURN MAPA_META.BP_CD%TYPE;
	/*********************************************************
	<SYNOPSIS>
		請求先から与信管理先を取得する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_BCST_CD
			請求先ＣＤ
	<ReturnValue>
		与信管理先ＣＤ
	**********************************************************/

	FUNCTION F_GET_BP_ADDR (
		I_BP_CD		IN	MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE,
		I_BP_ADDR_TYP	IN	MAPA_META.BP_ADDR_TYP%TYPE
	)
	RETURN VARCHAR2 ;
	/*********************************************************
	<SYNOPSIS>
		取引先に対する住所などを取得する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_BP_CD
			取引先ＣＤ
	<IN>	I_BASE_DT
			基準日
	<IN>	I_BP_ADDR_TYP
			取引先宛先区分
	<ReturnValue>
		取引先宛先区分に対応した値
	**********************************************************/

	FUNCTION F_GET_AR_DPT_CD_NE (
		I_CST_CD	IN MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN MAPA_META.DT%TYPE,
		I_NO_CHK_FLG	IN MAPA_META.FLG%TYPE DEFAULT '0'
	) RETURN MAPA_META.DPT_CD%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		取引先（得意先）に対する債権部門ＣＤを取得する(Not Exception版)
	<REMARKS>
		債権部門区分に2（債権部門）が設定されている得意先を入力値とする
		部門が取得できない場合はＮＵＬＬを返す
	<ARGUMENTS>
	<IN>	I_CST_CD
			得意先ＣＤ
	<IN>	I_BASE_DT
			基準日
	<IN>	I_CHK_FLG
			部門有効確認ＦＬＧ
	<RETURNVALUE>
		得意先ＣＤ、基準日から取得した債権部門ＣＤ
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_AR_DPT_CD (
		I_CST_CD	IN MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN MAPA_META.DT%TYPE
	) RETURN MAPA_META.DPT_CD%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		取引先（得意先）に対する債権部門ＣＤを取得する
	<REMARKS>
		債権部門区分に2（債権部門）が設定されている得意先を入力値とする
		部門が取得できない場合はエラーを返す
	<ARGUMENTS>
	<IN>	I_CST_CD
			得意先ＣＤ
	<IN>	I_BASE_DT
			基準日
	<RETURNVALUE>
		得意先ＣＤ、基準日から取得した債権部門ＣＤ
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_BCST_DPT_CD_NE (
		I_BCST_CD	IN MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN MAPA_META.DT%TYPE,
		I_NO_CHK_FLG	IN MAPA_META.FLG%TYPE DEFAULT '0'
	) RETURN MAPA_META.DPT_CD%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		取引先（請求先）に対する請求先担当部門ＣＤを取得する(Not Exception版)
	<REMARKS>
		債権部門区分に3（請求部門）が設定されている請求先を入力値とする
		部門が取得できない場合はＮＵＬＬを返す
	<ARGUMENTS>
	<IN>	I_BCST_CD
			請求先ＣＤ
	<IN>	I_BASE_DT
			基準日
	<IN>	I_CHK_FLG
			部門有効確認ＦＬＧ
	<RETURNVALUE>
		請求先ＣＤ、基準日から取得した請求先担当部門ＣＤ
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_BCST_DPT_CD (
		I_BCST_CD	IN MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN MAPA_META.DT%TYPE
	) RETURN MAPA_META.DPT_CD%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		取引先（請求先）に対する請求先担当部門ＣＤを取得する
	<REMARKS>
		債権部門区分に3（請求部門）が設定されている請求先を入力値とする
		部門が取得できない場合はエラーを返す
	<ARGUMENTS>
	<IN>	I_BCST_CD
			請求先ＣＤ
	<IN>	I_BASE_DT
			基準日
	<RETURNVALUE>
		請求先ＣＤ、基準日から取得した請求先担当部門ＣＤ
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_VMI_PURC_DPT_CD_NE (
		I_SPPL_CD	IN MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN MAPA_META.DT%TYPE,
		I_NO_CHK_FLG	IN MAPA_META.FLG%TYPE DEFAULT '0'
	) RETURN MAPA_META.DPT_CD%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		取引先（発注先）に対するＶＭＩ購買部門ＣＤを取得する(Not Exception版)
	<REMARKS>
		発注先を入力値とする
		部門が取得できない場合はＮＵＬＬを返す
	<ARGUMENTS>
	<IN>	I_SPPL_CD
			発注先ＣＤ
	<IN>	I_BASE_DT
			基準日
	<IN>	I_CHK_FLG
			部門有効確認ＦＬＧ
	<RETURNVALUE>
		発注先ＣＤ、基準日から取得したＶＭＩ購買部門ＣＤ
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_VMI_PURC_DPT_CD (
		I_SPPL_CD	IN MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN MAPA_META.DT%TYPE
	) RETURN MAPA_META.DPT_CD%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		取引先（発注先）に対するＶＭＩ購買部門ＣＤを取得する
	<REMARKS>
		発注先を入力値とする
		部門が取得できない場合はエラーを返す
	<ARGUMENTS>
	<IN>	I_SPPL_CD
			発注先ＣＤ
	<IN>	I_BASE_DT
			基準日
	<RETURNVALUE>
		発注先ＣＤ、基準日から取得したＶＭＩ購買部門ＣＤ
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_AP_DPT_CD_NE (
		I_ASPPL_CD	IN MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN MAPA_META.DT%TYPE,
		I_NO_CHK_FLG	IN MAPA_META.FLG%TYPE DEFAULT '0'
	) RETURN MAPA_META.DPT_CD%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		取引先（買掛先）に対する債務部門ＣＤを取得する(Not Exception版)
	<REMARKS>
		買掛先を入力値とする
		部門が取得できない場合はＮＵＬＬを返す
	<ARGUMENTS>
	<IN>	I_ASPPL_CD
			買掛先ＣＤ
	<IN>	I_BASE_DT
			基準日
	<IN>	I_CHK_FLG
			部門有効確認ＦＬＧ
	<RETURNVALUE>
		買掛先ＣＤ、基準日から取得した債務部門ＣＤ
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_AP_DPT_CD (
		I_ASPPL_CD	IN MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN MAPA_META.DT%TYPE
	) RETURN MAPA_META.DPT_CD%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		取引先（買掛先）に対する債務部門ＣＤを取得する
	<REMARKS>
		買掛先を入力値とする
		部門が取得できない場合はエラーを返す
	<ARGUMENTS>
	<IN>	I_ASPPL_CD
			買掛先ＣＤ
	<IN>	I_BASE_DT
			基準日
	<RETURNVALUE>
		買掛先ＣＤ、基準日から取得した債務部門ＣＤ
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_AP_DPT_CD_NE2 (
		I_SPPL_CD	IN MAPA_META.BP_CD%TYPE,
		I_ASPPL_CD	IN MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN MAPA_META.DT%TYPE,
		I_NO_CHK_FLG	IN MAPA_META.FLG%TYPE DEFAULT '0'
	) RETURN MAPA_META.DPT_CD%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		取引先（買掛先）に対する債務部門ＣＤを取得する(Not Exception版)
		取引先補助.債務部門 > 取引先.債務部門 > 発注先担当.購買部門　の優先順位で取得する
	<REMARKS>
		買掛先、発注先を入力値とする
		部門が取得できない場合はＮＵＬＬを返す
	<ARGUMENTS>
	<IN>	I_SPPL_CD
			発注先ＣＤ
	<IN>	I_ASPPL_CD
			買掛先ＣＤ
	<IN>	I_BASE_DT
			基準日
	<IN>	I_CHK_FLG
			部門有効確認ＦＬＧ
	<RETURNVALUE>
		買掛先ＣＤ、基準日から取得した債務部門ＣＤ
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_AP_DPT_CD2 (
		I_SPPL_CD	IN MAPA_META.BP_CD%TYPE,
		I_ASPPL_CD	IN MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN MAPA_META.DT%TYPE
	) RETURN MAPA_META.DPT_CD%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		取引先（買掛先）に対する債務部門ＣＤを取得する
		取引先補助.債務部門 > 取引先.債務部門 > 発注先担当.購買部門　の優先順位で取得する
	<REMARKS>
		買掛先、発注先を入力値とする
		部門が取得できない場合はエラーを返す
	<ARGUMENTS>
	<IN>	I_SPPL_CD
			発注先ＣＤ
	<IN>	I_ASPPL_CD
			買掛先ＣＤ
	<IN>	I_BASE_DT
			基準日
	<RETURNVALUE>
		買掛先ＣＤ、基準日から取得した債務部門ＣＤ
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_BSPPL_DPT_CD_NE (
		I_BSPPL_CD	IN MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN MAPA_META.DT%TYPE,
		I_NO_CHK_FLG	IN MAPA_META.FLG%TYPE DEFAULT '0'
	) RETURN MAPA_META.DPT_CD%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		取引先（支払予定管理先）に対する支払予定管理先担当部門ＣＤを取得する(Not Exception版)
	<REMARKS>
		支払予定管理先を入力値とする
		部門が取得できない場合はＮＵＬＬを返す
	<ARGUMENTS>
	<IN>	I_BSPPL_CD
			支払予定管理先ＣＤ
	<IN>	I_BASE_DT
			基準日
	<IN>	I_CHK_FLG
			部門有効確認ＦＬＧ
	<RETURNVALUE>
		支払予定管理先ＣＤ、基準日から取得した支払予定管理先担当部門ＣＤ
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_BSPPL_DPT_CD (
		I_BSPPL_CD	IN MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN MAPA_META.DT%TYPE
	) RETURN MAPA_META.DPT_CD%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		取引先（支払予定管理先）に対する支払予定管理先担当部門ＣＤを取得する
	<REMARKS>
		支払予定管理先を入力値とする
		部門が取得できない場合はエラーを返す
	<ARGUMENTS>
	<IN>	I_BSPPL_CD
			支払予定管理先ＣＤ
	<IN>	I_BASE_DT
			基準日
	<RETURNVALUE>
		支払予定管理先ＣＤ、基準日から取得した支払予定管理先担当部門ＣＤ
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_CRED_OF_SPPL (
		I_SPPL_CD	IN	MAPA_META.BP_CD%TYPE
	)
	RETURN MAPA_META.BP_CD%TYPE;
	/*********************************************************
	<SYNOPSIS>
			発注先から与信管理先を取得する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_SPPL_CD
			発注先ＣＤ
	<ReturnValue>
		与信管理先ＣＤ
	**********************************************************/

	FUNCTION F_GET_CRED_OF_ASPPL (
		I_ASPPL_CD	IN	MAPA_META.BP_CD%TYPE
	)
	RETURN MAPA_META.BP_CD%TYPE;
	/*********************************************************
	<SYNOPSIS>
			買掛先から与信管理先を取得する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_ASPPL_CD
			買掛先ＣＤ
	<ReturnValue>
		与信管理先ＣＤ
	**********************************************************/

	FUNCTION F_GET_CRED_OF_BSPPL (
		I_BSPPL_CD	IN	MAPA_META.BP_CD%TYPE
	)
	RETURN MAPA_META.BP_CD%TYPE;
	/*********************************************************
	<SYNOPSIS>
			支払予定管理先から与信管理先を取得する
	<REMARKS>
	<ARGUMENTS>
	<IN>	I_BSPPL_CD
			支払予定管理先ＣＤ
	<ReturnValue>
		与信管理先ＣＤ
	**********************************************************/
	FUNCTION F_GET_PAY_DPT_CD_NE (
		I_PSPPL_CD	IN MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN MAPA_META.DT%TYPE,
		I_NO_CHK_FLG	IN MAPA_META.FLG%TYPE DEFAULT '0'
	) RETURN MAPA_META.DPT_CD%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		取引先（支払先）に対する支払部門ＣＤを取得する(Not Exception版)
	<REMARKS>
		支払先を入力値とする
		部門が取得できない場合はＮＵＬＬを返す
	<ARGUMENTS>
	<IN>	I_PSPPL_CD
			支払先ＣＤ
	<IN>	I_BASE_DT
			基準日
	<IN>	I_CHK_FLG
			部門有効確認ＦＬＧ
	<RETURNVALUE>
		支払先ＣＤ、基準日から取得した支払部門ＣＤ
	<HISTORY>
	**********************************************************/

	FUNCTION F_GET_PAY_DPT_CD (
		I_PSPPL_CD	IN MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN MAPA_META.DT%TYPE
	) RETURN MAPA_META.DPT_CD%TYPE ;
	/*********************************************************
	<SYNOPSIS>
		取引先（支払先）に対する支払部門ＣＤを取得する
	<REMARKS>
		支払先を入力値とする
		部門が取得できない場合はエラーを返す
	<ARGUMENTS>
	<IN>	I_PSPPL_CD
			支払先ＣＤ
	<IN>	I_BASE_DT
			基準日
	<RETURNVALUE>
		支払先ＣＤ、基準日から取得した支払部門ＣＤ
	<HISTORY>
	**********************************************************/

	PROCEDURE P_DEL_BP ;
	/*********************************************************
	<SYNOPSIS>
		MAW_BP_KEYに登録されている取引先に対して
		取引先マスタのレコードを削除する
	<REMARKS>
	<ARGUMENTS>
	<RETURNVALUE>
	<HISTORY>
	**********************************************************/

END MAPA_BP ;
/
