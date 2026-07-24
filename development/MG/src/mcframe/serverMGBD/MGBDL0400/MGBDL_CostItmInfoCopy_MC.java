package mcframe.serverMGBD.MGBDL0400;

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
import mcframe.serverMGBD.MGBDL0400.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMAUD.MAUDL5010.MAUDL_Operation;
import static mcframe.serverMGBD.MGBDL0400.Query.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.serverMGBD.MGBDL5410.*;
import mcframe.serverMGBD.MGBDL5430.*;
import mcframe.serverMGBD.MGBDL5420.*;
import mcframe.serverMGBD.MGBDL5440.*;
import mcframe.serverMGBD.MGBDL5460.*;
import mcframe.serverMGBD.MGBDL5480.*;
import mcframe.serverMGBD.MGBDL5470.*;
import mcframe.serverMGBD.MGBDL5450.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBDL_CostItmInfoCopy"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBDL_CostItmInfoCopy_MC extends MGBDL_CostItmInfoCopy_MC_A{
	//FMCB CUSTOM START
	protected MCList<MAM_WG_R> _wgL = MCList.create(MAM_WG_R.class);

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 取込前のチェックを行います。<br>
	 */
	public class Chk01 extends MGBDL_CostItmInfoCopy_MC_A.Chk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			setDown();
		}

		@Override
		protected void initUpSub() {
			super.initUpSub();
			if (up0().cmn_flg()) {
				up0().wg_cd(MAC_STR.NULL_VAL.value());
			}
		}

		@Override
		protected boolean skipListLogicCheck(MCContainer container, String column) {
			if (up0().cmn_flg()) {
				if (container == up0() && isSame(column, Chk01_CndR.$wg_cd)) {
					return true;
				}
			}
			return super.skipListLogicCheck(container, column);
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			msgL.addAll(checkSub());
			return msgL;
		}

		protected MCMessageList checkSub() {
			MCMessageList msgL = new MCMessageList();
			if (!hasErrFlgOn(up0())) {
				// DACチェック 
				if (up0().wg_flg()) {
					for (String wg : MCStringUtil.arrayValueSplit(up0().wg_cd())) {
						Chk01_CndR wk = Chk01_CndR.create();
						wk.wg_cd(wg);
						msgL.addAll(checkWritableWgCdDac(wk, Chk01_CndR.$wg_cd));
					}
				}
			}
			return msgL;
		}

		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}
	}
	/**
	 * Chk02オペレーション.<p>
	 *
	 * 削除前のチェックを行います。<br>
	 */
	public class Chk02 extends MGBDL_CostItmInfoCopy_MC_A.Chk02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected boolean skipListLogicCheck(MCContainer container, String column) {
			if (up0().cmn_flg()) {
				if (container == up0() && isSame(column, Chk02_CndR.$wg_cd)) {
					return true;
				}
			}
			return super.skipListLogicCheck(container, column);
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			msgL.addAll(checkSub());
			return msgL;
		}

		protected MCMessageList checkSub() {
			MCMessageList msgL = new MCMessageList();
			if (!hasErrFlgOn(up0())) {
				// DACチェック 
				if (up0().wg_flg()) {
					for (String wg : MCStringUtil.arrayValueSplit(up0().wg_cd())) {
						Chk02_CndR wk = Chk02_CndR.create();
						wk.wg_cd(wg);
						msgL.addAll(checkWritableWgCdDac(wk, Chk02_CndR.$wg_cd));
					}
				}
			}
			return msgL;
		}
	}
	/**
	 * Ins01オペレーション.<p>
	 *
	 * 原価品目情報の取込を行います。<br>
	 */
	public class Ins01 extends MGBDL_CostItmInfoCopy_MC_A.Ins01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			try {
				initBatchLogger(dbTran());
				writeStartLogWithLogger(null);
				execMain();
			}
			catch (Exception ex) {
				handleExWithLogger(ex);
			}
			finally {
				writeEndLogWithLogger(null);
			}
		}

		protected void execMain() {
			callThisChk01();
			throwUpdErr();
			callSrv();
			throwUpdErr();
		}

		protected void callThisChk01() {
			MGBDL_CostItmInfoCopy.Chk01 ope = MGBDL_CostItmInfoCopy.crtChk01();
			MCRow.copyall(ope.up0(), up0());
			ope.exec();
			MCRow.copyvalue(up0(), ope.down0());
		}

		protected void callSrv() {
			getWg();

			if (up0().dtl_flg()) {
				callInsSrvDtl();
			}
			if (up0().oper_flg()) {
				callInsSrvOper();
			}
			if (up0().bom_flg()) {
				callInsSrvBom();
			}
			if (up0().wk_flg()) {
				callInsSrvWk();
			}
			if (up0().purc_flg()) {
				callInsSrvPurc();
			}
			if (up0().proc_flg()) {
				callInsSrvProc();
			}
			if (up0().prov_flg()) {
				callInsSrvProv();
			}
			if (up0().sls_flg()) {
				callInsSrvSls();
			}
		}

		protected void getWg() {
			if (up0().cmn_flg()) {
				MAM_WG_R r = MAM_WG_R.create();
				r.wg_cd(MAC_STR.NULL_VAL.value());
				_wgL.add(r);
			}
			else {
				if (isNull(up0().wg_cd())) {
					executeQuery(_wgL, MGBDL0400_MAM_WG_S01(), up0());
				}
				else {
					for (String wg : MCStringUtil.arrayValueSplit(up0().wg_cd())) {
						MAM_WG_R r = MAM_WG_R.create();
						r.wg_cd(wg);
						_wgL.add(r);
					}
				}
			}
		}

		/**
		 * サービス実行（品目詳細）
		 */
		protected void callInsSrvDtl() {
			try {
				for (MAM_WG_R wgR : _wgL) {
					MGBDL_CopyItmDtlService.CopyItmDtl_Ins01 ope = MGBDL_CopyItmDtlService.crtCopyItmDtl_Ins01();
					copy(ope.up0(), up0(), createMap_CopyItmDtl_Ins01_CndR_Chk01_CndR());
					ope.up0().wg_cd(wgR.wg_cd());
					ope.exec();
				}
			}
			finally {
				dbTran().commit();
			}
		}

		protected Map_CopyItmDtl_Ins01_CndR_Chk01_CndR<CopyItmDtl_Ins01_CndR, Chk01_CndR> createMap_CopyItmDtl_Ins01_CndR_Chk01_CndR() {
			return new Map_CopyItmDtl_Ins01_CndR_Chk01_CndR<CopyItmDtl_Ins01_CndR, Chk01_CndR>();
		}

		public class Map_CopyItmDtl_Ins01_CndR_Chk01_CndR<D extends CopyItmDtl_Ins01_CndR, S extends Chk01_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(CopyItmDtl_Ins01_CndR.$calc_ctg_cd, Chk01_CndR.$calc_ctg_cd);
				addColumnPathMap(CopyItmDtl_Ins01_CndR.$wg_cd, Chk01_CndR.$wg_cd);
				addColumnPathMap(CopyItmDtl_Ins01_CndR.$term, Chk01_CndR.$term);
				addColumnPathMap(CopyItmDtl_Ins01_CndR.$dt, Chk01_CndR.$dt);
				addColumnPathMap(CopyItmDtl_Ins01_CndR.$lump_flg, Chk01_CndR.$lump_flg);
			}
		}

		/**
		 * サービス実行（品目工程）
		 */
		protected void callInsSrvOper() {
			try {
				for (MAM_WG_R wgR : _wgL) {
					MGBDL_CopyItmOperService.CopyItmOper_Ins01 ope = MGBDL_CopyItmOperService.crtCopyItmOper_Ins01();
					copy(ope.up0(), up0(), createMap_CopyItmOper_Ins01_CndR_Chk01_CndR());
					ope.up0().wg_cd(wgR.wg_cd());
					ope.exec();
				}
			}
			finally {
				dbTran().commit();
			}
		}

		protected Map_CopyItmOper_Ins01_CndR_Chk01_CndR<CopyItmOper_Ins01_CndR, Chk01_CndR> createMap_CopyItmOper_Ins01_CndR_Chk01_CndR() {
			return new Map_CopyItmOper_Ins01_CndR_Chk01_CndR<CopyItmOper_Ins01_CndR, Chk01_CndR>();
		}

		public class Map_CopyItmOper_Ins01_CndR_Chk01_CndR<D extends CopyItmOper_Ins01_CndR, S extends Chk01_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(CopyItmOper_Ins01_CndR.$calc_ctg_cd, Chk01_CndR.$calc_ctg_cd);
				addColumnPathMap(CopyItmOper_Ins01_CndR.$wg_cd, Chk01_CndR.$wg_cd);
				addColumnPathMap(CopyItmOper_Ins01_CndR.$term, Chk01_CndR.$term);
				addColumnPathMap(CopyItmOper_Ins01_CndR.$dt, Chk01_CndR.$dt);
				addColumnPathMap(CopyItmOper_Ins01_CndR.$lump_flg, Chk01_CndR.$lump_flg);
			}
		}

		/**
		 * サービス実行（ＢＯＭ）
		 */
		protected void callInsSrvBom() {
			try {
				for (MAM_WG_R wgR : _wgL) {
					MGBDL_CopyBomService.CopyBom_Ins01 ope = MGBDL_CopyBomService.crtCopyBom_Ins01();
					copy(ope.up0(), up0(), createMap_CopyBom_Ins01_CndR_Chk01_CndR());
					ope.up0().wg_cd(wgR.wg_cd());
					ope.exec();
				}
			}
			finally {
				dbTran().commit();
			}
		}

		protected Map_CopyBom_Ins01_CndR_Chk01_CndR<CopyBom_Ins01_CndR, Chk01_CndR> createMap_CopyBom_Ins01_CndR_Chk01_CndR() {
			return new Map_CopyBom_Ins01_CndR_Chk01_CndR<CopyBom_Ins01_CndR, Chk01_CndR>();
		}

		public class Map_CopyBom_Ins01_CndR_Chk01_CndR<D extends CopyBom_Ins01_CndR, S extends Chk01_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(CopyBom_Ins01_CndR.$calc_ctg_cd, Chk01_CndR.$calc_ctg_cd);
				addColumnPathMap(CopyBom_Ins01_CndR.$wg_cd, Chk01_CndR.$wg_cd);
				addColumnPathMap(CopyBom_Ins01_CndR.$term, Chk01_CndR.$term);
				addColumnPathMap(CopyBom_Ins01_CndR.$dt, Chk01_CndR.$dt);
				addColumnPathMap(CopyBom_Ins01_CndR.$lump_flg, Chk01_CndR.$lump_flg);
			}
		}

		/**
		 * サービス実行（品目工数）
		 */
		protected void callInsSrvWk() {
			try {
				for (MAM_WG_R wgR : _wgL) {
					MGBDL_CopyItmWkService.CopyItmWk_Ins01 ope = MGBDL_CopyItmWkService.crtCopyItmWk_Ins01();
					copy(ope.up0(), up0(), createMap_CopyItmWk_Ins01_CndR_Chk01_CndR());
					ope.up0().wg_cd(wgR.wg_cd());
					ope.exec();
				}
			}
			finally {
				dbTran().commit();
			}
		}

		protected Map_CopyItmWk_Ins01_CndR_Chk01_CndR<CopyItmWk_Ins01_CndR, Chk01_CndR> createMap_CopyItmWk_Ins01_CndR_Chk01_CndR() {
			return new Map_CopyItmWk_Ins01_CndR_Chk01_CndR<CopyItmWk_Ins01_CndR, Chk01_CndR>();
		}

		public class Map_CopyItmWk_Ins01_CndR_Chk01_CndR<D extends CopyItmWk_Ins01_CndR, S extends Chk01_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(CopyItmWk_Ins01_CndR.$calc_ctg_cd, Chk01_CndR.$calc_ctg_cd);
				addColumnPathMap(CopyItmWk_Ins01_CndR.$wg_cd, Chk01_CndR.$wg_cd);
				addColumnPathMap(CopyItmWk_Ins01_CndR.$term, Chk01_CndR.$term);
				addColumnPathMap(CopyItmWk_Ins01_CndR.$dt, Chk01_CndR.$dt);
				addColumnPathMap(CopyItmWk_Ins01_CndR.$lump_flg, Chk01_CndR.$lump_flg);
			}
		}

		/**
		 * サービス実行（購買単価）
		 */
		protected void callInsSrvPurc() {
			try {
				for (MAM_WG_R wgR : _wgL) {
					MGBDL_CopyItmPurcService.CopyItmPurc_Ins01 ope = MGBDL_CopyItmPurcService.crtCopyItmPurc_Ins01();
					copy(ope.up0(), up0(), createMap_CopyItmPurc_Ins01_CndR_Chk01_CndR());
					ope.up0().wg_cd(wgR.wg_cd());
					ope.exec();
				}
			}
			finally {
				dbTran().commit();
			}
		}

		protected Map_CopyItmPurc_Ins01_CndR_Chk01_CndR<CopyItmPurc_Ins01_CndR, Chk01_CndR> createMap_CopyItmPurc_Ins01_CndR_Chk01_CndR() {
			return new Map_CopyItmPurc_Ins01_CndR_Chk01_CndR<CopyItmPurc_Ins01_CndR, Chk01_CndR>();
		}

		public class Map_CopyItmPurc_Ins01_CndR_Chk01_CndR<D extends CopyItmPurc_Ins01_CndR, S extends Chk01_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(CopyItmPurc_Ins01_CndR.$calc_ctg_cd, Chk01_CndR.$calc_ctg_cd);
				addColumnPathMap(CopyItmPurc_Ins01_CndR.$wg_cd, Chk01_CndR.$wg_cd);
				addColumnPathMap(CopyItmPurc_Ins01_CndR.$term, Chk01_CndR.$term);
				addColumnPathMap(CopyItmPurc_Ins01_CndR.$dt, Chk01_CndR.$dt);
				addColumnPathMap(CopyItmPurc_Ins01_CndR.$lump_flg, Chk01_CndR.$lump_flg);
			}
		}

		/**
		 * サービス実行（加工単価）
		 */
		protected void callInsSrvProc() {
			try {
				for (MAM_WG_R wgR : _wgL) {
					MGBDL_CopyItmProcService.CopyItmProc_Ins01 ope = MGBDL_CopyItmProcService.crtCopyItmProc_Ins01();
					copy(ope.up0(), up0(), createMap_CopyItmProc_Ins01_CndR_Chk01_CndR());
					ope.up0().wg_cd(wgR.wg_cd());
					ope.exec();
				}
			}
			finally {
				dbTran().commit();
			}
		}

		protected Map_CopyItmProc_Ins01_CndR_Chk01_CndR<CopyItmProc_Ins01_CndR, Chk01_CndR> createMap_CopyItmProc_Ins01_CndR_Chk01_CndR() {
			return new Map_CopyItmProc_Ins01_CndR_Chk01_CndR<CopyItmProc_Ins01_CndR, Chk01_CndR>();
		}

		public class Map_CopyItmProc_Ins01_CndR_Chk01_CndR<D extends CopyItmProc_Ins01_CndR, S extends Chk01_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(CopyItmProc_Ins01_CndR.$calc_ctg_cd, Chk01_CndR.$calc_ctg_cd);
				addColumnPathMap(CopyItmProc_Ins01_CndR.$wg_cd, Chk01_CndR.$wg_cd);
				addColumnPathMap(CopyItmProc_Ins01_CndR.$term, Chk01_CndR.$term);
				addColumnPathMap(CopyItmProc_Ins01_CndR.$dt, Chk01_CndR.$dt);
				addColumnPathMap(CopyItmProc_Ins01_CndR.$lump_flg, Chk01_CndR.$lump_flg);
			}
		}

		/**
		 * サービス実行（支給単価）
		 */
		protected void callInsSrvProv() {
			try {
				for (MAM_WG_R wgR : _wgL) {
					MGBDL_CopyItmProvService.CopyItmProv_Ins01 ope = MGBDL_CopyItmProvService.crtCopyItmProv_Ins01();
					copy(ope.up0(), up0(), createMap_CopyItmProv_Ins01_CndR_Chk01_CndR());
					ope.up0().wg_cd(wgR.wg_cd());
					ope.exec();
				}
			}
			finally {
				dbTran().commit();
			}
		}

		protected Map_CopyItmProv_Ins01_CndR_Chk01_CndR<CopyItmProv_Ins01_CndR, Chk01_CndR> createMap_CopyItmProv_Ins01_CndR_Chk01_CndR() {
			return new Map_CopyItmProv_Ins01_CndR_Chk01_CndR<CopyItmProv_Ins01_CndR, Chk01_CndR>();
		}

		public class Map_CopyItmProv_Ins01_CndR_Chk01_CndR<D extends CopyItmProv_Ins01_CndR, S extends Chk01_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(CopyItmProv_Ins01_CndR.$calc_ctg_cd, Chk01_CndR.$calc_ctg_cd);
				addColumnPathMap(CopyItmProv_Ins01_CndR.$wg_cd, Chk01_CndR.$wg_cd);
				addColumnPathMap(CopyItmProv_Ins01_CndR.$term, Chk01_CndR.$term);
				addColumnPathMap(CopyItmProv_Ins01_CndR.$dt, Chk01_CndR.$dt);
				addColumnPathMap(CopyItmProv_Ins01_CndR.$lump_flg, Chk01_CndR.$lump_flg);
			}
		}

		/**
		 * サービス実行（販売単価）
		 */
		protected void callInsSrvSls() {
			try {
				for (MAM_WG_R wgR : _wgL) {
					MGBDL_CopyItmSlsService.CopyItmSls_Ins01 ope = MGBDL_CopyItmSlsService.crtCopyItmSls_Ins01();
					copy(ope.up0(), up0(), createMap_CopyItmSls_Ins01_CndR_Chk01_CndR());
					ope.up0().wg_cd(wgR.wg_cd());
					ope.exec();
				}
			}
			finally {
				dbTran().commit();
			}
		}

		protected Map_CopyItmSls_Ins01_CndR_Chk01_CndR<CopyItmSls_Ins01_CndR, Chk01_CndR> createMap_CopyItmSls_Ins01_CndR_Chk01_CndR() {
			return new Map_CopyItmSls_Ins01_CndR_Chk01_CndR<CopyItmSls_Ins01_CndR, Chk01_CndR>();
		}

		public class Map_CopyItmSls_Ins01_CndR_Chk01_CndR<D extends CopyItmSls_Ins01_CndR, S extends Chk01_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(CopyItmSls_Ins01_CndR.$calc_ctg_cd, Chk01_CndR.$calc_ctg_cd);
				addColumnPathMap(CopyItmSls_Ins01_CndR.$wg_cd, Chk01_CndR.$wg_cd);
				addColumnPathMap(CopyItmSls_Ins01_CndR.$term, Chk01_CndR.$term);
				addColumnPathMap(CopyItmSls_Ins01_CndR.$dt, Chk01_CndR.$dt);
				addColumnPathMap(CopyItmSls_Ins01_CndR.$lump_flg, Chk01_CndR.$lump_flg);
				addColumnPathMap(CopyItmSls_Ins01_CndR.$sls_upri_imp_typ, Chk01_CndR.$sls_upri_imp_typ);
			}
		}

	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * ワークテーブルの削除を行います。<br>
	 */
	public class Del01 extends MGBDL_CostItmInfoCopy_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			try {
				initBatchLogger(dbTran());
				writeStartLogWithLogger(null);
				execMain();
			}
			catch (Exception ex) {
				handleExWithLogger(ex);
			}
			finally {
				writeEndLogWithLogger(null);
			}
		}

		protected void execMain() {
			callThisChk02();
			throwUpdErr();
			del();
		}

		protected void callThisChk02() {
			MGBDL_CostItmInfoCopy.Chk02 ope = MGBDL_CostItmInfoCopy.crtChk02();
			MCRow.copyall(ope.up0(), up0());
			ope.exec();
		}

		protected void del() {
			if (up0().dtl_flg()) {
				delMain(MGW_IMP_ITM_DTL_R.create("T"));
			}
			if (up0().oper_flg()) {
				delMain(MGW_IMP_ITM_OPER_R.create("T"));
			}
			if (up0().bom_flg()) {
				delMain(MGW_IMP_BOM_R.create("T"));
			}
			if (up0().wk_flg()) {
				delMain(MGW_IMP_ITM_WK_R.create("T"));
			}
			if (up0().purc_flg()) {
				delMain(MGW_IMP_ITM_PURC_R.create("T"));
			}
			if (up0().proc_flg()) {
				delMain(MGW_IMP_ITM_PROC_R.create("T"));
			}
			if (up0().prov_flg()) {
				delMain(MGW_IMP_ITM_PROV_R.create("T"));
			}
			if (up0().sls_flg()) {
				delMain(MGW_IMP_ITM_SLS_R.create("T"));
			}
		}
		protected void delMain(MCDBContainer dbc){
			
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(dbc);
			
			dbc_bldr.addWhereWithAnd(MCQueryApiBuilder.makeEq(dbc.getColumn$("calc_ctg_cd"), bind("calc_ctg_cd")));
			dbc_bldr.addWhereWithAnd(MCQueryApiBuilder.makeGte(dbc.getColumn$("term"), bind("term_fr")));
			dbc_bldr.addWhereWithAnd(MCQueryApiBuilder.makeLte(dbc.getColumn$("term"), bind("term_to")));
			if (up0().cmn_flg()) {
				if (isNullOrNullVal(getSysParm("DEF_WG_CD"))) {
					dbc_bldr.addWhereWithAnd(MCQueryApiBuilder.makeEq(dbc.getColumn$("wg_cd"), value(MAC_STR.NULL_VAL.value())));
				}
				dbc_bldr.buildDelete(createSqlId(LOGIC_ID, dbc_bldr.getBaseDbc(), "D50")).executeUpdate(up0());
			}
			else {
				if (isNull(up0().wg_cd())) {
					MAM_WG_R S0_WG = MAM_WG_R.create("WG");
					MAVM_WR_WG_R S1_W = MAVM_WR_WG_R.create("W");
					dbc_bldr.addWhereWithCutOffAnd(
						exists(subQuery().select(value(1)).from(S0_WG)
							.from(
								S0_WG
								.innerJoin(S1_W).on(S0_WG.wg_cd.eq(S1_W.wg_cd))
							)
							.where(
								value(0).eq(value(0))
								.and(
									value(0).eq(value(1))
									.or(S0_WG.sls_flg.eq(value(true)))
									.or(S0_WG.lg_flg.eq(value(true)))
									.or(S0_WG.mfg_flg.eq(value(true)))
									.or(S0_WG.purc_flg.eq(value(true)))
									.or(S0_WG.sls_flg.eq(value(false)))
									.and(S0_WG.lg_flg.eq(value(false)))
									.and(S0_WG.mfg_flg.eq(value(false)))
									.and(S0_WG.purc_flg.eq(value(false)))
									.and(S0_WG.ar_flg.eq(value(false)))
									.and(S0_WG.ap_flg.eq(value(false)))
									.and(S0_WG.sd_flg.eq(value(false)))
									.and(S0_WG.plm_flg.eq(value(false)))
									.and(MCQueryApiBuilder.makeEq(dbc.getColumn$("wg_cd"), S0_WG.wg_cd))
								)
							)
						)
					);
					dbc_bldr.buildDelete(createSqlId(LOGIC_ID, dbc_bldr.getBaseDbc(), "D50")).executeUpdate(up0());
				}
				else {
					dbc_bldr.addWhereWithCutOffAnd(MCQueryApiBuilder.makeLike(dbc.getColumn$("wg_cd"), bind("wg_cd")));
					dbc_bldr.buildDelete(createSqlId(LOGIC_ID, dbc_bldr.getBaseDbc(), "D50")).executeUpdate(up0());
				}
			}
		}
	}

	//FMCB CUSTOM END
}