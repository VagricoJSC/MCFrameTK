\encoding UTF-8

COMMENT ON VIEW mgt_wip_loc IS '場所別仕掛原価 // WIP cost by location';


COMMENT ON COLUMN mgt_wip_loc.calc_no IS '原価計算ＮＯ // #MA.CALC_NO // Calculation No.';


COMMENT ON COLUMN mgt_wip_loc.calc_grp_cd IS '計算グループＣＤ // #MA.CALC_GRP_CD // Calculation group cd.';


COMMENT ON COLUMN mgt_wip_loc.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mgt_wip_loc.ym IS '年月 // #MA.YM // Year month';


COMMENT ON COLUMN mgt_wip_loc.mng_dpt_cd IS '管理部門ＣＤ // #MA.COST_DPT_CD // Management dept. cd.';


COMMENT ON COLUMN mgt_wip_loc.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mgt_wip_loc.str_ln_cd IS 'ラインＣＤ // #MA.STR_LN_CD // Line cd.';


COMMENT ON COLUMN mgt_wip_loc.oper_cd IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN mgt_wip_loc.oper_seq IS '工程連番 // #MA.OPER_SEQ // Operation sequence number';


COMMENT ON COLUMN mgt_wip_loc.expns_cd IS '費目ＣＤ // #MA.EXPNS_CD // Cost element cd.';


COMMENT ON COLUMN mgt_wip_loc.st_wip_amt IS '月初仕掛原価 // #MA.MONEY // Beginning WIP cost';


COMMENT ON COLUMN mgt_wip_loc.prod_amt IS '発生原価 // #MA.MONEY // Incurred cost';


COMMENT ON COLUMN mgt_wip_loc.inpt_amt IS '製造品投入原価 // #MA.MONEY // Mfg. item input cost';


COMMENT ON COLUMN mgt_wip_loc.comp_amt IS '完成原価 // #MA.MONEY // Cost of completed item';


COMMENT ON COLUMN mgt_wip_loc.end_wip_amt IS '月末仕掛原価 // #MA.MONEY // Ending WIP cost';


COMMENT ON COLUMN mgt_wip_loc.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mgt_wip_loc.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mgt_wip_loc.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mgt_wip_loc.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mgt_wip_loc.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mgt_wip_loc.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mgt_wip_loc.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mgt_wip_loc.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mgt_wip_loc.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mgt_wip_loc.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

