package mcframe.serverMBBE.MBBEB0010;

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
import mcframe.serverMBBE.MBBEL5020.MBBEL_SendExtMstService;
import mcframe.serverMBBE.MBBEL5020.SendExtMst_Chk01_CndR;
//FMCB CUSTOM_IMPORT END

/**
 * "MBBEB_ExtMstBatch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MBBEB_ExtMstBatch_MC extends MBBEB_ExtMstBatch_MC_A{
	//FMCB CUSTOM START

	/**
	 * SendExtMst_Ins01オペレーション.<p>
	 *
	 * 外部マスタ送信を行う。<br>
	 */
	public class SendExtMst_Ins01 extends MBBEB_ExtMstBatch_MC_A.SendExtMst_Ins01 {
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
			MBBEL_SendExtMstService.SendExtMst_Ins01 ope = MBBEL_SendExtMstService.crtSendExtMst_Ins01();
			copy(ope.up0(), up0(), createMap_SendExtMst_Chk01_CndR_SendExtMst_Upd01_CndR());
			ope.exec();
		}

		protected void postBatch() {
			int dbCount = 0;
			if (_exceptionFlg) {
				MCMessagePool.clear();
				MCMessagePool.add(new MCMessage(MAUDL0009));
			}
			else {
				String reqNo = mcframe.serverCore.sys.MCSys.request.serverRequestNo();
				if (MAC_EXT_MASTER_TYP.isCST_BP(up0().ext_master_typ())
				 || MAC_EXT_MASTER_TYP.isDLV_BP(up0().ext_master_typ())
				 || MAC_EXT_MASTER_TYP.isDEST_BP(up0().ext_master_typ())
				 || MAC_EXT_MASTER_TYP.isSPPL_BP(up0().ext_master_typ())) {
					MBT_BP_SND_IF_EXT_R t = MBT_BP_SND_IF_EXT_R.create("T");

					dbCount = execDbCount("MBBEB0010_MBT_BP_SND_IF_EXT_S01", t, t.upd_srv_req_no.eq(bind("1")), reqNo);
				}
				else if (MAC_EXT_MASTER_TYP.isPROD_ITM(up0().ext_master_typ())
				 || MAC_EXT_MASTER_TYP.isOTHER_ITM(up0().ext_master_typ())
				 || MAC_EXT_MASTER_TYP.isGOODS_ITM(up0().ext_master_typ())
				 || MAC_EXT_MASTER_TYP.isWIP_ITM(up0().ext_master_typ())
				 || MAC_EXT_MASTER_TYP.isPARTS_ITM(up0().ext_master_typ())
				 || MAC_EXT_MASTER_TYP.isMATE_ITM(up0().ext_master_typ())
				 || MAC_EXT_MASTER_TYP.isRAWMATE_ITM(up0().ext_master_typ())) {
					MBT_ITM_SND_IF_R t = MBT_ITM_SND_IF_R.create("T");

					dbCount = execDbCount("MBBEB0010_MBT_ITM_SND_IF_S01", t, t.upd_srv_req_no.eq(bind("1")), reqNo);
				}
				else if (MAC_EXT_MASTER_TYP.isBP_STOP(up0().ext_master_typ())) {
					MBT_BP_STOP_SND_IF_R t = MBT_BP_STOP_SND_IF_R.create("T");

					dbCount = execDbCount("MBBEB0010_MBT_BP_STOP_SND_IF_S01", t, t.upd_srv_req_no.eq(bind("1")), reqNo);
				}
				else if (MAC_EXT_MASTER_TYP.isITM_STOP(up0().ext_master_typ())) {
					MBT_ITM_STOP_SND_IF_R t = MBT_ITM_STOP_SND_IF_R.create("T");

					dbCount = execDbCount("MBBEB0010_MBT_ITM_STOP_SND_IF_S01", t, t.upd_srv_req_no.eq(bind("1")), reqNo);
				}
				else if (MAC_EXT_MASTER_TYP.isEX_CTRL(up0().ext_master_typ())) {
					MBT_EX_CTRL_SND_IF_R t = MBT_EX_CTRL_SND_IF_R.create("T");

					dbCount = execDbCount("MBBEB0010_MBT_EX_CTRL_SND_IF_S01", t, t.upd_srv_req_no.eq(bind("1")), reqNo);
				}
				if (dbCount == 0) {
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

		protected Map_SendExtMst_Chk01_CndR_SendExtMst_Ins01_CndR<SendExtMst_Chk01_CndR,SendExtMst_Ins01_CndR> createMap_SendExtMst_Chk01_CndR_SendExtMst_Upd01_CndR() {
			return new Map_SendExtMst_Chk01_CndR_SendExtMst_Ins01_CndR<SendExtMst_Chk01_CndR, SendExtMst_Ins01_CndR>();
		}

		public class Map_SendExtMst_Chk01_CndR_SendExtMst_Ins01_CndR<D extends SendExtMst_Chk01_CndR, S extends SendExtMst_Ins01_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SendExtMst_Chk01_CndR.$ext_master_typ, SendExtMst_Ins01_CndR.$ext_master_typ);
				addColumnPathMap(SendExtMst_Chk01_CndR.$ext_sys_cd, SendExtMst_Ins01_CndR.$ext_sys_cd);
				addColumnPathMap(SendExtMst_Chk01_CndR.$err_flg, SendExtMst_Ins01_CndR.$err_flg);
			}
		}
	}

	//FMCB CUSTOM END
}