package mcframe.serverMABC.MABCL1700;

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
import mcframe.serverMABC.MABCL1700.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_StrgTgtReportReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_StrgTgtReportReg_MC extends MABCL_StrgTgtReportReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * StrgTgtReport_UpdChk01オペレーション.<p>
	 *
	 * 保存対象帳票マスタを登録する前のチェックを行う<br>
	 */
	public class StrgTgtReport_UpdChk01 extends MABCL_StrgTgtReportReg_MC_A.StrgTgtReport_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			mcframe.serverCore.report.MCServerReportDefine rd = new
					mcframe.serverCore.report.MCServerReportDefine();
			for(StrgTgtReport_UpdChk01_DtlR r : up0()){
				String[] id = rd.getId(r.report_id());
				if(id == null) {
					msgList.add(new MCMessage(r, StrgTgtReport_UpdChk01_DtlR.$report_id, MABCL0654, toDispGUIIndex(r)));				
				}
			}
			return msgList;
		}
	}
	/**
	 * StrgTgtReport_Upd01オペレーション.<p>
	 *
	 * 保存対象帳票マスタを登録する<br>
	 */
	public class StrgTgtReport_Upd01 extends MABCL_StrgTgtReportReg_MC_A.StrgTgtReport_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * StrgTgtReport_DelChk01オペレーション.<p>
	 *
	 * 保存対象帳票マスタを削除する前のチェックを行う<br>
	 */
	public class StrgTgtReport_DelChk01 extends MABCL_StrgTgtReportReg_MC_A.StrgTgtReport_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * StrgTgtReport_Del01オペレーション.<p>
	 *
	 * 保存対象帳票マスタを削除する<br>
	 */
	public class StrgTgtReport_Del01 extends MABCL_StrgTgtReportReg_MC_A.StrgTgtReport_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 検索処理を行う<br>
	 */
	public class Srch01 extends MABCL_StrgTgtReportReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void down_SELECT_c0_0(MCList<Srch01_Rslt1R> dest,
				MCList<MAM_STRG_TGT_REPORT_R> src) {
			super.down_SELECT_c0_0(dest, src);
			mcframe.serverCore.report.MCServerReportDefine rd = new
					mcframe.serverCore.report.MCServerReportDefine();
			for (Srch01_Rslt1R r : dest) {
				String[] id = rd.getId(r.report_id());
				if (id != null) {
					r.report_nm(rd.getReportName(id[0], r.report_id()));
				}
			}
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 削除処理を行う<br>
	 */
	public class Del01 extends MABCL_StrgTgtReportReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 登録処理を行う<br>
	 */
	public class Upd01 extends MABCL_StrgTgtReportReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}