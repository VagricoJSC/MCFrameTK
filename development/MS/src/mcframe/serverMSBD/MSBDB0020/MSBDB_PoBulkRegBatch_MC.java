package mcframe.serverMSBD.MSBDB0020;

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
import static mcframe.commonCore.notice.Core_Msg.*;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import mcframe.serverMSBD.MSBDL5290.*;
import mcframe.serverFXUC.FXUCL0170.FXUCL_BeforeAfterValidater;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBDB_PoBulkRegBatch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBDB_PoBulkRegBatch_MC extends MSBDB_PoBulkRegBatch_MC_A{
	//FMCB CUSTOM START

	/**
	 * PoBulkRegBatch_Ins01オペレーション.<p>
	 *
	 * 発注を一括で登録する<br>
	 */
	public class PoBulkRegBatch_Ins01 extends MSBDB_PoBulkRegBatch_MC_A.PoBulkRegBatch_Ins01 {
		/** 処理件数 */
		protected PoBulkReg_Chk01_CntR _cntR;
		/** 例外発生ＦＬＧ **/
		protected boolean _exceptionFlg;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			try {
				initLogger();
				writeStartLog();
				execMain();
			}
			catch (Exception ex) {
				handleEx(ex);
			}
			finally {
				writeEndLog();
			}
		}
		/**
		 * 例外処理
		 */
		protected void handleEx(Exception ex) {
			MCException mcex;
			if (ex instanceof MCException) {
				mcex = (MCException) ex;
			}
			else {
				mcex = new MCException(ex);
			}
			logger().writeProcessLog(mcex);

			_exceptionFlg = true;

			throw mcex;
		}
		/**
		 * 終了ログを出力します。
		 */
		protected void writeEndLog() {
			logger().writeProcessLog(MCMessagePool.getMessageList());

			if (_cntR == null) {
				_cntR = crtCntR();
			}
			if (_exceptionFlg) {
				logger().writeProcessLog(MAUDL0009);
				MCMessagePool.add(MAUDL0009);
				pushErrorLog(logger());
			}
			else if (MCNumber.ZERO.eq(MCNumber.sum(
					_cntR.po_schd_success_cnt()
					, _cntR.po_schd_error_cnt()))) {
				logger().writeProcessLog(MAUDL0008);
				MCMessagePool.add(MAUDL0008);
			}
			logger().writeEndLog(
					MSBDL0402
					, _cntR.total_cnt()
					, _cntR.po_schd_success_cnt()
					, _cntR.po_schd_error_cnt());
			pushEndLog(logger());
			logger().close();
		}

		/**
		 * バッチログを初期化します。
		 */
		protected void initLogger() {
			getConcurrentLogger();
		}
		/**
		 * 開始ログを出力します。
		 */
		protected void writeStartLog() {
			logger().writeStartLog(MSBDL0401);
			pushStartLog(logger());
		}
		/**
		 * メイン処理
		 */
		protected void execMain() {
			_cntR = crtCntR();

			MCMessageList msgL = chkUpParam();
			if (!msgL.isEmpty()) {
				logger().writeProcessLog(msgL);
				throw new MCAppException(msgOpeErr());
			}

			callPoBulkIns();

		}

		/**
		 * 上り電文チェック
		 * @return
		 */
		protected MCMessageList chkUpParam() {
			MCMessageList msgL = new MCMessageList();
			if (isNull(up0().po_schd_dt_to())) {
				up0().po_schd_dt_to(getToday());
			}
			if (!isNullOr(up0().po_schd_dt_fr(), up0().po_schd_dt_to())) {
				FXUCL_BeforeAfterValidater validator = new FXUCL_BeforeAfterValidater();
				validator.setBefore(up0(), PoBulkRegBatch_Ins01_CndR.$po_schd_dt_fr);
				msgL.addAll(check(up0(), new String[] {PoBulkRegBatch_Ins01_CndR.$po_schd_dt_to}, validator));
			}
			up0().addDateColumn("base_dt", getToday());
			if (!isNull(up0().purc_dpt_cd())) {
				MAM_DPT_R m1 = MAM_DPT_R.create("M1");
				MCList<MAVM_USR_DPT_R> usrDptL = MCList.create(MAVM_USR_DPT_R.class);
				MAVM_USR_DPT_R t = MAVM_USR_DPT_R.create("T");
				MCQueryApiBuilder usrDptL_bldr = MCQueryApiBuilder.create(t);
				usrDptL.addStringColumn("wg_cd");
				usrDptL_bldr.addSelect(m1.wg_cd);
				usrDptL_bldr.addInnerJoin(m1, t.dpt_cd.eq(m1.dpt_cd).and(m1.purc_dpt_flg.eq(value(true))).and(bind("base_dt").between(m1.st_dt, m1.end_dt)));
				usrDptL_bldr.addWhereWithAnd(t.dpt_cd.eq(bind("purc_dpt_cd")));
				usrDptL_bldr.addWhereWithAnd(t.del_flg.eq(value(false)));
				if (!isNull(up0().purc_usr_cd())) {
					usrDptL_bldr.addWhereWithAnd(t.usr_cd.eq(bind("purc_usr_cd")));
				}
				usrDptL_bldr.addWhereWithAnd(bind("base_dt").between(t.st_dt, t.end_dt));
				dbSelect("MSBDB0020_MAVM_USR_DPT_S01", usrDptL, usrDptL_bldr, up0());

				if (usrDptL.isEmpty()) {
					if (!isNull(up0().purc_usr_cd())) {
						msgL.add(new MCMessage(MSBDL0404, up0().purc_usr_cd(), up0().purc_dpt_cd()));
					}
					else {
						msgL.add(new MCMessage(MSBDL0403, up0().purc_dpt_cd()));
					}
				}
				else {
					up0().purc_dpt_wg_cd(usrDptL.get(0).getStringNE("wg_cd"));
				}
			}
			else if (!isNull(up0().purc_usr_cd())) {
				MAM_DPT_R m1 = MAM_DPT_R.create("M1");
				// 購買担当者のみが指定されていた場合で、主部門が購買部門の場合、マスタ補完できなかった場合に主部門を購買部門へ補完する
				MAM_USR_ACL_R usrAclR = MAM_USR_ACL_R.create();
				MAM_USR_ACL_R t = MAM_USR_ACL_R.create("T");
				MCQueryApiBuilder usrAclR_bldr = MCQueryApiBuilder.create(t);
				usrAclR.addStringColumn("wg_cd");
				usrAclR_bldr.addSelect(m1.wg_cd);
				usrAclR_bldr.addInnerJoin(m1, t.dpt_cd.eq(m1.dpt_cd).and(m1.purc_dpt_flg.eq(value(true))).and(bind("base_dt").between(m1.st_dt, m1.end_dt)));
				usrAclR_bldr.addWhereWithAnd(t.usr_cd.eq(bind("purc_usr_cd")));
				usrAclR_bldr.addWhereWithAnd(bind("base_dt").between(t.st_dt, t.end_dt));
				usrAclR_bldr.addWhereWithAnd(t.del_flg.eq(value(false)));
				usrAclR_bldr.addWhereWithAnd(m1.del_flg.eq(value(false)));
				dbSelect("MSBDB0020_MAM_USR_ACL_S01", usrAclR, usrAclR_bldr, up0());
				if (!usrAclR.isEmpty()) {
					up0().purc_dpt_cd(usrAclR.dpt_cd());
					up0().purc_dpt_wg_cd(usrAclR.getStringNE("wg_cd"));
				}
			}
			return msgL;
		}

		/**
		 * チェック処理を実行します。
		 */
		protected void callPoBulkIns() {
			MSBDL_PoBulkRegService.PoBulkReg_Ins01 ope = MSBDL_PoBulkRegService.crtPoBulkReg_Ins01();
			copy(ope.up0(), up0(), createMap_PoBulkReg_Chk01_CndR_PoBulkRegBatch_Ins01_CndR());
			ope.exec();
			MCRow.copyall(_cntR, ope.down0());
		}

		/**
		 * 結果行初期化
		 * @return
		 */
		protected PoBulkReg_Chk01_CntR crtCntR() {
			PoBulkReg_Chk01_CntR cntR = PoBulkReg_Chk01_CntR.create();
			cntR.total_cnt(MCNumber.ZERO);
			cntR.po_schd_success_cnt(MCNumber.ZERO);
			cntR.po_schd_error_cnt(MCNumber.ZERO);
			return cntR;
		}

		protected Map_PoBulkReg_Chk01_CndR_PoBulkRegBatch_Ins01_CndR<PoBulkReg_Chk01_CndR,PoBulkRegBatch_Ins01_CndR> createMap_PoBulkReg_Chk01_CndR_PoBulkRegBatch_Ins01_CndR() {
			return new Map_PoBulkReg_Chk01_CndR_PoBulkRegBatch_Ins01_CndR<PoBulkReg_Chk01_CndR, PoBulkRegBatch_Ins01_CndR>();
		}

		public class Map_PoBulkReg_Chk01_CndR_PoBulkRegBatch_Ins01_CndR<D extends PoBulkReg_Chk01_CndR, S extends PoBulkRegBatch_Ins01_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PoBulkReg_Chk01_CndR.$wg_cd, PoBulkRegBatch_Ins01_CndR.$wg_cd);
				addColumnPathMap(PoBulkReg_Chk01_CndR.$sppl_cd, PoBulkRegBatch_Ins01_CndR.$sppl_cd);
				addColumnPathMap(PoBulkReg_Chk01_CndR.$po_schd_dt_fr, PoBulkRegBatch_Ins01_CndR.$po_schd_dt_fr);
				addColumnPathMap(PoBulkReg_Chk01_CndR.$po_schd_dt_to, PoBulkRegBatch_Ins01_CndR.$po_schd_dt_to);
				addColumnPathMap(PoBulkReg_Chk01_CndR.$purc_usr_cd, PoBulkRegBatch_Ins01_CndR.$purc_usr_cd);
				addColumnPathMap(PoBulkReg_Chk01_CndR.$purc_dpt_cd, PoBulkRegBatch_Ins01_CndR.$purc_dpt_cd);
				addColumnPathMap(PoBulkReg_Chk01_CndR.$purc_dpt_wg_cd, PoBulkRegBatch_Ins01_CndR.$purc_dpt_wg_cd);
				addColumnPathMap(PoBulkReg_Chk01_CndR.$prnt_po_flg, PoBulkRegBatch_Ins01_CndR.$prnt_po_flg);
				addColumnPathMap(PoBulkReg_Chk01_CndR.$prnt_dlv_flg, PoBulkRegBatch_Ins01_CndR.$prnt_dlv_flg);
				addColumnPathMap(PoBulkReg_Chk01_CndR.$skip_err_flg, PoBulkRegBatch_Ins01_CndR.$skip_err_flg);
				addColumnPathMap(PoBulkReg_Chk01_CndR.$calc_schd_dt_flg, PoBulkRegBatch_Ins01_CndR.$calc_schd_dt_flg);

			}
		}
	}

	//FMCB CUSTOM END
}