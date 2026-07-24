
COMMENT ON TABLE MAM_MPS_GRP_ALL IS 'ＭＰＳグループマスタ // MPS group master';


COMMENT ON COLUMN MAM_MPS_GRP_ALL.MPS_GRP_CD IS 'ＭＰＳグループＣＤ // #MA.MPS_GRP_CD // MPS group cd.';


COMMENT ON COLUMN MAM_MPS_GRP_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MAM_MPS_GRP_ALL.MPS_GRP_NM IS 'ＭＰＳグループ名 // #MA.MPS_GRP_NM // MPS group name';


COMMENT ON COLUMN MAM_MPS_GRP_ALL.RQMT_MONS IS '日次生産依頼作成月数 // #MA.MONS // Daily production request created months';


COMMENT ON COLUMN MAM_MPS_GRP_ALL.PRCD_MONS IS '先行手配依頼作成月数 // #MA.MONS // Long LT request creation months';


COMMENT ON COLUMN MAM_MPS_GRP_ALL.DATE_DIV_MONS IS '日ばらし月数 // #MA.MONS // Number of months for disaggregation by day';


COMMENT ON COLUMN MAM_MPS_GRP_ALL.WEEK_DIV_MONS IS '週ばらし月数 // #MA.MONS // Number of months disaggregated by week';


COMMENT ON COLUMN MAM_MPS_GRP_ALL.PERIOD_DIV_MONS IS '旬ばらし月数 // #MA.MONS // Number of months disaggregated by 10 days';


COMMENT ON COLUMN MAM_MPS_GRP_ALL.DATE_DIV_TYP IS '日ばらし区分 // #MA.DATE_DIV_TYP // Disaggregation by day type';


COMMENT ON COLUMN MAM_MPS_GRP_ALL.MON01_PROD_QTY IS '１月生産可能数量／日 // #MA.QTY // Possible daily production qty. in January';


COMMENT ON COLUMN MAM_MPS_GRP_ALL.MON02_PROD_QTY IS '２月生産可能数量／日 // #MA.QTY // Production possible qty. in February/day';


COMMENT ON COLUMN MAM_MPS_GRP_ALL.MON03_PROD_QTY IS '３月生産可能数量／日 // #MA.QTY // Production possible qty. in March/day';


COMMENT ON COLUMN MAM_MPS_GRP_ALL.MON04_PROD_QTY IS '４月生産可能数量／日 // #MA.QTY // Production possible qty. in April/day';


COMMENT ON COLUMN MAM_MPS_GRP_ALL.MON05_PROD_QTY IS '５月生産可能数量／日 // #MA.QTY // Production possible qty. in May/day';


COMMENT ON COLUMN MAM_MPS_GRP_ALL.MON06_PROD_QTY IS '６月生産可能数量／日 // #MA.QTY // Production possible qty. in June/day';


COMMENT ON COLUMN MAM_MPS_GRP_ALL.MON07_PROD_QTY IS '７月生産可能数量／日 // #MA.QTY // Production possible qty. in July/day';


COMMENT ON COLUMN MAM_MPS_GRP_ALL.MON08_PROD_QTY IS '８月生産可能数量／日 // #MA.QTY // Production possible qty. in August/day';


COMMENT ON COLUMN MAM_MPS_GRP_ALL.MON09_PROD_QTY IS '９月生産可能数量／日 // #MA.QTY // Production possible qty. in September/day';


COMMENT ON COLUMN MAM_MPS_GRP_ALL.MON10_PROD_QTY IS '１０月生産可能数量／日 // #MA.QTY // Production possible qty. in October/day';


COMMENT ON COLUMN MAM_MPS_GRP_ALL.MON11_PROD_QTY IS '１１月生産可能数量／日 // #MA.QTY // Production possible qty. in November/day';


COMMENT ON COLUMN MAM_MPS_GRP_ALL.MON12_PROD_QTY IS '１２月生産可能数量／日 // #MA.QTY // Production possible qty. in December/day';


COMMENT ON COLUMN MAM_MPS_GRP_ALL.MEMO1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN MAM_MPS_GRP_ALL.MEMO2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN MAM_MPS_GRP_ALL.MEMO3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN MAM_MPS_GRP_ALL.DEL_FLG IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN MAM_MPS_GRP_ALL.DEL_USR_ID IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN MAM_MPS_GRP_ALL.DEL_USR_NM IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN MAM_MPS_GRP_ALL.DEL_TS IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN MAM_MPS_GRP_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MAM_MPS_GRP_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MAM_MPS_GRP_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MAM_MPS_GRP_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MAM_MPS_GRP_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MAM_MPS_GRP_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MAM_MPS_GRP_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MAM_MPS_GRP_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MAM_MPS_GRP_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MAM_MPS_GRP_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

