
COMMENT ON TABLE MGW_ST_STK_DIFF IS '月初在庫評価替用ワーク // Beginning inventory revaluation work';


COMMENT ON COLUMN MGW_ST_STK_DIFF.ST_STK_KEY IS '月初在庫キー // #MG.ROW_NO // Beginning inventory key';


COMMENT ON COLUMN MGW_ST_STK_DIFF.EXPNS_CD IS '費目ＣＤ // #MA.EXPNS_CD // Cost element cd.';


COMMENT ON COLUMN MGW_ST_STK_DIFF.DIFF_AMT IS '改定差異 // #MA.MONEY // Revised variance';


COMMENT ON COLUMN MGW_ST_STK_DIFF.BF_AMT IS '改定前金額 // #MA.MONEY // Amount before revised';


COMMENT ON COLUMN MGW_ST_STK_DIFF.AF_AMT IS '改定後金額 // #MA.MONEY // Revised amount';

