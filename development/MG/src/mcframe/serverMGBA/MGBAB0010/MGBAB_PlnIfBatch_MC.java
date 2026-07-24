package mcframe.serverMGBA.MGBAB0010;

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
import mcframe.serverMGBA.MGBAL5010.*;
import mcframe.serverMGBA.MGBAL5020.*;
import mcframe.serverMGBA.MGBAL5030.*;
import mcframe.serverMGBA.MGBAL5040.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBAB_PlnIfBatch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBAB_PlnIfBatch_MC extends MGBAB_PlnIfBatch_MC_A{
	//FMCB CUSTOM START

	/**
	 * PlnIf_Upd01オペレーション.<p>
	 *
	 * 売上計画の取込処理をする<br>
	 */
	public class PlnIf_Upd01 extends MGBAB_PlnIfBatch_MC_A.PlnIf_Upd01 {

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
			MGBAL_PlnSlsIfService.PlnSlsIf_Upd01 ope = MGBAL_PlnSlsIfService.crtPlnSlsIf_Upd01();
			copy(ope.up0(), up0(), createMap_PlnSlsIf_Chk01_CndR_PlnIf_Upd01_CndR());
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

		protected Map_PlnSlsIf_Chk01_CndR_PlnIf_Upd01_CndR<PlnSlsIf_Chk01_CndR, PlnIf_Upd01_CndR> createMap_PlnSlsIf_Chk01_CndR_PlnIf_Upd01_CndR() {
			return new Map_PlnSlsIf_Chk01_CndR_PlnIf_Upd01_CndR<PlnSlsIf_Chk01_CndR, PlnIf_Upd01_CndR>();
		}

		public class Map_PlnSlsIf_Chk01_CndR_PlnIf_Upd01_CndR<D extends PlnSlsIf_Chk01_CndR, S extends PlnIf_Upd01_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PlnSlsIf_Chk01_CndR.$calc_ctg_cd, PlnIf_Upd01_CndR.$calc_ctg_cd);
				addColumnPathMap(PlnSlsIf_Chk01_CndR.$wg_cd, PlnIf_Upd01_CndR.$wg_cd);
				addColumnPathMap(PlnSlsIf_Chk01_CndR.$ym_fr, PlnIf_Upd01_CndR.$ym_fr);
				addColumnPathMap(PlnSlsIf_Chk01_CndR.$ym_to, PlnIf_Upd01_CndR.$ym_to);
				addColumnPathMap(PlnSlsIf_Chk01_CndR.$sls_pln_imp_typ, PlnIf_Upd01_CndR.$sls_pln_imp_typ);
			}
		}

	}
	/**
	 * PlnIf_Upd02オペレーション.<p>
	 *
	 * 月次計画の取込処理をする<br>
	 */
	public class PlnIf_Upd02 extends MGBAB_PlnIfBatch_MC_A.PlnIf_Upd02 {

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
			MGBAL_PlnRqmtIfService.PlnRqmtIf_Upd01 ope = MGBAL_PlnRqmtIfService.crtPlnRqmtIf_Upd01();
			copy(ope.up0(), up0(), createMap_PlnSlsIf_Chk01_CndR_PlnIf_Upd02_CndR());
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

		protected Map_PlnRqmtIf_Chk01_CndR_PlnIf_Upd02_CndR<PlnRqmtIf_Chk01_CndR, PlnIf_Upd02_CndR> createMap_PlnSlsIf_Chk01_CndR_PlnIf_Upd02_CndR() {
			return new Map_PlnRqmtIf_Chk01_CndR_PlnIf_Upd02_CndR<PlnRqmtIf_Chk01_CndR, PlnIf_Upd02_CndR>();
		}

		public class Map_PlnRqmtIf_Chk01_CndR_PlnIf_Upd02_CndR<D extends PlnRqmtIf_Chk01_CndR, S extends PlnIf_Upd02_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PlnRqmtIf_Chk01_CndR.$calc_ctg_cd, PlnIf_Upd02_CndR.$calc_ctg_cd);
				addColumnPathMap(PlnRqmtIf_Chk01_CndR.$wg_cd, PlnIf_Upd02_CndR.$wg_cd);
				addColumnPathMap(PlnRqmtIf_Chk01_CndR.$ym_fr, PlnIf_Upd02_CndR.$ym_fr);
				addColumnPathMap(PlnRqmtIf_Chk01_CndR.$ym_to, PlnIf_Upd02_CndR.$ym_to);
				addColumnPathMap(PlnRqmtIf_Chk01_CndR.$rqmt_pln_imp_typ, PlnIf_Upd02_CndR.$rqmt_pln_imp_typ);
				addColumnPathMap(PlnRqmtIf_Chk01_CndR.$sim_mrp_no, PlnIf_Upd02_CndR.$sim_mrp_no);
			}
		}

	}
	/**
	 * PlnIf_Upd03オペレーション.<p>
	 *
	 * 製造計画の取込処理をする<br>
	 */
	public class PlnIf_Upd03 extends MGBAB_PlnIfBatch_MC_A.PlnIf_Upd03 {

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
			MGBAL_PlnMfgIfService.PlnMfgIf_Upd01 ope = MGBAL_PlnMfgIfService.crtPlnMfgIf_Upd01();
			copy(ope.up0(), up0(), createMap_PlnMfgIf_Chk01_CndR_PlnIf_Upd03_CndR());
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

		protected Map_PlnMfgIf_Chk01_CndR_PlnIf_Upd03_CndR<PlnMfgIf_Chk01_CndR, PlnIf_Upd03_CndR> createMap_PlnMfgIf_Chk01_CndR_PlnIf_Upd03_CndR() {
			return new Map_PlnMfgIf_Chk01_CndR_PlnIf_Upd03_CndR<PlnMfgIf_Chk01_CndR, PlnIf_Upd03_CndR>();
		}

		public class Map_PlnMfgIf_Chk01_CndR_PlnIf_Upd03_CndR<D extends PlnMfgIf_Chk01_CndR, S extends PlnIf_Upd03_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PlnMfgIf_Chk01_CndR.$calc_ctg_cd, PlnIf_Upd03_CndR.$calc_ctg_cd);
				addColumnPathMap(PlnMfgIf_Chk01_CndR.$wg_cd, PlnIf_Upd03_CndR.$wg_cd);
				addColumnPathMap(PlnMfgIf_Chk01_CndR.$ym_fr, PlnIf_Upd03_CndR.$ym_fr);
				addColumnPathMap(PlnMfgIf_Chk01_CndR.$ym_to, PlnIf_Upd03_CndR.$ym_to);
				addColumnPathMap(PlnMfgIf_Chk01_CndR.$mfg_pln_imp_typ, PlnIf_Upd03_CndR.$mfg_pln_imp_typ);
				addColumnPathMap(PlnMfgIf_Chk01_CndR.$sim_mrp_no, PlnIf_Upd03_CndR.$sim_mrp_no);
			}
		}

	}
	/**
	 * PlnIf_Upd04オペレーション.<p>
	 *
	 * 購買計画の取込処理をする<br>
	 */
	public class PlnIf_Upd04 extends MGBAB_PlnIfBatch_MC_A.PlnIf_Upd04 {

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
			MGBAL_PlnPurcIfService.PlnPurcIf_Upd01 ope = MGBAL_PlnPurcIfService.crtPlnPurcIf_Upd01();
			copy(ope.up0(), up0(), createMap_PlnPurcIf_Chk01_CndR_PlnIf_Upd04_CndR());
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

		protected Map_PlnPurcIf_Chk01_CndR_PlnIf_Upd04_CndR<PlnPurcIf_Chk01_CndR, PlnIf_Upd04_CndR> createMap_PlnPurcIf_Chk01_CndR_PlnIf_Upd04_CndR() {
			return new Map_PlnPurcIf_Chk01_CndR_PlnIf_Upd04_CndR<PlnPurcIf_Chk01_CndR, PlnIf_Upd04_CndR>();
		}

		public class Map_PlnPurcIf_Chk01_CndR_PlnIf_Upd04_CndR<D extends PlnPurcIf_Chk01_CndR, S extends PlnIf_Upd04_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PlnPurcIf_Chk01_CndR.$calc_ctg_cd, PlnIf_Upd04_CndR.$calc_ctg_cd);
				addColumnPathMap(PlnPurcIf_Chk01_CndR.$wg_cd, PlnIf_Upd04_CndR.$wg_cd);
				addColumnPathMap(PlnPurcIf_Chk01_CndR.$ym_fr, PlnIf_Upd04_CndR.$ym_fr);
				addColumnPathMap(PlnPurcIf_Chk01_CndR.$ym_to, PlnIf_Upd04_CndR.$ym_to);
				addColumnPathMap(PlnPurcIf_Chk01_CndR.$purc_pln_imp_typ, PlnIf_Upd04_CndR.$purc_pln_imp_typ);
				addColumnPathMap(PlnPurcIf_Chk01_CndR.$sim_mrp_no, PlnIf_Upd04_CndR.$sim_mrp_no);
			}
		}

	}

	//FMCB CUSTOM END
}