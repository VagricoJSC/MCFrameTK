\encoding UTF-8

COMMENT ON TABLE mgt_acc_inpt_all IS '数量展開情報（原価計算結果） // Quantity explosion info. (Calculation result)';


COMMENT ON COLUMN mgt_acc_inpt_all.calc_no IS '原価計算ＮＯ // #MA.CALC_NO // Calculation No.';


COMMENT ON COLUMN mgt_acc_inpt_all.calc_grp_cd IS '計算グループＣＤ // #MA.CALC_GRP_CD // Calculation group cd.';


COMMENT ON COLUMN mgt_acc_inpt_all.inpt_rec_no IS '投入レコードＮＯ // #MG.INPT_REC_NO // Input record No.';


COMMENT ON COLUMN mgt_acc_inpt_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mgt_acc_inpt_all.top_rec_no IS '最上位レコードＮＯ // #MG.TOP_REC_NO // Top record No.';


COMMENT ON COLUMN mgt_acc_inpt_all.lvl IS 'レベル // #MG.CALC_LVL // Level';


COMMENT ON COLUMN mgt_acc_inpt_all.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mgt_acc_inpt_all.ym IS '年月 // #MA.YM // Year month';


COMMENT ON COLUMN mgt_acc_inpt_all.ac_dt IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN mgt_acc_inpt_all.mng_dpt_cd IS '管理部門ＣＤ // #MA.COST_DPT_CD // Management dept. cd.';


COMMENT ON COLUMN mgt_acc_inpt_all.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mgt_acc_inpt_all.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mgt_acc_inpt_all.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mgt_acc_inpt_all.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mgt_acc_inpt_all.mfg_purc_typ IS '製造購買区分 // #MA.MFG_PURC_TYP // Mfg. purchase type';


COMMENT ON COLUMN mgt_acc_inpt_all.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mgt_acc_inpt_all.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mgt_acc_inpt_all.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mgt_acc_inpt_all.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mgt_acc_inpt_all.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mgt_acc_inpt_all.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mgt_acc_inpt_all.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mgt_acc_inpt_all.str_ln_cd IS 'ラインＣＤ // #MA.STR_LN_CD // Line cd.';


COMMENT ON COLUMN mgt_acc_inpt_all.oper_act_no IS '工程実績ＮＯ // #MA.OPER_ACT_NO // Operation result No.';


COMMENT ON COLUMN mgt_acc_inpt_all.oper_cd IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN mgt_acc_inpt_all.oper_seq IS '工程連番 // #MA.OPER_SEQ // Operation sequence number';


COMMENT ON COLUMN mgt_acc_inpt_all.ac_slip_typ IS '投入会計伝票区分 // #MA.AC_SLIP_TYP // Input accounting slip type';


COMMENT ON COLUMN mgt_acc_inpt_all.ac_rsn_cd IS '投入会計理由ＣＤ // #MA.AC_RSN_CD // Input accounting reason cd.';


COMMENT ON COLUMN mgt_acc_inpt_all.asst_typ IS '資産区分 // #MA.ASST_TYP // Asset type';


COMMENT ON COLUMN mgt_acc_inpt_all.act_qty IS '実際使用数量 // #MA.QTY // Actual used qty.';


COMMENT ON COLUMN mgt_acc_inpt_all.std_qty IS '標準使用数量 // #MA.QTY // Standard use qty.';


COMMENT ON COLUMN mgt_acc_inpt_all.act_upri IS '実際単価 // #MA.MONEY // Actual unit price';


COMMENT ON COLUMN mgt_acc_inpt_all.std_upri IS '標準単価 // #MA.MONEY // Standard unit cost';


COMMENT ON COLUMN mgt_acc_inpt_all.repurc_obli_flg IS '買戻義務ＦＬＧ // #MA.FLG // Repurchase obligation flg.';


COMMENT ON COLUMN mgt_acc_inpt_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mgt_acc_inpt_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mgt_acc_inpt_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mgt_acc_inpt_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mgt_acc_inpt_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mgt_acc_inpt_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mgt_acc_inpt_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mgt_acc_inpt_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mgt_acc_inpt_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mgt_acc_inpt_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

