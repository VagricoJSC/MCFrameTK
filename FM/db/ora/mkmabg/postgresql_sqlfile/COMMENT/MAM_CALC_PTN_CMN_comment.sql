\encoding UTF-8

COMMENT ON TABLE mam_calc_ptn_cmn IS '計算パタンマスタ_（共通）_ // Calculation pattern master_(Common)_';


COMMENT ON COLUMN mam_calc_ptn_cmn.calc_ptn_cd IS '計算パタンＣＤ // #MA.CALC_PTN_CD // Calculation pattern cd.';


COMMENT ON COLUMN mam_calc_ptn_cmn.calc_ptn_nm IS '計算パタン名 // #MA.CALC_PTN_NM // Calculation pattern name';


COMMENT ON COLUMN mam_calc_ptn_cmn.mfg_purc_typ IS '製造購買区分 // #MA.MFG_PURC_TYP // Mfg. purchase type';


COMMENT ON COLUMN mam_calc_ptn_cmn.eval_typ IS '金額評価区分 // #MA.EVAL_TYP // Amount evaluation type';


COMMENT ON COLUMN mam_calc_ptn_cmn.dpt_typ IS '部門計算区分 // #MA.UNIT_CALC_TYP // Dept. calculation type';


COMMENT ON COLUMN mam_calc_ptn_cmn.lot_typ IS 'ロットＮＯ計算区分 // #MA.UNIT_CALC_TYP // Lot No. calculation type';


COMMENT ON COLUMN mam_calc_ptn_cmn.sublot_typ IS 'サブロットＮＯ計算区分 // #MA.UNIT_CALC_TYP // Sublot No. calculation type';


COMMENT ON COLUMN mam_calc_ptn_cmn.sno1_typ IS '手配ＮＯ１計算区分 // #MA.UNIT_CALC_TYP // SEIBAN No. 1 calculation type';


COMMENT ON COLUMN mam_calc_ptn_cmn.sno2_typ IS '手配ＮＯ２計算区分 // #MA.UNIT_CALC_TYP // SEIBAN No. 2 calculation type';


COMMENT ON COLUMN mam_calc_ptn_cmn.sno3_typ IS '手配ＮＯ３計算区分 // #MA.UNIT_CALC_TYP // SEIBAN No. 3 calculation type';


COMMENT ON COLUMN mam_calc_ptn_cmn.sno4_typ IS '手配ＮＯ４計算区分 // #MA.UNIT_CALC_TYP // SEIBAN No. 4 calculation type';


COMMENT ON COLUMN mam_calc_ptn_cmn.lot_act_typ IS 'ロットＮＯ実績区分 // #MA.ACT_SET_TYP // Lot No. result type';


COMMENT ON COLUMN mam_calc_ptn_cmn.sublot_act_typ IS 'サブロットＮＯ実績区分 // #MA.ACT_SET_TYP // Sublot No. result type';


COMMENT ON COLUMN mam_calc_ptn_cmn.sno1_act_typ IS '手配ＮＯ１実績区分 // #MA.ACT_SET_TYP // SEIBAN No. 1 result type';


COMMENT ON COLUMN mam_calc_ptn_cmn.sno2_act_typ IS '手配ＮＯ２実績区分 // #MA.ACT_SET_TYP // SEIBAN No. 2 result type';


COMMENT ON COLUMN mam_calc_ptn_cmn.sno3_act_typ IS '手配ＮＯ３実績区分 // #MA.ACT_SET_TYP // SEIBAN No. 3 result type';


COMMENT ON COLUMN mam_calc_ptn_cmn.sno4_act_typ IS '手配ＮＯ４実績区分 // #MA.ACT_SET_TYP // SEIBAN No. 4 result type';


COMMENT ON COLUMN mam_calc_ptn_cmn.itm_mfg_inst_no_set_typ IS '品目製造指図ＮＯ設定区分 // #MA.ITM_MFG_INST_NO_SET_TYP // Item mfg. order No. setting type';


COMMENT ON COLUMN mam_calc_ptn_cmn.mfg_act_no_set_typ IS '製造実績ＮＯ設定区分 // #MA.MFG_ACT_NO_SET_TYP // Mfg. result No. setting type';


COMMENT ON COLUMN mam_calc_ptn_cmn.oper_act_no_set_typ IS '工程実績ＮＯ設定区分 // #MA.OPER_ACT_NO_SET_TYP // Operation result No. setting type';


COMMENT ON COLUMN mam_calc_ptn_cmn.lot_exp_typ IS 'ロットＮＯ展開区分 // #MA.EXP_SET_TYP // Lot No. explosion type';


COMMENT ON COLUMN mam_calc_ptn_cmn.sublot_exp_typ IS 'サブロットＮＯ展開区分 // #MA.EXP_SET_TYP // Sublot No. explosion type';


COMMENT ON COLUMN mam_calc_ptn_cmn.sno1_exp_typ IS '手配ＮＯ１展開区分 // #MA.EXP_SET_TYP // SEIBAN No. 1 explosion type';


COMMENT ON COLUMN mam_calc_ptn_cmn.sno2_exp_typ IS '手配ＮＯ２展開区分 // #MA.EXP_SET_TYP // SEIBAN No. 2 explosion type';


