package mcframe.serverMABC.MABCL0032;

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
import mcframe.serverMABC.MABCL0032.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0170.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_MultiReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_MultiReg_MC extends MABCL_MultiReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * BankAc_UpdChk01オペレーション.<p>
	 *
	 * 口座マスタの登録前のチェックを行います。<br>
	 */
	public class BankAc_UpdChk01 extends MABCL_MultiReg_MC_A.BankAc_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(BankAc_UpdChk01_DtlR row : up0()){
				if (isNotCd(row.bank_ac_cd())){
					msgList.add(new MCMessage(row, BankAc_UpdChk01_DtlR.$bank_ac_cd, MABCL0306, 
									getLabel(row, BankAc_UpdChk01_DtlR.$bank_ac_cd), row.bank_ac_cd(), toDispGUIIndex(row)));
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
	 * BankAc_Upd01オペレーション.<p>
	 *
	 * 口座マスタの登録を行います。<br>
	 */
	public class BankAc_Upd01 extends MABCL_MultiReg_MC_A.BankAc_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * BankAcLcl_UpdChk01オペレーション.<p>
	 *
	 * 口座マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	public class BankAcLcl_UpdChk01 extends MABCL_MultiReg_MC_A.BankAcLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * BankAcLcl_Upd01オペレーション.<p>
	 *
	 * 口座マスタの登録を行います。（ロケール用）<br>
	 */
	public class BankAcLcl_Upd01 extends MABCL_MultiReg_MC_A.BankAcLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * BankAc_DelChk01オペレーション.<p>
	 *
	 * 口座マスタの削除前のチェックを行います。<br>
	 */
	public class BankAc_DelChk01 extends MABCL_MultiReg_MC_A.BankAc_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * BankAc_Del01オペレーション.<p>
	 *
	 * 口座マスタの削除を行います。<br>
	 */
	public class BankAc_Del01 extends MABCL_MultiReg_MC_A.BankAc_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Xrate_UpdChk01オペレーション.<p>
	 *
	 * 為替レート基本マスタの登録前のチェックを行います。<br>
	 */
	public class Xrate_UpdChk01 extends MABCL_MultiReg_MC_A.Xrate_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(Xrate_UpdChk01_DtlR row : up0()){
				if (isNotCd(row.xrate_cd())){
					msgList.add(new MCMessage(row, Xrate_UpdChk01_DtlR.$xrate_cd, MABCL0306, 
									getLabel(row, Xrate_UpdChk01_DtlR.$xrate_cd), row.xrate_cd(), toDispGUIIndex(row)));
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
	 * Xrate_Upd01オペレーション.<p>
	 *
	 * 為替レート基本マスタの登録を行います。<br>
	 */
	public class Xrate_Upd01 extends MABCL_MultiReg_MC_A.Xrate_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * XrateLcl_UpdChk01オペレーション.<p>
	 *
	 * 為替レート基本マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	public class XrateLcl_UpdChk01 extends MABCL_MultiReg_MC_A.XrateLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * XrateLcl_Upd01オペレーション.<p>
	 *
	 * 為替レート基本マスタの登録を行います。（ロケール用）<br>
	 */
	public class XrateLcl_Upd01 extends MABCL_MultiReg_MC_A.XrateLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Xrate_DelChk01オペレーション.<p>
	 *
	 * 為替レート基本マスタの削除前のチェックを行います。<br>
	 */
	public class Xrate_DelChk01 extends MABCL_MultiReg_MC_A.Xrate_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Xrate_Del01オペレーション.<p>
	 *
	 * 為替レート基本マスタの削除を行います。<br>
	 */
	public class Xrate_Del01 extends MABCL_MultiReg_MC_A.Xrate_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CalBase_UpdChk01オペレーション.<p>
	 *
	 * カレンダ基本マスタの登録前のチェックを行います。<br>
	 */
	public class CalBase_UpdChk01 extends MABCL_MultiReg_MC_A.CalBase_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(CalBase_UpdChk01_DtlR row : up0()){
				if (isNotCd(row.cal_cd())){
					msgList.add(new MCMessage(row, CalBase_UpdChk01_DtlR.$cal_cd, MABCL0306, 
									getLabel(row, CalBase_UpdChk01_DtlR.$cal_cd), row.cal_cd(), toDispGUIIndex(row)));
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
	 * CalBase_Upd01オペレーション.<p>
	 *
	 * カレンダ基本マスタの登録を行います。<br>
	 */
	public class CalBase_Upd01 extends MABCL_MultiReg_MC_A.CalBase_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CalBaseLcl_UpdChk01オペレーション.<p>
	 *
	 * カレンダ基本マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	public class CalBaseLcl_UpdChk01 extends MABCL_MultiReg_MC_A.CalBaseLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CalBaseLcl_Upd01オペレーション.<p>
	 *
	 * カレンダ基本マスタの登録を行います。（ロケール用）<br>
	 */
	public class CalBaseLcl_Upd01 extends MABCL_MultiReg_MC_A.CalBaseLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CalBase_DelChk01オペレーション.<p>
	 *
	 * カレンダ基本マスタの削除前のチェックを行います。<br>
	 */
	public class CalBase_DelChk01 extends MABCL_MultiReg_MC_A.CalBase_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CalBase_Del01オペレーション.<p>
	 *
	 * カレンダ基本マスタの削除を行います。<br>
	 */
	public class CalBase_Del01 extends MABCL_MultiReg_MC_A.CalBase_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ItmJnl_UpdChk01オペレーション.<p>
	 *
	 * 品目仕訳マスタの登録前のチェックを行います。<br>
	 */
	public class ItmJnl_UpdChk01 extends MABCL_MultiReg_MC_A.ItmJnl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(ItmJnl_UpdChk01_DtlR row : up0()){
				if (isNotCd(row.itm_jnl_cd())){
					msgList.add(new MCMessage(row, ItmJnl_UpdChk01_DtlR.$itm_jnl_cd, MABCL0306, 
									getLabel(row, ItmJnl_UpdChk01_DtlR.$itm_jnl_cd), row.itm_jnl_cd(), toDispGUIIndex(row)));
					continue;
				}
				if (!registrableApTyp(row)) {
					msgList.add(new MCMessage(row, AcRsn_UpdChk01_DtlR.$ap_typ, MABCL0306, 
							getLabel(row, AcRsn_UpdChk01_DtlR.$ap_typ), row.ap_typ(), toDispGUIIndex(row)));
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
		protected boolean registrableApTyp(ItmJnl_UpdChk01_DtlR row) {
			return isNull(row.ap_typ()) 
					|| MAC_AP_TYP.isAP(row.ap_typ()) || MAC_AP_TYP.isAC(row.ap_typ());
		}
	}
	/**
	 * ItmJnl_Upd01オペレーション.<p>
	 *
	 * 品目仕訳マスタの登録を行います。<br>
	 */
	public class ItmJnl_Upd01 extends MABCL_MultiReg_MC_A.ItmJnl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ItmJnlLcl_UpdChk01オペレーション.<p>
	 *
	 * 品目仕訳マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	public class ItmJnlLcl_UpdChk01 extends MABCL_MultiReg_MC_A.ItmJnlLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ItmJnlLcl_Upd01オペレーション.<p>
	 *
	 * 品目仕訳マスタの登録を行います。（ロケール用）<br>
	 */
	public class ItmJnlLcl_Upd01 extends MABCL_MultiReg_MC_A.ItmJnlLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ItmJnl_DelChk01オペレーション.<p>
	 *
	 * 品目仕訳マスタの削除前のチェックを行います。<br>
	 */
	public class ItmJnl_DelChk01 extends MABCL_MultiReg_MC_A.ItmJnl_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ItmJnl_Del01オペレーション.<p>
	 *
	 * 品目仕訳マスタの削除を行います。<br>
	 */
	public class ItmJnl_Del01 extends MABCL_MultiReg_MC_A.ItmJnl_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AcItmGrp_UpdChk01オペレーション.<p>
	 *
	 * 会計品目分類マスタの登録前のチェックを行います。<br>
	 */
	public class AcItmGrp_UpdChk01 extends MABCL_MultiReg_MC_A.AcItmGrp_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(AcItmGrp_UpdChk01_DtlR row : up0()){
				if (isNotCd(row.ac_itm_grp_cd())){
					msgList.add(new MCMessage(row, AcItmGrp_UpdChk01_DtlR.$ac_itm_grp_cd, MABCL0306, 
									getLabel(row, AcItmGrp_UpdChk01_DtlR.$ac_itm_grp_cd), row.ac_itm_grp_cd(), toDispGUIIndex(row)));
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
	 * AcItmGrp_Upd01オペレーション.<p>
	 *
	 * 会計品目分類マスタの登録を行います。<br>
	 */
	public class AcItmGrp_Upd01 extends MABCL_MultiReg_MC_A.AcItmGrp_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AcItmGrpLcl_UpdChk01オペレーション.<p>
	 *
	 * 会計品目分類マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	public class AcItmGrpLcl_UpdChk01 extends MABCL_MultiReg_MC_A.AcItmGrpLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AcItmGrpLcl_Upd01オペレーション.<p>
	 *
	 * 会計品目分類マスタの登録を行います。（ロケール用）<br>
	 */
	public class AcItmGrpLcl_Upd01 extends MABCL_MultiReg_MC_A.AcItmGrpLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AcItmGrp_DelChk01オペレーション.<p>
	 *
	 * 会計品目分類マスタの削除前のチェックを行います。<br>
	 */
	public class AcItmGrp_DelChk01 extends MABCL_MultiReg_MC_A.AcItmGrp_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AcItmGrp_Del01オペレーション.<p>
	 *
	 * 会計品目分類マスタの削除を行います。<br>
	 */
	public class AcItmGrp_Del01 extends MABCL_MultiReg_MC_A.AcItmGrp_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AcRsn_UpdChk01オペレーション.<p>
	 *
	 * 会計理由マスタの登録前のチェックを行います。<br>
	 */
	public class AcRsn_UpdChk01 extends MABCL_MultiReg_MC_A.AcRsn_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(AcRsn_UpdChk01_DtlR row : up0()){
				if (isNotCd(row.ac_rsn_cd())){
					msgList.add(new MCMessage(row, AcRsn_UpdChk01_DtlR.$ac_rsn_cd, MABCL0306, 
									getLabel(row, AcRsn_UpdChk01_DtlR.$ac_rsn_cd), row.ac_rsn_cd(), toDispGUIIndex(row)));
					continue;
				}
				if (!registrableApTyp(row)) {
					msgList.add(new MCMessage(row, AcRsn_UpdChk01_DtlR.$ap_typ, MABCL0306, 
							getLabel(row, AcRsn_UpdChk01_DtlR.$ap_typ), row.ap_typ(), toDispGUIIndex(row)));
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
		protected boolean registrableApTyp(AcRsn_UpdChk01_DtlR row) {
			return isNull(row.ap_typ()) 
					|| MAC_AP_TYP.isAP(row.ap_typ()) || MAC_AP_TYP.isAC(row.ap_typ());
		}
	}
	/**
	 * AcRsn_Upd01オペレーション.<p>
	 *
	 * 会計理由マスタの登録を行います。<br>
	 */
	public class AcRsn_Upd01 extends MABCL_MultiReg_MC_A.AcRsn_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AcRsnLcl_UpdChk01オペレーション.<p>
	 *
	 * 会計理由マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	public class AcRsnLcl_UpdChk01 extends MABCL_MultiReg_MC_A.AcRsnLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AcRsnLcl_Upd01オペレーション.<p>
	 *
	 * 会計理由マスタの登録を行います。（ロケール用）<br>
	 */
	public class AcRsnLcl_Upd01 extends MABCL_MultiReg_MC_A.AcRsnLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AcRsn_DelChk01オペレーション.<p>
	 *
	 * 会計理由マスタの削除前のチェックを行います。<br>
	 */
	public class AcRsn_DelChk01 extends MABCL_MultiReg_MC_A.AcRsn_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AcRsn_Del01オペレーション.<p>
	 *
	 * 会計理由マスタの削除を行います。<br>
	 */
	public class AcRsn_Del01 extends MABCL_MultiReg_MC_A.AcRsn_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Site_UpdChk01オペレーション.<p>
	 *
	 * 工場・物流倉庫マスタの登録前のチェックを行います。<br>
	 */
	public class Site_UpdChk01 extends MABCL_MultiReg_MC_A.Site_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(Site_UpdChk01_DtlR row : up0()){
				if (isNotCd(row.site_cd())){
					msgList.add(new MCMessage(row, Site_UpdChk01_DtlR.$site_cd, MABCL0306, 
									getLabel(row, Site_UpdChk01_DtlR.$site_cd), row.site_cd(), toDispGUIIndex(row)));
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
	 * Site_Upd01オペレーション.<p>
	 *
	 * 工場・物流倉庫マスタの登録を行います。<br>
	 */
	public class Site_Upd01 extends MABCL_MultiReg_MC_A.Site_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * SiteLcl_UpdChk01オペレーション.<p>
	 *
	 * 工場・物流倉庫マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	public class SiteLcl_UpdChk01 extends MABCL_MultiReg_MC_A.SiteLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * SiteLcl_Upd01オペレーション.<p>
	 *
	 * 工場・物流倉庫マスタの登録を行います。（ロケール用）<br>
	 */
	public class SiteLcl_Upd01 extends MABCL_MultiReg_MC_A.SiteLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Site_DelChk01オペレーション.<p>
	 *
	 * 工場・物流倉庫マスタの削除前のチェックを行います。<br>
	 */
	public class Site_DelChk01 extends MABCL_MultiReg_MC_A.Site_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Site_Del01オペレーション.<p>
	 *
	 * 工場・物流倉庫マスタの削除を行います。<br>
	 */
	public class Site_Del01 extends MABCL_MultiReg_MC_A.Site_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * LocGrp_UpdChk01オペレーション.<p>
	 *
	 * 製造場所グループマスタの登録前のチェックを行います。<br>
	 */
	public class LocGrp_UpdChk01 extends MABCL_MultiReg_MC_A.LocGrp_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(LocGrp_UpdChk01_DtlR row : up0()){
				if (isNotCd(row.loc_grp_cd())){
					msgList.add(new MCMessage(row, LocGrp_UpdChk01_DtlR.$loc_grp_cd, MABCL0306, 
									getLabel(row, LocGrp_UpdChk01_DtlR.$loc_grp_cd), row.loc_grp_cd(), toDispGUIIndex(row)));
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
	 * LocGrp_Upd01オペレーション.<p>
	 *
	 * 製造場所グループマスタの登録を行います。<br>
	 */
	public class LocGrp_Upd01 extends MABCL_MultiReg_MC_A.LocGrp_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * LocGrpLcl_UpdChk01オペレーション.<p>
	 *
	 * 製造場所グループマスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	public class LocGrpLcl_UpdChk01 extends MABCL_MultiReg_MC_A.LocGrpLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * LocGrpLcl_Upd01オペレーション.<p>
	 *
	 * 製造場所グループマスタの登録を行います。（ロケール用）<br>
	 */
	public class LocGrpLcl_Upd01 extends MABCL_MultiReg_MC_A.LocGrpLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * LocGrp_DelChk01オペレーション.<p>
	 *
	 * 製造場所グループマスタの削除前のチェックを行います。<br>
	 */
	public class LocGrp_DelChk01 extends MABCL_MultiReg_MC_A.LocGrp_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * LocGrp_Del01オペレーション.<p>
	 *
	 * 製造場所グループマスタの削除を行います。<br>
	 */
	public class LocGrp_Del01 extends MABCL_MultiReg_MC_A.LocGrp_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * LgGrp_UpdChk01オペレーション.<p>
	 *
	 * 物流グループマスタの登録前のチェックを行います。<br>
	 */
	public class LgGrp_UpdChk01 extends MABCL_MultiReg_MC_A.LgGrp_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			String _defWgCd = getSysParmNE("DEF_WG_CD") ;
			for(LgGrp_UpdChk01_DtlR row : up0()){
				if (isNotCd(row.lg_grp_cd())){
					msgList.add(new MCMessage(row, LgGrp_UpdChk01_DtlR.$lg_grp_cd, MABCL0306, 
									getLabel(row, LgGrp_UpdChk01_DtlR.$lg_grp_cd), row.lg_grp_cd(), toDispGUIIndex(row)));
					continue;
				}
				if (row.del_flg()) {
					continue ;
				}
				if (row.getBooleanNE("err_flg")) {
					continue;
				}

				// 条件付必須チェック
				if (row.loc_flg() && isNull(_defWgCd)) {
					msgList.addAll(check(row, LgGrp_UpdChk01_DtlR.$wg_cd, new FXUCL_RequiredValidater()));
				}

				// 個別チェック
				if (!row.loc_flg()) {
					if (!isNull(row.wg_cd())) {
						msgList.add(getMsg(row, LgGrp_UpdChk01_DtlR.$wg_cd, MABCL0261));
					}
					if (row.ship_slip_flg()) {
						msgList.add(getMsg(row, LgGrp_UpdChk01_DtlR.$ship_slip_flg, MABCL0285));
					}
					if (row.pick_list_flg()) {
						msgList.add(getMsg(row, LgGrp_UpdChk01_DtlR.$pick_list_flg, MABCL0285));
					}
					if (row.ship_inst_flg()) {
						msgList.add(getMsg(row, LgGrp_UpdChk01_DtlR.$ship_inst_flg, MABCL0285));
					}
					if (row.ship_slip_act_flg()) {
						msgList.add(getMsg(row, LgGrp_UpdChk01_DtlR.$ship_slip_act_flg, MABCL0285));
					}
					if (!isNull(row.cal_cd())) {
						msgList.add(getMsg(row, LgGrp_UpdChk01_DtlR.$cal_cd, MABCL0261));
					}
					if (!isNull(row.site_co_cd())) {
						msgList.add(getMsg(row, LgGrp_UpdChk01_DtlR.$site_co_cd, MABCL0261));
					}
					if (row.gi_minus_stk_chk_flg()) {
						msgList.add(getMsg(row, LgGrp_UpdChk01_DtlR.$gi_minus_stk_chk_flg, MABCL0285));
					}
					if (row.ship_loc_prio_flg()) {
						msgList.add(getMsg(row, LgGrp_UpdChk01_DtlR.$ship_loc_prio_flg, MABCL0285));
					}
				}
			}
			return msgList;
		}

		/** 項目名、行番号を引数に持つメッセージ */
		protected MCMessage getMsg(LgGrp_UpdChk01_DtlR r, String col, String id) {
			return new MCMessage(r, col, id, getLabel(r, col), toDispGUIIndex(r));
		}
	}
	/**
	 * LgGrp_Upd01オペレーション.<p>
	 *
	 * 物流グループマスタの登録を行います。<br>
	 */
	public class LgGrp_Upd01 extends MABCL_MultiReg_MC_A.LgGrp_Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void up() {
			editUp();
			super.up();
		}

		/**
		 * 上り電文を編集する。
		 */
		protected void editUp() {
			String _defWgCd = getSysParmNE("DEF_WG_CD") ;
			if (!isNull(_defWgCd)) {
				for (LgGrp_UpdChk01_DtlR r : up0()) {
					if (isNull(r.wg_cd()) && r.loc_flg()) {
						r.wg_cd(_defWgCd) ;
					}
				}
			}
		}
	}
	/**
	 * LgGrpLcl_UpdChk01オペレーション.<p>
	 *
	 * 物流グループマスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	public class LgGrpLcl_UpdChk01 extends MABCL_MultiReg_MC_A.LgGrpLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * LgGrpLcl_Upd01オペレーション.<p>
	 *
	 * 物流グループマスタの登録を行います。（ロケール用）<br>
	 */
	public class LgGrpLcl_Upd01 extends MABCL_MultiReg_MC_A.LgGrpLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * LgGrp_DelChk01オペレーション.<p>
	 *
	 * 物流グループマスタの削除前のチェックを行います。<br>
	 */
	public class LgGrp_DelChk01 extends MABCL_MultiReg_MC_A.LgGrp_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * LgGrp_Del01オペレーション.<p>
	 *
	 * 物流グループマスタの削除を行います。<br>
	 */
	public class LgGrp_Del01 extends MABCL_MultiReg_MC_A.LgGrp_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AllocGrp_UpdChk01オペレーション.<p>
	 *
	 * 総量引当場所グループマスタの登録前のチェックを行います。<br>
	 */
	public class AllocGrp_UpdChk01 extends MABCL_MultiReg_MC_A.AllocGrp_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(AllocGrp_UpdChk01_DtlR row : up0()){
				if (isNotCd(row.alloc_grp_cd())){
					msgList.add(new MCMessage(row, AllocGrp_UpdChk01_DtlR.$alloc_grp_cd, MABCL0306, 
									getLabel(row, AllocGrp_UpdChk01_DtlR.$alloc_grp_cd), row.alloc_grp_cd(), toDispGUIIndex(row)));
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
	 * AllocGrp_Upd01オペレーション.<p>
	 *
	 * 総量引当場所グループマスタの登録を行います。<br>
	 */
	public class AllocGrp_Upd01 extends MABCL_MultiReg_MC_A.AllocGrp_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AllocGrpLcl_UpdChk01オペレーション.<p>
	 *
	 * 総量引当場所グループマスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	public class AllocGrpLcl_UpdChk01 extends MABCL_MultiReg_MC_A.AllocGrpLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AllocGrpLcl_Upd01オペレーション.<p>
	 *
	 * 総量引当場所グループマスタの登録を行います。（ロケール用）<br>
	 */
	public class AllocGrpLcl_Upd01 extends MABCL_MultiReg_MC_A.AllocGrpLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AllocGrp_DelChk01オペレーション.<p>
	 *
	 * 総量引当場所グループマスタの削除前のチェックを行います。<br>
	 */
	public class AllocGrp_DelChk01 extends MABCL_MultiReg_MC_A.AllocGrp_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AllocGrp_Del01オペレーション.<p>
	 *
	 * 総量引当場所グループマスタの削除を行います。<br>
	 */
	public class AllocGrp_Del01 extends MABCL_MultiReg_MC_A.AllocGrp_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}