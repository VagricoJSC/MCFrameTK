SET SQLBLANKLINES ON

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
show errors;


CREATE OR REPLACE PACKAGE BODY MAPA_BP
IS
	G_BIND FCPA_ERR.MSG_BINDER ;

	CURSOR BP_SUB (
		I_BP_CD		IN	MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
		)
	IS
		SELECT	p.ZIP_CD,
			p.ADDR1, p.ADDR2,
			p.ADDR3, p.ADDR4,
			p.TEL, p.FAX,
			p.CST_CNTCT_DPT, p.CST_CNTCT_PSN, p.CST_CNTCT_PSN_TITLE,
			p.SPPL_CNTCT_DPT, p.SPPL_CNTCT_PSN, p.SPPL_CNTCT_PSN_TITLE,
			p.DLV_CNTCT_DPT, p.DLV_CNTCT_PSN, p.DLV_CNTCT_PSN_TITLE,
			p.BILL_ZIP_CD,
			p.BILL_ADDR1, p.BILL_ADDR2,
			p.BILL_ADDR3, p.BILL_ADDR4,
			p.BILL_TEL,
			p.BILL_BCST_NM,
			p.BILL_BCST_DPT, p.BILL_BCST_PSN, p.BILL_BCST_PSN_TITLE,
			p.AR_DPT_CD, p.SLS_TAX_CD, p.SLS_ANLY_CD1, p.SLS_ANLY_CD2, p.SLS_ANLY_CD3,
			p.BCST_DPT_CD, 
			p.VMI_PURC_DPT_CD, p.PURC_TAX_CD, p.PROV_TAX_CD,
			p.AP_DPT_CD, p.BSPPL_DPT_CD
			,p.PAY_DPT_CD
		FROM	(
			SELECT	m.ZIP_CD,
				m.ADDR1, m.ADDR2,
				m.ADDR3, m.ADDR4,
				m.TEL, m.FAX,
				m.CST_CNTCT_DPT, m.CST_CNTCT_PSN, m.CST_CNTCT_PSN_TITLE,
				m.SPPL_CNTCT_DPT, m.SPPL_CNTCT_PSN, m.SPPL_CNTCT_PSN_TITLE,
				m.DLV_CNTCT_DPT, m.DLV_CNTCT_PSN, m.DLV_CNTCT_PSN_TITLE,
				m.BILL_ZIP_CD,
				m.BILL_ADDR1, m.BILL_ADDR2,
				m.BILL_ADDR3, m.BILL_ADDR4,
				m.BILL_TEL,
				m.BILL_BCST_NM,
				m.BILL_BCST_DPT, m.BILL_BCST_PSN, m.BILL_BCST_PSN_TITLE,
				m.AR_DPT_CD, m.SLS_TAX_CD, m.SLS_ANLY_CD1, m.SLS_ANLY_CD2, m.SLS_ANLY_CD3,
				m.BCST_DPT_CD,
				m.VMI_PURC_DPT_CD, m.PURC_TAX_CD, m.PROV_TAX_CD,
				m.AP_DPT_CD, m.BSPPL_DPT_CD,
				m.PAY_DPT_CD,
				99	PRIO
			FROM	MAM_BP m
			WHERE	0=0
			AND	m.BP_CD = I_BP_CD
			UNION ALL
			SELECT	m.ZIP_CD,
				m.ADDR1, m.ADDR2,
				m.ADDR3, m.ADDR4,
				m.TEL, m.FAX,
				m.CST_CNTCT_DPT, m.CST_CNTCT_PSN, m.CST_CNTCT_PSN_TITLE,
				m.SPPL_CNTCT_DPT, m.SPPL_CNTCT_PSN, m.SPPL_CNTCT_PSN_TITLE,
				m.DLV_CNTCT_DPT, m.DLV_CNTCT_PSN, m.DLV_CNTCT_PSN_TITLE,
				m.BILL_ZIP_CD,
				m.BILL_ADDR1, m.BILL_ADDR2,
				m.BILL_ADDR3, m.BILL_ADDR4,
				m.BILL_TEL,
				m.BILL_BCST_NM,
				m.BILL_BCST_DPT, m.BILL_BCST_PSN, m.BILL_BCST_PSN_TITLE,
				m.AR_DPT_CD, m.SLS_TAX_CD, m.SLS_ANLY_CD1, m.SLS_ANLY_CD2, m.SLS_ANLY_CD3,
				m.BCST_DPT_CD, 
				m.VMI_PURC_DPT_CD, m.PURC_TAX_CD, m.PROV_TAX_CD,
				m.AP_DPT_CD, m.BSPPL_DPT_CD,
				m.PAY_DPT_CD,
				1	PRIO
			FROM	MAM_BP_SUB m
			WHERE	0=0
			AND	m.BP_CD = I_BP_CD
			AND	m.ST_DT  <= I_BASE_DT
			AND	m.END_DT >= I_BASE_DT
			AND	m.DEL_FLG = '0'
			) p
		WHERE	0=0
		ORDER BY p.PRIO
	;


	FUNCTION F_IS_SLO_STOP (
		I_BP_CD		IN	MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.FLG%TYPE
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
	IS
		L_CNT	NUMBER ;
	BEGIN
		-- 取引先禁止マスタ取得（受注禁止日）
		SELECT	COUNT(*)
		INTO	L_CNT
		FROM	MAM_BP_STOP m
		WHERE	0 = 0
		AND	m.BP_CD = I_BP_CD
		AND	m.SLO_STOP_DT <= I_BASE_DT
		AND	m.DEL_FLG = '0'
		;

		IF L_CNT = 0 THEN
			RETURN '0' ;
		ELSE
			RETURN '1' ;
		END IF ;

	END F_IS_SLO_STOP ;

	FUNCTION F_IS_PO_STOP (
		I_BP_CD		IN	MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.FLG%TYPE
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
	IS
		L_CNT	NUMBER ;
	BEGIN
		-- 取引先禁止マスタ取得（発注禁止日）
		SELECT	COUNT(*)
		INTO	L_CNT
		FROM	MAM_BP_STOP m
		WHERE	0 = 0
		AND	m.BP_CD = I_BP_CD
		AND	m.PO_STOP_DT <= I_BASE_DT
		AND	m.DEL_FLG = '0'
		;

		IF L_CNT = 0 THEN
			RETURN '0' ;
		ELSE
			RETURN '1' ;
		END IF ;

	END F_IS_PO_STOP ;

	FUNCTION F_IS_SLS_STOP (
		I_BP_CD		IN	MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.FLG%TYPE
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
	IS
		L_CNT	NUMBER ;
	BEGIN
		-- 取引先禁止マスタ取得（売上・出荷禁止日）
		SELECT	COUNT(*)
		INTO	L_CNT
		FROM	MAM_BP_STOP m
		WHERE	0 = 0
		AND	m.BP_CD = I_BP_CD
		AND	m.SLS_STOP_DT <= I_BASE_DT
		AND	m.DEL_FLG = '0'
		;

		IF L_CNT = 0 THEN
			RETURN '0' ;
		ELSE
			RETURN '1' ;
		END IF ;

	END F_IS_SLS_STOP ;

	FUNCTION F_IS_PURC_STOP (
		I_BP_CD		IN	MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.FLG%TYPE
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
	IS
		L_CNT	NUMBER ;
	BEGIN
		-- 取引先禁止マスタ取得（仕入・入荷禁止日）
		SELECT	COUNT(*)
		INTO	L_CNT
		FROM	MAM_BP_STOP m
		WHERE	0 = 0
		AND	m.BP_CD = I_BP_CD
		AND	m.PURC_STOP_DT <= I_BASE_DT
		AND	m.DEL_FLG = '0'
		;

		IF L_CNT = 0 THEN
			RETURN '0' ;
		ELSE
			RETURN '1' ;
		END IF ;

	END F_IS_PURC_STOP ;

	FUNCTION F_IS_ORDER_STOP (
		I_BP_CD		IN	MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.FLG%TYPE
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
	IS
		L_CNT	NUMBER ;
	BEGIN
		-- 取引先禁止マスタ取得（所要・オーダ禁止日）
		SELECT	COUNT(*)
		INTO	L_CNT
		FROM	MAM_BP_STOP m
		WHERE	0 = 0
		AND	m.BP_CD = I_BP_CD
		AND	m.ORDER_STOP_DT <= I_BASE_DT
		AND	m.DEL_FLG = '0'
		;

		IF L_CNT = 0 THEN
			RETURN '0' ;
		ELSE
			RETURN '1' ;
		END IF ;

	END F_IS_ORDER_STOP ;

	FUNCTION F_IS_MFG_INST_STOP (
		I_BP_CD		IN	MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.FLG%TYPE
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
	IS
		L_CNT	NUMBER ;
	BEGIN
		-- 取引先禁止マスタ取得（製造指図禁止日）
		SELECT	COUNT(*)
		INTO	L_CNT
		FROM	MAM_BP_STOP m
		WHERE	0 = 0
		AND	m.BP_CD = I_BP_CD
		AND	m.MFG_INST_STOP_DT <= I_BASE_DT
		AND	m.DEL_FLG = '0'
		;

		IF L_CNT = 0 THEN
			RETURN '0' ;
		ELSE
			RETURN '1' ;
		END IF ;

	END F_IS_MFG_INST_STOP ;

	FUNCTION F_IS_SHIP_INST_STOP (
		I_BP_CD		IN	MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.FLG%TYPE
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
	IS
		L_CNT	NUMBER ;
	BEGIN
		-- 取引先禁止マスタ取得（出荷指図禁止日）
		SELECT	COUNT(*)
		INTO	L_CNT
		FROM	MAM_BP_STOP m
		WHERE	0 = 0
		AND	m.BP_CD = I_BP_CD
		AND	m.SHIP_INST_STOP_DT <= I_BASE_DT
		AND	m.DEL_FLG = '0'
		;

		IF L_CNT = 0 THEN
			RETURN '0' ;
		ELSE
			RETURN '1' ;
		END IF ;

	END F_IS_SHIP_INST_STOP ;

	FUNCTION F_IS_XFR_STOP (
		I_BP_CD		IN	MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE
	) RETURN MAPA_META.FLG%TYPE
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
	IS
		L_CNT	NUMBER ;
	BEGIN
		-- 取引先禁止マスタ取得（移送・移動禁止日）
		SELECT 	COUNT(*)
		INTO	L_CNT
		FROM	MAM_BP_STOP m
		WHERE	0 = 0
		AND	m.BP_CD = I_BP_CD
		AND	m.XFR_STOP_DT <= I_BASE_DT
		AND	m.DEL_FLG = '0'
		;

		IF L_CNT = 0 THEN
			RETURN '0' ;
		ELSE
			RETURN '1' ;
		END IF ;

	END F_IS_XFR_STOP ;

	FUNCTION F_GET_CRED_OF_CST (
		I_CST_CD	IN	MAPA_META.BP_CD%TYPE
	)
	RETURN MAPA_META.BP_CD%TYPE
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
	IS
		L_CRED_CD	MAPA_META.BP_CD%TYPE ;
	BEGIN
		L_CRED_CD := NULL ;
		FOR x IN (
			-- 売掛先の取得
			SELECT	m.ACST_CD
			FROM	MAM_BP m
			WHERE	0 = 0
			AND	m.BP_CD = I_CST_CD
			AND	m.CST_FLG = '1'
			AND 	m.ACST_CD IS NOT NULL
			)
		LOOP
			L_CRED_CD := F_GET_CRED_OF_ACST(x.ACST_CD) ;
			EXIT ;
		END LOOP ;

		RETURN L_CRED_CD ;

	END F_GET_CRED_OF_CST ;

	FUNCTION F_GET_CRED_OF_ACST (
		I_ACST_CD	IN	MAPA_META.BP_CD%TYPE
	)
	RETURN MAPA_META.BP_CD%TYPE
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
	IS
		L_CRED_CD	MAPA_META.BP_CD%TYPE ;
	BEGIN
		L_CRED_CD := NULL ;
		FOR x IN (
			-- 請求先の取得
			SELECT	m.BCST_CD
			FROM	MAM_BP m
			WHERE	0 = 0
			AND	m.BP_CD = I_ACST_CD
			AND	m.ACST_FLG = '1'
			AND 	m.BCST_CD IS NOT NULL
			)
		LOOP
			L_CRED_CD :=  F_GET_CRED_OF_BCST(x.BCST_CD) ;
			EXIT ;
		END LOOP ;

		RETURN L_CRED_CD ;

	END F_GET_CRED_OF_ACST ;

	FUNCTION F_GET_CRED_OF_BCST (
		I_BCST_CD	IN	MAPA_META.BP_CD%TYPE
	)
	RETURN MAPA_META.BP_CD%TYPE
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
	IS
		L_CRED_CD	MAPA_META.BP_CD%TYPE ;
	BEGIN

		-- 与信管理先の取得
		SELECT	MIN(m.AR_CRED_CD)
		INTO	L_CRED_CD
		FROM	MAM_BP m
		WHERE	0 = 0
		AND	m.BP_CD = I_BCST_CD
		AND	m.BCST_FLG = '1'
		AND	m.AR_CRED_CD IS NOT NULL
		;

		RETURN L_CRED_CD ;

	END F_GET_CRED_OF_BCST ;

	FUNCTION F_GET_BP_ADDR (
		I_BP_CD		IN	MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN	MAPA_META.DT%TYPE,
		I_BP_ADDR_TYP	IN	MAPA_META.BP_ADDR_TYP%TYPE
	)
	RETURN VARCHAR2
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
	IS
	BEGIN
		FOR x IN BP_SUB(I_BP_CD, I_BASE_DT) LOOP
			CASE I_BP_ADDR_TYP
			WHEN MAC_BP_ADDR_TYP.ZIP_CD THEN RETURN x.ZIP_CD ;
			WHEN MAC_BP_ADDR_TYP.ADDR1 THEN RETURN x.ADDR1 ;
			WHEN MAC_BP_ADDR_TYP.ADDR2 THEN RETURN x.ADDR2 ;
			WHEN MAC_BP_ADDR_TYP.ADDR3 THEN RETURN x.ADDR3 ;
			WHEN MAC_BP_ADDR_TYP.ADDR4 THEN RETURN x.ADDR4 ;
			WHEN MAC_BP_ADDR_TYP.TEL THEN RETURN x.TEL ;
			WHEN MAC_BP_ADDR_TYP.FAX THEN RETURN x.FAX ;
			WHEN MAC_BP_ADDR_TYP.CST_CNTCT_DPT THEN RETURN x.CST_CNTCT_DPT ;
			WHEN MAC_BP_ADDR_TYP.CST_CNTCT_PSN THEN RETURN x.CST_CNTCT_PSN ;
			WHEN MAC_BP_ADDR_TYP.CST_CNTCT_PSN_TITLE THEN RETURN x.CST_CNTCT_PSN_TITLE ;
			WHEN MAC_BP_ADDR_TYP.SPPL_CNTCT_DPT THEN RETURN x.SPPL_CNTCT_DPT ;
			WHEN MAC_BP_ADDR_TYP.SPPL_CNTCT_PSN THEN RETURN x.SPPL_CNTCT_PSN ;
			WHEN MAC_BP_ADDR_TYP.SPPL_CNTCT_PSN_TITLE THEN RETURN x.SPPL_CNTCT_PSN_TITLE ;
			WHEN MAC_BP_ADDR_TYP.DLV_CNTCT_DPT THEN RETURN x.DLV_CNTCT_DPT ;
			WHEN MAC_BP_ADDR_TYP.DLV_CNTCT_PSN THEN RETURN x.DLV_CNTCT_PSN ;
			WHEN MAC_BP_ADDR_TYP.DLV_CNTCT_PSN_TITLE THEN RETURN x.DLV_CNTCT_PSN_TITLE ;
			WHEN MAC_BP_ADDR_TYP.BILL_ZIP_CD THEN RETURN x.BILL_ZIP_CD ;
			WHEN MAC_BP_ADDR_TYP.BILL_ADDR1 THEN RETURN x.BILL_ADDR1 ;
			WHEN MAC_BP_ADDR_TYP.BILL_ADDR2 THEN RETURN x.BILL_ADDR2 ;
			WHEN MAC_BP_ADDR_TYP.BILL_ADDR3 THEN RETURN x.BILL_ADDR3 ;
			WHEN MAC_BP_ADDR_TYP.BILL_ADDR4 THEN RETURN x.BILL_ADDR4 ;
			WHEN MAC_BP_ADDR_TYP.BILL_TEL THEN RETURN x.BILL_TEL ;
			WHEN MAC_BP_ADDR_TYP.BILL_BCST_NM THEN RETURN x.BILL_BCST_NM ;
			WHEN MAC_BP_ADDR_TYP.BILL_BCST_DPT THEN RETURN x.BILL_BCST_DPT ;
			WHEN MAC_BP_ADDR_TYP.BILL_BCST_PSN THEN RETURN x.BILL_BCST_PSN ;
			WHEN MAC_BP_ADDR_TYP.BILL_BCST_PSN_TITLE THEN RETURN x.BILL_BCST_PSN_TITLE ;
			ELSE RETURN NULL ;
			END CASE ;

			EXIT ;
		END LOOP ;

		RETURN NULL ;

	END F_GET_BP_ADDR ;

	FUNCTION F_GET_AR_DPT_CD_NE (
		I_CST_CD	IN MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN MAPA_META.DT%TYPE,
		I_NO_CHK_FLG	IN MAPA_META.FLG%TYPE DEFAULT '0'
	) RETURN MAPA_META.DPT_CD%TYPE
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
	<IN>	I_NO_CHK_FLG
			部門有効確認対象外ＦＬＧ
	<RETURNVALUE>
		得意先ＣＤ、基準日から取得した債権部門ＣＤ
	<HISTORY>
	**********************************************************/
	IS
		L_AR_DPT_CD	MAPA_META.DPT_CD%TYPE ;
	BEGIN
		L_AR_DPT_CD := NULL ;
		IF I_CST_CD IS NULL OR I_BASE_DT IS NULL THEN
			RETURN L_AR_DPT_CD ;
		END IF ;

		FOR x IN BP_SUB(I_CST_CD, I_BASE_DT) LOOP
			L_AR_DPT_CD := x.AR_DPT_CD ;
			EXIT ;
		END LOOP ;

		IF I_NO_CHK_FLG = '1' THEN
			RETURN L_AR_DPT_CD ;
		END IF ;

		RETURN MAPA_DPT.F_CHECK_DPT_CD(L_AR_DPT_CD, I_BASE_DT) ;

	END F_GET_AR_DPT_CD_NE ;

	FUNCTION F_GET_AR_DPT_CD (
		I_CST_CD	IN MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN MAPA_META.DT%TYPE
	) RETURN MAPA_META.DPT_CD%TYPE
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
	IS
		L_AR_DPT_CD	MAPA_META.DPT_CD%TYPE ;
	BEGIN
		L_AR_DPT_CD := NULL ;
		IF I_CST_CD IS NULL OR I_BASE_DT IS NULL THEN
			RETURN L_AR_DPT_CD ;
		END IF ;

		L_AR_DPT_CD := F_GET_AR_DPT_CD_NE(I_CST_CD, I_BASE_DT, '1') ;

		IF L_AR_DPT_CD IS NULL THEN
			G_BIND := FCPA_ERR.MSG_BINDER(I_CST_CD, FCPA_DATE_UTIL.F_TO_CHAR(I_BASE_DT, FCPA_DATE_UTIL.Y4MD)) ;
			FCPA_ERR.RAISE_APP_ERR('MABSD0006', G_BIND) ;
		ELSE
			G_BIND := FCPA_ERR.MSG_BINDER(I_CST_CD, L_AR_DPT_CD, FCPA_DATE_UTIL.F_TO_CHAR(I_BASE_DT, FCPA_DATE_UTIL.Y4MD)) ;
			L_AR_DPT_CD := MAPA_DPT.F_CHECK_DPT_CD(L_AR_DPT_CD, I_BASE_DT) ;
			IF L_AR_DPT_CD IS NULL THEN
				FCPA_ERR.RAISE_APP_ERR('MABSD0005', G_BIND) ;
			END IF ;
		END IF ;

		RETURN L_AR_DPT_CD ;
	END F_GET_AR_DPT_CD ;

	FUNCTION F_GET_BCST_DPT_CD_NE (
		I_BCST_CD	IN MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN MAPA_META.DT%TYPE,
		I_NO_CHK_FLG	IN MAPA_META.FLG%TYPE DEFAULT '0'
	) RETURN MAPA_META.DPT_CD%TYPE
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
	<IN>	I_NO_CHK_FLG
			部門有効確認対象外ＦＬＧ
	<RETURNVALUE>
		請求先ＣＤ、基準日から取得した請求先担当部門ＣＤ
	<HISTORY>
	**********************************************************/
	IS
		L_BCST_DPT_CD	MAPA_META.DPT_CD%TYPE ;
	BEGIN
		L_BCST_DPT_CD := NULL ;
		IF I_BCST_CD IS NULL OR I_BASE_DT IS NULL THEN
			RETURN L_BCST_DPT_CD ;
		END IF ;

		FOR x IN BP_SUB(I_BCST_CD, I_BASE_DT) LOOP
			L_BCST_DPT_CD := x.BCST_DPT_CD ;
			EXIT ;
		END LOOP ;

		IF I_NO_CHK_FLG = '1' THEN
			RETURN L_BCST_DPT_CD ;
		END IF ;

		RETURN MAPA_DPT.F_CHECK_DPT_CD(L_BCST_DPT_CD, I_BASE_DT) ;

	END F_GET_BCST_DPT_CD_NE ;

	FUNCTION F_GET_BCST_DPT_CD (
		I_BCST_CD	IN MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN MAPA_META.DT%TYPE
	) RETURN MAPA_META.DPT_CD%TYPE
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
	IS
		L_BCST_DPT_CD	MAPA_META.DPT_CD%TYPE ;
	BEGIN
		L_BCST_DPT_CD := NULL ;
		IF I_BCST_CD IS NULL OR I_BASE_DT IS NULL THEN
			RETURN L_BCST_DPT_CD ;
		END IF ;

		L_BCST_DPT_CD := F_GET_BCST_DPT_CD_NE(I_BCST_CD, I_BASE_DT, '1') ;

		IF L_BCST_DPT_CD IS NULL THEN
			G_BIND := FCPA_ERR.MSG_BINDER(I_BCST_CD, FCPA_DATE_UTIL.F_TO_CHAR(I_BASE_DT, FCPA_DATE_UTIL.Y4MD)) ;
			FCPA_ERR.RAISE_APP_ERR('MABSD0007', G_BIND) ;
		ELSE
			G_BIND := FCPA_ERR.MSG_BINDER(I_BCST_CD, L_BCST_DPT_CD, FCPA_DATE_UTIL.F_TO_CHAR(I_BASE_DT, FCPA_DATE_UTIL.Y4MD)) ;
			L_BCST_DPT_CD := MAPA_DPT.F_CHECK_DPT_CD(L_BCST_DPT_CD, I_BASE_DT) ;
			IF L_BCST_DPT_CD IS NULL THEN
				FCPA_ERR.RAISE_APP_ERR('MABSD0005', G_BIND) ;
			END IF ;
		END IF ;

		RETURN L_BCST_DPT_CD ;

	END F_GET_BCST_DPT_CD ;

	FUNCTION F_GET_VMI_PURC_DPT_CD_NE (
		I_SPPL_CD	IN MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN MAPA_META.DT%TYPE,
		I_NO_CHK_FLG	IN MAPA_META.FLG%TYPE DEFAULT '0'
	) RETURN MAPA_META.DPT_CD%TYPE
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
	<IN>	I_NO_CHK_FLG
			部門有効確認対象外ＦＬＧ
	<RETURNVALUE>
		発注先ＣＤ、基準日から取得したＶＭＩ購買部門ＣＤ
	<HISTORY>
	**********************************************************/
	IS
		L_VMI_PURC_DPT_CD	MAPA_META.DPT_CD%TYPE ;
	BEGIN
		L_VMI_PURC_DPT_CD := NULL ;
		IF I_SPPL_CD IS NULL OR I_BASE_DT IS NULL THEN
			RETURN L_VMI_PURC_DPT_CD ;
		END IF ;

		FOR x IN BP_SUB(I_SPPL_CD, I_BASE_DT) LOOP
			L_VMI_PURC_DPT_CD := x.VMI_PURC_DPT_CD ;
			EXIT ;
		END LOOP ;

		IF I_NO_CHK_FLG = '1' THEN
			RETURN L_VMI_PURC_DPT_CD ;
		END IF ;

		RETURN MAPA_DPT.F_CHECK_DPT_CD(L_VMI_PURC_DPT_CD, I_BASE_DT) ;

	END F_GET_VMI_PURC_DPT_CD_NE ;

	FUNCTION F_GET_VMI_PURC_DPT_CD (
		I_SPPL_CD	IN MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN MAPA_META.DT%TYPE
	) RETURN MAPA_META.DPT_CD%TYPE
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
	IS
		L_VMI_PURC_DPT_CD	MAPA_META.DPT_CD%TYPE ;
	BEGIN
		L_VMI_PURC_DPT_CD := NULL ;
		IF I_SPPL_CD IS NULL OR I_BASE_DT IS NULL THEN
			RETURN L_VMI_PURC_DPT_CD ;
		END IF ;

		L_VMI_PURC_DPT_CD := F_GET_VMI_PURC_DPT_CD_NE(I_SPPL_CD, I_BASE_DT, '1') ;

		IF L_VMI_PURC_DPT_CD IS NULL THEN
			G_BIND := FCPA_ERR.MSG_BINDER(I_SPPL_CD, FCPA_DATE_UTIL.F_TO_CHAR(I_BASE_DT, FCPA_DATE_UTIL.Y4MD)) ;
			FCPA_ERR.RAISE_APP_ERR('MABSD0008', G_BIND) ;
		ELSE
			G_BIND := FCPA_ERR.MSG_BINDER(I_SPPL_CD, L_VMI_PURC_DPT_CD, FCPA_DATE_UTIL.F_TO_CHAR(I_BASE_DT, FCPA_DATE_UTIL.Y4MD)) ;
			L_VMI_PURC_DPT_CD := MAPA_DPT.F_CHECK_DPT_CD(L_VMI_PURC_DPT_CD, I_BASE_DT) ;
			IF L_VMI_PURC_DPT_CD IS NULL THEN
				FCPA_ERR.RAISE_APP_ERR('MABSD0005', G_BIND) ;
			END IF ;
		END IF ;

		RETURN L_VMI_PURC_DPT_CD ;

	END F_GET_VMI_PURC_DPT_CD ;

	FUNCTION F_GET_AP_DPT_CD_NE (
		I_ASPPL_CD	IN MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN MAPA_META.DT%TYPE,
		I_NO_CHK_FLG	IN MAPA_META.FLG%TYPE DEFAULT '0'
	) RETURN MAPA_META.DPT_CD%TYPE
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
	<IN>	I_NO_CHK_FLG
			部門有効確認対象外ＦＬＧ
	<RETURNVALUE>
		買掛先ＣＤ、基準日から取得した債務部門ＣＤ
	<HISTORY>
	**********************************************************/
	IS
		L_AP_DPT_CD	MAPA_META.DPT_CD%TYPE ;
	BEGIN
		L_AP_DPT_CD := NULL ;
		IF I_ASPPL_CD IS NULL OR I_BASE_DT IS NULL THEN
			RETURN L_AP_DPT_CD ;
		END IF ;

		FOR x IN BP_SUB(I_ASPPL_CD, I_BASE_DT) LOOP
			L_AP_DPT_CD := x.AP_DPT_CD ;
			EXIT ;
		END LOOP ;

		IF I_NO_CHK_FLG = '1' THEN
			RETURN L_AP_DPT_CD ;
		END IF ;

		RETURN MAPA_DPT.F_CHECK_DPT_CD(L_AP_DPT_CD, I_BASE_DT) ;

	END F_GET_AP_DPT_CD_NE ;

	FUNCTION F_GET_AP_DPT_CD (
		I_ASPPL_CD	IN MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN MAPA_META.DT%TYPE
	) RETURN MAPA_META.DPT_CD%TYPE
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
	IS
		L_AP_DPT_CD	MAPA_META.DPT_CD%TYPE ;
	BEGIN
		L_AP_DPT_CD := NULL ;
		IF I_ASPPL_CD IS NULL OR I_BASE_DT IS NULL THEN
			RETURN L_AP_DPT_CD ;
		END IF ;

		L_AP_DPT_CD := F_GET_AP_DPT_CD_NE(I_ASPPL_CD, I_BASE_DT, '1') ;

		IF L_AP_DPT_CD IS NULL THEN
			G_BIND := FCPA_ERR.MSG_BINDER(I_ASPPL_CD, FCPA_DATE_UTIL.F_TO_CHAR(I_BASE_DT, FCPA_DATE_UTIL.Y4MD)) ;
			FCPA_ERR.RAISE_APP_ERR('MABSD0009', G_BIND) ;
		ELSE
			G_BIND := FCPA_ERR.MSG_BINDER(I_ASPPL_CD, L_AP_DPT_CD, FCPA_DATE_UTIL.F_TO_CHAR(I_BASE_DT, FCPA_DATE_UTIL.Y4MD)) ;
			L_AP_DPT_CD := MAPA_DPT.F_CHECK_DPT_CD(L_AP_DPT_CD, I_BASE_DT) ;
			IF L_AP_DPT_CD IS NULL THEN
				FCPA_ERR.RAISE_APP_ERR('MABSD0005', G_BIND) ;
			END IF ;
		END IF ;

		RETURN L_AP_DPT_CD ;

	END F_GET_AP_DPT_CD ;

	FUNCTION F_GET_AP_DPT_CD_NE2 (
		I_SPPL_CD	IN MAPA_META.BP_CD%TYPE,
		I_ASPPL_CD	IN MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN MAPA_META.DT%TYPE,
		I_NO_CHK_FLG	IN MAPA_META.FLG%TYPE DEFAULT '0'
	) RETURN MAPA_META.DPT_CD%TYPE
	/*********************************************************
	<SYNOPSIS>
		取引先（買掛先）に対する債務部門ＣＤを取得する(Not Exception版)
		取引先補助.債務部門 > 取引先.債務部門 > 発注先担当.購買部門(債務部門オン)　の優先順位で取得する
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
	<IN>	I_NO_CHK_FLG
			部門有効確認対象外ＦＬＧ
	<RETURNVALUE>
		買掛先ＣＤ、基準日から取得した債務部門ＣＤ
	<HISTORY>
	**********************************************************/
	IS
		L_AP_DPT_CD	MAPA_META.DPT_CD%TYPE ;
	BEGIN
		L_AP_DPT_CD := NULL ;
		IF I_SPPL_CD IS NULL OR I_ASPPL_CD IS NULL OR I_BASE_DT IS NULL THEN
			RETURN L_AP_DPT_CD ;
		END IF ;

		L_AP_DPT_CD := F_GET_AP_DPT_CD_NE(I_ASPPL_CD, I_BASE_DT, I_NO_CHK_FLG) ;

		IF L_AP_DPT_CD IS NOT NULL THEN
			RETURN L_AP_DPT_CD ;
		END IF;

		BEGIN
			SELECT 
				m.PURC_DPT_CD
			INTO
				L_AP_DPT_CD
			FROM 
				MAM_SPPL_USR m
			WHERE 0 = 0
			AND I_BASE_DT BETWEEN m.ST_DT AND m.END_DT
			AND m.SPPL_CD = I_SPPL_CD;
		EXCEPTION 
			WHEN NO_DATA_FOUND THEN
				RETURN NULL;
		END;

		BEGIN
			SELECT 
				m.DPT_CD
			INTO
				L_AP_DPT_CD
			FROM 
				MAM_DPT m
			WHERE 0 = 0
			AND I_BASE_DT BETWEEN m.ST_DT AND m.END_DT
			AND m.AP_DPT_FLG = '1'
			AND m.DPT_CD = L_AP_DPT_CD;
		EXCEPTION 
			WHEN NO_DATA_FOUND THEN
				RETURN NULL;
		END;

		RETURN L_AP_DPT_CD ;

	END F_GET_AP_DPT_CD_NE2 ;

	FUNCTION F_GET_AP_DPT_CD2 (
		I_SPPL_CD	IN MAPA_META.BP_CD%TYPE,
		I_ASPPL_CD	IN MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN MAPA_META.DT%TYPE
	) RETURN MAPA_META.DPT_CD%TYPE
	/*********************************************************
	<SYNOPSIS>
		取引先（買掛先）に対する債務部門ＣＤを取得する
		取引先補助.債務部門 > 取引先.債務部門 > 発注先担当.購買部門（債務部門オン）　の優先順位で取得する
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
	IS
		L_AP_DPT_CD	MAPA_META.DPT_CD%TYPE ;
	BEGIN
		L_AP_DPT_CD := NULL ;
		IF I_SPPL_CD IS NULL OR I_ASPPL_CD IS NULL OR I_BASE_DT IS NULL THEN
			RETURN L_AP_DPT_CD ;
		END IF ;

		L_AP_DPT_CD := F_GET_AP_DPT_CD_NE2(I_SPPL_CD, I_ASPPL_CD, I_BASE_DT, '1') ;

		IF L_AP_DPT_CD IS NULL THEN
			G_BIND := FCPA_ERR.MSG_BINDER(I_ASPPL_CD, FCPA_DATE_UTIL.F_TO_CHAR(I_BASE_DT, FCPA_DATE_UTIL.Y4MD)) ;
			FCPA_ERR.RAISE_APP_ERR('MABSD0009', G_BIND) ;
		ELSE
			G_BIND := FCPA_ERR.MSG_BINDER(I_ASPPL_CD, L_AP_DPT_CD, FCPA_DATE_UTIL.F_TO_CHAR(I_BASE_DT, FCPA_DATE_UTIL.Y4MD)) ;
			L_AP_DPT_CD := MAPA_DPT.F_CHECK_DPT_CD(L_AP_DPT_CD, I_BASE_DT) ;
			IF L_AP_DPT_CD IS NULL THEN
				FCPA_ERR.RAISE_APP_ERR('MABSD0005', G_BIND) ;
			END IF ;
		END IF ;

		RETURN L_AP_DPT_CD ;

	END F_GET_AP_DPT_CD2 ;

	FUNCTION F_GET_BSPPL_DPT_CD_NE (
		I_BSPPL_CD	IN MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN MAPA_META.DT%TYPE,
		I_NO_CHK_FLG	IN MAPA_META.FLG%TYPE DEFAULT '0'
	) RETURN MAPA_META.DPT_CD%TYPE
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
	<IN>	I_NO_CHK_FLG
			部門有効確認対象外ＦＬＧ
	<RETURNVALUE>
		支払予定管理先ＣＤ、基準日から取得した支払予定管理先担当部門ＣＤ
	<HISTORY>
	**********************************************************/
	IS
		L_BSPPL_DPT_CD	MAPA_META.DPT_CD%TYPE ;
	BEGIN
		L_BSPPL_DPT_CD := NULL ;
		IF I_BSPPL_CD IS NULL OR I_BASE_DT IS NULL THEN
			RETURN L_BSPPL_DPT_CD ;
		END IF ;

		FOR x IN BP_SUB(I_BSPPL_CD, I_BASE_DT) LOOP
			L_BSPPL_DPT_CD := x.BSPPL_DPT_CD ;
			EXIT ;
		END LOOP ;

		IF I_NO_CHK_FLG = '1' THEN
			RETURN L_BSPPL_DPT_CD ;
		END IF ;

		RETURN MAPA_DPT.F_CHECK_DPT_CD(L_BSPPL_DPT_CD, I_BASE_DT) ;

	END F_GET_BSPPL_DPT_CD_NE ;

	FUNCTION F_GET_BSPPL_DPT_CD (
		I_BSPPL_CD	IN MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN MAPA_META.DT%TYPE
	) RETURN MAPA_META.DPT_CD%TYPE
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
	IS
		L_BSPPL_DPT_CD	MAPA_META.DPT_CD%TYPE ;
	BEGIN
		L_BSPPL_DPT_CD := NULL ;
		IF I_BSPPL_CD IS NULL OR I_BASE_DT IS NULL THEN
			RETURN L_BSPPL_DPT_CD ;
		END IF ;

		L_BSPPL_DPT_CD := F_GET_BSPPL_DPT_CD_NE(I_BSPPL_CD, I_BASE_DT, '1') ;

		IF L_BSPPL_DPT_CD IS NULL THEN
			G_BIND := FCPA_ERR.MSG_BINDER(I_BSPPL_CD, FCPA_DATE_UTIL.F_TO_CHAR(I_BASE_DT, FCPA_DATE_UTIL.Y4MD)) ;
			FCPA_ERR.RAISE_APP_ERR('MABSD0010', G_BIND) ;
		ELSE
			G_BIND := FCPA_ERR.MSG_BINDER(I_BSPPL_CD, L_BSPPL_DPT_CD, FCPA_DATE_UTIL.F_TO_CHAR(I_BASE_DT, FCPA_DATE_UTIL.Y4MD)) ;
			L_BSPPL_DPT_CD := MAPA_DPT.F_CHECK_DPT_CD(L_BSPPL_DPT_CD, I_BASE_DT) ;
			IF L_BSPPL_DPT_CD IS NULL THEN
				FCPA_ERR.RAISE_APP_ERR('MABSD0005', G_BIND) ;
			END IF ;
		END IF ;

		RETURN L_BSPPL_DPT_CD ;

	END F_GET_BSPPL_DPT_CD ;

	FUNCTION F_GET_CRED_OF_SPPL (
		I_SPPL_CD	IN	MAPA_META.BP_CD%TYPE
	)
	RETURN MAPA_META.BP_CD%TYPE
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
	IS
		L_CRED_CD	MAPA_META.BP_CD%TYPE ;
	BEGIN
		L_CRED_CD := NULL ;
		FOR x IN (
			-- 買掛先の取得
			SELECT	m.ASPPL_CD
			FROM	MAM_BP m
			WHERE	0 = 0
			AND	m.BP_CD = I_SPPL_CD
			AND	m.SPPL_FLG = '1'
			AND 	m.ASPPL_CD IS NOT NULL
			)
		LOOP
			L_CRED_CD := F_GET_CRED_OF_ASPPL(x.ASPPL_CD) ;
			EXIT ;
		END LOOP ;

		RETURN L_CRED_CD ;

	END F_GET_CRED_OF_SPPL ;

	FUNCTION F_GET_CRED_OF_ASPPL (
		I_ASPPL_CD	IN	MAPA_META.BP_CD%TYPE
	)
	RETURN MAPA_META.BP_CD%TYPE
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
	IS
		L_CRED_CD	MAPA_META.BP_CD%TYPE ;
	BEGIN
		L_CRED_CD := NULL ;
		FOR x IN (
			-- 支払予定管理先の取得
			SELECT	m.BSPPL_CD
			FROM	MAM_BP m
			WHERE	0 = 0
			AND	m.BP_CD = I_ASPPL_CD
			AND	m.ASPPL_FLG = '1'
			AND 	m.BSPPL_CD IS NOT NULL
			)
		LOOP
			L_CRED_CD := F_GET_CRED_OF_BSPPL(x.BSPPL_CD) ;
			EXIT ;
		END LOOP ;

		RETURN L_CRED_CD ;

	END F_GET_CRED_OF_ASPPL ;

	FUNCTION F_GET_CRED_OF_BSPPL (
		I_BSPPL_CD	IN	MAPA_META.BP_CD%TYPE
	)
	RETURN MAPA_META.BP_CD%TYPE
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
	IS
		L_CRED_CD	MAPA_META.BP_CD%TYPE ;
	BEGIN
		-- 与信管理先の取得
		SELECT	MIN(m.AP_CRED_CD)
		INTO 	L_CRED_CD
		FROM	MAM_BP m
		WHERE	0 = 0
		AND	m.BP_CD = I_BSPPL_CD
		AND	m.BSPPL_FLG = '1'
		AND 	m.AP_CRED_CD IS NOT NULL
		;

		RETURN L_CRED_CD ;

	END F_GET_CRED_OF_BSPPL ;
	FUNCTION F_GET_PAY_DPT_CD_NE (
		I_PSPPL_CD	IN MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN MAPA_META.DT%TYPE,
		I_NO_CHK_FLG	IN MAPA_META.FLG%TYPE DEFAULT '0'
	) RETURN MAPA_META.DPT_CD%TYPE
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
	<IN>	I_NO_CHK_FLG
			部門有効確認対象外ＦＬＧ
	<RETURNVALUE>
		支払先ＣＤ、基準日から取得した支払部門ＣＤ
	<HISTORY>
	**********************************************************/
	IS
		L_PAY_DPT_CD	MAPA_META.DPT_CD%TYPE ;
	BEGIN
		L_PAY_DPT_CD := NULL ;
		IF I_PSPPL_CD IS NULL OR I_BASE_DT IS NULL THEN
			RETURN L_PAY_DPT_CD ;
		END IF ;

		FOR x IN BP_SUB(I_PSPPL_CD, I_BASE_DT) LOOP
			L_PAY_DPT_CD := x.PAY_DPT_CD ;
			EXIT ;
		END LOOP ;

		IF I_NO_CHK_FLG = '1' THEN
			RETURN L_PAY_DPT_CD ;
		END IF ;

		RETURN MAPA_DPT.F_CHECK_DPT_CD(L_PAY_DPT_CD, I_BASE_DT) ;

	END F_GET_PAY_DPT_CD_NE ;

	FUNCTION F_GET_PAY_DPT_CD (
		I_PSPPL_CD	IN MAPA_META.BP_CD%TYPE,
		I_BASE_DT	IN MAPA_META.DT%TYPE
	) RETURN MAPA_META.DPT_CD%TYPE
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
	IS
		L_PAY_DPT_CD	MAPA_META.DPT_CD%TYPE ;
	BEGIN
		L_PAY_DPT_CD := NULL ;
		IF I_PSPPL_CD IS NULL OR I_BASE_DT IS NULL THEN
			RETURN L_PAY_DPT_CD ;
		END IF ;

		L_PAY_DPT_CD := F_GET_PAY_DPT_CD_NE(I_PSPPL_CD, I_BASE_DT, '1') ;

		IF L_PAY_DPT_CD IS NULL THEN
			G_BIND := FCPA_ERR.MSG_BINDER(I_PSPPL_CD, FCPA_DATE_UTIL.F_TO_CHAR(I_BASE_DT, FCPA_DATE_UTIL.Y4MD)) ;
			FCPA_ERR.RAISE_APP_ERR('MABSD0050', G_BIND) ;
		ELSE
			G_BIND := FCPA_ERR.MSG_BINDER(I_PSPPL_CD, L_PAY_DPT_CD, FCPA_DATE_UTIL.F_TO_CHAR(I_BASE_DT, FCPA_DATE_UTIL.Y4MD)) ;
			L_PAY_DPT_CD := MAPA_DPT.F_CHECK_DPT_CD(L_PAY_DPT_CD, I_BASE_DT) ;
			IF L_PAY_DPT_CD IS NULL THEN
				FCPA_ERR.RAISE_APP_ERR('MABSD0005', G_BIND) ;
			END IF ;
		END IF ;

		RETURN L_PAY_DPT_CD ;

	END F_GET_PAY_DPT_CD ;

	PROCEDURE P_DEL_BP
	/*********************************************************
	<SYNOPSIS>
		MAW_BP_KEYに登録されている取引先に対して
		取引先マスタのレコードを削除する
	<REMARKS>
	<ARGUMENTS>
	<RETURNVALUE>
	<HISTORY>
	**********************************************************/
	IS
		L_CNT	NUMBER ;
		L_CO	MAPA_META.CO_CD%TYPE ;

	BEGIN
		L_CO := FCPA_CONTEXT.F_GET_CO_CD ;

		DELETE	MAM_BP_ALL m
		WHERE	0=0
		AND	m.CO_CD = L_CO
		AND	EXISTS (
				SELECT	'X'
				FROM	MAW_BP_KEY w
				WHERE	0=0
				AND	w.BP_CD = m.BP_CD
			)
		;
		DELETE	MAM_BP_LCL_ALL m
		WHERE	0=0
		AND	m.CO_CD = L_CO
		AND	EXISTS (
				SELECT	'X'
				FROM	MAW_BP_KEY w
				WHERE	0=0
				AND	w.BP_CD = m.BP_CD
			)
		;
		
		DELETE	MAM_BP_SUB m
		WHERE	0=0
		AND	EXISTS (
				SELECT	'X'
				FROM	MAW_BP_KEY w
				WHERE	0=0
				AND	w.BP_CD = m.BP_CD
			)
		;

		SELECT	COUNT(*)
		INTO	L_CNT
		FROM	MAM_SYS_PARM m
		WHERE	0=0
		AND	m.PARM_KEY = 'BP_CMN_DEL'
		AND	m.PARM_VAL = '1'
		AND	m.DEL_FLG = '0'
		;

		IF L_CNT > 0 THEN
			DELETE	MAM_BP_CMN m
			WHERE	0=0
			AND	EXISTS(
				SELECT	'X'
				FROM	MAW_BP_KEY w
				WHERE	0 = 0
				AND	m.bp_cd = w.bp_cd
				)
			AND	NOT EXISTS(
				SELECT	'X'
				FROM	MAM_BP_ALL y1
				WHERE	0=0
				AND	m.BP_CD = y1.BP_CD
				)
			;
			DELETE	MAM_BP_LCL m
			WHERE	0=0
			AND	EXISTS(
				SELECT	'X'
				FROM	MAW_BP_KEY w
				WHERE	0 = 0
				AND	m.bp_cd = w.bp_cd
				)
			AND	NOT EXISTS(
				SELECT	'X'
				FROM	MAM_BP_ALL y1
				WHERE	0=0
				AND	m.BP_CD = y1.BP_CD
				)
			;
		END IF ;

	END P_DEL_BP ;

END MAPA_BP ;

/
show errors;


