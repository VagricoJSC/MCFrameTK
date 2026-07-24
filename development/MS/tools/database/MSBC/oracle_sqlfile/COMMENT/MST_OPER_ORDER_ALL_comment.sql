
COMMENT ON TABLE MST_OPER_ORDER_ALL IS '工程オーダ情報 // Operation order info.';


COMMENT ON COLUMN MST_OPER_ORDER_ALL.OPER_ORD_NO IS '工程オーダＮＯ // #MA.OPER_ORD_NO // Operation order No.';


COMMENT ON COLUMN MST_OPER_ORDER_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MST_OPER_ORDER_ALL.ST_SCHD_TM IS '工程着手予定日時 // #MA.TM // Scheduled operation start date and time';


COMMENT ON COLUMN MST_OPER_ORDER_ALL.INST_ST_SCHD_TM IS '工程着手予定日時（指図） // #MA.TM // Scheduled operation start date and time (Order)';


COMMENT ON COLUMN MST_OPER_ORDER_ALL.ACT_ST_TM IS '工程着手実績日時 // #MA.TM // Actual operation start date and time';


COMMENT ON COLUMN MST_OPER_ORDER_ALL.END_SCHD_TM IS '工程終了予定日時 // #MA.TM // Scheduled operation end date and time';


COMMENT ON COLUMN MST_OPER_ORDER_ALL.INST_END_SCHD_TM IS '工程終了予定日時（指図） // #MA.TM // Scheduled operation end date and time (Order)';


COMMENT ON COLUMN MST_OPER_ORDER_ALL.ACT_END_TM IS '工程終了実績日時 // #MA.TM // Actual operation end date and time';


COMMENT ON COLUMN MST_OPER_ORDER_ALL.OPER_LT IS '工程ＬＴ // #MA.LT // Operation LT';


COMMENT ON COLUMN MST_OPER_ORDER_ALL.ACT_OPER_LT IS '工程ＬＴ（実績） // #MA.LT // Operation LT (Result)';


COMMENT ON COLUMN MST_OPER_ORDER_ALL.OPER_OFFST_TYP IS '工程オフセット区分 // #MA.OFFST_TYP // Operation offset type';


COMMENT ON COLUMN MST_OPER_ORDER_ALL.OPER_OFFST IS '工程オフセット // #MA.OFFST // Operation offset';


COMMENT ON COLUMN MST_OPER_ORDER_ALL.OPER_SCHD_QTY IS '工程指図予定数量 // #MA.QTY // Operation order scheduled qty.';


COMMENT ON COLUMN MST_OPER_ORDER_ALL.NOT_OPER_SCHD_QTY IS '工程未指図数量 // #MA.QTY // Operation unordered qty.';


COMMENT ON COLUMN MST_OPER_ORDER_ALL.ITM_ORD_NO IS '品目オーダＮＯ // #MA.ITM_ORD_NO // Item order No.';


COMMENT ON COLUMN MST_OPER_ORDER_ALL.DISP_SEQ IS '工順 // #MA.INT // Routing';


COMMENT ON COLUMN MST_OPER_ORDER_ALL.OPER_PTN IS '工程パタン // #MA.OPER_PTN // Operation pattern';


COMMENT ON COLUMN MST_OPER_ORDER_ALL.OPER_CD IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN MST_OPER_ORDER_ALL.OPER_SEQ IS '工程連番 // #MA.OPER_SEQ // Operation sequence number';


COMMENT ON COLUMN MST_OPER_ORDER_ALL.LOC_CD IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN MST_OPER_ORDER_ALL.OPER_ORD_STS_TYP IS '工程オーダ状況区分 // #MS.OPER_ORD_STS_TYP // Operation order status type';


COMMENT ON COLUMN MST_OPER_ORDER_ALL.ITM_ORD_STS_TYP IS '品目オーダ状況区分 // #MS.ITM_ORD_STS_TYP // Item order status type';


COMMENT ON COLUMN MST_OPER_ORDER_ALL.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MST_OPER_ORDER_ALL.YIELD_OPER_FLG IS '出来高計上工程ＦＬＧ // #MA.FLG // Create inventory flg.';


COMMENT ON COLUMN MST_OPER_ORDER_ALL.SIM_MRP_NO IS 'シミュレーションＮＯ // #MA.SIM_MRP_NO // Simulation No.';


COMMENT ON COLUMN MST_OPER_ORDER_ALL.OPER_RSRC IS '工程資源 // #MA.OPER_RSRC // Operation resources';


COMMENT ON COLUMN MST_OPER_ORDER_ALL.INTR_RMRKS IS '内部備考 // #MS.OORDER_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN MST_OPER_ORDER_ALL.SUB_CHAR1 IS '予備１ // #MS.OORDER_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_OPER_ORDER_ALL.SUB_CHAR2 IS '予備２ // #MS.OORDER_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_OPER_ORDER_ALL.SUB_CHAR3 IS '予備３ // #MS.OORDER_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_OPER_ORDER_ALL.EXT_OPER_ORD_NO IS '外部工程オーダＮＯ // #MA.EXT_OPER_ORD_NO // External operation order No.';


COMMENT ON COLUMN MST_OPER_ORDER_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_OPER_ORDER_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_OPER_ORDER_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_OPER_ORDER_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_OPER_ORDER_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_OPER_ORDER_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_OPER_ORDER_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_OPER_ORDER_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_OPER_ORDER_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_OPER_ORDER_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN MST_OPER_ORDER_ALL.SCHEDULER_FROZEN_FLG IS 'スケジューラ凍結ＦＬＧ // #MA.FLG // Scheduler frozen flg.';

