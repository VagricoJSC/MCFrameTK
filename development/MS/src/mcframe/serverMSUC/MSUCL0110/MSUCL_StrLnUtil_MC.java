package mcframe.serverMSUC.MSUCL0110;

import mcframe.commonCore.lang.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.commonCore.notice.*;
import mcframe.serverCore.logic.*;
import mcframe.serverCore.notice.MCMessagePool;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.serverMA.dbc.*;
import mcframe.serverMB.dbc.*;
import mcframe.serverMS.dbc.*;
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMS.dbc.MSFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverMS.dbc.MSBAFunction.*;
import static mcframe.serverMS.dbc.MSBBFunction.*;
import static mcframe.serverMS.dbc.MSBCFunction.*;
import static mcframe.serverMS.dbc.MSBDFunction.*;
import static mcframe.serverMS.dbc.MSBEFunction.*;
import static mcframe.serverMS.dbc.MSBFFunction.*;
import static mcframe.serverMS.dbc.MSBGFunction.*;
import static mcframe.serverMS.dbc.MSBHFunction.*;
import static mcframe.serverMS.dbc.MSBIFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START

//FMCB CUSTOM_IMPORT END

/**
 * "MSUCL_StrLnUtil"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSUCL_StrLnUtil_MC extends MSUCL_StrLnUtil_MC_A{
	//FMCB CUSTOM START

	/**
	 * StrLnUtil_Srch01オペレーション.<p>
	 *
	 * 品目と場所から標準棚・ラインＣＤを取得する<br>
	 */
	public class StrLnUtil_Srch01 extends MSUCL_StrLnUtil_MC_A.StrLnUtil_Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			doCache();
			setDown();
		}

		/**
		 * マスタデータのキャッシュを取得する
		 */
		protected void doCache() {
			initItmStrLn(up0());
		}

		/**
		 * 品目棚・ラインマスタキャッシュ
		 */
		protected ItmStrLnCache _itmStrLnCache;
		protected void initItmStrLn(MCList<StrLnUtil_Srch01_CndR> l) {
			_itmStrLnCache = new ItmStrLnCache(l);
		}

		public class ItmStrLnCache {
			protected MCIndexKey _idx;
			protected MCList<MAM_ITM_STR_LN_R> _dbc = MCList.create(MAM_ITM_STR_LN_R.class);
			public ItmStrLnCache(MCList<StrLnUtil_Srch01_CndR> l) {
				init(l);
			}
			protected void init(MCList<StrLnUtil_Srch01_CndR> l) {

				MAM_ITM_STR_LN_R t = MAM_ITM_STR_LN_R.create("T");
				MAM_STR_LN_R m = MAM_STR_LN_R.create("M");
				MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
				builder.addLeftOuterJoin(m, t.gr_loc_cd.eq(m.loc_cd) .and(t.str_ln_cd.eq(m.str_ln_cd)));
				builder.setSelect(t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3, t.gr_loc_cd, t.str_ln_cd, m.str_ln_nm);
				builder.addWhereWithAnd(t.itm_cd.eq(bind("itm_cd")));
				builder.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
				builder.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
				builder.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
				builder.addWhereWithAnd(t.gr_loc_cd.eq(bind("loc_cd")));
				builder.addWhereWithAnd(t.del_flg.eq(value(false)));
				builder.addWhereWithAnd(m.del_flg.eq(value(false)));

				dbSelect(createSqlId(LOGIC_ID, t, "S01"), _dbc, builder,
						l.groupBy(StrLnUtil_Srch01_CndR.$itm_cd,
								StrLnUtil_Srch01_CndR.$itm_sub1,
								StrLnUtil_Srch01_CndR.$itm_sub2,
								StrLnUtil_Srch01_CndR.$itm_sub3,
								StrLnUtil_Srch01_CndR.$loc_cd));

				_idx = _dbc.createIndex(
						MAM_ITM_STR_LN_R.$itm_cd,
						MAM_ITM_STR_LN_R.$itm_sub1,
						MAM_ITM_STR_LN_R.$itm_sub2,
						MAM_ITM_STR_LN_R.$itm_sub3,
						MAM_ITM_STR_LN_R.$gr_loc_cd
						);

			}
			protected MAM_ITM_STR_LN_R get(StrLnUtil_Srch01_CndR r) {
				MAM_ITM_STR_LN_R ctlR = _dbc.getFirst(_idx, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.loc_cd());
				return ctlR;
			}
		}

		protected void setDown() {
			up0().setString(StrLnUtil_Srch01_CndR.$str_ln_cd, MAC_STR.NULL_VAL.value());

			for (StrLnUtil_Srch01_CndR r : up0()) {
				MAM_ITM_STR_LN_R ctlR = _itmStrLnCache.get(r);
				if (!isNull(ctlR)) {
					r.str_ln_cd(ctlR.str_ln_cd());
					r.str_ln_nm(ctlR.getStringNE("str_ln_nm"));
				}
			}
			down0().setAll(up0());
		}
	}

	//FMCB CUSTOM END
}