SET SQLBLANKLINES ON

CREATE OR REPLACE VIEW MSVT_ARR_ACT_RECV_IF(
	DATA_LNO,
	DATA_NO,
	EXE_STS_TYP,
	DATA_CRUD_TYP,
	EXT_SYS_CD,
	EXT_DATA_NO,
	EXT_DATA_LNO,
	DATA_MAKE_DT,
	IMP_FLG,
	RECV_DT,
	SPPL_CD,
	IV_FLG,
	IF_PROC_TYP,
	ARR_SCHD_NO,
	PO_NO,
	PO_D_NO,
	PRMS_RCPT_D_NO,
	DLV_INST_NO,
	DLV_INST_D_NO,
	RCPT_IV_D_NO,
	SLS_RET_SCHD_D_NO,
	DLV_SLIP_D_NO,
	IV_D_NO,
	EXT_ARR_ACT_NO,
	ARR_TM,
	ARR_DPT_CD,
	ARR_USR_CD,
	ARR_LG_GRP_CD,
	ARR_LOC_CD,
	ARR_STR_LN_CD,
	ITM_CD,
	ITM_SUB1,
	ITM_SUB2,
	ITM_SUB3,
	LOT_NO,
	SUBLOT_NO,
	VER_NO,
	GD_CD,
	TRD_UNIT_QTY,
	TRD_UNIT_CD,
	ABORT_FLG,
	BP_LOT_NO,
	BP_DLV_SLIP_NO,
	BP_DLV_SLIP_REV,
	BP_DLV_SLIP_D_NO,
	SHIP_FR_VALID_DT,
	INSP_CNT_RMRKS,
	INTR_RMRKS,
	SUB_CHAR1,
	SUB_CHAR2,
	SUB_CHAR3,
	SUB_CHAR4,
	SUB_CHAR5,
	SUB_CHAR6,
	SUB_CHAR7,
	SUB_CHAR8,
	SUB_CHAR9,
	SUB_CHAR10,
	SUB_CHAR11,
	SUB_CHAR12,
	SUB_CHAR13,
	SUB_CHAR14,
	SUB_CHAR15,
	SUB_CHAR16,
	SUB_CHAR17,
	SUB_CHAR18,
	SUB_CHAR19,
	SUB_CHAR20,
	SUB_CHAR21,
	SUB_CHAR22,
	SUB_CHAR23,
	SUB_CHAR24,
	SUB_CHAR25,
	SUB_CHAR26,
	SUB_CHAR27,
	SUB_CHAR28,
	SUB_CHAR29,
	SUB_CHAR30,
	SUB_NUM1,
	SUB_NUM2,
	SUB_NUM3,
	SUB_NUM4,
	SUB_NUM5,
	SUB_DT1,
	SUB_DT2,
	SUB_DT3,
	SUB_DT4,
	SUB_DT5,
	BATCH_LOG_NO,
	LOG_SUB_KEY1,
	LOG_SUB_KEY2,
	INS_USR_ID,
	INS_USR_NM,
	INS_TS,
	INS_FUNC_ID,
	UPD_CNTR,
	UPD_USR_ID,
	UPD_USR_NM,
	UPD_TS,
	UPD_FUNC_ID,
	UPD_SRV_REQ_NO
)
AS
SELECT
	IF.DATA_LNO					--データ行ＮＯ
	,IF.DATA_NO					--データＮＯ
	,IF.EXE_STS_TYP					--ＰＧ実行状況区分
	,IF.DATA_CRUD_TYP					--データ更新区分
	,IF.EXT_SYS_CD					--外部システムＣＤ
	,IF.EXT_DATA_NO					--外部システムデータＮＯ
	,IF.EXT_DATA_LNO					--外部システムデータ行ＮＯ
	,IF.DATA_MAKE_DT					--送信元レコード作成日時
	,IF.IMP_FLG					--取込対象ＦＬＧ
	,IF.RECV_DT					--受信日
	,IF.SPPL_CD					--発注先
	,IF.IV_FLG					--インボイスＦＬＧ
	,MAC_IF_PROC_TYP.SHIP_ACT_RECV IF_PROC_TYP					--ＩＦ処理区分
	,NULL ARR_SCHD_NO					--入荷予定ＮＯ
	,IF.PO_NO					--発注ＮＯ
	,IF.PO_D_NO					--発注明細ＮＯ
	,NULL PRMS_RCPT_D_NO					--納期回答受領明細ＮＯ
	,IF.DLV_INST_NO					--納入指示ＮＯ
	,IF.DLV_INST_D_NO					--納入指示明細ＮＯ
	,NULL RCPT_IV_D_NO					--受領インボイス明細ＮＯ
	,NULL SLS_RET_SCHD_D_NO					--売上返品予定明細ＮＯ
	,NULL DLV_SLIP_D_NO					--納品書明細ＮＯ
	,NULL IV_D_NO					--インボイス明細ＮＯ
	,IF.SPPL_CD || '-' || IF.PO_D_NO || '-' || IF.BP_DLV_SLIP_NO || '-' || IF.BP_DLV_SLIP_D_NO EXT_ARR_ACT_NO					--外部入荷実績ＮＯ
	,IF.DLV_SCHD_TM ARR_TM					--入荷日時
	,NULL ARR_DPT_CD 					--入荷部門ＣＤ
	,NULL ARR_USR_CD					--入荷担当者ＣＤ
	,LOC.LG_GRP_CD ARR_LG_GRP_CD					--入荷物流グループＣＤ
	,IF.IN_TO_ID_CD ARR_LOC_CD					--入荷場所ＣＤ
	,NULL ARR_STR_LN_CD					--入荷棚・ラインＣＤ
	,IF.ITM_CD					--品目ＣＤ
	,IF.ITM_SUB1					--枝番１
	,IF.ITM_SUB2					--枝番２
	,IF.ITM_SUB3					--枝番３
	,IF.LOT_NO					--ロットＮＯ
	,IF.SUBLOT_NO					--サブロットＮＯ
	,NULL VER_NO					--版ＮＯ
	,NULL GD_CD					--格付ＣＤ
	,IF.TRD_UNIT_QTY					--取引単位数量
	,IF.TRD_UNIT_CD					--取引単位ＣＤ
	,'0' ABORT_FLG					--打切ＦＬＧ
	,IF.LOT_NO BP_LOT_NO					--業者ロットＮＯ
	,IF.BP_DLV_SLIP_NO					--業者納品書ＮＯ
	,IF.BP_DLV_SLIP_REV				--業者納品書改訂番号
	,IF.BP_DLV_SLIP_D_NO					--業者納品書明細ＮＯ
	,IF.SHIP_FR_VALID_DT					--出荷元期限
	,NULL INSP_CNT_RMRKS					--検査連絡備考
	,NULL INTR_RMRKS					--内部備考
	,IF.SUB_CHAR1					--予備ＣＨＡＲ項目１
	,IF.SUB_CHAR2					--予備ＣＨＡＲ項目２
	,IF.SUB_CHAR3					--予備ＣＨＡＲ項目３
	,IF.SUB_CHAR4					--予備ＣＨＡＲ項目４
	,IF.SUB_CHAR5					--予備ＣＨＡＲ項目５
	,IF.SUB_CHAR6					--予備ＣＨＡＲ項目６
	,IF.SUB_CHAR7					--予備ＣＨＡＲ項目７
	,IF.SUB_CHAR8					--予備ＣＨＡＲ項目８
	,IF.SUB_CHAR9					--予備ＣＨＡＲ項目９
	,IF.SUB_CHAR10					--予備ＣＨＡＲ項目１０
	,IF.SUB_CHAR11					--予備ＣＨＡＲ項目１１
	,IF.SUB_CHAR12					--予備ＣＨＡＲ項目１２
	,IF.SUB_CHAR13					--予備ＣＨＡＲ項目１３
	,IF.SUB_CHAR14					--予備ＣＨＡＲ項目１４
	,IF.SUB_CHAR15					--予備ＣＨＡＲ項目１５
	,IF.SUB_CHAR16					--予備ＣＨＡＲ項目１６
	,IF.SUB_CHAR17					--予備ＣＨＡＲ項目１７
	,IF.SUB_CHAR18					--予備ＣＨＡＲ項目１８
	,IF.SUB_CHAR19					--予備ＣＨＡＲ項目１９
	,IF.SUB_CHAR20					--予備ＣＨＡＲ項目２０
	,IF.SUB_CHAR21					--予備ＣＨＡＲ項目２１
	,IF.SUB_CHAR22					--予備ＣＨＡＲ項目２２
	,IF.SUB_CHAR23					--予備ＣＨＡＲ項目２３
	,IF.SUB_CHAR24					--予備ＣＨＡＲ項目２４
	,IF.SUB_CHAR25					--予備ＣＨＡＲ項目２５
	,IF.SUB_CHAR26					--予備ＣＨＡＲ項目２６
	,IF.SUB_CHAR27					--予備ＣＨＡＲ項目２７
	,IF.SUB_CHAR28					--予備ＣＨＡＲ項目２８
	,IF.SUB_CHAR29					--予備ＣＨＡＲ項目２９
	,IF.SUB_CHAR30					--予備ＣＨＡＲ項目３０
	,IF.SUB_NUM1					--予備ＮＵＭ項目１
	,IF.SUB_NUM2					--予備ＮＵＭ項目２
	,IF.SUB_NUM3					--予備ＮＵＭ項目３
	,IF.SUB_NUM4					--予備ＮＵＭ項目４
	,IF.SUB_NUM5					--予備ＮＵＭ項目５
	,IF.SUB_DT1					--予備ＤＡＴＥ項目１
	,IF.SUB_DT2					--予備ＤＡＴＥ項目２
	,IF.SUB_DT3					--予備ＤＡＴＥ項目３
	,IF.SUB_DT4					--予備ＤＡＴＥ項目４
	,IF.SUB_DT5					--予備ＤＡＴＥ項目５
	,IF.BATCH_LOG_NO					--ログＮＯ
	,IF.LOG_SUB_KEY1					--ログサブキー１
	,IF.LOG_SUB_KEY2					--ログサブキー２
	,IF.INS_USR_ID					--登録ユーザＩＤ
	,IF.INS_USR_NM					--登録ユーザ名
	,IF.INS_TS					--登録日時
	,IF.INS_FUNC_ID					--登録機能ＩＤ
	,IF.UPD_CNTR					--更新カウンタ
	,IF.UPD_USR_ID					--更新ユーザＩＤ
	,IF.UPD_USR_NM					--更新ユーザ名
	,IF.UPD_TS					--更新日時
	,IF.UPD_FUNC_ID					--更新機能ＩＤ
	,IF.UPD_SRV_REQ_NO					--更新リクエストＮＯ
