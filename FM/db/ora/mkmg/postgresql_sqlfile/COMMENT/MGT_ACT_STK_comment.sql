\encoding UTF-8

COMMENT ON VIEW mgt_act_stk IS '在庫実績 // Inventory result';


COMMENT ON COLUMN mgt_act_stk.calc_ctg_cd IS '計算カテゴリＣＤ // #MA.CALC_CTG_CD // Calculation category cd.';


COMMENT ON COLUMN mgt_act_stk.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mgt_act_stk.ym IS '年月 // #MA.YM // Year month';


COMMENT ON COLUMN mgt_act_stk.mng_dpt_cd IS '管理部門ＣＤ // #MA.COST_DPT_CD // Management dept. cd.';


COMMENT ON COLUMN mgt_act_stk.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mgt_act_stk.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mgt_act_stk.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mgt_act_stk.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mgt_act_stk.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mgt_act_stk.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mgt_act_stk.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mgt_act_stk.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mgt_act_stk.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mgt_act_stk.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mgt_act_stk.bp_cd IS '取引先ＣＤ // #MA.BP_CD // BP cd.';


COMMENT ON COLUMN mgt_act_stk.asst_typ IS '資産区分 // #MA.ASST_TYP // Asset type';


COMMENT ON COLUMN mgt_act_stk.qty IS '数量 // #MA.QTY // Quantity';


COMMENT ON COLUMN mgt_act_stk.first_gr_dt IS '最古入庫日 // #MA.DT // Oldest GR date';


COMMENT ON COLUMN mgt_act_stk.vld_dt IS '有効期限 // #MA.DT // Expiration date';


COMMENT ON COLUMN mgt_act_stk.lmt_dt IS '使用期限 // #MA.DT // Usage expiration date';


COMMENT ON COLUMN mgt_act_stk.non_mov_base_dt IS '滞留基準年月 // #MA.YM // Non-moving base month';


COMMENT ON COLUMN mgt_act_stk.rmrks IS '備考 // #MG.ACT_STK_RMRKS // Remarks';


COMMENT ON COLUMN mgt_act_stk.sub_char1 IS '予備１ // #MG.ACT_STK_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mgt_act_stk.sub_char2 IS '予備２ // #MG.ACT_STK_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mgt_act_stk.sub_char3 IS '予備３ // #MG.ACT_STK_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mgt_act_stk.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mgt_act_stk.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mgt_act_stk.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mgt_act_stk.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mgt_act_stk.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mgt_act_stk.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mgt_act_stk.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mgt_act_stk.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mgt_act_stk.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mgt_act_stk.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

