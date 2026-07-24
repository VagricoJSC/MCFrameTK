\encoding UTF-8

COMMENT ON VIEW mgvt_arg_usr IS 'ユーザ別原価計算設定情報ビュー // Calculation settings info. by user view';


COMMENT ON COLUMN mgvt_arg_usr.calc_no IS '原価計算ＮＯ // #MA.CALC_NO // Calculation No.';


COMMENT ON COLUMN mgvt_arg_usr.calc_grp_cd IS '計算グループＣＤ // #MA.CALC_GRP_CD // Calculation group cd.';


COMMENT ON COLUMN mgvt_arg_usr.term IS '期 // #MA.YM // Term';


COMMENT ON COLUMN mgvt_arg_usr.st_ym IS '対象期間先頭年月 // #MA.YM // First month of the term';


COMMENT ON COLUMN mgvt_arg_usr.end_ym IS '対象期間末尾年月 // #MA.YM // Last month of the term';


COMMENT ON COLUMN mgvt_arg_usr.sa_typ IS '予実区分 // #MA.SA_TYP // Plan/Result type';


COMMENT ON COLUMN mgvt_arg_usr.exp_calc_typ IS '展開計算区分 // #MA.EXP_CALC_TYP // BOM explosion calculation type';


COMMENT ON COLUMN mgvt_arg_usr.pre_alc_calc_typ IS '一次配賦計算区分 // #MA.PRE_ALC_CALC_TYP // Departmental alloc. calculation type';


COMMENT ON COLUMN mgvt_arg_usr.alc_calc_typ IS '配賦率計算区分 // #MA.ALC_CALC_TYP // Allocation rate calculation type';


COMMENT ON COLUMN mgvt_arg_usr.cost_calc_typ IS '原価計算区分 // #MA.COST_CALC_TYP // Calculation type';


COMMENT ON COLUMN mgvt_arg_usr.eval_typ IS '金額評価区分 // #MA.EVAL_TYP // Amount evaluation type';


COMMENT ON COLUMN mgvt_arg_usr.inpt_calc_flg IS '投入計算ＦＬＧ // #MA.FLG // Input calculation flg.';


COMMENT ON COLUMN mgvt_arg_usr.wk_calc_flg IS '工数計算ＦＬＧ // #MA.FLG // Man-hour calculation flg.';


COMMENT ON COLUMN mgvt_arg_usr.prov_calc_flg IS '支給計算ＦＬＧ // #MA.FLG // Supply calculation flg.';


COMMENT ON COLUMN mgvt_arg_usr.xfr_calc_flg IS '移動計算ＦＬＧ // #MA.FLG // Movement calculation flg.';


COMMENT ON COLUMN mgvt_arg_usr.xrate_cd IS '為替レートＣＤ // #MA.XRATE_CD // Exchange rate cd.';


COMMENT ON COLUMN mgvt_arg_usr.runtime_wg_cd IS '実行時ワーキンググループＣＤ // #MA.WG_CD // Execution working group cd.';


COMMENT ON COLUMN mgvt_arg_usr.calc_st IS '計算開始時刻 // #MA.YMDHMS // Calculation start time';


COMMENT ON COLUMN mgvt_arg_usr.calc_fin IS '計算終了時刻 // #MA.YMDHMS // Calculation end time';


COMMENT ON COLUMN mgvt_arg_usr.calc_cnt IS '計算回数 // #MG.CALC_CNT // Calculation count';


COMMENT ON COLUMN mgvt_arg_usr.calc_exec_cnt IS '計算実行回数 // #MG.CALC_CNT // Number of calculation execute';


COMMENT ON COLUMN mgvt_arg_usr.alc_err_flg IS '未配賦ＦＬＧ // #MA.FLG // Unallocated flg.';


COMMENT ON COLUMN mgvt_arg_usr.trd_amt_flg IS '振替差額ＦＬＧ // #MA.FLG // Transfer difference flg.';


COMMENT ON COLUMN mgvt_arg_usr.adj_amt_flg IS '受払差額ＦＬＧ // #MA.FLG // GR/GI difference flg.';


COMMENT ON COLUMN mgvt_arg_usr.minus_stk_flg IS 'マイナス在庫ＦＬＧ // #MA.FLG // Negative inventory flg.';


COMMENT ON COLUMN mgvt_arg_usr.other_chk_flg IS '任意チェックＦＬＧ // #MA.FLG // Optional check flg.';


COMMENT ON COLUMN mgvt_arg_usr.itm_limit_flg IS '品目指定ＦＬＧ // #MA.FLG // Item specification flg.';


COMMENT ON COLUMN mgvt_arg_usr.data_check_flg IS 'データ確認ＦＬＧ // #MA.FLG // Data check flg.';


COMMENT ON COLUMN mgvt_arg_usr.carry_flg IS '繰越ＦＬＧ // #MA.FLG // Carry-over flg.';


COMMENT ON COLUMN mgvt_arg_usr.non_del_flg IS '削除不可ＦＬＧ // #MA.FLG // Undeletable flg.';


COMMENT ON COLUMN mgvt_arg_usr.fix_flg IS '確定ＦＬＧ // #MA.FLG // Firm flg.';


COMMENT ON COLUMN mgvt_arg_usr.rate_fix_flg IS '配賦率確定ＦＬＧ // #MA.FLG // Firm Allocation rate flg.';


COMMENT ON COLUMN mgvt_arg_usr.calc_err_flg IS 'エラーＦＬＧ // #MA.FLG // Error flg.';


COMMENT ON COLUMN mgvt_arg_usr.ins_srv_req_no IS '登録リクエストＮＯ // #MA.SRV_REQ_NO // Entry request No.';


COMMENT ON COLUMN mgvt_arg_usr.batch_log_no IS 'バッチログＮＯ // #MA.BATCH_LOG_NO // Batch log No.';


COMMENT ON COLUMN mgvt_arg_usr.rmrks IS '備考 // #MG.CALC_ARG_RMRKS // Remarks';


COMMENT ON COLUMN mgvt_arg_usr.sub_char1 IS '予備１ // #MG.CALC_ARG_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mgvt_arg_usr.sub_char2 IS '予備２ // #MG.CALC_ARG_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mgvt_arg_usr.sub_char3 IS '予備３ // #MG.CALC_ARG_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mgvt_arg_usr.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mgvt_arg_usr.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mgvt_arg_usr.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mgvt_arg_usr.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mgvt_arg_usr.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mgvt_arg_usr.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mgvt_arg_usr.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mgvt_arg_usr.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mgvt_arg_usr.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mgvt_arg_usr.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

