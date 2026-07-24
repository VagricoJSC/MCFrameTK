\encoding UTF-8

COMMENT ON TABLE mst_purc_act_all IS '仕入実績ヘッダ // Purchase result header';


COMMENT ON COLUMN mst_purc_act_all.purc_act_no IS '仕入実績ＮＯ // #MA.PURC_ACT_NO // Purchase result No.';


COMMENT ON COLUMN mst_purc_act_all.purc_act_seq IS '仕入実績連番 // #MA.SLIP_SEQ // Purchase result sequence number';


COMMENT ON COLUMN mst_purc_act_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_purc_act_all.purc_act_rev IS '仕入実績改訂番号 // #MA.SLIP_REV // Purchase result rev. number';


COMMENT ON COLUMN mst_purc_act_all.trd_cd IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN mst_purc_act_all.trd_ptn_typ IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN mst_purc_act_all.slip_sts_typ IS '伝票状況区分 // #MA.SLIP_STS_TYP // Slip status type';


COMMENT ON COLUMN mst_purc_act_all.po_no IS '発注ＮＯ // #MA.PO_NO // PO No.';


COMMENT ON COLUMN mst_purc_act_all.purc_dpt_cd IS '購買部門ＣＤ // #MA.DPT_CD // Purchasing dept. cd.';


COMMENT ON COLUMN mst_purc_act_all.wg_cd IS 'ＷＧ ＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mst_purc_act_all.purc_usr_cd IS '購買担当者ＣＤ // #MA.USR_CD // Purchasing PIC cd.';


COMMENT ON COLUMN mst_purc_act_all.sppl_cd IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN mst_purc_act_all.asppl_cd IS '買掛先ＣＤ // #MA.BP_CD // AP supplier cd.';


COMMENT ON COLUMN mst_purc_act_all.bsppl_cd IS '支払予定管理先ＣＤ // #MA.BP_CD // Scheduled payee cd.';


COMMENT ON COLUMN mst_purc_act_all.psppl_cd IS '支払先ＣＤ // #MA.BP_CD // Payee cd.';


COMMENT ON COLUMN mst_purc_act_all.cred_cd IS '与信管理先ＣＤ // #MA.BP_CD // Credit managed BP cd.';


COMMENT ON COLUMN mst_purc_act_all.trd_cur_cd IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN mst_purc_act_all.ptax_cur_cd IS '納税通貨ＣＤ // #MA.CUR_CD // Taxpaying currency cd.';


COMMENT ON COLUMN mst_purc_act_all.base_cur_cd IS '基準通貨ＣＤ // #MA.CUR_CD // Base currency cd.';


COMMENT ON COLUMN mst_purc_act_all.xrate_cd IS '為替レートＣＤ // #MA.XRATE_CD // Exchange rate cd.';


COMMENT ON COLUMN mst_purc_act_all.xrate IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN mst_purc_act_all.ptax_xrate IS '納税為替レート // #MA.MONEY // Taxpaying exchange rate';


COMMENT ON COLUMN mst_purc_act_all.purc_dt IS '仕入日 // #MA.DT // Purchase date';


COMMENT ON COLUMN mst_purc_act_all.ac_ym IS '計上年月 // #MA.YM // Recording month';


COMMENT ON COLUMN mst_purc_act_all.ac_dt IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN mst_purc_act_all.pay_basis_dt IS '支払起算日 // #MA.DT // Payment base date';


COMMENT ON COLUMN mst_purc_act_all.pay_schd_dt IS '支払予定日 // #MA.DT // Scheduled payment date';


COMMENT ON COLUMN mst_purc_act_all.ptax_dt IS '納税日 // #MA.DT // Taxpaying date';


COMMENT ON COLUMN mst_purc_act_all.rcpt_iv_no IS '受領インボイスＮＯ // #MA.IV_NO // Purchase invoice No.';


COMMENT ON COLUMN mst_purc_act_all.rcpt_iv_mng_no IS '受領インボイス管理ＮＯ // #MA.RCPT_IV_MNG_NO // Purchase invoice management No.';


COMMENT ON COLUMN mst_purc_act_all.rcpt_iv_rev IS '受領インボイス改訂番号 // #MA.SLIP_REV // Purchase invoice rev. number';


COMMENT ON COLUMN mst_purc_act_all.ref_rcpt_iv_no IS '対応受領インボイスＮＯ // #MA.IV_NO // Corresponding purchase I/V No.';


COMMENT ON COLUMN mst_purc_act_all.purc_ret_act_no IS '仕入返品実績ＮＯ // #MA.PURC_RET_ACT_NO // Purchase return result No.';


COMMENT ON COLUMN mst_purc_act_all.purc_ret_act_rev IS '仕入返品実績改訂番号 // #MA.SLIP_REV // Purchase return result rev. number';


COMMENT ON COLUMN mst_purc_act_all.tterm_cd1 IS '取引条件ＣＤ１ // #MA.TTERM_CD // Transaction terms cd. 1';


COMMENT ON COLUMN mst_purc_act_all.tterm_rmrks1 IS '取引条件備考１ // #MS.TTERM_RMRKS1 // Transaction terms remarks 1';


COMMENT ON COLUMN mst_purc_act_all.tterm_cd2 IS '取引条件ＣＤ２ // #MA.TTERM_CD // Transaction terms cd. 2';


COMMENT ON COLUMN mst_purc_act_all.tterm_rmrks2 IS '取引条件備考２ // #MS.TTERM_RMRKS2 // Transaction terms remarks 2';


COMMENT ON COLUMN mst_purc_act_all.tterm_cd3 IS '取引条件ＣＤ３ // #MA.TTERM_CD // Transaction terms cd. 3';


COMMENT ON COLUMN mst_purc_act_all.tterm_rmrks3 IS '取引条件備考３ // #MS.TTERM_RMRKS3 // Transaction terms remarks 3';


COMMENT ON COLUMN mst_purc_act_all.trd_rmrks IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN mst_purc_act_all.intr_rmrks IS '内部備考 // #MS.PURC_ACT_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_purc_act_all.adjst_dt IS '調整対象日 // #MA.DT // Adjustment required date';


COMMENT ON COLUMN mst_purc_act_all.purc_adjst_typ IS '仕入調整区分 // #MS.PURC_ADJST_TYP // Purchase adjustment type';


COMMENT ON COLUMN mst_purc_act_all.adjst_mtd_typ IS '調整方法区分 // #MS.ADJST_MTD_TYP // Adjustment method type';


COMMENT ON COLUMN mst_purc_act_all.purc_adjst_flg IS '仕入調整ＦＬＧ // #MA.FLG // Purchase adjustment flg.';


COMMENT ON COLUMN mst_purc_act_all.temp_ap_use_flg IS '暫定買掛使用ＦＬＧ // #MA.FLG // Temporary AP use flg.';


COMMENT ON COLUMN mst_purc_act_all.sub_char1 IS '予備１ // #MS.PURC_ACT_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_purc_act_all.sub_char2 IS '予備２ // #MS.PURC_ACT_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_purc_act_all.sub_char3 IS '予備３ // #MS.PURC_ACT_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_purc_act_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_purc_act_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_purc_act_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_purc_act_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_purc_act_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_purc_act_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_purc_act_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_purc_act_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_purc_act_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_purc_act_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

