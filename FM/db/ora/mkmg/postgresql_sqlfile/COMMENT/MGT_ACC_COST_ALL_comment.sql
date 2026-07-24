\encoding UTF-8

COMMENT ON TABLE mgt_acc_cost_all IS '原価展開情報（原価計算結果） // Cost explosion info. (Calculation result)';


COMMENT ON COLUMN mgt_acc_cost_all.calc_no IS '原価計算ＮＯ // #MA.CALC_NO // Calculation No.';


COMMENT ON COLUMN mgt_acc_cost_all.calc_grp_cd IS '計算グループＣＤ // #MA.CALC_GRP_CD // Calculation group cd.';


COMMENT ON COLUMN mgt_acc_cost_all.inpt_rec_no IS '投入レコードＮＯ // #MG.INPT_REC_NO // Input record No.';


COMMENT ON COLUMN mgt_acc_cost_all.wk_rec_no IS '工数レコードＮＯ // #MG.WK_REC_NO // Man-hour record No.';


COMMENT ON COLUMN mgt_acc_cost_all.oper_act_no IS '工程実績ＮＯ // #MA.OPER_ACT_NO // Operation result No.';


COMMENT ON COLUMN mgt_acc_cost_all.oper_cd IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN mgt_acc_cost_all.oper_seq IS '工程連番 // #MA.OPER_SEQ // Operation sequence number';


COMMENT ON COLUMN mgt_acc_cost_all.expns_cd IS '費目ＣＤ // #MA.EXPNS_CD // Cost element cd.';


COMMENT ON COLUMN mgt_acc_cost_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mgt_acc_cost_all.act_cost IS '実際原価 // #MA.MONEY // Actual cost';


COMMENT ON COLUMN mgt_acc_cost_all.std_cost IS '標準原価 // #MA.MONEY // Standard cost';


COMMENT ON COLUMN mgt_acc_cost_all.sml_inpt_rec_no IS '集計用投入レコードＮＯ // #MG.INPT_REC_NO // Input record No. for aggregation';


COMMENT ON COLUMN mgt_acc_cost_all.top_rec_no IS '最上位レコードＮＯ // #MG.TOP_REC_NO // Top record No.';


COMMENT ON COLUMN mgt_acc_cost_all.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mgt_acc_cost_all.str_ln_cd IS 'ラインＣＤ // #MA.STR_LN_CD // Line cd.';


COMMENT ON COLUMN mgt_acc_cost_all.oper_cost_flg IS '工程原価ＦＬＧ // #MA.FLG // Operation cost flg.';


COMMENT ON COLUMN mgt_acc_cost_all.expns_typ IS '費目区分 // #MA.EXPNS_TYP // Cost element type';


COMMENT ON COLUMN mgt_acc_cost_all.diff_qty IS '数量差異 // #MA.MONEY // Quantity variance';


COMMENT ON COLUMN mgt_acc_cost_all.diff_wk IS '工数差異 // #MA.MONEY // Time variance';


COMMENT ON COLUMN mgt_acc_cost_all.diff_up IS '価格差異 // #MA.MONEY // Price variance';


COMMENT ON COLUMN mgt_acc_cost_all.diff_rt IS '配賦率差異 // #MA.MONEY // Allocation rate variance';


COMMENT ON COLUMN mgt_acc_cost_all.diff_std IS '標準調整差異 // #MA.MONEY // Standard adjustment variance';


COMMENT ON COLUMN mgt_acc_cost_all.diff_a IS '差異１ // #MA.MONEY // Variance 1';


COMMENT ON COLUMN mgt_acc_cost_all.diff_b IS '差異２ // #MA.MONEY // Variance 2';


COMMENT ON COLUMN mgt_acc_cost_all.diff_c IS '差異３ // #MA.MONEY // Variance 3';


COMMENT ON COLUMN mgt_acc_cost_all.diff_d IS '差異４ // #MA.MONEY // Variance 4';


COMMENT ON COLUMN mgt_acc_cost_all.diff_e IS '差異５ // #MA.MONEY // Variance 5';


COMMENT ON COLUMN mgt_acc_cost_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mgt_acc_cost_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mgt_acc_cost_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mgt_acc_cost_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mgt_acc_cost_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mgt_acc_cost_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mgt_acc_cost_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mgt_acc_cost_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mgt_acc_cost_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mgt_acc_cost_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

