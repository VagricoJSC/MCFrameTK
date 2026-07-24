\encoding UTF-8

COMMENT ON TABLE mst_frcst_slo_sum_all IS '顧客期間内示・受注集計 // Sales forecast/sales order aggregated';


COMMENT ON COLUMN mst_frcst_slo_sum_all.ym IS '年月 // #MA.YM // Year month';


COMMENT ON COLUMN mst_frcst_slo_sum_all.sls_dpt_cd IS '売上部門ＣＤ // #MA.DPT_CD // Sales dept. cd.';


COMMENT ON COLUMN mst_frcst_slo_sum_all.sls_usr_cd IS '売上担当者ＣＤ // #MA.USR_CD // Sales PIC cd.';


COMMENT ON COLUMN mst_frcst_slo_sum_all.cst_cd IS '得意先ＣＤ // #MA.BP_CD // Customer cd.';


COMMENT ON COLUMN mst_frcst_slo_sum_all.wrk_no IS '案件ＮＯ // #MA.WRK_NO // Sales project No.';


COMMENT ON COLUMN mst_frcst_slo_sum_all.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_frcst_slo_sum_all.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_frcst_slo_sum_all.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_frcst_slo_sum_all.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_frcst_slo_sum_all.trd_cur_cd IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN mst_frcst_slo_sum_all.spln_itm_cd IS '計画品目ＣＤ // #MA.SPLN_ITM_CD // Plan item cd.';


COMMENT ON COLUMN mst_frcst_slo_sum_all.sls_itm_grp_cd IS '品目体系ＣＤ // #MA.SLS_ITM_GRP_CD // Item system cd.';


COMMENT ON COLUMN mst_frcst_slo_sum_all.base_unit_slo_qty IS '基準単位本受注数量 // #MA.QTY // Base unit official sales order qty.';


COMMENT ON COLUMN mst_frcst_slo_sum_all.trd_cur_slo_amt IS '取引通貨本受注金額 // #MA.MONEY // Official sales amount (Transaction currency)';


COMMENT ON COLUMN mst_frcst_slo_sum_all.slo_cost_amt IS '本受注原価金額 // #MA.MONEY // Official sales order cost amount';


COMMENT ON COLUMN mst_frcst_slo_sum_all.base_unit_pre_slo_qty IS '基準単位仮受注数量 // #MA.QTY // Base unit temporary sales order qty.';


COMMENT ON COLUMN mst_frcst_slo_sum_all.trd_cur_pre_slo_amt IS '取引通貨仮受注金額 // #MA.MONEY // Temporary sales order amount (Transaction currency)';


COMMENT ON COLUMN mst_frcst_slo_sum_all.pre_slo_cost_amt IS '仮受注原価金額 // #MA.MONEY // Temporary sales order cost amount';


COMMENT ON COLUMN mst_frcst_slo_sum_all.cst_frcst_qty IS '基準単位顧客期間内示数量 // #MA.QTY // Base unit customer period forecast qty.';


COMMENT ON COLUMN mst_frcst_slo_sum_all.trd_cur_cst_frcst_amt IS '取引通貨顧客期間内示金額 // #MA.MONEY // Customer period forecast amount (Transaction currency)';


COMMENT ON COLUMN mst_frcst_slo_sum_all.usr_cst_cd IS '得意先ＣＤ（入力） // #MA.BP_CD // Customer cd. (Input)';


COMMENT ON COLUMN mst_frcst_slo_sum_all.usr_wrk_no IS '案件ＮＯ（入力） // #MA.WRK_NO // Sales project No. (Input)';


COMMENT ON COLUMN mst_frcst_slo_sum_all.sum_cst_cd IS '得意先ＣＤ（集計） // #MA.BP_CD // Customer cd. (Aggregation)';


COMMENT ON COLUMN mst_frcst_slo_sum_all.sum_wrk_no IS '案件ＮＯ（集計） // #MA.WRK_NO // Sales project No. (Aggregated)';


COMMENT ON COLUMN mst_frcst_slo_sum_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_frcst_slo_sum_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_frcst_slo_sum_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_frcst_slo_sum_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_frcst_slo_sum_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_frcst_slo_sum_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_frcst_slo_sum_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_frcst_slo_sum_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_frcst_slo_sum_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_frcst_slo_sum_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_frcst_slo_sum_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

