package mcframe.serverMBBB.MBBBB0060;

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
import mcframe.serverMBBB.MBBBL5060.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MBBBB_SendAcMstBatch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MBBBB_SendAcMstBatch_MC extends MBBBB_SendAcMstBatch_MC_A{
	//FMCB CUSTOM START

	/**
	 * SendAcMst_Upd01オペレーション.<p>
	 *
	 * 会計マスタ情報を送信する。<br>
	 */
	public class SendAcMst_Upd01 extends MBBBB_SendAcMstBatch_MC_A.SendAcMst_Upd01 {

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
			MBBBL_SendAcMstService.SendAcMst_Upd01 ope = MBBBL_SendAcMstService.crtSendAcMst_Upd01();
			copy(ope.up0(), up0(), createMap_SendAcMst_Chk01_CndR_SendAcMst_Upd01_CndR());
			ope.exec();
		}

		protected void postBatch() {

			if (_exceptionFlg) {
				MCMessagePool.clear();
				MCMessagePool.add(new MCMessage(MAUDL0009));
			}
			else {
				String reqNo = mcframe.serverCore.sys.MCSys.request.serverRequestNo();
				MBT_BP_SND_IF_R t = MBT_BP_SND_IF_R.create("T");
				if (execDbCount("MBBBB0060_MBT_BP_SND_IF_S01", t, t.upd_srv_req_no.eq(bind("1")),
						reqNo) == 0) {
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

		protected Map_SendAcMst_Chk01_CndR_SendAcMst_Upd01_CndR<SendAcMst_Chk01_CndR,SendAcMst_Upd01_CndR> createMap_SendAcMst_Chk01_CndR_SendAcMst_Upd01_CndR() {
			return new Map_SendAcMst_Chk01_CndR_SendAcMst_Upd01_CndR<SendAcMst_Chk01_CndR, SendAcMst_Upd01_CndR>();
		}

		public class Map_SendAcMst_Chk01_CndR_SendAcMst_Upd01_CndR<D extends SendAcMst_Chk01_CndR, S extends SendAcMst_Upd01_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SendAcMst_Chk01_CndR.$master_typ, SendAcMst_Upd01_CndR.$master_typ);
				addColumnPathMap(SendAcMst_Chk01_CndR.$ext_sys_cd, SendAcMst_Upd01_CndR.$ext_sys_cd);
				addColumnPathMap(SendAcMst_Chk01_CndR.$err_flg, SendAcMst_Upd01_CndR.$err_flg);
			}
		}

	}

	//FMCB CUSTOM END
}