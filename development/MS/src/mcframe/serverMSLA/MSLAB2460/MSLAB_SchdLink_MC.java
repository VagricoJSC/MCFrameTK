package mcframe.serverMSLA.MSLAB2460;

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
import mcframe.serverMSLA.MSLAL9970.*;
import mcframe.serverMSLA.MSLAL9980.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSLAB_SchdLink"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSLAB_SchdLink_MC extends MSLAB_SchdLink_MC_A{
	//FMCB CUSTOM START

	/**
	 * Send_Upd01オペレーション.<p>
	 *
	 * スケジューラＩＦファイル送信を実行する<br>
	 */
	public class Send_Upd01 extends MSLAB_SchdLink_MC_A.Send_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			MSLAL_SchdLinkService.Send_Upd01 ope = MSLAL_SchdLinkService.crtSend_Upd01();
			copy(ope.up0(), up0(), createMap_Link_DtlR_Send_Upd01_DtlR());
			ope.exec();
		}
		
		protected Map_Send_DtlR_Send_Upd01_DtlR<Link_DtlR,Send_Upd01_DtlR> createMap_Link_DtlR_Send_Upd01_DtlR() {
			return new Map_Send_DtlR_Send_Upd01_DtlR<Link_DtlR, Send_Upd01_DtlR>();
		}
		
		public class Map_Send_DtlR_Send_Upd01_DtlR<D extends Link_DtlR, S extends Send_Upd01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Link_DtlR.$if_proc_typ, Send_Upd01_DtlR.$if_proc_typ);
				addColumnPathMap(Link_DtlR.$ext_sys_cd, Send_Upd01_DtlR.$ext_sys_cd);
				addColumnPathMap(Link_DtlR.$if_scheduler_typ, Send_Upd01_DtlR.$if_scheduler_typ);
			}
		}
	}
	/**
	 * Recv_Upd01オペレーション.<p>
	 *
	 * スケジューラＩＦファイル受信を実行する<br>
	 */
	public class Recv_Upd01 extends MSLAB_SchdLink_MC_A.Recv_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			MSLAL_SchdLinkService.Recv_Upd01 ope = MSLAL_SchdLinkService.crtRecv_Upd01();
			copy(ope.up0(), up0(), createMap_Link_DtlR_Recv_Upd01_DtlR());
			ope.exec();
		}
		
		protected Map_Link_DtlR_Recv_Upd01_DtlR<Link_DtlR,Recv_Upd01_DtlR> createMap_Link_DtlR_Recv_Upd01_DtlR() {
			return new Map_Link_DtlR_Recv_Upd01_DtlR<Link_DtlR, Recv_Upd01_DtlR>();
		}
		
		public class Map_Link_DtlR_Recv_Upd01_DtlR<D extends Link_DtlR, S extends Recv_Upd01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Link_DtlR.$if_proc_typ, Recv_Upd01_DtlR.$if_proc_typ);
				addColumnPathMap(Link_DtlR.$ext_sys_cd, Recv_Upd01_DtlR.$ext_sys_cd);
				addColumnPathMap(Link_DtlR.$if_scheduler_typ, Recv_Upd01_DtlR.$if_scheduler_typ);
			}
		}
	}

	//FMCB CUSTOM END
}