\encoding UTF-8

COMMENT ON VIEW mst_yield_act IS '出来高実績 // Output result';


COMMENT ON COLUMN mst_yield_act.yield_act_no IS '出来高実績ＮＯ // #MA.YIELD_ACT_NO // Output result No.';


COMMENT ON COLUMN mst_yield_act.mfg_act_no IS '製造実績ＮＯ // #MA.MFG_ACT_NO // Mfg. result No.';


COMMENT ON COLUMN mst_yield_act.itm_mfg_inst_no IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN mst_yield_act.oper_act_no IS '工程実績ＮＯ // #MA.OPER_ACT_NO // Operation result No.';


COMMENT ON COLUMN mst_yield_act.yield_schd_no IS '出来高予定ＮＯ // #MA.YIELD_INST_NO // Output schedule No.';


COMMENT ON COLUMN mst_yield_act.div_seq IS '分割連番 // #MS.DIV_SEQ // Split sequence number';


COMMENT ON COLUMN mst_yield_act.mfg_mtd_typ IS '生産方法区分 // #MS.MFG_MTD_TYP // Production method type';


COMMENT ON COLUMN mst_yield_act.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_yield_act.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_yield_act.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_yield_act.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_yield_act.trd_unit_qty IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN mst_yield_act.trd_unit_cd IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN mst_yield_act.base_unit_qty IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN mst_yield_act.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mst_yield_act.yield_typ IS '出来高区分 // #MA.YIELD_TYP // Output type';


COMMENT ON COLUMN mst_yield_act.yield_rate IS '出来高進捗度 // #MA.RATE // Output progress';


COMMENT ON COLUMN mst_yield_act.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mst_yield_act.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mst_yield_act.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mst_yield_act.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mst_yield_act.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mst_yield_act.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mst_yield_act.quality_typ IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN mst_yield_act.stk_insp_typ IS '在庫検査区分 // #MS.STK_INSP_TYP // Inventory inspection type';


COMMENT ON COLUMN mst_yield_act.gd_cd IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN mst_yield_act.yield_rsn_cd IS '出来高理由ＣＤ // #MA.BIZ_RSN_CD // Output reason cd.';


COMMENT ON COLUMN mst_yield_act.yield_loc_cd IS '出来高場所ＣＤ // #MA.LOC_CD // Output location cd.';


COMMENT ON COLUMN mst_yield_act.yield_str_ln_cd IS '出来高棚・ラインＣＤ // #MA.STR_LN_CD // Output rack/line cd.';


COMMENT ON COLUMN mst_yield_act.strg_loc_cd IS '格納場所ＣＤ // #MA.LOC_CD // Storage location cd.';


COMMENT ON COLUMN mst_yield_act.strg_str_ln_cd IS '格納棚・ラインＣＤ // #MA.STR_LN_CD // Storage rack/line cd.';


COMMENT ON COLUMN mst_yield_act.act_tm IS '実績日時 // #MA.TM // Actual date and time';


COMMENT ON COLUMN mst_yield_act.ac_dt IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN mst_yield_act.bkf_ctl_flg IS 'バックフラッシュ更新許可ＦＬＧ // #MA.FLG // Allow backflush update flg.';


COMMENT ON COLUMN mst_yield_act.lot_ctl_flg IS '同一ロット発番許可ＦＬＧ // #MA.FLG // Allow same lot numbering flg.';


COMMENT ON COLUMN mst_yield_act.sublot_ctl_flg IS '同一サブロット発番許可ＦＬＧ // #MA.FLG // Allow same sublot numbering flg.';


COMMENT ON COLUMN mst_yield_act.stk_lst_prnt_flg IS '現品票発行済ＦＬＧ // #MA.FLG // Identification tag issued flg.';


COMMENT ON COLUMN mst_yield_act.not_stk_flg IS '非在庫ＦＬＧ // #MA.FLG // MRO supply flg.';


COMMENT ON COLUMN mst_yield_act.data_no IS 'データＮＯ // #MA.IF_DATA_NO // Data No.';


COMMENT ON COLUMN mst_yield_act.mes_id IS 'ＭＥＳＩＤ // #MS.MES_ID // MES ID';


COMMENT ON COLUMN mst_yield_act.mes_flg IS 'ＭＥＳＦＬＧ // #MA.FLG // MES flg.';


COMMENT ON COLUMN mst_yield_act.ext_sys_cd IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN mst_yield_act.ext_yield_act_no IS '外部出来高実績ＮＯ // #MA.EXT_YIELD_ACT_NO // External output result No.';


COMMENT ON COLUMN mst_yield_act.intr_rmrks IS '内部備考 // #MS.YIELD_ACT_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_yield_act.act_rpt_rmrks IS '記録書備考 // #MS.YIELD_ACT_RPT_RMRKS // Record sheet remarks';


COMMENT ON COLUMN mst_yield_act.insp_cnt_rmrks IS '検査連絡備考 // #MS.INSP_CNT_RMRKS // Inspection contact remarks';


COMMENT ON COLUMN mst_yield_act.trd_rmrks IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN mst_yield_act.sub_char1 IS '予備１ // #MS.YIELD_ACT_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_yield_act.sub_char2 IS '予備２ // #MS.YIELD_ACT_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_yield_act.sub_char3 IS '予備３ // #MS.YIELD_ACT_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_yield_act.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_yield_act.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_yield_act.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_yield_act.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_yield_act.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_yield_act.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_yield_act.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_yield_act.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_yield_act.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_yield_act.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

