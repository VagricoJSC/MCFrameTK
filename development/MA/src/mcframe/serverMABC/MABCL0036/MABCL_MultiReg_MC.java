package mcframe.serverMABC.MABCL0036;

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
import mcframe.serverMABC.MABCL0036.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_MultiReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_MultiReg_MC extends MABCL_MultiReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * GpAlc_UpdChk01オペレーション.<p>
	 *
	 * 汎用配賦分類マスタの登録前のチェックを行います。<br>
	 */
	public class GpAlc_UpdChk01 extends MABCL_MultiReg_MC_A.GpAlc_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(GpAlc_UpdChk01_DtlR row : up0()){
				if (isNotCd(row.gp_alc_cd())){
					msgList.add(new MCMessage(row, GpAlc_UpdChk01_DtlR.$gp_alc_cd, MABCL0306, 
									getLabel(row, GpAlc_UpdChk01_DtlR.$gp_alc_cd), row.gp_alc_cd(), toDispGUIIndex(row)));
					continue;
				}
				if (row.del_flg()) {
					continue ;
				}
				if (row.getBooleanNE("err_flg")) {
					continue;
				}
			}
			return msgList;
		}
	}
	/**
	 * GpAlc_Upd01オペレーション.<p>
	 *
	 * 汎用配賦分類マスタの登録を行います。<br>
	 */
	public class GpAlc_Upd01 extends MABCL_MultiReg_MC_A.GpAlc_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * GpAlcLcl_UpdChk01オペレーション.<p>
	 *
	 * 汎用配賦分類マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	public class GpAlcLcl_UpdChk01 extends MABCL_MultiReg_MC_A.GpAlcLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * GpAlc_DelChk01オペレーション.<p>
	 *
	 * 汎用配賦分類マスタの削除前のチェックを行います。<br>
	 */
	public class GpAlc_DelChk01 extends MABCL_MultiReg_MC_A.GpAlc_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CalcCtg_UpdChk01オペレーション.<p>
	 *
	 * 計算カテゴリマスタの登録前のチェックを行います。<br>
	 */
	public class CalcCtg_UpdChk01 extends MABCL_MultiReg_MC_A.CalcCtg_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(CalcCtg_UpdChk01_DtlR row : up0()){
				if (isNotCd(row.calc_ctg_cd())){
					msgList.add(new MCMessage(row, CalcCtg_UpdChk01_DtlR.$calc_ctg_cd, MABCL0306, 
									getLabel(row, CalcCtg_UpdChk01_DtlR.$calc_ctg_cd), row.calc_ctg_cd(), toDispGUIIndex(row)));
					continue;
				}
				if (row.del_flg()) {
					continue ;
				}
				if (row.getBooleanNE("err_flg")) {
					continue;
				}
			}
			return msgList;
		}
	}
	/**
	 * CalcCtgLcl_UpdChk01オペレーション.<p>
	 *
	 * 計算カテゴリマスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	public class CalcCtgLcl_UpdChk01 extends MABCL_MultiReg_MC_A.CalcCtgLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CalcCtg_DelChk01オペレーション.<p>
	 *
	 * 計算カテゴリマスタの削除前のチェックを行います。<br>
	 */
	public class CalcCtg_DelChk01 extends MABCL_MultiReg_MC_A.CalcCtg_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * RptPtn_UpdChk01オペレーション.<p>
	 *
	 * 原価レポートパタンマスタの登録前のチェックを行います。<br>
	 */
	public class RptPtn_UpdChk01 extends MABCL_MultiReg_MC_A.RptPtn_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(RptPtn_UpdChk01_DtlR row : up0()){
				if (isNotCd(row.rpt_ptn_cd())){
					msgList.add(new MCMessage(row, RptPtn_UpdChk01_DtlR.$rpt_ptn_cd, MABCL0306, 
									getLabel(row, RptPtn_UpdChk01_DtlR.$rpt_ptn_cd), row.rpt_ptn_cd(), toDispGUIIndex(row)));
					continue;
				}
				if (row.del_flg()) {
					continue ;
				}
				if (row.getBooleanNE("err_flg")) {
					continue;
				}
			}
			return msgList;
		}
	}
	/**
	 * RptPtnLcl_UpdChk01オペレーション.<p>
	 *
	 * 原価レポートパタンマスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	public class RptPtnLcl_UpdChk01 extends MABCL_MultiReg_MC_A.RptPtnLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * RptPtn_DelChk01オペレーション.<p>
	 *
	 * 原価レポートパタンマスタの削除前のチェックを行います。<br>
	 */
	public class RptPtn_DelChk01 extends MABCL_MultiReg_MC_A.RptPtn_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CostMenu_UpdChk01オペレーション.<p>
	 *
	 * 原価メニューマスタの登録前のチェックを行います。<br>
	 */
	public class CostMenu_UpdChk01 extends MABCL_MultiReg_MC_A.CostMenu_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(CostMenu_UpdChk01_DtlR row : up0()){
				if (isNotCd(row.menu_cd())){
					msgList.add(new MCMessage(row, CostMenu_UpdChk01_DtlR.$menu_cd, MABCL0306, 
									getLabel(row, CostMenu_UpdChk01_DtlR.$menu_cd), row.menu_cd(), toDispGUIIndex(row)));
					continue;
				}
				if (row.del_flg()) {
					continue ;
				}
				if (row.getBooleanNE("err_flg")) {
					continue;
				}
			}
			return msgList;
		}
	}
	/**
	 * CostMenuLcl_UpdChk01オペレーション.<p>
	 *
	 * 原価メニューマスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	public class CostMenuLcl_UpdChk01 extends MABCL_MultiReg_MC_A.CostMenuLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CostMenu_DelChk01オペレーション.<p>
	 *
	 * 原価メニューマスタの削除前のチェックを行います。<br>
	 */
	public class CostMenu_DelChk01 extends MABCL_MultiReg_MC_A.CostMenu_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * GpAlcLcl_Upd01オペレーション.<p>
	 *
	 * 汎用配賦分類マスタの登録を行います。（ロケール用）<br>
	 */
	public class GpAlcLcl_Upd01 extends MABCL_MultiReg_MC_A.GpAlcLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * GpAlc_Del01オペレーション.<p>
	 *
	 * 汎用配賦分類マスタの削除を行います。<br>
	 */
	public class GpAlc_Del01 extends MABCL_MultiReg_MC_A.GpAlc_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CalcCtg_Upd01オペレーション.<p>
	 *
	 * 計算カテゴリマスタの登録を行います。<br>
	 */
	public class CalcCtg_Upd01 extends MABCL_MultiReg_MC_A.CalcCtg_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CalcCtgLcl_Upd01オペレーション.<p>
	 *
	 * 計算カテゴリマスタの登録を行います。（ロケール用）<br>
	 */
	public class CalcCtgLcl_Upd01 extends MABCL_MultiReg_MC_A.CalcCtgLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CalcCtg_Del01オペレーション.<p>
	 *
	 * 計算カテゴリマスタの削除を行います。<br>
	 */
	public class CalcCtg_Del01 extends MABCL_MultiReg_MC_A.CalcCtg_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * RptPtn_Upd01オペレーション.<p>
	 *
	 * 原価レポートパタンマスタの登録を行います。<br>
	 */
	public class RptPtn_Upd01 extends MABCL_MultiReg_MC_A.RptPtn_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * RptPtnLcl_Upd01オペレーション.<p>
	 *
	 * 原価レポートパタンマスタの登録を行います。（ロケール用）<br>
	 */
	public class RptPtnLcl_Upd01 extends MABCL_MultiReg_MC_A.RptPtnLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * RptPtn_Del01オペレーション.<p>
	 *
	 * 原価レポートパタンマスタの削除を行います。<br>
	 */
	public class RptPtn_Del01 extends MABCL_MultiReg_MC_A.RptPtn_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CostMenu_Upd01オペレーション.<p>
	 *
	 * 原価メニューマスタの登録を行います。<br>
	 */
	public class CostMenu_Upd01 extends MABCL_MultiReg_MC_A.CostMenu_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CostMenuLcl_Upd01オペレーション.<p>
	 *
	 * 原価メニューマスタの登録を行います。（ロケール用）<br>
	 */
	public class CostMenuLcl_Upd01 extends MABCL_MultiReg_MC_A.CostMenuLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CostMenu_Del01オペレーション.<p>
	 *
	 * 原価メニューマスタの削除を行います。<br>
	 */
	public class CostMenu_Del01 extends MABCL_MultiReg_MC_A.CostMenu_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * SiteCo_UpdChk01オペレーション.<p>
	 *
	 * 倉庫事業者マスタの登録前のチェックを行います。<br>
	 */
	public class SiteCo_UpdChk01 extends MABCL_MultiReg_MC_A.SiteCo_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * SiteCo_Upd01オペレーション.<p>
	 *
	 * 倉庫事業者マスタの登録を行います。<br>
	 */
	public class SiteCo_Upd01 extends MABCL_MultiReg_MC_A.SiteCo_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * SiteCoLcl_UpdChk01オペレーション.<p>
	 *
	 * 倉庫事業者マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	public class SiteCoLcl_UpdChk01 extends MABCL_MultiReg_MC_A.SiteCoLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * SiteCoLcl_Upd01オペレーション.<p>
	 *
	 * 倉庫事業者マスタの登録を行います。（ロケール用）<br>
	 */
	public class SiteCoLcl_Upd01 extends MABCL_MultiReg_MC_A.SiteCoLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * SiteCo_DelChk01オペレーション.<p>
	 *
	 * 倉庫事業者マスタの削除前のチェックを行います。<br>
	 */
	public class SiteCo_DelChk01 extends MABCL_MultiReg_MC_A.SiteCo_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * SiteCo_Del01オペレーション.<p>
	 *
	 * 倉庫事業者マスタの削除を行います。<br>
	 */
	public class SiteCo_Del01 extends MABCL_MultiReg_MC_A.SiteCo_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}