\encoding UTF-8

COMMENT ON VIEW mst_lot_trace_gi IS 'ロットトレース出庫情報 // Lot trace GI info.';


COMMENT ON COLUMN mst_lot_trace_gi.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_lot_trace_gi.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_lot_trace_gi.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_lot_trace_gi.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_lot_trace_gi.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mst_lot_trace_gi.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mst_lot_trace_gi.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mst_lot_trace_gi.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mst_lot_trace_gi.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mst_lot_trace_gi.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mst_lot_trace_gi.slip_no IS '伝票ＮＯ // #MA.SLIP_NO // Slip No.';


COMMENT ON COLUMN mst_lot_trace_gi.slip_schd_no IS '受払予定伝票ＮＯ // #MA.SLIP_SCHD_NO // GR/GI schedule slip No.';


COMMENT ON COLUMN mst_lot_trace_gi.itm_mfg_inst_no IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN mst_lot_trace_gi.mfg_act_no IS '製造実績ＮＯ // #MA.MFG_ACT_NO // Mfg. result No.';


COMMENT ON COLUMN mst_lot_trace_gi.stk_xfr_act_no IS '在庫振替実績ＮＯ // #MA.STK_XFR_ACT_NO // Inventory transfer result No.';


COMMENT ON COLUMN mst_lot_trace_gi.base_unit_qty IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN mst_lot_trace_gi.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mst_lot_trace_gi.dlv_cd IS '納品先ＣＤ // #MA.BP_CD // Delivery destination cd.';


COMMENT ON COLUMN mst_lot_trace_gi.tdlv_cd IS '配送先ＣＤ // #MA.BP_CD // Receiving point cd.';


COMMENT ON COLUMN mst_lot_trace_gi.loc_cd IS '出庫場所ＣＤ // #MA.LOC_CD // GI location cd.';


COMMENT ON COLUMN mst_lot_trace_gi.schd_dt IS '予定日 // #MA.DT // Scheduled date';


COMMENT ON COLUMN mst_lot_trace_gi.act_dt IS '実績日 // #MA.DT // Actual date';


COMMENT ON COLUMN mst_lot_trace_gi.trd_ptn_typ IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN mst_lot_trace_gi.io_act_typ IS '受払区分 // #MS.IO_ACT_TYP // GR/GI type';


COMMENT ON COLUMN mst_lot_trace_gi.schd_act_typ IS '予定実績区分 // #MS.SCHD_ACT_TYP // Schedule/Result type';


COMMENT ON COLUMN mst_lot_trace_gi.mfg_inst_unit_typ IS '製造指図単位区分 // #MA.MFG_INST_UNIT_TYP // Mfg. order unit type';


COMMENT ON COLUMN mst_lot_trace_gi.sub_char1 IS '予備１ // #MS.LOT_TRACE_GI_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_lot_trace_gi.sub_char2 IS '予備２ // #MS.LOT_TRACE_GI_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_lot_trace_gi.sub_char3 IS '予備３ // #MS.LOT_TRACE_GI_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_lot_trace_gi.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_lot_trace_gi.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_lot_trace_gi.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_lot_trace_gi.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_lot_trace_gi.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_lot_trace_gi.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_lot_trace_gi.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_lot_trace_gi.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_lot_trace_gi.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_lot_trace_gi.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

