package mcframe.serverMBBB.MBBBB0030;

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
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import mcframe.serverMB.dbc.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import mcframe.serverMBBB.MBBBL5030.*;
import mcframe.serverMBBB.MBBBL5040.*;
import mcframe.serverMBBB.MBBBL5080.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MBBBB_AutoJnlBatch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MBBBB_AutoJnlBatch_MC extends MBBBB_AutoJnlBatch_MC_A{
	//FMCB CUSTOM START

	/**
	 * AutoJnl_Upd01オペレーション.<p>
	 *
	 * 自動で仕訳を作成する。<br>
	 */
	public class AutoJnl_Upd01 extends MBBBB_AutoJnlBatch_MC_A.AutoJnl_Upd01 {

		/** 例外発生ＦＬＧ **/
		protected boolean _exceptionFlg;
		/**  **/
		protected MCList<MBT_JNL_HISTORY_R> _jnlHisL = null;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			try {
				callAutoJnl();
				if (!isNull(up0().ext_sys_cd()) && isJnlMaked()) {
					callSendAc();
				}
			}
			catch (Exception ex) {
				handleEx(ex);
			}
			finally {
				postBatch();
			}
		}

		protected void callAutoJnl() {
			MBBBL_AutoJnlService.AutoJnl_Upd01 ope = MBBBL_AutoJnlService.crtAutoJnl_Upd01();
			copy(ope.up0(), up0(), createMap_AutoJnl_Chk01_CndR_AutoJnl_Upd01_CndR());
			ope.exec();
		}

		protected void callSendAc() {
			MBBBL_SendAcService.SendAc_Ins01 ope = crtSendAc_Ins01();
			SendAc_Chk01_DtlR destR = ope.up0().createRow();
			copy(destR, _jnlHisL.get(0), createMap_SendAc_Chk01_DtlR_MBT_JNL_HISTORY_R());
			destR.ext_sys_cd(up0().ext_sys_cd());
			ope.up0().add(destR);

			String lgcId = ope.getOperationInfo().logicId;
			String opeId = ope.getOperationID();

			logger().writeStartLog(MAUDL0406, lgcId, opeId);
			ope.exec();
			logger().writeEndLog(MAUDL0407, lgcId, opeId);
		}
		protected  MBBBL_SendAcService.SendAc_Ins01 crtSendAc_Ins01() {
			if (isSAP()) {
				return MBBBL_SapSendAcService.crtSendAc_Ins01();
			}
			else {
				return MBBBL_SendAcService.crtSendAc_Ins01();
			}
		}
		protected boolean isSAP() {
			MAM_EXT_SYS_R rsltR = MAM_EXT_SYS_R.create();
			dbSelectKey("MBBBB0030_MAM_EXT_SYS_S01", rsltR, rsltR, up0());
			if (MAC_EXT_SYS_TYP.isAC_SAP(rsltR.ext_sys_typ())) {
				return true;
			}
			return false;
		}

		protected boolean isJnlMaked() {
			_jnlHisL = MCList.create(MBT_JNL_HISTORY_R.class);
			MBT_JNL_HISTORY_R t = MBT_JNL_HISTORY_R.create("T");
			MCQueryApiBuilder jnlHisL_bldr = MCQueryApiBuilder.create(t);
			jnlHisL_bldr.setSelect(t.jnl_grp_no, t.data_typ, t.jnl_rmrks, t.upd_cntr);
			jnlHisL_bldr.setWhere(t.upd_srv_req_no.eq(bind("1")), mcframe.serverCore.sys.MCSys.request.serverRequestNo());
			jnlHisL_bldr.setOrderByDesc(t.jnl_grp_no);
			dbSelect("MBBBB0030_MBT_JNL_HISTORY_S01", _jnlHisL, jnlHisL_bldr);
			setPegNo(_jnlHisL);
			return !_jnlHisL.isEmpty() && MAC_DATA_TYP.isJNL_MK(_jnlHisL.get(0).data_typ());
		}

		protected void postBatch() {
			if (_exceptionFlg) {
				MCMessagePool.clear();
				MCMessagePool.add(new MCMessage(MAUDL0009));
			}
			else {
				String reqNo = mcframe.serverCore.sys.MCSys.request.serverRequestNo();
				MBT_JOURNAL_R t = MBT_JOURNAL_R.create("T");
				if (execDbCount("MBBBB0030_MBT_JOURNAL_S01", t, t.upd_srv_req_no.eq(bind("1")), reqNo) == 0) {
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

		protected Map_AutoJnl_Chk01_CndR_AutoJnl_Upd01_CndR<AutoJnl_Chk01_CndR,AutoJnl_Upd01_CndR> createMap_AutoJnl_Chk01_CndR_AutoJnl_Upd01_CndR() {
			return new Map_AutoJnl_Chk01_CndR_AutoJnl_Upd01_CndR<AutoJnl_Chk01_CndR, AutoJnl_Upd01_CndR>();
		}

		public class Map_AutoJnl_Chk01_CndR_AutoJnl_Upd01_CndR<D extends AutoJnl_Chk01_CndR, S extends AutoJnl_Upd01_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(AutoJnl_Chk01_CndR.$ac_ym, AutoJnl_Upd01_CndR.$ac_ym);
				addColumnPathMap(AutoJnl_Chk01_CndR.$dt_fr, AutoJnl_Upd01_CndR.$dt_fr);
				addColumnPathMap(AutoJnl_Chk01_CndR.$dt_to, AutoJnl_Upd01_CndR.$dt_to);
				addColumnPathMap(AutoJnl_Chk01_CndR.$ac_slip_dt, AutoJnl_Upd01_CndR.$ac_slip_dt);
				addColumnPathMap(AutoJnl_Chk01_CndR.$jnl_act_cd, AutoJnl_Upd01_CndR.$jnl_act_cd);
				addColumnPathMap(AutoJnl_Chk01_CndR.$wg_cd, AutoJnl_Upd01_CndR.$wg_cd);
				addColumnPathMap(AutoJnl_Chk01_CndR.$rerun_flg, AutoJnl_Upd01_CndR.$rerun_flg);
				addColumnPathMap(AutoJnl_Chk01_CndR.$jnl_rmrks, AutoJnl_Upd01_CndR.$jnl_rmrks);
				addColumnPathMap(AutoJnl_Chk01_CndR.$err_flg, AutoJnl_Upd01_CndR.$err_flg);
			}
		}

		protected Map_SendAc_Chk01_DtlR_MBT_JNL_HISTORY_R<SendAc_Chk01_DtlR,MBT_JNL_HISTORY_R> createMap_SendAc_Chk01_DtlR_MBT_JNL_HISTORY_R() {
			return new Map_SendAc_Chk01_DtlR_MBT_JNL_HISTORY_R<SendAc_Chk01_DtlR, MBT_JNL_HISTORY_R>();
		}

		public class Map_SendAc_Chk01_DtlR_MBT_JNL_HISTORY_R<D extends SendAc_Chk01_DtlR, S extends MBT_JNL_HISTORY_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SendAc_Chk01_DtlR.$jnl_grp_no, MBT_JNL_HISTORY_R.$jnl_grp_no);
				addColumnPathMap(SendAc_Chk01_DtlR.$data_typ, MBT_JNL_HISTORY_R.$data_typ);
				addColumnPathMap(SendAc_Chk01_DtlR.$jnl_rmrks, MBT_JNL_HISTORY_R.$jnl_rmrks);
				addColumnPathMap(SendAc_Chk01_DtlR.$upd_cntr, MBT_JNL_HISTORY_R.$upd_cntr);
			}
		}

	}

	//FMCB CUSTOM END
}