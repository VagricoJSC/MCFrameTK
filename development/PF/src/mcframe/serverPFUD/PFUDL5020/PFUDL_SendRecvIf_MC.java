package mcframe.serverPFUD.PFUDL5020;

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
import static mcframe.commonPF.notice.PF_Msg.*;

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
import static mcframe.serverPF.dbc.PFFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverPFUD.PFUDL5020.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverPFUC.PFUCL5010.PFUCL_AppSys.*;
import mcframe.serverPF.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "PFUDL_SendRecvIf"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class PFUDL_SendRecvIf_MC extends PFUDL_SendRecvIf_MC_A{
	//FMCB CUSTOM START
	// ＩＦアダプタマスタを管理するクラス
	mcframe.serverPFUC.PFUCL5010.PFUCL_AppSys.IfAdptrMgr<?> _ifAdptrMgr = crtIfAdptrlMgr();

	/**
	 * Conv01オペレーション.<p>
	 *
	 */
	public class Conv01 extends PFUDL_SendRecvIf_MC_A.Conv01 {
		@Override
		protected void call() {
			// オペレーションの実装
		}
	}
	/**
	 * Conv02オペレーション.<p>
	 *
	 */
	public class Conv02 extends PFUDL_SendRecvIf_MC_A.Conv02 {
		@Override
		protected void call() {
			// オペレーションの実装
		}
	}
	/**
	 * Conv03オペレーション.<p>
	 *
	 */
	public class Conv03 extends PFUDL_SendRecvIf_MC_A.Conv03 {
		@Override
		protected void call() {
			// オペレーションの実装
		}
	}

	//FMCB CUSTOM END
}