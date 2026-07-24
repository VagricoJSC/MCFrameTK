
COMMENT ON TABLE MGVT_ST_WIP_EXPNS IS '原価計算月初仕掛費目別原価ビュー // Cost calculation beginning cost by WIP cost element view';


COMMENT ON COLUMN MGVT_ST_WIP_EXPNS.ST_WIP_KEY IS '月初仕掛キー // #MG.ROW_NO // Beginning WIP key';


COMMENT ON COLUMN MGVT_ST_WIP_EXPNS.EXPNS_CD IS '費目ＣＤ // #MA.EXPNS_CD // Cost element cd.';


COMMENT ON COLUMN MGVT_ST_WIP_EXPNS.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MGVT_ST_WIP_EXPNS.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MGVT_ST_WIP_EXPNS.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MGVT_ST_WIP_EXPNS.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MGVT_ST_WIP_EXPNS.ITM_EXT IS '品目拡張 // #MG.ITM_EXT // Item extension';


COMMENT ON COLUMN MGVT_ST_WIP_EXPNS.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MGVT_ST_WIP_EXPNS.WIP_AMT IS '自レベル金額 // #MA.MONEY // Own level amount';


COMMENT ON COLUMN MGVT_ST_WIP_EXPNS.INPT_AMT IS '下位レベル金額 // #MA.MONEY // Lower level amount';

