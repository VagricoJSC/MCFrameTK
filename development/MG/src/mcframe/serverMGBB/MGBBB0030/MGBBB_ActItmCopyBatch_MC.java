package mcframe.serverMGBB.MGBBB0030;

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
import mcframe.serverMGBB.MGBBL5030.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBBB_ActItmCopyBatch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBBB_ActItmCopyBatch_MC extends MGBBB_ActItmCopyBatch_MC_A{
	//FMCB CUSTOM START

	/**
	 * ActItmCopy_Ins01オペレーション.<p>
	 *
	 * 原価実績品目情報コピー<br>
	 */
	public class ActItmCopy_Ins01 extends MGBBB_ActItmCopyBatch_MC_A.ActItmCopy_Ins01 {

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
			MGBBL_ActItmCopyService.ActItmCopy_Ins01 ope = MGBBL_ActItmCopyService.crtActItmCopy_Ins01();
			copy(ope.up0(), up0(), createMap_ActItmCopy_Chk01_CndR_ActItmCopy_Ins01_CndR());
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
		
		protected Map_ActItmCopy_Chk01_CndR_ActItmCopy_Ins01_CndR<ActItmCopy_Chk01_CndR,ActItmCopy_Ins01_CndR> createMap_ActItmCopy_Chk01_CndR_ActItmCopy_Ins01_CndR() {
			return new Map_ActItmCopy_Chk01_CndR_ActItmCopy_Ins01_CndR<ActItmCopy_Chk01_CndR, ActItmCopy_Ins01_CndR>();
		}

		public class Map_ActItmCopy_Chk01_CndR_ActItmCopy_Ins01_CndR<D extends ActItmCopy_Chk01_CndR, S extends ActItmCopy_Ins01_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ActItmCopy_Chk01_CndR.$err_flg, ActItmCopy_Ins01_CndR.$err_flg);
				addColumnPathMap(ActItmCopy_Chk01_CndR.$act_calc_ctg_cd, ActItmCopy_Ins01_CndR.$act_calc_ctg_cd);
				addColumnPathMap(ActItmCopy_Chk01_CndR.$wg_cd, ActItmCopy_Ins01_CndR.$wg_cd);
				addColumnPathMap(ActItmCopy_Chk01_CndR.$ym_fr, ActItmCopy_Ins01_CndR.$ym_fr);
				addColumnPathMap(ActItmCopy_Chk01_CndR.$ym_to, ActItmCopy_Ins01_CndR.$ym_to);
				addColumnPathMap(ActItmCopy_Chk01_CndR.$calc_ctg_cd, ActItmCopy_Ins01_CndR.$calc_ctg_cd);
				addColumnPathMap(ActItmCopy_Chk01_CndR.$term, ActItmCopy_Ins01_CndR.$term);
				addColumnPathMap(ActItmCopy_Chk01_CndR.$ptn_set_typ, ActItmCopy_Ins01_CndR.$ptn_set_typ);
				addColumnPathMap(ActItmCopy_Chk01_CndR.$itm_flg, ActItmCopy_Ins01_CndR.$itm_flg);
				addColumnPathMap(ActItmCopy_Chk01_CndR.$dtl_flg, ActItmCopy_Ins01_CndR.$dtl_flg);
				addColumnPathMap(ActItmCopy_Chk01_CndR.$oper_flg, ActItmCopy_Ins01_CndR.$oper_flg);
				addColumnPathMap(ActItmCopy_Chk01_CndR.$bom_flg, ActItmCopy_Ins01_CndR.$bom_flg);
				addColumnPathMap(ActItmCopy_Chk01_CndR.$wk_flg, ActItmCopy_Ins01_CndR.$wk_flg);
				addColumnPathMap(ActItmCopy_Chk01_CndR.$purc_flg, ActItmCopy_Ins01_CndR.$purc_flg);
				addColumnPathMap(ActItmCopy_Chk01_CndR.$proc_flg, ActItmCopy_Ins01_CndR.$proc_flg);
				addColumnPathMap(ActItmCopy_Chk01_CndR.$prov_flg, ActItmCopy_Ins01_CndR.$prov_flg);
				addColumnPathMap(ActItmCopy_Chk01_CndR.$sls_flg, ActItmCopy_Ins01_CndR.$sls_flg);

			}
		}
	}

	//FMCB CUSTOM END
}