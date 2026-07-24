\encoding UTF-8

COMMENT ON TABLE mst_lot_trace_gr_all IS 'ロットトレース入庫情報 // Lot trace GR info.';


COMMENT ON COLUMN mst_lot_trace_gr_all.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_lot_trace_gr_all.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_lot_trace_gr_all.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_lot_trace_gr_all.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_lot_trace_gr_all.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mst_lot_trace_gr_all.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mst_lot_trace_gr_all.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mst_lot_trace_gr_all.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mst_lot_trace_gr_all.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mst_lot_trace_gr_all.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mst_lot_trace_gr_all.slip_no IS '伝票ＮＯ // #MA.SLIP_NO // Slip No.';


COMMENT ON COLUMN mst_lot_trace_gr_all.slip_schd_no IS '受払予定伝票ＮＯ // #MA.SLIP_SCHD_NO // GR/GI schedule slip No.';


COMMENT ON COLUMN mst_lot_trace_gr_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_lot_trace_gr_all.itm_mfg_inst_no IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN mst_lot_trace_gr_all.mfg_act_no IS '製造実績ＮＯ // #MA.MFG_ACT_NO // Mfg. result No.';


COMMENT ON COLUMN mst_lot_trace_gr_all.stk_xfr_act_no IS '在庫振替実績ＮＯ // #MA.STK_XFR_ACT_NO // Inventory transfer result No.';


COMMENT ON COLUMN mst_lot_trace_gr_all.base_unit_qty IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN mst_lot_trace_gr_all.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mst_lot_trace_gr_all.sppl_cd IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN mst_lot_trace_gr_all.mfg_loc_cd IS '製造場所ＣＤ // #MA.LOC_CD // Mfg. location cd.';


COMMENT ON COLUMN mst_lot_trace_gr_all.strg_loc_cd IS '格納場所ＣＤ // #MA.LOC_CD // Storage location cd.';


COMMENT ON COLUMN mst_lot_trace_gr_all.schd_dt IS '予定日 // #MA.DT // Scheduled date';


COMMENT ON COLUMN mst_lot_trace_gr_all.act_dt IS '実績日 // #MA.DT // Actual date';


COMMENT ON COLUMN mst_lot_trace_gr_all.trd_ptn_typ IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN mst_lot_trace_gr_all.io_act_typ IS '受払区分 // #MS.IO_ACT_TYP // GR/GI type';


COMMENT ON COLUMN mst_lot_trace_gr_all.schd_act_typ IS '予定実績区分 // #MS.SCHD_ACT_TYP // Schedule/Result type';


COMMENT ON COLUMN mst_lot_trace_gr_all.mfg_inst_unit_typ IS '製造指図単位区分 // #MA.MFG_INST_UNIT_TYP // Mfg. order unit type';


COMMENT ON COLUMN mst_lot_trace_gr_all.sub_char1 IS '予備１ // #MS.LOT_TRACE_GR_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_lot_trace_gr_all.sub_char2 IS '予備２ // #MS.LOT_TRACE_GR_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_lot_trace_gr_all.sub_char3 IS '予備３ // #MS.LOT_TRACE_GR_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_lot_trace_gr_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_lot_trace_gr_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_lot_trace_gr_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_lot_trace_gr_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_lot_trace_gr_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_lot_trace_gr_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_lot_trace_gr_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_lot_trace_gr_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_lot_trace_gr_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_lot_trace_gr_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

