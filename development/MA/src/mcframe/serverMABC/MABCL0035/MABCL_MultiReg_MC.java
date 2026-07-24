package mcframe.serverMABC.MABCL0035;

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
import mcframe.serverMABC.MABCL0035.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_MultiReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_MultiReg_MC extends MABCL_MultiReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * JnlPtnBase_UpdChk01オペレーション.<p>
	 *
	 * 仕訳パタンマスタの登録前のチェックを行います。<br>
	 */
	public class JnlPtnBase_UpdChk01 extends MABCL_MultiReg_MC_A.JnlPtnBase_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(JnlPtnBase_UpdChk01_DtlR row : up0()){
				if (isNotCd(row.jnl_ptn_cd())){
					msgList.add(new MCMessage(row, JnlPtnBase_UpdChk01_DtlR.$jnl_ptn_cd, MABCL0306, 
									getLabel(row, JnlPtnBase_UpdChk01_DtlR.$jnl_ptn_cd), row.jnl_ptn_cd(), toDispGUIIndex(row)));
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
	 * JnlPtnBase_Upd01オペレーション.<p>
	 *
	 * 仕訳パタンマスタの登録を行います。<br>
	 */
	public class JnlPtnBase_Upd01 extends MABCL_MultiReg_MC_A.JnlPtnBase_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * JnlPtnBaseLcl_UpdChk01オペレーション.<p>
	 *
	 * 仕訳パタンマスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	public class JnlPtnBaseLcl_UpdChk01 extends MABCL_MultiReg_MC_A.JnlPtnBaseLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * JnlPtnBaseLcl_Upd01オペレーション.<p>
	 *
	 * 仕訳パタンマスタの登録を行います。（ロケール用）<br>
	 */
	public class JnlPtnBaseLcl_Upd01 extends MABCL_MultiReg_MC_A.JnlPtnBaseLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * JnlPtnBase_DelChk01オペレーション.<p>
	 *
	 * 仕訳パタンマスタの削除前のチェックを行います。<br>
	 */
	public class JnlPtnBase_DelChk01 extends MABCL_MultiReg_MC_A.JnlPtnBase_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * JnlPtnBase_Del01オペレーション.<p>
	 *
	 * 仕訳パタンマスタの削除を行います。<br>
	 */
	public class JnlPtnBase_Del01 extends MABCL_MultiReg_MC_A.JnlPtnBase_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AutoJnlKey_UpdChk01オペレーション.<p>
	 *
	 * 自動仕訳キーマスタの登録前のチェックを行います。<br>
	 */
	public class AutoJnlKey_UpdChk01 extends MABCL_MultiReg_MC_A.AutoJnlKey_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(AutoJnlKey_UpdChk01_DtlR row : up0()){
				if (isNotCd(row.auto_jnl_key_cd())){
					msgList.add(new MCMessage(row, AutoJnlKey_UpdChk01_DtlR.$auto_jnl_key_cd, MABCL0306, 
									getLabel(row, AutoJnlKey_UpdChk01_DtlR.$auto_jnl_key_cd), row.auto_jnl_key_cd(), toDispGUIIndex(row)));
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
	 * AutoJnlKey_Upd01オペレーション.<p>
	 *
	 * 自動仕訳キーマスタの登録を行います。<br>
	 */
	public class AutoJnlKey_Upd01 extends MABCL_MultiReg_MC_A.AutoJnlKey_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AutoJnlKeyLcl_UpdChk01オペレーション.<p>
	 *
	 * 自動仕訳キーマスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	public class AutoJnlKeyLcl_UpdChk01 extends MABCL_MultiReg_MC_A.AutoJnlKeyLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AutoJnlKeyLcl_Upd01オペレーション.<p>
	 *
	 * 自動仕訳キーマスタの登録を行います。（ロケール用）<br>
	 */
	public class AutoJnlKeyLcl_Upd01 extends MABCL_MultiReg_MC_A.AutoJnlKeyLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AutoJnlKey_DelChk01オペレーション.<p>
	 *
	 * 自動仕訳キーマスタの削除前のチェックを行います。<br>
	 */
	public class AutoJnlKey_DelChk01 extends MABCL_MultiReg_MC_A.AutoJnlKey_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AutoJnlKey_Del01オペレーション.<p>
	 *
	 * 自動仕訳キーマスタの削除を行います。<br>
	 */
	public class AutoJnlKey_Del01 extends MABCL_MultiReg_MC_A.AutoJnlKey_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * InspPtn_UpdChk01オペレーション.<p>
	 *
	 * 検査パタンマスタの登録前のチェックを行います。<br>
	 */
	public class InspPtn_UpdChk01 extends MABCL_MultiReg_MC_A.InspPtn_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(InspPtn_UpdChk01_DtlR row : up0()){
				if (isNotCd(row.insp_ptn_cd())){
					msgList.add(new MCMessage(row, InspPtn_UpdChk01_DtlR.$insp_ptn_cd, MABCL0306, 
									getLabel(row, InspPtn_UpdChk01_DtlR.$insp_ptn_cd), row.insp_ptn_cd(), toDispGUIIndex(row)));
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
	 * InspPtn_Upd01オペレーション.<p>
	 *
	 * 検査パタンマスタの登録を行います。<br>
	 */
	public class InspPtn_Upd01 extends MABCL_MultiReg_MC_A.InspPtn_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * InspPtnLcl_UpdChk01オペレーション.<p>
	 *
	 * 検査パタンマスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	public class InspPtnLcl_UpdChk01 extends MABCL_MultiReg_MC_A.InspPtnLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * InspPtnLcl_Upd01オペレーション.<p>
	 *
	 * 検査パタンマスタの登録を行います。（ロケール用）<br>
	 */
	public class InspPtnLcl_Upd01 extends MABCL_MultiReg_MC_A.InspPtnLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * InspPtn_DelChk01オペレーション.<p>
	 *
	 * 検査パタンマスタの削除前のチェックを行います。<br>
	 */
	public class InspPtn_DelChk01 extends MABCL_MultiReg_MC_A.InspPtn_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * InspPtn_Del01オペレーション.<p>
	 *
	 * 検査パタンマスタの削除を行います。<br>
	 */
	public class InspPtn_Del01 extends MABCL_MultiReg_MC_A.InspPtn_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * WkDay_UpdChk01オペレーション.<p>
	 *
	 * 勤務種類マスタの登録前のチェックを行います。<br>
	 */
	public class WkDay_UpdChk01 extends MABCL_MultiReg_MC_A.WkDay_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(WkDay_UpdChk01_DtlR row : up0()){
				if (isNotCd(row.wk_day_cd())){
					msgList.add(new MCMessage(row, WkDay_UpdChk01_DtlR.$wk_day_cd, MABCL0306, 
									getLabel(row, WkDay_UpdChk01_DtlR.$wk_day_cd), row.wk_day_cd(), toDispGUIIndex(row)));
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
	 * WkDay_Upd01オペレーション.<p>
	 *
	 * 勤務種類マスタの登録を行います。<br>
	 */
	public class WkDay_Upd01 extends MABCL_MultiReg_MC_A.WkDay_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * WkDayLcl_UpdChk01オペレーション.<p>
	 *
	 * 勤務種類マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	public class WkDayLcl_UpdChk01 extends MABCL_MultiReg_MC_A.WkDayLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * WkDayLcl_Upd01オペレーション.<p>
	 *
	 * 勤務種類マスタの登録を行います。（ロケール用）<br>
	 */
	public class WkDayLcl_Upd01 extends MABCL_MultiReg_MC_A.WkDayLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * WkDay_DelChk01オペレーション.<p>
	 *
	 * 勤務種類マスタの削除前のチェックを行います。<br>
	 */
	public class WkDay_DelChk01 extends MABCL_MultiReg_MC_A.WkDay_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * WkDay_Del01オペレーション.<p>
	 *
	 * 勤務種類マスタの削除を行います。<br>
	 */
	public class WkDay_Del01 extends MABCL_MultiReg_MC_A.WkDay_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ShipTerm_UpdChk01オペレーション.<p>
	 *
	 * 出荷条件マスタの登録前のチェックを行います。<br>
	 */
	public class ShipTerm_UpdChk01 extends MABCL_MultiReg_MC_A.ShipTerm_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(ShipTerm_UpdChk01_DtlR row : up0()){
				if (isNotCd(row.ship_term_cd())){
					msgList.add(new MCMessage(row, ShipTerm_UpdChk01_DtlR.$ship_term_cd, MABCL0306, 
									getLabel(row, ShipTerm_UpdChk01_DtlR.$ship_term_cd), row.ship_term_cd(), toDispGUIIndex(row)));
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
	 * ShipTerm_Upd01オペレーション.<p>
	 *
	 * 出荷条件マスタの登録を行います。<br>
	 */
	public class ShipTerm_Upd01 extends MABCL_MultiReg_MC_A.ShipTerm_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ShipTermLcl_UpdChk01オペレーション.<p>
	 *
	 * 出荷条件マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	public class ShipTermLcl_UpdChk01 extends MABCL_MultiReg_MC_A.ShipTermLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ShipTermLcl_Upd01オペレーション.<p>
	 *
	 * 出荷条件マスタの登録を行います。（ロケール用）<br>
	 */
	public class ShipTermLcl_Upd01 extends MABCL_MultiReg_MC_A.ShipTermLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ShipTerm_DelChk01オペレーション.<p>
	 *
	 * 出荷条件マスタの削除前のチェックを行います。<br>
	 */
	public class ShipTerm_DelChk01 extends MABCL_MultiReg_MC_A.ShipTerm_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ShipTerm_Del01オペレーション.<p>
	 *
	 * 出荷条件マスタの削除を行います。<br>
	 */
	public class ShipTerm_Del01 extends MABCL_MultiReg_MC_A.ShipTerm_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ShipWk_UpdChk01オペレーション.<p>
	 *
	 * 出荷作業マスタの登録前のチェックを行います。<br>
	 */
	public class ShipWk_UpdChk01 extends MABCL_MultiReg_MC_A.ShipWk_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(ShipWk_UpdChk01_DtlR row : up0()){
				if (isNotCd(row.ship_wk_cd())){
					msgList.add(new MCMessage(row, ShipWk_UpdChk01_DtlR.$ship_wk_cd, MABCL0306, 
									getLabel(row, ShipWk_UpdChk01_DtlR.$ship_wk_cd), row.ship_wk_cd(), toDispGUIIndex(row)));
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
	 * ShipWk_Upd01オペレーション.<p>
	 *
	 * 出荷作業マスタの登録を行います。<br>
	 */
	public class ShipWk_Upd01 extends MABCL_MultiReg_MC_A.ShipWk_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ShipWkLcl_UpdChk01オペレーション.<p>
	 *
	 * 出荷作業マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	public class ShipWkLcl_UpdChk01 extends MABCL_MultiReg_MC_A.ShipWkLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ShipWkLcl_Upd01オペレーション.<p>
	 *
	 * 出荷作業マスタの登録を行います。（ロケール用）<br>
	 */
	public class ShipWkLcl_Upd01 extends MABCL_MultiReg_MC_A.ShipWkLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ShipWk_DelChk01オペレーション.<p>
	 *
	 * 出荷作業マスタの削除前のチェックを行います。<br>
	 */
	public class ShipWk_DelChk01 extends MABCL_MultiReg_MC_A.ShipWk_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ShipWk_Del01オペレーション.<p>
	 *
	 * 出荷作業マスタの削除を行います。<br>
	 */
	public class ShipWk_Del01 extends MABCL_MultiReg_MC_A.ShipWk_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Rsrc_UpdChk01オペレーション.<p>
	 *
	 * 資源マスタの登録前のチェックを行います。<br>
	 */
	public class Rsrc_UpdChk01 extends MABCL_MultiReg_MC_A.Rsrc_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(Rsrc_UpdChk01_DtlR row : up0()){
				if (isNotCd(row.rsrc_cd())){
					msgList.add(new MCMessage(row, Rsrc_UpdChk01_DtlR.$rsrc_cd, MABCL0306, 
									getLabel(row, Rsrc_UpdChk01_DtlR.$rsrc_cd), row.rsrc_cd(), toDispGUIIndex(row)));
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
	 * Rsrc_Upd01オペレーション.<p>
	 *
	 * 資源マスタの登録を行います。<br>
	 */
	public class Rsrc_Upd01 extends MABCL_MultiReg_MC_A.Rsrc_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * RsrcLcl_UpdChk01オペレーション.<p>
	 *
	 * 資源マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	public class RsrcLcl_UpdChk01 extends MABCL_MultiReg_MC_A.RsrcLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * RsrcLcl_Upd01オペレーション.<p>
	 *
	 * 資源マスタの登録を行います。（ロケール用）<br>
	 */
	public class RsrcLcl_Upd01 extends MABCL_MultiReg_MC_A.RsrcLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Rsrc_DelChk01オペレーション.<p>
	 *
	 * 資源マスタの削除前のチェックを行います。<br>
	 */
	public class Rsrc_DelChk01 extends MABCL_MultiReg_MC_A.Rsrc_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Rsrc_Del01オペレーション.<p>
	 *
	 * 資源マスタの削除を行います。<br>
	 */
	public class Rsrc_Del01 extends MABCL_MultiReg_MC_A.Rsrc_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * HsGrp_UpdChk01オペレーション.<p>
	 *
	 * ＨＳ分類マスタの登録前のチェックを行います。<br>
	 */
	public class HsGrp_UpdChk01 extends MABCL_MultiReg_MC_A.HsGrp_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(HsGrp_UpdChk01_DtlR row : up0()){
				if (isNotCd(row.hs_grp_cd())){
					msgList.add(new MCMessage(row, HsGrp_UpdChk01_DtlR.$hs_grp_cd, MABCL0306, 
									getLabel(row, HsGrp_UpdChk01_DtlR.$hs_grp_cd), row.hs_grp_cd(), toDispGUIIndex(row)));
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
	 * HsGrp_Upd01オペレーション.<p>
	 *
	 * ＨＳ分類マスタの登録を行います。<br>
	 */
	public class HsGrp_Upd01 extends MABCL_MultiReg_MC_A.HsGrp_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * HsGrpLcl_UpdChk01オペレーション.<p>
	 *
	 * ＨＳ分類マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	public class HsGrpLcl_UpdChk01 extends MABCL_MultiReg_MC_A.HsGrpLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * HsGrpLcl_Upd01オペレーション.<p>
	 *
	 * ＨＳ分類マスタの登録を行います。（ロケール用）<br>
	 */
	public class HsGrpLcl_Upd01 extends MABCL_MultiReg_MC_A.HsGrpLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * HsGrp_DelChk01オペレーション.<p>
	 *
	 * ＨＳ分類マスタの削除前のチェックを行います。<br>
	 */
	public class HsGrp_DelChk01 extends MABCL_MultiReg_MC_A.HsGrp_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * HsGrp_Del01オペレーション.<p>
	 *
	 * ＨＳ分類マスタの削除を行います。<br>
	 */
	public class HsGrp_Del01 extends MABCL_MultiReg_MC_A.HsGrp_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AlcPtn_UpdChk01オペレーション.<p>
	 *
	 * 配賦パタンマスタの登録前のチェックを行います。<br>
	 */
	public class AlcPtn_UpdChk01 extends MABCL_MultiReg_MC_A.AlcPtn_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(AlcPtn_UpdChk01_DtlR row : up0()){
				if (isNotCd(row.alc_ptn_cd())){
					msgList.add(new MCMessage(row, AlcPtn_UpdChk01_DtlR.$alc_ptn_cd, MABCL0306, 
									getLabel(row, AlcPtn_UpdChk01_DtlR.$alc_ptn_cd), row.alc_ptn_cd(), toDispGUIIndex(row)));
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
	 * AlcPtn_Upd01オペレーション.<p>
	 *
	 * 配賦パタンマスタの登録を行います。<br>
	 */
	public class AlcPtn_Upd01 extends MABCL_MultiReg_MC_A.AlcPtn_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AlcPtnLcl_UpdChk01オペレーション.<p>
	 *
	 * 配賦パタンマスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	public class AlcPtnLcl_UpdChk01 extends MABCL_MultiReg_MC_A.AlcPtnLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AlcPtnLcl_Upd01オペレーション.<p>
	 *
	 * 配賦パタンマスタの登録を行います。（ロケール用）<br>
	 */
	public class AlcPtnLcl_Upd01 extends MABCL_MultiReg_MC_A.AlcPtnLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AlcPtn_DelChk01オペレーション.<p>
	 *
	 * 配賦パタンマスタの削除前のチェックを行います。<br>
	 */
	public class AlcPtn_DelChk01 extends MABCL_MultiReg_MC_A.AlcPtn_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AlcPtn_Del01オペレーション.<p>
	 *
	 * 配賦パタンマスタの削除を行います。<br>
	 */
	public class AlcPtn_Del01 extends MABCL_MultiReg_MC_A.AlcPtn_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CtgGrp_UpdChk01オペレーション.<p>
	 *
	 * 原価品群グループマスタの登録前のチェックを行います。<br>
	 */
	public class CtgGrp_UpdChk01 extends MABCL_MultiReg_MC_A.CtgGrp_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(CtgGrp_UpdChk01_DtlR row : up0()){
				if (isNotCd(row.ctg_grp_cd())){
					msgList.add(new MCMessage(row, CtgGrp_UpdChk01_DtlR.$ctg_grp_cd, MABCL0306, 
									getLabel(row, CtgGrp_UpdChk01_DtlR.$ctg_grp_cd), row.ctg_grp_cd(), toDispGUIIndex(row)));
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
	 * CtgGrp_Upd01オペレーション.<p>
	 *
	 * 原価品群グループマスタの登録を行います。<br>
	 */
	public class CtgGrp_Upd01 extends MABCL_MultiReg_MC_A.CtgGrp_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CtgGrpLcl_UpdChk01オペレーション.<p>
	 *
	 * 原価品群グループマスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	public class CtgGrpLcl_UpdChk01 extends MABCL_MultiReg_MC_A.CtgGrpLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CtgGrpLcl_Upd01オペレーション.<p>
	 *
	 * 原価品群グループマスタの登録を行います。（ロケール用）<br>
	 */
	public class CtgGrpLcl_Upd01 extends MABCL_MultiReg_MC_A.CtgGrpLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CtgGrp_DelChk01オペレーション.<p>
	 *
	 * 原価品群グループマスタの削除前のチェックを行います。<br>
	 */
	public class CtgGrp_DelChk01 extends MABCL_MultiReg_MC_A.CtgGrp_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CtgGrp_Del01オペレーション.<p>
	 *
	 * 原価品群グループマスタの削除を行います。<br>
	 */
	public class CtgGrp_Del01 extends MABCL_MultiReg_MC_A.CtgGrp_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ActPtn_UpdChk01オペレーション.<p>
	 *
	 * 計算実行パタンマスタの登録前のチェックを行います。<br>
	 */
	public class ActPtn_UpdChk01 extends MABCL_MultiReg_MC_A.ActPtn_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(ActPtn_UpdChk01_DtlR row : up0()){
				if (isNotCd(row.act_ptn_cd())){
					msgList.add(new MCMessage(row, ActPtn_UpdChk01_DtlR.$act_ptn_cd, MABCL0306, 
									getLabel(row, ActPtn_UpdChk01_DtlR.$act_ptn_cd), row.act_ptn_cd(), toDispGUIIndex(row)));
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
	 * ActPtn_Upd01オペレーション.<p>
	 *
	 * 計算実行パタンマスタの登録を行います。<br>
	 */
	public class ActPtn_Upd01 extends MABCL_MultiReg_MC_A.ActPtn_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ActPtnLcl_UpdChk01オペレーション.<p>
	 *
	 * 計算実行パタンマスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	public class ActPtnLcl_UpdChk01 extends MABCL_MultiReg_MC_A.ActPtnLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ActPtnLcl_Upd01オペレーション.<p>
	 *
	 * 計算実行パタンマスタの登録を行います。（ロケール用）<br>
	 */
	public class ActPtnLcl_Upd01 extends MABCL_MultiReg_MC_A.ActPtnLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ActPtn_DelChk01オペレーション.<p>
	 *
	 * 計算実行パタンマスタの削除前のチェックを行います。<br>
	 */
	public class ActPtn_DelChk01 extends MABCL_MultiReg_MC_A.ActPtn_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ActPtn_Del01オペレーション.<p>
	 *
	 * 計算実行パタンマスタの削除を行います。<br>
	 */
	public class ActPtn_Del01 extends MABCL_MultiReg_MC_A.ActPtn_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}