FROM
	MST_ESHIP_ACT_RECV_IF IF
	LEFT JOIN MAM_LOC LOC ON (IF.IN_TO_ID_CD = LOC.LOC_CD)
UNION ALL
SELECT
	DATA_LNO					--データ行ＮＯ
	,DATA_NO					--データＮＯ
	,EXE_STS_TYP					--ＰＧ実行状況区分
	,DATA_CRUD_TYP					--データ更新区分
	,EXT_SYS_CD					--外部システムＣＤ
	,EXT_DATA_NO					--外部システムデータＮＯ
	,EXT_DATA_LNO					--外部システムデータ行ＮＯ
	,DATA_MAKE_DT					--送信元レコード作成日時
	,IMP_FLG					--取込対象ＦＬＧ
	,RECV_DT					--受信日
	,NULL SPPL_CD					--発注先
	,'0' IV_FLG					--インボイスＦＬＧ
	,MAC_IF_PROC_TYP.WMS_ARR_ACT_RECV IF_PROC_TYP					--ＩＦ処理区分
	,ARR_SCHD_NO					--入荷予定ＮＯ
	,NULL PO_NO					--発注ＮＯ
	,PO_D_NO					--発注明細ＮＯ
	,PRMS_RCPT_D_NO					--納期回答受領明細ＮＯ
	,NULL DLV_INST_NO					--納入指示ＮＯ
	,DLV_INST_D_NO					--納入指示明細ＮＯ
	,RCPT_IV_D_NO					--受領インボイス明細ＮＯ
	,SLS_RET_SCHD_D_NO					--売上返品予定明細ＮＯ
	,DLV_SLIP_D_NO					--納品書明細ＮＯ
	,IV_D_NO					--インボイス明細ＮＯ
	,EXT_ARR_ACT_NO					--外部入荷実績ＮＯ
	,ARR_TM					--入荷日時
	,ARR_DPT_CD					--入荷部門ＣＤ
	,ARR_USR_CD					--入荷担当者ＣＤ
	,ARR_LG_GRP_CD					--入荷物流グループＣＤ
	,ARR_LOC_CD					--入荷場所ＣＤ
	,ARR_STR_LN_CD					--入荷棚・ラインＣＤ
	,ITM_CD					--品目ＣＤ
	,ITM_SUB1					--枝番１
	,ITM_SUB2					--枝番２
	,ITM_SUB3					--枝番３
	,LOT_NO					--ロットＮＯ
	,SUBLOT_NO					--サブロットＮＯ
	,VER_NO					--版ＮＯ
	,GD_CD					--格付ＣＤ
	,TRD_UNIT_QTY					--取引単位数量
	,TRD_UNIT_CD					--取引単位ＣＤ
	,ABORT_FLG					--打切ＦＬＧ
	,BP_LOT_NO					--業者ロットＮＯ
	,BP_DLV_SLIP_NO					--業者納品書ＮＯ
	,NULL BP_DLV_SLIP_REV				--業者納品書改訂番号
	,BP_DLV_SLIP_D_NO					--業者納品書明細ＮＯ
	,SHIP_FR_VALID_DT					--出荷元期限
	,INSP_CNT_RMRKS					--検査連絡備考
	,INTR_RMRKS					--内部備考
	,SUB_CHAR1					--予備ＣＨＡＲ項目１
	,SUB_CHAR2					--予備ＣＨＡＲ項目２
	,SUB_CHAR3					--予備ＣＨＡＲ項目３
	,SUB_CHAR4					--予備ＣＨＡＲ項目４
	,SUB_CHAR5					--予備ＣＨＡＲ項目５
	,SUB_CHAR6					--予備ＣＨＡＲ項目６
	,SUB_CHAR7					--予備ＣＨＡＲ項目７
	,SUB_CHAR8					--予備ＣＨＡＲ項目８
	,SUB_CHAR9					--予備ＣＨＡＲ項目９
	,SUB_CHAR10					--予備ＣＨＡＲ項目１０
	,SUB_CHAR11					--予備ＣＨＡＲ項目１１
	,SUB_CHAR12					--予備ＣＨＡＲ項目１２
	,SUB_CHAR13					--予備ＣＨＡＲ項目１３
	,SUB_CHAR14					--予備ＣＨＡＲ項目１４
	,SUB_CHAR15					--予備ＣＨＡＲ項目１５
	,SUB_CHAR16					--予備ＣＨＡＲ項目１６
	,SUB_CHAR17					--予備ＣＨＡＲ項目１７
	,SUB_CHAR18					--予備ＣＨＡＲ項目１８
	,SUB_CHAR19					--予備ＣＨＡＲ項目１９
	,SUB_CHAR20					--予備ＣＨＡＲ項目２０
	,SUB_CHAR21					--予備ＣＨＡＲ項目２１
	,SUB_CHAR22					--予備ＣＨＡＲ項目２２
	,SUB_CHAR23					--予備ＣＨＡＲ項目２３
	,SUB_CHAR24					--予備ＣＨＡＲ項目２４
	,SUB_CHAR25					--予備ＣＨＡＲ項目２５
	,SUB_CHAR26					--予備ＣＨＡＲ項目２６
	,SUB_CHAR27					--予備ＣＨＡＲ項目２７
	,SUB_CHAR28					--予備ＣＨＡＲ項目２８
	,SUB_CHAR29					--予備ＣＨＡＲ項目２９
	,SUB_CHAR30					--予備ＣＨＡＲ項目３０
	,SUB_NUM1					--予備ＮＵＭ項目１
	,SUB_NUM2					--予備ＮＵＭ項目２
	,SUB_NUM3					--予備ＮＵＭ項目３
	,SUB_NUM4					--予備ＮＵＭ項目４
	,SUB_NUM5					--予備ＮＵＭ項目５
	,SUB_DT1					--予備ＤＡＴＥ項目１
	,SUB_DT2					--予備ＤＡＴＥ項目２
	,SUB_DT3					--予備ＤＡＴＥ項目３
	,SUB_DT4					--予備ＤＡＴＥ項目４
	,SUB_DT5					--予備ＤＡＴＥ項目５
	,BATCH_LOG_NO					--ログＮＯ
	,LOG_SUB_KEY1					--ログサブキー１
	,LOG_SUB_KEY2					--ログサブキー２
	,INS_USR_ID					--登録ユーザＩＤ
	,INS_USR_NM					--登録ユーザ名
	,INS_TS					--登録日時
	,INS_FUNC_ID					--登録機能ＩＤ
	,UPD_CNTR					--更新カウンタ
	,UPD_USR_ID					--更新ユーザＩＤ
	,UPD_USR_NM					--更新ユーザ名
	,UPD_TS					--更新日時
	,UPD_FUNC_ID					--更新機能ＩＤ
	,UPD_SRV_REQ_NO					--更新リクエストＮＯ
FROM
	MST_ARR_ACT_RECV_IF
;