COMMENT ON COLUMN mam_calc_ptn_cmn.sno3_exp_typ IS '手配ＮＯ３展開区分 // #MA.EXP_SET_TYP // SEIBAN No. 3 explosion type';


COMMENT ON COLUMN mam_calc_ptn_cmn.sno4_exp_typ IS '手配ＮＯ４展開区分 // #MA.EXP_SET_TYP // SEIBAN No. 4 explosion type';


COMMENT ON COLUMN mam_calc_ptn_cmn.dpt_loss_eval_typ IS '管理部門評価区分 // #MA.LOSS_EVAL_TYP // Management dept. evaluation type';


COMMENT ON COLUMN mam_calc_ptn_cmn.lot_loss_eval_typ IS 'ロットＮＯ評価区分 // #MA.LOSS_EVAL_TYP // Lot No. evaluation type';


COMMENT ON COLUMN mam_calc_ptn_cmn.sublot_loss_eval_typ IS 'サブロットＮＯ評価区分 // #MA.LOSS_EVAL_TYP // Sublot No. revaluation type';


COMMENT ON COLUMN mam_calc_ptn_cmn.sno1_loss_eval_typ IS '手配ＮＯ１評価区分 // #MA.LOSS_EVAL_TYP // SEIBAN No. 1 evaluation type';


COMMENT ON COLUMN mam_calc_ptn_cmn.sno2_loss_eval_typ IS '手配ＮＯ２評価区分 // #MA.LOSS_EVAL_TYP // SEIBAN No. 2 evaluation type';


COMMENT ON COLUMN mam_calc_ptn_cmn.sno3_loss_eval_typ IS '手配ＮＯ３評価区分 // #MA.LOSS_EVAL_TYP // SEIBAN No. 3 evaluation type';


COMMENT ON COLUMN mam_calc_ptn_cmn.sno4_loss_eval_typ IS '手配ＮＯ４評価区分 // #MA.LOSS_EVAL_TYP // SEIBAN No. 4 evaluation type';


COMMENT ON COLUMN mam_calc_ptn_cmn.asst_loss_eval_typ IS '資産区分評価区分 // #MA.LOSS_EVAL_TYP // Asset type evaluation type';


COMMENT ON COLUMN mam_calc_ptn_cmn.std_rnd_typ IS '標準端数処理区分 // #MA.RND_TYP // Rounding type (Standard)';


COMMENT ON COLUMN mam_calc_ptn_cmn.std_dec_place IS '標準小数部有効桁数 // #MA.DEC_PLACE // Standard number of decimal places';


COMMENT ON COLUMN mam_calc_ptn_cmn.ave_rnd_typ IS '単価端数処理区分 // #MA.RND_TYP // Rounding type (Unit price)';


COMMENT ON COLUMN mam_calc_ptn_cmn.ave_dec_place IS '単価小数部有効桁数 // #MA.DEC_PLACE // Unit price number of decimal places';


COMMENT ON COLUMN mam_calc_ptn_cmn.adj_typ IS '端数調整区分 // #MA.ADJ_TYP // Fraction adjustment type';


COMMENT ON COLUMN mam_calc_ptn_cmn.wip_typ IS '仕掛区分 // #MA.WIP_TYP // WIP type';


COMMENT ON COLUMN mam_calc_ptn_cmn.bd_agg_typ IS '内訳集計区分 // #MA.BD_AGG_TYP // Breakdown aggregated type';


COMMENT ON COLUMN mam_calc_ptn_cmn.mrgn_expns_cd IS '調整費目ＣＤ // #MA.EXPNS_CD // Adjustment cost element cd.';


COMMENT ON COLUMN mam_calc_ptn_cmn.purc_expns_cd IS '購買費目ＣＤ // #MA.EXPNS_CD // Purchase cost element item cd.';


COMMENT ON COLUMN mam_calc_ptn_cmn.out_expns_cd IS '外注費目ＣＤ // #MA.EXPNS_CD // Subcontract cost element cd.';


COMMENT ON COLUMN mam_calc_ptn_cmn.inpt_expns_cd IS '投入費目ＣＤ // #MA.EXPNS_CD // Input cost element cd.';


COMMENT ON COLUMN mam_calc_ptn_cmn.ss_expns_cd IS '自給費目ＣＤ // #MA.EXPNS_CD // Self supply cost element cd.';


COMMENT ON COLUMN mam_calc_ptn_cmn.prov_expns_cd IS '有償差額費目ＣＤ // #MA.EXPNS_CD // Cost element cd. for gain or loss of chargeable item';


COMMENT ON COLUMN mam_calc_ptn_cmn.exp_alloc_typ IS '展開割付区分 // #MA.EXP_ALLOC_TYP // Explosion allocation type';


COMMENT ON COLUMN mam_calc_ptn_cmn.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_calc_ptn_cmn.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_calc_ptn_cmn.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_calc_ptn_cmn.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_calc_ptn_cmn.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_calc_ptn_cmn.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_calc_ptn_cmn.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_calc_ptn_cmn.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_calc_ptn_cmn.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_calc_ptn_cmn.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_calc_ptn_cmn.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_calc_ptn_cmn.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_calc_ptn_cmn.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_calc_ptn_cmn.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_calc_ptn_cmn.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_calc_ptn_cmn.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_calc_ptn_cmn.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

