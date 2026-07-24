\encoding UTF-8

COMMENT ON VIEW mgt_st_stk IS '月初在庫数 // Beginning inventory qty.';


COMMENT ON COLUMN mgt_st_stk.st_stk_key IS '月初在庫キー // #MG.ROW_NO // Beginning inventory key';


COMMENT ON COLUMN mgt_st_stk.calc_grp_cd IS '計算グループＣＤ // #MA.CALC_GRP_CD // Calculation group cd.';


COMMENT ON COLUMN mgt_st_stk.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mgt_st_stk.ym IS '年月 // #MA.YM // Year month';


COMMENT ON COLUMN mgt_st_stk.gr_dt IS '入庫日 // #MA.DT // GR date';


COMMENT ON COLUMN mgt_st_stk.mng_dpt_cd IS '管理部門ＣＤ // #MA.COST_DPT_CD // Management dept. cd.';


COMMENT ON COLUMN mgt_st_stk.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mgt_st_stk.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mgt_st_stk.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mgt_st_stk.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mgt_st_stk.itm_ext IS '品目拡張 // #MG.ITM_EXT // Item extension';


COMMENT ON COLUMN mgt_st_stk.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mgt_st_stk.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mgt_st_stk.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mgt_st_stk.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mgt_st_stk.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mgt_st_stk.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mgt_st_stk.bp_cd IS '取引先ＣＤ // #MA.BP_CD // BP cd.';


COMMENT ON COLUMN mgt_st_stk.asst_typ IS '資産区分 // #MA.ASST_TYP // Asset type';


COMMENT ON COLUMN mgt_st_stk.qty IS '数量 // #MA.QTY // Quantity';


COMMENT ON COLUMN mgt_st_stk.repurc_obli_flg IS '買戻義務ＦＬＧ // #MA.FLG // Repurchase obligation flg.';


COMMENT ON COLUMN mgt_st_stk.std_flg IS '標準評価後ＦＬＧ // #MA.FLG // After standard evaluate flg.';


COMMENT ON COLUMN mgt_st_stk.rmrks IS '備考 // #MG.ST_STK_RMRKS // Remarks';


COMMENT ON COLUMN mgt_st_stk.sub_char1 IS '予備１ // #MG.ST_STK_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mgt_st_stk.sub_char2 IS '予備２ // #MG.ST_STK_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mgt_st_stk.sub_char3 IS '予備３ // #MG.ST_STK_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mgt_st_stk.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mgt_st_stk.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mgt_st_stk.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mgt_st_stk.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mgt_st_stk.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mgt_st_stk.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mgt_st_stk.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mgt_st_stk.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mgt_st_stk.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mgt_st_stk.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

