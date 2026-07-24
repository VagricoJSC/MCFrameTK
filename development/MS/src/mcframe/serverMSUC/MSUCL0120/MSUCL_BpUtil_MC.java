package mcframe.serverMSUC.MSUCL0120;

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
 * "MSUCL_BpUtil"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSUCL_BpUtil_MC extends MSUCL_BpUtil_MC_A{
	//FMCB CUSTOM START

	/**
	 * BpUtil_Sprt01オペレーション.<p>
	 *
	 * 取引先から個別発行フラグを取得する<br>
	 */
	public class BpUtil_Sprt01 extends MSUCL_BpUtil_MC_A.BpUtil_Sprt01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			initBp(up1());
			setDown();
		}

		/**
		 * 取引先マスタキャッシュ
		 */
		protected BpCache _BpCache;
		protected void initBp(MCList<BpUtil_Sprt01_DtlR> l) {
			_BpCache = new BpCache(l);
		}

		public class BpCache {
			protected MCIndexKey _bpIdx;
			protected MCList<MAM_BP_R> _bpL = MCList.create(MAM_BP_R.class);
			public BpCache(MCList<BpUtil_Sprt01_DtlR> l) {
				init(l);
			}

			protected void init(MCList<BpUtil_Sprt01_DtlR> l) {
				MAM_BP_R t = MAM_BP_R.create("T");
				MCQueryApiBuilder bpL_bldr = MCQueryApiBuilder.create(t);
				bpL_bldr.addWhereWithAnd(t.bp_cd.eq(bind("bp_cd")));
				dbSelect("MSUCL0120_MAM_BP_S01", _bpL, bpL_bldr, l.groupBy("bp_cd"));
				_bpIdx = _bpL.createIndex(MAM_BP_R.$bp_cd);
			}

			protected MAM_BP_R get(BpUtil_Sprt01_DtlR r) {
				MAM_BP_R bpR = _bpL.getFirst(_bpIdx, r.bp_cd());
				return bpR;
			}
		}

		protected void setDown() {
			MAM_CO_R coR = getCo();
			String prntTypCol = MAC_BP_IS_SRCH_TYP.prnt_typ_col(up0().bp_typ());

			for (BpUtil_Sprt01_DtlR r : up1()) {
				MAM_BP_R bpR = _BpCache.get(r);
				if (!isNull(bpR)) {
					if (!isNull(bpR.getStringNE(prntTypCol))) {
						r.indiv_prnt_flg(MAC_PRNT_TYP.isINDIV_PRNT(bpR.getStringNE(prntTypCol)) ? true : false);
					}
					else {
						r.indiv_prnt_flg(MAC_PRNT_TYP.isINDIV_PRNT(coR.getStringNE(prntTypCol)) ? true : false);
					}
				}
				else {
					r.indiv_prnt_flg(MAC_PRNT_TYP.isINDIV_PRNT(coR.getStringNE(prntTypCol)) ? true : false);
				}
			}
			down0().setAll(up1());
		}
	}

	//FMCB CUSTOM END
}