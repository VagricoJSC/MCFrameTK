
COMMENT ON TABLE MSW_OPER_ORDER IS '工程オーダ情報ワーク // Operation order info. work';


COMMENT ON COLUMN MSW_OPER_ORDER.PEG_NO IS '紐付けＮＯ // #MA.INT // Pegging No.';


COMMENT ON COLUMN MSW_OPER_ORDER.OPER_ORD_NO IS '工程オーダＮＯ // #MA.OPER_ORD_NO // Operation order No.';


COMMENT ON COLUMN MSW_OPER_ORDER.ST_SCHD_TM IS '工程着手予定日時 // #MA.TM // Scheduled operation start date and time';


COMMENT ON COLUMN MSW_OPER_ORDER.INST_ST_SCHD_TM IS '工程着手予定日時（指図） // #MA.TM // Scheduled operation start date and time (Order)';


COMMENT ON COLUMN MSW_OPER_ORDER.ACT_ST_TM IS '工程着手実績日時 // #MA.TM // Actual operation start date and time';


COMMENT ON COLUMN MSW_OPER_ORDER.END_SCHD_TM IS '工程終了予定日時 // #MA.TM // Scheduled operation end date and time';


COMMENT ON COLUMN MSW_OPER_ORDER.INST_END_SCHD_TM IS '工程終了予定日時（指図） // #MA.TM // Scheduled operation end date and time (Order)';


COMMENT ON COLUMN MSW_OPER_ORDER.ACT_END_TM IS '工程終了実績日時 // #MA.TM // Actual operation end date and time';


COMMENT ON COLUMN MSW_OPER_ORDER.OPER_LT IS '工程ＬＴ // #MA.LT // Operation LT';


COMMENT ON COLUMN MSW_OPER_ORDER.ACT_OPER_LT IS '工程ＬＴ（実績） // #MA.LT // Operation LT (Result)';


COMMENT ON COLUMN MSW_OPER_ORDER.OPER_OFFST_TYP IS '工程オフセット区分 // #MA.OFFST_TYP // Operation offset type';


COMMENT ON COLUMN MSW_OPER_ORDER.OPER_OFFST IS '工程オフセット // #MA.OFFST // Operation offset';


COMMENT ON COLUMN MSW_OPER_ORDER.OPER_SCHD_QTY IS '工程指図予定数量 // #MA.QTY // Operation order scheduled qty.';


COMMENT ON COLUMN MSW_OPER_ORDER.NOT_OPER_SCHD_QTY IS '工程未指図数量 // #MA.QTY // Operation unordered qty.';


COMMENT ON COLUMN MSW_OPER_ORDER.ITM_ORD_NO IS '品目オーダＮＯ // #MA.ITM_ORD_NO // Item order No.';


COMMENT ON COLUMN MSW_OPER_ORDER.DISP_SEQ IS '工順 // #MA.INT // Routing';


COMMENT ON COLUMN MSW_OPER_ORDER.OPER_PTN IS '工程パタン // #MA.OPER_PTN // Operation pattern';


COMMENT ON COLUMN MSW_OPER_ORDER.OPER_CD IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN MSW_OPER_ORDER.OPER_SEQ IS '工程連番 // #MA.OPER_SEQ // Operation sequence number';


COMMENT ON COLUMN MSW_OPER_ORDER.LOC_CD IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN MSW_OPER_ORDER.OPER_ORD_STS_TYP IS '工程オーダ状況区分 // #MS.OPER_ORD_STS_TYP // Operation order status type';


COMMENT ON COLUMN MSW_OPER_ORDER.ITM_ORD_STS_TYP IS '品目オーダ状況区分 // #MS.ITM_ORD_STS_TYP // Item order status type';


COMMENT ON COLUMN MSW_OPER_ORDER.WG_CD IS 'WG ＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MSW_OPER_ORDER.YIELD_OPER_FLG IS '出来高計上工程ＦＬＧ // #MA.FLG // Create inventory flg.';

