package mcframe.serverMGBB.MGBBB0040;

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
import mcframe.serverMGBB.MGBBL6010.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBBB_PcmExtIfBatch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBBB_PcmExtIfBatch_MC extends MGBBB_PcmExtIfBatch_MC_A{
	//FMCB CUSTOM START

	/**
	 * PcmExtIf_Upd01オペレーション.<p>
	 *
	 * 原価外部ＩＦデータを取り込む。<br>
	 */
	public class PcmExtIf_Upd01 extends MGBBB_PcmExtIfBatch_MC_A.PcmExtIf_Upd01 {

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
			MGBBL_PcmExtIfService.PcmExtIf_Upd01 ope = MGBBL_PcmExtIfService.crtPcmExtIf_Upd01();
			copy(ope.up0(), up0(), createMap_PcmExtIf_Chk01_CndR_PcmExtIf_Upd01_CndR());
			ope.exec();
		}

		protected void postBatch() {
			if (_exceptionFlg || hasErrMsg()) {
				MCMessagePool.clear();
				MCMessagePool.add(new MCMessage(MAUDL0009));
			}
			else {
				if (!isIfDataCreated()) {
					MCMessagePool.clear();
					MCMessagePool.add(new MCMessage(MAUDL0008));
				}
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

		protected Map_PcmExtIf_Chk01_CndR_PcmExtIf_Upd01_CndR<PcmExtIf_Chk01_CndR,PcmExtIf_Upd01_CndR> createMap_PcmExtIf_Chk01_CndR_PcmExtIf_Upd01_CndR() {
			return new Map_PcmExtIf_Chk01_CndR_PcmExtIf_Upd01_CndR<PcmExtIf_Chk01_CndR, PcmExtIf_Upd01_CndR>();
		}

		public class Map_PcmExtIf_Chk01_CndR_PcmExtIf_Upd01_CndR<D extends PcmExtIf_Chk01_CndR, S extends PcmExtIf_Upd01_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PcmExtIf_Chk01_CndR.$ym, PcmExtIf_Upd01_CndR.$ym);
				addColumnPathMap(PcmExtIf_Chk01_CndR.$calc_ctg_cd, PcmExtIf_Upd01_CndR.$calc_ctg_cd);
				addColumnPathMap(PcmExtIf_Chk01_CndR.$wg_cd, PcmExtIf_Upd01_CndR.$wg_cd);
				addColumnPathMap(PcmExtIf_Chk01_CndR.$io_flg, PcmExtIf_Upd01_CndR.$io_flg);
				addColumnPathMap(PcmExtIf_Chk01_CndR.$wk_flg, PcmExtIf_Upd01_CndR.$wk_flg);
				addColumnPathMap(PcmExtIf_Chk01_CndR.$wip_flg, PcmExtIf_Upd01_CndR.$wip_flg);
				addColumnPathMap(PcmExtIf_Chk01_CndR.$stk_flg, PcmExtIf_Upd01_CndR.$stk_flg);
				addColumnPathMap(PcmExtIf_Chk01_CndR.$rerun_flg, PcmExtIf_Upd01_CndR.$rerun_flg);
			}
		}
		
		protected boolean isIfDataCreated() {
			String reqNo = mcframe.serverCore.sys.MCSys.request.serverRequestNo();

			MGT_ACT_MFG_IF_R mfg = MGT_ACT_MFG_IF_R.create("T");
			if (execDbCount("MGBBB0040_MGT_ACT_MFG_IF_S01", mfg, mfg.upd_srv_req_no.eq(bind("1")), reqNo) > 0) {
				return true;
			}
			MGT_ACT_PURC_IF_R purc = MGT_ACT_PURC_IF_R.create("T");
			if (execDbCount("MGBBB0040_MGT_ACT_PURC_IF_S01", purc, purc.upd_srv_req_no.eq(bind("1")), reqNo) > 0) {
				return true;
			}
			MGT_ACT_INPT_IF_R inpt = MGT_ACT_INPT_IF_R.create("T");
			if (execDbCount("MGBBB0040_MGT_ACT_INPT_IF_S01", inpt, inpt.upd_srv_req_no.eq(bind("1")), reqNo) > 0) {
				return true;
			}
			MGT_ACT_IO_IF_R io = MGT_ACT_IO_IF_R.create("T");
			if (execDbCount("MGBBB0040_MGT_ACT_IO_IF_S01", io, io.upd_srv_req_no.eq(bind("1")), reqNo) > 0) {
				return true;
			}
			MGT_ACT_SLS_IF_R sls = MGT_ACT_SLS_IF_R.create("T");
			if (execDbCount("MGBBB0040_MGT_ACT_SLS_IF_S01", sls, sls.upd_srv_req_no.eq(bind("1")), reqNo) > 0) {
				return true;
			}
			MGT_ACT_INST_WK_IF_R instWk = MGT_ACT_INST_WK_IF_R.create("T");
			if (execDbCount("MGBBB0040_MGT_ACT_INST_WK_IF_S01", instWk, instWk.upd_srv_req_no.eq(bind("1")), reqNo) > 0) {
				return true;
			}
			MGT_ACT_OTHER_WK_IF_R otherWk = MGT_ACT_OTHER_WK_IF_R.create("T");
			if (execDbCount("MGBBB0040_MGT_ACT_OTHER_WK_IF_S01", otherWk, otherWk.upd_srv_req_no.eq(bind("1")), reqNo) > 0) {
				return true;
			}
			MGT_ACT_INST_WIP_IF_R instWip = MGT_ACT_INST_WIP_IF_R.create("T");
			if (execDbCount("MGBBB0040_MGT_ACT_INST_WIP_IF_S01", instWip, instWip.upd_srv_req_no.eq(bind("1")), reqNo) > 0) {
				return true;
			}
			MGT_ACT_STK_IF_R stk = MGT_ACT_STK_IF_R.create("T");
			if (execDbCount("MGBBB0040_MGT_ACT_STK_IF_S01", stk, stk.upd_srv_req_no.eq(bind("1")), reqNo) > 0) {
				return true;
			}
			MGT_ITM_MFG_INST_R itmMfgInst = MGT_ITM_MFG_INST_R.create("T");
			if (execDbCount("MGBBB0040_MGT_ITM_MFG_INST_S01", itmMfgInst, itmMfgInst.upd_srv_req_no.eq(bind("1")), reqNo) > 0) {
				return true;
			}
			MGT_INST_OPER_R instOper = MGT_INST_OPER_R.create("T");
			if (execDbCount("MGBBB0040_MGT_INST_OPER_S01", instOper, instOper.upd_srv_req_no.eq(bind("1")), reqNo) > 0) {
				return true;
			}

			return false;
		}
	}

	//FMCB CUSTOM END
}