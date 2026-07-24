package mcframe.serverMABG.MABGL0750;

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

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMABG.MABGL0750.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MABGL_CostReportReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABGL_CostReportReg_MC extends MABGL_CostReportReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * CostReport_DelChk01オペレーション.<p>
	 *
	 * 原価帳票マスタの削除前のチェックを行います。<br>
	 */
	public class CostReport_DelChk01 extends MABGL_CostReportReg_MC_A.CostReport_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CostReport_Del01オペレーション.<p>
	 *
	 * 原価帳票マスタの削除を行います。<br>
	 */
	public class CostReport_Del01 extends MABGL_CostReportReg_MC_A.CostReport_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 原価帳票マスタの削除を行います。<br>
	 */
	public class Del01 extends MABGL_CostReportReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CostReport_UpdChk01オペレーション.<p>
	 *
	 * 原価帳票マスタの登録前のチェックを行います。<br>
	 */
	public class CostReport_UpdChk01 extends MABGL_CostReportReg_MC_A.CostReport_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();

			for(CostReport_UpdChk01_DtlR r : up0()){

				if ((mcframe.serverCore.resource.MCConst.repotlbl.containsKey(mcframe.serverCore.resource.MCConst.createKey("MG", r.report_id(), "label"))) == false) {
					msgList.add(new MCMessage(r, CostReport_UpdChk01_DtlR.$report_id, MABGL0031, toDispGUIIndex(r)));
				}
			}
			return msgList;
		}
	}
	/**
	 * CostReport_Upd01オペレーション.<p>
	 *
	 * 原価帳票マスタの登録を行います。<br>
	 */
	public class CostReport_Upd01 extends MABGL_CostReportReg_MC_A.CostReport_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 原価帳票マスタの登録を行います。<br>
	 */
	public class Upd01 extends MABGL_CostReportReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 原価帳票マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABGL_CostReportReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void down_SELECT_c0_0(MCList<Srch01_Rslt1R> dest,
				MCList<MAM_COST_REPORT_R> src) {
			super.down_SELECT_c0_0(dest, src);
			mcframe.serverCore.report.MCServerReportDefine rd = new
					mcframe.serverCore.report.MCServerReportDefine();
			for (Srch01_Rslt1R r : dest) {
				r.report_nm(rd.getReportName("MG", r.report_id()));
			}
		}
	}

	//FMCB CUSTOM END
}