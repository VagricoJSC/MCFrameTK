\encoding UTF-8

COMMENT ON TABLE mgw_imp_itm_purc_all IS '原価品目購買単価取込対象ワーク // Work for cost item purchase unit price import';


COMMENT ON COLUMN mgw_imp_itm_purc_all.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mgw_imp_itm_purc_all.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mgw_imp_itm_purc_all.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mgw_imp_itm_purc_all.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mgw_imp_itm_purc_all.sppl_cd IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN mgw_imp_itm_purc_all.term IS '期 // #MA.YM // Term';


COMMENT ON COLUMN mgw_imp_itm_purc_all.calc_ctg_cd IS '計算カテゴリＣＤ // #MA.CALC_CTG_CD // Calculation category cd.';


COMMENT ON COLUMN mgw_imp_itm_purc_all.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mgw_imp_itm_purc_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mgw_imp_itm_purc_all.base_qty IS '基準数量 // #MA.QTY // Base qty.';


COMMENT ON COLUMN mgw_imp_itm_purc_all.cur_cd IS '通貨ＣＤ // #MA.CUR_CD // Currency cd.';


COMMENT ON COLUMN mgw_imp_itm_purc_all.upri IS '単価 // #MA.MONEY // Unit price';


COMMENT ON COLUMN mgw_imp_itm_purc_all.cost_ratio IS '原価比率 // #MA.COST_RATIO // Cost ratio';


COMMENT ON COLUMN mgw_imp_itm_purc_all.rmrks IS '備考 // #MG.ITM_PURC_RMRKS // Remarks';


COMMENT ON COLUMN mgw_imp_itm_purc_all.sub_char1 IS '予備１ // #MG.ITM_PURC_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mgw_imp_itm_purc_all.sub_char2 IS '予備２ // #MG.ITM_PURC_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mgw_imp_itm_purc_all.sub_char3 IS '予備３ // #MG.ITM_PURC_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mgw_imp_itm_purc_all.non_calc_flg IS '計算対象外ＦＬＧ // #MA.FLG // Not to calculate flg.';


COMMENT ON COLUMN mgw_imp_itm_purc_all.imp_err_flg IS '取込エラーＦＬＧ // #MA.FLG // Import error flg.';


COMMENT ON COLUMN mgw_imp_itm_purc_all.imp_flg IS '取込対象ＦＬＧ // #MA.FLG // To import flg.';


COMMENT ON COLUMN mgw_imp_itm_purc_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mgw_imp_itm_purc_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mgw_imp_itm_purc_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mgw_imp_itm_purc_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mgw_imp_itm_purc_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mgw_imp_itm_purc_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mgw_imp_itm_purc_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mgw_imp_itm_purc_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mgw_imp_itm_purc_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mgw_imp_itm_purc_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

