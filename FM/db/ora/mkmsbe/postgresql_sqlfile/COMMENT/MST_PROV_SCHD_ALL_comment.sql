\encoding UTF-8

COMMENT ON TABLE mst_prov_schd_all IS '支給予定 // Supply schedule';


COMMENT ON COLUMN mst_prov_schd_all.prov_schd_no IS '支給予定ＮＯ // #MA.PROV_SCHD_NO // Supply schedule No.';


COMMENT ON COLUMN mst_prov_schd_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_prov_schd_all.prov_src_schd_typ IS '支給元予定区分 // #MS.PROV_SRC_SCHD_TYP // Supply-from schedule type';


COMMENT ON COLUMN mst_prov_schd_all.prov_src_schd_no1 IS '支給元予定ＮＯ１ // #MA.PROV_SRC_SCHD_NO // Supply-from schedule No. 1';


COMMENT ON COLUMN mst_prov_schd_all.prov_src_schd_no2 IS '支給元予定ＮＯ２ // #MA.PROV_SRC_SCHD_NO // Supply-from schedule No. 2';


COMMENT ON COLUMN mst_prov_schd_all.trd_cd IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN mst_prov_schd_all.trd_ptn_typ IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN mst_prov_schd_all.xfr_rsn_cd IS '移送理由ＣＤ // #MA.BIZ_RSN_CD // Transport reason cd.';


COMMENT ON COLUMN mst_prov_schd_all.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mst_prov_schd_all.base_unit_qty IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN mst_prov_schd_all.accpt_schd_dt IS '検収予定日 // #MA.DT // Scheduled acceptance date';


COMMENT ON COLUMN mst_prov_schd_all.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mst_prov_schd_all.prsppl_cd IS '支給先ＣＤ // #MA.BP_CD // Subcontractor cd.';


COMMENT ON COLUMN mst_prov_schd_all.prov_typ IS '支給区分 // #MA.PROV_TYP // Supply type';


COMMENT ON COLUMN mst_prov_schd_all.prov_basis_typ IS '支給計上区分 // #MA.PROV_BASIS_TYP // Supply recording type';


COMMENT ON COLUMN mst_prov_schd_all.xrate_inpt_flg IS '為替レート指定ＦＬＧ // #MA.FLG // Set exchange rate flg.';


COMMENT ON COLUMN mst_prov_schd_all.xrate IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN mst_prov_schd_all.ptax_xrate_inpt_flg IS '納税為替レート指定ＦＬＧ // #MA.FLG // Taxpaying exchange rate specification flg.';


COMMENT ON COLUMN mst_prov_schd_all.ptax_xrate IS '納税為替レート // #MA.MONEY // Taxpaying exchange rate';


COMMENT ON COLUMN mst_prov_schd_all.trd_cur_cd IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN mst_prov_schd_all.tax_fix_flg IS '税指定ＦＬＧ // #MA.FLG // Tax specified flg.';


COMMENT ON COLUMN mst_prov_schd_all.tax_cd IS '税ＣＤ // #MA.TAX_CD // Tax cd.';


COMMENT ON COLUMN mst_prov_schd_all.trd_cur_upri IS '取引通貨単価 // #MA.MONEY // Unit price (Transaction currency)';


COMMENT ON COLUMN mst_prov_schd_all.trd_cur_amt IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN mst_prov_schd_all.trd_cur_tax_amt IS '取引通貨税額 // #MA.MONEY // Tax amount (Transaction currency)';


COMMENT ON COLUMN mst_prov_schd_all.wtax_rate IS '源泉税率 // #MA.WTAX_RATE // Withholding tax rate';


COMMENT ON COLUMN mst_prov_schd_all.wtax_amt IS '源泉税額 // #MA.MONEY // Withholding tax';


COMMENT ON COLUMN mst_prov_schd_all.intr_rmrks IS '内部備考 // #MS.PROV_SCHD_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_prov_schd_all.sub_char1 IS '予備１ // #MS.PROV_SCHD_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_prov_schd_all.sub_char2 IS '予備２ // #MS.PROV_SCHD_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_prov_schd_all.sub_char3 IS '予備３ // #MS.PROV_SCHD_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_prov_schd_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_prov_schd_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_prov_schd_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_prov_schd_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_prov_schd_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_prov_schd_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_prov_schd_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_prov_schd_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_prov_schd_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_prov_schd_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

