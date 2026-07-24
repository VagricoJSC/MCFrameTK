package mcframe.serverMGBG.MGBGB0050;

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
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import mcframe.serverMB.dbc.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import static mcframe.serverMGUC.MGUCL0020.MGUCL_AppSys.*;
import mcframe.commonMG.constant.*;
import mcframe.serverMG.dbc.*;
import static mcframe.commonMG.notice.MG_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMG.dbc.MGFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMGBG.MGBGL5200.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBGB_PreAlcRateBatch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBGB_PreAlcRateBatch_MC extends MGBGB_PreAlcRateBatch_MC_A{
	//FMCB CUSTOM START

	/**
	 * PreAlcRate_Upd01オペレーション.<p>
	 *
	 * 一次配賦比率を作成する。<br>
	 */
	public class PreAlcRate_Upd01 extends MGBGB_PreAlcRateBatch_MC_A.PreAlcRate_Upd01 {

		/** 例外発生ＦＬＧ **/
		protected boolean _exceptionFlg;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			try {
				execMain();
			}
			catch (Exception ex) {
				handleEx(ex);
			}
			finally {
				postBatch();
			}
		}

		protected void execMain() {
			MGBGL_PreAlcRateService.PreAlcRate_Upd01 ope = MGBGL_PreAlcRateService.crtPreAlcRate_Upd01();
			setAll(ope.up0(), up0(), createMap_PreAlcRate_Chk01_DtlR_PreAlcRate_Upd01_DtlR());
			ope.exec();
		}

		protected void postBatch() {
			if (_exceptionFlg) {
				MCMessagePool.clear();
				MCMessagePool.add(new MCMessage(MAUDL0009));
			}
		}

		protected void handleEx(Exception e) {
			_exceptionFlg = true;
			if (e instanceof MCAppException) {
				//正常終了と見なす
				return ;
			}
			throw new MCException(e);
		}

		protected Map_PreAlcRate_Chk01_DtlR_PreAlcRate_Upd01_DtlR<PreAlcRate_Chk01_DtlR,PreAlcRate_Upd01_DtlR> createMap_PreAlcRate_Chk01_DtlR_PreAlcRate_Upd01_DtlR() {
			return new Map_PreAlcRate_Chk01_DtlR_PreAlcRate_Upd01_DtlR<PreAlcRate_Chk01_DtlR, PreAlcRate_Upd01_DtlR>();
		}

		public class Map_PreAlcRate_Chk01_DtlR_PreAlcRate_Upd01_DtlR<D extends PreAlcRate_Chk01_DtlR, S extends PreAlcRate_Upd01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PreAlcRate_Chk01_DtlR.$sa_typ, PreAlcRate_Upd01_DtlR.$sa_typ);
				addColumnPathMap(PreAlcRate_Chk01_DtlR.$ym, PreAlcRate_Upd01_DtlR.$ym);
				addColumnPathMap(PreAlcRate_Chk01_DtlR.$ym_fr, PreAlcRate_Upd01_DtlR.$ym_fr);
				addColumnPathMap(PreAlcRate_Chk01_DtlR.$ym_to, PreAlcRate_Upd01_DtlR.$ym_to);
				addColumnPathMap(PreAlcRate_Chk01_DtlR.$calc_ctg_cd, PreAlcRate_Upd01_DtlR.$calc_ctg_cd);
				addColumnPathMap(PreAlcRate_Chk01_DtlR.$pre_alc_rate_cd, PreAlcRate_Upd01_DtlR.$pre_alc_rate_cd);
				addColumnPathMap(PreAlcRate_Chk01_DtlR.$wg_cd, PreAlcRate_Upd01_DtlR.$wg_cd);
			}
		}

	}

	//FMCB CUSTOM END
}